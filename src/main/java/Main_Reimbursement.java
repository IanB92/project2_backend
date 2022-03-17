

import java.util.List;

import com.fasterxml.jackson.core.JsonParser.Feature;

import exceptions.EmployeeNotFound;
import io.javalin.Javalin;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import service.ManagerService;
import service.ManagerServiceImpl;
import transferobjects.Denied;
import transferobjects.EmployeeTo;
import transferobjects.ManagerPojo;
import transferobjects.ReimbursementPojo;
import transferobjects.ResolvedPojo;

public class Main_Reimbursement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// testing integration
		//testing 2
		//hopefully last test
		EmployeeService employeeService = new EmployeeServiceImpl();
		ManagerService managerService = new ManagerServiceImpl();
		
		Javalin myServer = Javalin.create((config) -> config.enableCorsForAllOrigins()).start(7070);
		System.out.println("Server listening at port 7070 . .");

		// Employee
		// endpoint for employeelogin
		myServer.post("/api/employee-login", (ctx) -> {
			// there is an incomming book json in the requestbody, fetching the request body
			// and storing it in newBook
			EmployeeTo returnLogin = employeeService.employeeLogin(ctx.bodyAsClass(EmployeeTo.class));
			ctx.json(returnLogin);
		});
		// endpoint for employee Info
		myServer.get("/api/employee-Info/{bid}", (ctx) -> {

			String employeeId = ctx.pathParam("bid");
			EmployeeTo returnInfo = employeeService.employeeInfo(Integer.parseInt(employeeId));
			ctx.json(returnInfo);

		});
		// enpoint for employee update
		myServer.put("/api/employee-update", (ctx) -> {
			EmployeeTo update = ctx.bodyAsClass(EmployeeTo.class);
			EmployeeTo returnUpdate = employeeService.employeeUpdate(update);
			ctx.json(returnUpdate);

		});
		// enpoint for employee request
		myServer.post("/api/employee-request", (ctx) -> {
			ReimbursementPojo returnRequest = employeeService.employeeRequest(ctx.bodyAsClass(ReimbursementPojo.class));
			ctx.json(returnRequest);
		});
		// enpoint for employee pending
		myServer.get("/api/view-pending/{bid}", (ctx) -> {
			String employeeId = ctx.pathParam("bid");
			List<ReimbursementPojo> returnPending = employeeService.employeeViewMyPending(Integer.parseInt(employeeId));
			ctx.json(returnPending);

		});
		// enpoint for employee resolved
		myServer.get("/api/view-resolved/{bid}", (ctx) -> {
			String employeeId = ctx.pathParam("bid");
			List<ReimbursementPojo> returnResolved = employeeService
					.employeeViewMyResolved(Integer.parseInt(employeeId));
			ctx.json(returnResolved);
		});

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Manager
		
		
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

//		myServer.exception(SystemException.class, (se, ctx) -> {
//			Map<String, String> error = new HashMap<String, String>();
//			error.put("message", se.getMessage());
//			error.put("datetime", LocalDateTime.now() + "");
//			ctx.json(error);
//		});
//
//		myServer.exception(EmployeeNotFound.class, (be, ctx) -> {
//			Map<String, String> error = new HashMap<String, String>();
//			error.put("message", be.getMessage());
//			error.put("datetime", LocalDateTime.now() + "");
//			ctx.json(error);
//		});

	}

	

}
