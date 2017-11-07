package spring.service.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.domain.User;
/*
��������(xml)���� 
${}�� �������� ��Ÿ������ �ۿ� ������ �� ���� -- Spring 2.XXX �� ����
#{}�� ����ؾ� �Ϻ��� WIRING�� �����ϴ� -- Spring 3.XXX�� ����
*/
/*
 * FileName : UserTestApp03.java
 */
public class UserTestApp03 {
	
	///Main Method
	public static void main(String[] args){
	
		//1. ApplicatiContext �̿� xml �� ������,������ ����� instance ���� �� ����������
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("/config/userservice03.xml");

		//2. Container �� ���� ������ id �� ���� instance Look Up 
		//	- Dependency Lookup / Dependency Injection Ȯ��...
		System.out.println("\n======================================================");
		User user08 = (User)factory.getBean("user08");
		System.out.println(user08);
		
		System.out.println("\n======================================================"); 
		User user09 = (User)factory.getBean("user09");
		System.out.println(user09);
		
		System.out.println("\n======================================================");
		User user11 = (User)factory.getBean("user11");
		System.out.println(user11);
		
		System.out.println("\n======================================================");
		User user12 = (User)factory.getBean("user12");
		System.out.println(user12);

	}
	
}//end of class