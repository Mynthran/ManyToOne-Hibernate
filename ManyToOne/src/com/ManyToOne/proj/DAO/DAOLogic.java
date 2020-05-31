package com.ManyToOne.proj.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ManyToOne.proj.DTO.Movie;

public class DAOLogic 
{
		public void saveMovie(Movie movie)
		{
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(movie);
			transaction.commit();
			
		}
}
