package org.hcl;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hcl.entities.Emp;
import org.hibernate.Session;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Emp e=new Emp();
		e.setName("ksrao");
		e.setAddress("hyd");
		Integer id=(Integer)session.save(e);
		tx.commit();
		System.out.println(id);
		session.close();
		factory.close();

	}

}
