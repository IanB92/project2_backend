package service;


import java.util.List;
import exceptions.SystemException;
import transferobjects.Denied;
import transferobjects.ManagerPojo;
import transferobjects.ReimbursementPojo;
import transferobjects.ResolvedPojo;
public interface ManagerService {
	
	List<ReimbursementPojo> fetchAllPending() throws SystemException;

	List<ResolvedPojo> fetchAllResolved() throws SystemException;

	List<Denied> fetchAllDenied() throws SystemException;

	ReimbursementPojo approve(int pendingId) throws SystemException;

	ReimbursementPojo deny(int pendingId) throws SystemException;

	List<ReimbursementPojo> fetchEmpReimbursement(int employeeId) throws SystemException;

	ManagerPojo managerLogin(ManagerPojo manager) throws SystemException;
	

}