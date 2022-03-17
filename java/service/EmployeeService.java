package service;

import java.util.List;

import exceptions.NothingPending;
import exceptions.SystemException;
import transferobjects.EmployeeTo;
import transferobjects.ReimbursementPojo;

public interface EmployeeService {
	EmployeeTo employeeLogin(EmployeeTo employee)throws SystemException;
	
	ReimbursementPojo employeeRequest(ReimbursementPojo reimbursement)throws SystemException;
	
	List<ReimbursementPojo> employeeViewMyPending(int employeeId)throws SystemException, NothingPending;
	
	List<ReimbursementPojo> employeeViewMyResolved(int employeeId)throws SystemException;
	
	EmployeeTo employeeInfo(int employeeId)throws SystemException;
	
	EmployeeTo employeeUpdate(EmployeeTo employeeTo)throws SystemException;

}
