package atlas2;

import java.util.List;
import exception.SystemException;
public interface ManagerDao {
List<ReimbursementPojo> fetchAllPending() throws SystemException;

List<ResolvedPojo> fetchAllResolved() throws SystemException;

List<Denied> fetchAllDenied() throws SystemException;
	
 ReimbursementPojo  approve(int employeeId) throws SystemException;
	
	
	
	ReimbursementPojo deny(int employeeId) throws SystemException;

	List<ReimbursementPojo> fetchEmpReimbursement(int employeeId)throws SystemException;
	
	default void exitApplication()throws SystemException {
		DbUtil.closeConnection();
	}

	ManagerPojo managerLogin(ManagerPojo manager) throws SystemException;

	ReimbursementPojo fetchByReimId(int reimId) throws SystemException;

	




	
}