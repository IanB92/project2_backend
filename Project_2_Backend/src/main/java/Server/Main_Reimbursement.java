package Server;

import java.util.List;

import com.fasterxml.jackson.core.JsonParser.Feature;
import io.javalin.Javalin;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import transferobjects.EmployeeTo;
import transferobjects.ReimbursementPojo;

public class Main_Reimbursement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeServiceImpl();
		// Javalin myServer = Javalin.create().start(7070);
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
	}

}
