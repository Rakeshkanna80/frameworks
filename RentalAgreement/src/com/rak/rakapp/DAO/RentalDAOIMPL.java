package com.rak.rakapp.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rak.rakapp.DTO.RentalDTO;
import com.rak.rakapp.hibernate.util.HibernateUtil;

public class RentalDAOIMPL implements RentalDAO {

	@Override
	public void save(String OwnerName,String TenantName,String Address,String Rent,String Deposit) {
		Session session = HibernateUtil.getfactory().openSession();
		try {
			Transaction tx=session.beginTransaction();
			RentalDTO dto=new RentalDTO();
			dto.setOwnerName(OwnerName);
			dto.setTenantName(TenantName);
			dto.setAddress(Address);
			dto.setRent(Rent);
			dto.setDeposit(Deposit);
			session.save(dto);
			tx.commit();
		} catch (HibernateException e) {
			System.err.println("exception" + e.getMessage());
		} finally {
			session.close();
		}
	}

}
