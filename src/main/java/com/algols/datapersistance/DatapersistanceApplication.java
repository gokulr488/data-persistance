package com.algols.datapersistance;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.algols.datapersistance.dos.EvnAtrListDo;
import com.algols.datapersistance.dos.TSubEventDo;

//@SpringBootApplication
public class DatapersistanceApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DatapersistanceApplication.class, args);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(TSubEventDo.class)
				.addAnnotatedClass(EvnAtrListDo.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			TSubEventDo subEvent = new TSubEventDo();

			List<EvnAtrListDo> atrListDos = new ArrayList<EvnAtrListDo>();
			EvnAtrListDo atrListDo = new EvnAtrListDo();
			atrListDo.settSubEventDo(subEvent);
			atrListDos.add(atrListDo);

			subEvent.setEventSeq(1);
			subEvent.setBusEventType("bu");
			subEvent.setCustomerId("cust");
			subEvent.setEvnAtrListDos(atrListDos);

			session.save(subEvent);
			System.out.println(subEvent);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
