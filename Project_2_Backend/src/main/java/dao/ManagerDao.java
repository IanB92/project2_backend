package dao;

import java.util.List;
import exceptions.SystemException;
import transferobjects.Denied;
import transferobjects.ManagerPojo;
import transferobjects.ReimbursementPojo;
import transferobjects.ResolvedPojo;
public interface ManagerDao {
List<ReimbursementPojo> fetchAllPending() throws SystemException;

List<ResolvedPojo> fetchAllResolved() throws SystemException;

List<Denied> fetchAllDenied() throws SystemException;
	
 ReimbursementPojo  approve(int pendingId) throws SystemException;
	
	
	
	ReimbursementPojo deny(int pendingId) throws SystemException;

	List<ReimbursementPojo> fetchEmpReimbursement(int employeeId)throws SystemException;
	
	default void exitApplication()throws SystemException {
		DBUtil.closeConnection();
	}

	ManagerPojo managerLogin(ManagerPojo manager) throws SystemException;

	ReimbursementPojo fetchByReimId(int reimId) throws SystemException;

	




	
}