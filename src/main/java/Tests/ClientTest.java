package Tests;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Course;
import entities.User;
import entities.UserType;
import services.coursmanagementRemote;

final class ClientTest {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/GestionCoursEnseignant-ear/GestionCoursEnseignant-ejb/coursmanagement!services.coursmanagementRemote");
		
		coursmanagementRemote proxy= (coursmanagementRemote) obj;
		
//		User u= new User();
//		u.setUsertyp(UserType.teacher);
//		u.setName("ahmed");
//		proxy.ajouterUser(u);
	
		
//		User u= new User();
//		u.setUsertyp(UserType.teacher);
//		u.setName("Salma");
//		Course c= new Course();
//		c.setName("salma");
//		proxy.ajouterCoursEtEnseignant(c, u);
		
		System.out.println(proxy.listerCours(3));

	}

}
