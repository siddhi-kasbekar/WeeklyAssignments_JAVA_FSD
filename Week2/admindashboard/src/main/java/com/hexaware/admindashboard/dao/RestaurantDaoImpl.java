package com.hexaware.admindashboard.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.admindashboard.model.Restaurant;

public class RestaurantDaoImpl implements IRestaurantDao{

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    Session session = sessionFactory.openSession();
    
    
	@Override
	public Serializable insertRestaurant(Restaurant restaurant) {

		try (Session session = sessionFactory.openSession()) { // using try-with-resources which closes session after executing the code block
			Transaction transaction = session.beginTransaction();

            session.clear();
            Serializable ser = session.save(restaurant);
            transaction.commit();
            return ser;
        }catch (Exception e) {
            e.printStackTrace(); 
            return null; //  null if an error 
        }
	}

	@Override
	public Serializable updateRestaurant(Restaurant restaurant) {
	    try (Session session = sessionFactory.openSession()) { //The resources declared in the parentheses are automatically closed when the try block is exited, either normally or due to an exception.
	        Transaction transaction = session.beginTransaction();

	        try {
	            session.saveOrUpdate(restaurant);

	            transaction.commit();

	            return restaurant.getResId();
	        } catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
	            return null; // null if an error occurred
	        }
	    }
	}



	@Override
	public boolean deleteRestaurantById(int resid) {
	    try (Session session = sessionFactory.openSession()) {
	        try {
	            Transaction transaction = session.beginTransaction();

	            Restaurant restaurantToDelete = session.get(Restaurant.class, resid);

	            if (restaurantToDelete != null) {
	                session.delete(restaurantToDelete);
	                transaction.commit();
	                return true;
	            } else {
	                System.err.println("Restaurant with ID " + resid + " not found.");
	                transaction.rollback();
	                return false;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	}


	@Override
	public List<Restaurant> selectRestaurantByLocation(String location) {
		String selectQuery = "select r from Restaurant r where r.location=?1";
		
		Query<Restaurant> query = session.createQuery(selectQuery);
		query.setParameter(1, location);

		List<Restaurant> list = query.getResultList();
		return list;
		}
	

	@Override
	public List<Restaurant> selectAll() {

        session.clear();

		 String selectQuery = "select  r from Restaurant r "; 

		 
	        Query<Restaurant>  query = session.createQuery(selectQuery);
	        
	        
	        
	        List<Restaurant> list = query.getResultList();
	        		return list;
	}

}
