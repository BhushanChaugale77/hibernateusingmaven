package hibarnet_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentRepositiory {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

//		Student std = new Student();
//		std.setId(7);
//		std.setName("Bhau");
//		std.setAddress("Kolhapur");

		Car car1 = new Car("Tata", "SUV", 977777);

		Session session = factory.openSession();

		Transaction ts = session.beginTransaction();
		// session.save(std);

		session.save(car1);

		ts.commit();

		session.close();

		System.out.println("Done");

	}

}
