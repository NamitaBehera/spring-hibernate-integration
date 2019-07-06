package com.xworkz.Book.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.Book.DTO.BookDTO;
import com.xworkz.HibernateUtil.SessionFactoryUtil;

public class BookDAO {
	public void save(BookDTO book){
		System.out.println("invoked saved method");
		
		SessionFactory sf=SessionFactoryUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		try{
			
			session.save(book);
			tx.commit();
			
		}catch(HibernateException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			System.out.println("closing resources");
		}
	}

}
