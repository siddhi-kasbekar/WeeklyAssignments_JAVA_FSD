package com.hexaware.hibernatemappings;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernatemappings.entity.MenuItems;
import com.hexaware.hibernatemappings.entity.Orders;

public class ManyToMany {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            Transaction transaction = session.beginTransaction();

         // Creating MenuItems
            MenuItems menuItem1 = new MenuItems();
            menuItem1.setMenuName("Burger");
            menuItem1.setPrice(5.99);

            MenuItems menuItem2 = new MenuItems();
            menuItem2.setMenuName("Pizza");
            menuItem2.setPrice(9.99);

            MenuItems menuItem3 = new MenuItems();
            menuItem3.setMenuName("Salad");
            menuItem3.setPrice(3.99);

            Orders order1 = new Orders();
            order1.setDate(LocalDate.now());
            order1.setStatus("Pending");

            Orders order2 = new Orders();
            order2.setDate(LocalDate.now());
            order2.setStatus("Delivered");

            order1.addMenuItems(menuItem1);
            order1.addMenuItems(menuItem2);

            order2.addMenuItems(menuItem2);
            order2.addMenuItems(menuItem3);

            session.persist(menuItem1);
            session.persist(menuItem2);
            session.persist(menuItem3);

            session.persist(order1);
            session.persist(order2);

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }

		
	}

}
