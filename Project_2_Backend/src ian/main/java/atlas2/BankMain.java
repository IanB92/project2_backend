package atlas2;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.EmployeeNotFound;
import exception.SystemException;
import io.javalin.Javalin;

public class BankMain {
	public static void main(String[] args) {
		ManagerService managerService = new ManagerServiceImpl();
		Javalin myServer = Javalin.create((config) -> config.enableCorsForAllOrigins()).start(4042);

		System.out.println("server listening on port 4042..");

		myServer.post("/api/manager-login/", (ctx) -> {

			ManagerPojo returnLogin = managerService.managerLogin(ctx.bodyAsClass(ManagerPojo.class));
			ctx.json(returnLogin);
		});

		myServer.get("/api/employees", (ctx) -> {

			List<ReimbursementPojo> allInfo = managerService.fetchAllPending();
			ctx.json(allInfo);

		});

		myServer.get("/api/employees/resolved", (ctx) -> {

			List<ResolvedPojo> allInfo = managerService.fetchAllResolved();
			ctx.json(allInfo);

		});

		myServer.get("/api/employees/denied", (ctx) -> {

			List<Denied> allInfo = managerService.fetchAllDenied();
			ctx.json(allInfo);

		});

		myServer.put("/api/approve/{eid}", (ctx) -> {
			String empId = ctx.pathParam("eid");

			ReimbursementPojo UpdatedEmp = managerService.approve(Integer.parseInt(empId));
			ctx.json(UpdatedEmp);

		});
		myServer.put("/api/deny/{eid}", (ctx) -> {
			String empId = ctx.pathParam("eid");

			ReimbursementPojo UpdatedEmp = managerService.deny(Integer.parseInt(empId));
			ctx.json(UpdatedEmp);

		});

		myServer.get("/api/employee/{eid}", (ctx) -> {

			String empId = ctx.pathParam("eid");

			List<ReimbursementPojo> fetchedEmp = managerService.fetchEmpReimbursement(Integer.parseInt(empId));

			ctx.json(fetchedEmp);

		});

		myServer.exception(SystemException.class, (se, ctx) -> {
			Map<String, String> error = new HashMap<String, String>();
			error.put("message", se.getMessage());
			error.put("datetime", LocalDateTime.now() + "");
			ctx.json(error);
		});

		myServer.exception(EmployeeNotFound.class, (be, ctx) -> {
			Map<String, String> error = new HashMap<String, String>();
			error.put("message", be.getMessage());
			error.put("datetime", LocalDateTime.now() + "");
			ctx.json(error);
		});

	}

}
