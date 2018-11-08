package com.tuyano.eclipse_maven_app;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 * Hello world!
 *
 */
public class App 
{
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-persistence");
	
    public static void main( String[] args )
    {
    	App app = new App();
    	app.createEntities();
    	System.out.println();
    	System.out.println("App start======================");
    	app.printEntities();
    	System.out.println("App end======================");
    	System.out.println();
    }
    

	private void createEntities() {
    	EntityManager manager = factory.createEntityManager();
    	try {
			manager.getTransaction().begin();
				manager.persist(new Person("name1", "mail1", "1"));
				manager.persist(new Person("name2", "mail2", "2"));
				manager.persist(new Person("name3", "mail3", "3"));
			manager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			manager.close();
		}
		
	}

	private void printEntities() {
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("Select i from Person i");
		@SuppressWarnings("unchecked")
		List<Person> list= query.getResultList();
		System.out.println("get " + list.size()+ " Person.");
		for (Person person : list) {
			System.out.println(person);
		}
	}
    
}
