package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import exceptions.NothingPending;
import exceptions.SystemException;
import transferobjects.EmployeeTo;
import transferobjects.ReimbursementPojo;
	
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao;
	
	
	
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public EmployeeTo employeeLogin(EmployeeTo employee) throws SystemException{
		// TODO Auto-generated method stub
		return employeeDao.employeeLogin(employee);
	}

	@Override
	public ReimbursementPojo employeeRequest(ReimbursementPojo reimbursement)throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.employeeRequest(reimbursement);
	}

	@Override
	public List<ReimbursementPojo> employeeViewMyPending(int employeeId)throws SystemException , NothingPending{
		// TODO Auto-generated method stub
		return employeeDao.employeeViewMyPending(employeeId);
	}

	@Override
	public List<ReimbursementPojo> employeeViewMyResolved(int employeeId) throws SystemException{
		// TODO Auto-generated method stub
		return employeeDao.employeeViewMyResolved(employeeId);
	}

	@Override
	public EmployeeTo employeeInfo(int employeeId)throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.employeeInfo(employeeId);
	}

	@Override
	public EmployeeTo employeeUpdate(EmployeeTo employeeTo) throws SystemException{
		// TODO Auto-generated method stub
		return employeeDao.employeeUpdate(employeeTo);
	}

}
