package com.pojo;

import java.util.Scanner;

import com.dao.Library;

public class MainMenu {

	public void mainMenu() {
		Scanner sc1 = new Scanner(System.in);

		Library lib = new Library();

		System.out.println("Welcome to Library");
		System.out.println("Enter Operation To Perform");

		int exitchoice = 1;
		do {
			System.out.println("1.Show Books, \n2.Show Student Details, \n3.Issue Book, \n4.Transaction Details,"
					+ " \n5.Return Book ");
			int choice = sc1.nextInt();
			System.out.println(" ");

			switch (choice) {

			case 1:
				lib.showBooks();
				break;

			case 2:
				lib.showStudents();
				break;

			case 3:
				lib.issueBook();
				break;

			default:
				System.out.println("Invalid Choice,  Please try again!....");

			}
			System.out.println("Do You Want to Continue......");
			System.out.println("1.Yes \t 2. NO");
			exitchoice = sc1.nextInt();
		} while (exitchoice == 1);

		System.out.println("Thank You For Visiting..... \nHave A Nice Day!");
		
		sc1.close();
	}

}
