package encapsulation;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {

		Student oStudent = new Student();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Student Registration details");
		oStudent.setName(scan.next());
		oStudent.seteMail(scan.next());
		oStudent.setAdmissionId(scan.nextInt());
		oStudent.setPhoneNumber(scan.nextInt());

		System.out.println("Student name : " +oStudent.getName());
		System.out.println("Student email : " +oStudent.geteMail());
		System.out.println("Student id : " +oStudent.getAdmissionId());
		System.out.println("Student phonenumber : " +oStudent.getPhoneNumber());
	
}}