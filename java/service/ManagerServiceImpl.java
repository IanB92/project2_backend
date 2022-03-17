package service;

import java.util.List;
import dao.ManagerDao;
import dao.ManagerDaoJDBCImpl;
import exceptions.SystemException;
import transferobjects.Denied;
import transferobjects.ManagerPojo;
import transferobjects.ReimbursementPojo;
import transferobjects.ResolvedPojo;
	
	public class ManagerServiceImpl implements ManagerService {
		
		//interface refrence variable 
		ManagerDao managerDao; 
		
		public ManagerServiceImpl() {
			managerDao = new ManagerDaoJDBCImpl();
		}


		@Override
		public List<ReimbursementPojo> fetchAllPending() throws SystemException {
			
			return managerDao.fetchAllPending();
		}

		@Override
		public List<ResolvedPojo> fetchAllResolved() throws SystemException {
			
			return managerDao.fetchAllResolved();
		}
		
		@Override
		public List<Denied> fetchAllDenied() throws SystemException {
			
			return managerDao.fetchAllDenied();
		}

		@Override
		public ReimbursementPojo  approve(int pendingId) throws SystemException {
			
			return managerDao.approve(pendingId);
		}

		

		@Override
		public ReimbursementPojo deny(int pendingId) throws SystemException {
			
			return managerDao.deny(pendingId);
		}

		@Override
		public List<ReimbursementPojo> fetchEmpReimbursement(int employeeId) throws SystemException {
			
			return managerDao.fetchEmpReimbursement(employeeId);
		}


		@Override
		public ManagerPojo managerLogin(ManagerPojo manager) throws SystemException {
			// TODO Auto-generated method stub
			return managerDao.managerLogin(manager);
		}
		}