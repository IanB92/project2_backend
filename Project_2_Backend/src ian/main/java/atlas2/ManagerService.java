package atlas2;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import exception.SystemException;
public interface ManagerService {
	
	List<ReimbursementPojo> fetchAllPending() throws SystemException;

	List<ResolvedPojo> fetchAllResolved() throws SystemException;
	
	List<Denied> fetchAllDenied() throws SystemException;
		
	ReimbursementPojo approve(int employeeId) throws SystemException;
		
		
		
		ReimbursementPojo deny(int employeeId) throws SystemException;

		 List<ReimbursementPojo> fetchEmpReimbursement(int employeeId)throws SystemException;
		
		ManagerPojo managerLogin(ManagerPojo manager) throws SystemException;
		
		default void exitApplication()throws SystemException {
			DbUtil.closeConnection();
		}

		
//		@Override
//		public ReimbursementPojo fetchEmpReimbursement(int employeeId) throws SystemException {
//			ReimbursementPojo reimbursementPojo = null;
//			Connection conn = DbUtil.receiveConnection();
//			try {
//				Statement stmt = conn.createStatement();
//				String query = "SELECT * FROM pending_details WHERE employee_id= " + employeeId ; 
//				ResultSet rs = stmt.executeQuery(query);
//				String query2 = "SELECT * FROM denied_details WHERE employee_id= " + employeeId ;
//				ResultSet rs2 = stmt.executeQuery(query2);
//				String query3 = "SELECT * FROM reimbursement_details WHERE employee_id= " + employeeId;
//				ResultSet rs3 = stmt.executeQuery(query3);
//				if (rs.next()) {
//					reimbursementPojo = new ReimbursementPojo(rs.getInt(1), rs.getInt(2), rs.getFloat(3), rs.getString(4),
//							rs.getString(5), rs.getString(6));
//				} else {
//					System.out.println("Sorry no account under that ID");
//				}
//				if (rs.next()) {
//					reimbursementPojo = new ReimbursementPojo(rs.getInt(1), rs.getInt(2), rs.getFloat(3), rs.getString(4),
//							rs.getString(5), rs.getString(6));
//				} else {
//					System.out.println("Sorry no account under that ID");
//				}
//			} catch (SQLException e) {
//				throw new SystemException();
//			}
//			return reimbursementPojo;
//		}
//		

		
	
	

}