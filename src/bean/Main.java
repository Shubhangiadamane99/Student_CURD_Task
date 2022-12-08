package bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

	/*	Student st = new Student();
		st.setId(6);
		st.setName("shubhu");
		st.setContact("987543212");
		st.setEmail("shubhu@gmail.com");*/

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
	    
		 // to insert data into Table
		// session.save(st);
		 
		/* -------- For update record--------
		Student updateStudent=new Student();
		updateStudent.setId(6);
		updateStudent.setContact("34578902");
		updateStudent.setName("Kalya");
		updateStudent.setEmail("kalya@gmail.com");
		session.update(updateStudent);*/
		
		/* ---------- For Delete record --------
		Student deleteStudent = new Student();
		deleteStudent.setId(4);
		session.delete(deleteStudent);*/
		
		Student stud = session.get(Student.class,2);
		System.out.println("id : " +stud.getId());
		System.out.println("Name : " +stud.getName());
		System.out.println("Contact : " +stud.getContact());
		System.out.println("Email : " +stud.getEmail()); 
		
		
		tr.commit();
		session.close();
		sf.close();


	}
}