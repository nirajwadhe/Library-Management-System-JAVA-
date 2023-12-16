package com.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.pojo.Books;
import com.pojo.IssueBook;
import com.pojo.MainMenu;
import com.pojo.ReturnBook;
import com.pojo.Student;

public class Library {

	ArrayList<Books> booksArrayList = new ArrayList<Books>();
	ArrayList<Student> studentArrayList = new ArrayList<Student>();
	ArrayList<IssueBook> IssueBookArrayList = new ArrayList<IssueBook>();
	ArrayList<ReturnBook> ReturnBookArrayList = new ArrayList<ReturnBook>();

	Scanner sc = new Scanner(System.in);

	public Library() {
		Books book1 = new Books();

		book1.setBookid(100);
		book1.setBookname("Mathematical Foundations for Computer Science");
		book1.setAuthorname("V. Balakrishnan");
		book1.setCopyno(0);

		booksArrayList.add(book1);

		Books book2 = new Books();
		book2.setBookid(101);
		book2.setBookname("Advanced Data Structures");
		book2.setAuthorname("E. Balaguruswamy");
		book2.setCopyno(5);
		booksArrayList.add(book2);

		Books book3 = new Books();
		book3.setBookid(102);
		book3.setBookname("Data Science");
		book3.setAuthorname("V.K. Jain");
		book3.setCopyno(5);
		booksArrayList.add(book3);

		Books book4 = new Books();
		book4.setBookid(103);
		book4.setBookname("Machine Learning");
		book4.setAuthorname("Vinod Chandra S.S.");
		book4.setCopyno(5);
		booksArrayList.add(book4);

		Books book5 = new Books();
		book5.setBookid(104);
		book5.setBookname("Research Methodology and IPR");
		book5.setAuthorname("Ranjit Kumar");
		book5.setCopyno(5);
		booksArrayList.add(book5);

		Books book6 = new Books();
		book6.setBookid(105);
		book6.setBookname("Ethical Hacking");
		book6.setAuthorname("Harsh Bothra");
		book6.setCopyno(5);
		booksArrayList.add(book6);

		Books book7 = new Books();
		book7.setBookid(106);
		book7.setBookname("Advanced Wireless and Mobile Networks");
		book7.setAuthorname("Pandya Raj");
		book7.setCopyno(5);
		booksArrayList.add(book7);

		Books book8 = new Books();
		book8.setBookid(107);
		book8.setBookname("Operating System Design");
		book8.setAuthorname("M. Singhal");
		book8.setCopyno(5);
		booksArrayList.add(book8);

		Books book9 = new Books();
		book9.setBookid(108);
		book9.setBookname("Cluster and Grid Computing");
		book9.setAuthorname("Janakiram");
		book9.setCopyno(5);
		booksArrayList.add(book9);

		Books book10 = new Books();
		book10.setBookid(109);
		book10.setBookname("Introduction to Intelligent Systems");
		book10.setAuthorname("M.C.Trivedi");
		book10.setCopyno(5);
		booksArrayList.add(book10);

		Student student1 = new Student();
		student1.setStudentid(100);
		student1.setStudentname("Rahul");
		student1.setStudentdeptartment("Computer");
		student1.setStudentemail("Rahul@gmail.com");
		student1.setStudentcontact("9784563102");
		studentArrayList.add(student1);

		Student student2 = new Student();
		student2.setStudentid(101);
		student2.setStudentname("Rohit");
		student2.setStudentdeptartment("IT");
		student2.setStudentemail("Rohit@gmail.com");
		student2.setStudentcontact("7894561232");
		studentArrayList.add(student2);

		Student student3 = new Student();
		student3.setStudentid(102);
		student3.setStudentname("Manoj");
		student3.setStudentdeptartment("Civil");
		student3.setStudentemail("Manoj@gmail.com");
		student3.setStudentcontact("7412589630");
		studentArrayList.add(student3);

		Student student4 = new Student();
		student4.setStudentid(103);
		student4.setStudentname("Raj");
		student4.setStudentdeptartment("Mechanical");
		student4.setStudentemail("Raj@gmail.com");
		student4.setStudentcontact("9874512036");
		studentArrayList.add(student4);

		Student student5 = new Student();
		student5.setStudentid(104);
		student5.setStudentname("Ajay");
		student5.setStudentdeptartment("Computer");
		student5.setStudentemail("Ajay@gmail.com");
		student5.setStudentcontact("9547632102");
		studentArrayList.add(student5);

		Student student6 = new Student();
		student6.setStudentid(105);
		student6.setStudentname("Malhar");
		student6.setStudentdeptartment("IT");
		student6.setStudentemail("Malhar@gmail.com");
		student6.setStudentcontact("9587463210");
		studentArrayList.add(student6);

		Student student7 = new Student();
		student7.setStudentid(106);
		student7.setStudentname("Vicky");
		student7.setStudentdeptartment("Civil");
		student7.setStudentemail("vicky@gmail.com");
		student7.setStudentcontact("9654781230");
		studentArrayList.add(student7);

		Student student8 = new Student();
		student8.setStudentid(107);
		student8.setStudentname("Riya");
		student8.setStudentdeptartment("Mechanical");
		student8.setStudentemail("Riya@gmail.com");
		student8.setStudentcontact("7410235896");
		studentArrayList.add(student8);

		Student student9 = new Student();
		student9.setStudentid(108);
		student9.setStudentname("Lisa");
		student9.setStudentdeptartment("Computer");
		student9.setStudentemail("Lisa@gmail.com");
		student9.setStudentcontact("7598462103");
		studentArrayList.add(student9);

		Student student10 = new Student();
		student10.setStudentid(109);
		student10.setStudentname("Vivek");
		student10.setStudentdeptartment("Mechanical");
		student10.setStudentemail("Vivek@gmail.com");
		student10.setStudentcontact("8462153078");
		studentArrayList.add(student10);

	}

	public void showBooks() {
		System.out.println("Books Details : ");
		for (Books books : booksArrayList) {
			System.out.println(books + " \n");
		}
	}

	public void showStudents() {
		System.out.println("Students Details : ");
		for (Student student : studentArrayList) {
			System.out.println(student + " \n");
		}
	}

	public void issueBook() {

		showBooks();

		int initaialSize = IssueBookArrayList.size();// Checking arraylist initaial size

		System.out.println("Enter Book ID ");
		int bookid = sc.nextInt();

//		finding Book From BookArray
		Books b = new Books();
		int count = 0,cn=0;

		for (int i = 0; i < booksArrayList.size(); i++) {
			if (bookid == booksArrayList.get(i).getBookid()) {
				if (booksArrayList.get(i).getCopyno() > 0) {
					b = booksArrayList.get(i);
					count++;
					cn++;
				} else {
					System.out.println("Entered Book Is Out Of Stock... \n");
					count++;
					issueBook();
				}
//			System.out.println(b);
			}

		}
		if (count == 2) {
			System.out.println("Book Not Found \n");
			issueBook();

		}

		if (cn == 1) {

			System.out.println("Enter Student ID ");
			int studentid = sc.nextInt();

//		FInding Student from Student Array
			Student s = new Student();

			for (int i = 0; i < studentArrayList.size(); i++) {
				if (studentid == studentArrayList.get(i).getStudentid()) {

					s = studentArrayList.get(i);
					count++;
//				System.out.println(s);
				}
			}
			if (count != 2) {
				System.out.println("Student Data Not Found!... \n");
				issueBook();

//					System.out.println("Do You Want to Add New Student Data");
//					System.out.println("1.Yes 2.No");
//					int ch = sc.nextInt();

//			----Adding new Student Details----
//					if (ch == 1) {
//						addNewStudent();
//					} else {
//						MainMenu m = new MainMenu();
//						m.mainMenu();
//					}
			}

			// Setting Issue Date

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date today = new Date();
			String issuedate = formatter.format(today);

			// Setting return Date
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DATE, 15);
			String returnDate = sdf.format(c.getTime());

//		Adding all data to Issuebook ArrayList
			IssueBook issueBook = new IssueBook();
			issueBook.setBookId(b.getBookid());
			issueBook.setBookName(b.getBookname());
			issueBook.setBookAuthor(b.getAuthorname());
			issueBook.setS(s);
			issueBook.setIssueDate(issuedate);
			issueBook.setReturnDate(returnDate);

			IssueBookArrayList.add(issueBook);
		}

			int finalSize = IssueBookArrayList.size();// Checking if arraylist size has increased or not

			if (finalSize > initaialSize) {
				System.out.println("Booked Issueed Sucessfully!...\n");
				int decrementbook = b.getCopyno() - 1;
				b.setCopyno(decrementbook);

				showIssueBook();
			} else {
				System.out.println("Booked Not Issued!...\n");
			}
	}

	public void showIssueBook() {
		System.out.println("Issued Book Details ");
		for (IssueBook i : IssueBookArrayList) {
			if (i != null) {
				System.out.println(i + " \n");
			}
		}
	}

//	public void addNewStudent() {
//		Student student = new Student();
//		int id = studentArrayList.get(studentArrayList.size() - 1).getStudentid();
//		id = id + 1;
//		System.out.println("Enter Student Name: ");
//		String name = sc.next();
//		System.out.println("Enter Student Department: ");
//		String dept = sc.next();
//		System.out.println("Enter Student Email: ");
//		String email = sc.next();
//		System.out.println("Enter Student Contact: ");
//		String contact = sc.next();
//
//		student.setStudentid(id);
//		student.setStudentname(name);
//		student.setStudentdeptartment(dept);
//		student.setStudentemail(email);
//		student.setStudentcontact(contact);
//
//		studentArrayList.add(student);
//		
//		MainMenu m = new MainMenu();
//		m.mainMenu();
//
//	}
}
