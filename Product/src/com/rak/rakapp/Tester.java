package com.rak.rakapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.HibernateException;

import com.rak.rakapp.DAO.ProductDAO;
import com.rak.rakapp.DAO.ProductDAOImpl;
import com.rak.rakapp.DTO.ProductDTO;

public class Tester {

	public static void main(String[] args) {
		try {
			List l=new ArrayList();
			for (int i = 0; i < 10000; i++) {
				ProductDTO dto=new ProductDTO();
				dto.setName("rakesh"+i);
				l.add(dto);
			}
			
			
			ProductDAO dao=new ProductDAOImpl();
			dao.save(l);
			

			/*ProductDTO dto = new ProductDTO();
			dto.setName("laptop");
			dto.setPrice(25000.00);
			dto.setQuantity(5);

			ProductDTO dto1 = new ProductDTO();
			dto1.setName("mobile");
			dto1.setPrice(15000.00);
			dto1.setQuantity(4);

			ProductDTO dto2 = new ProductDTO();
			dto2.setName("tv");
			dto2.setPrice(40000.00);
			dto2.setQuantity(3);

			ProductDTO dto3 = new ProductDTO();
			dto3.setName("speakers");
			dto3.setPrice(5000.00);
			dto3.setQuantity(2);

			ProductDTO dto4 = new ProductDTO();
			dto4.setName("earphone");
			dto4.setPrice(1000.00);
			dto4.setQuantity(1);

			List<ProductDTO> list = new ArrayList<>();
			list.add(dto);
			list.add(dto1);
			list.add(dto2);
			list.add(dto3);
			list.add(dto4);*/

		//	dao.save(list);

			/*
			 * ProductDAO dao = new ProductDAOImpl(); List<String> list =
			 * dao.fetchNameList(); System.out.println(list);
			 * System.out.println("---------------------------------------------------");
			 * 
			 * List<Double> d=dao.fetchPriceList(); System.out.println(d);
			 * System.out.println("---------------------------------------------------");
			 * 
			 * List<Object[]> o = dao.fetchNameandPriceByQuantity(5); for (Object[] objects
			 * : o) { System.out.println(Arrays.toString(objects)); }
			 * 
			 * System.out.println("----------------------------------------------------");
			 * 
			 * List<Object[]> li = dao.fetchCountofEntityByQuantity(1);
			 * System.out.println(li);
			 */
			
		} catch (HibernateException e) {
			System.err.println("exception in main" + e.getMessage());
		} finally {
			HibernateUtil.getFactory().close();
		}
	}

}
