package com.algols.datapersistance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.algols.datapersistance.dos.TSubEventDo;

//@SpringBootApplication
public class DatapersistanceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DatapersistanceApplication.class, args);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(TSubEventDo.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			
			session.beginTransaction();
			TSubEventDo subEvent = session.get(TSubEventDo.class, 2L);
			//subEvent.setEventSeq(1);
//			subEvent.setBusEventType("bu");
//			subEvent.setCustomerId("cu");
//			session.beginTransaction();
//			session.save(subEvent);
			System.out.println(subEvent);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
