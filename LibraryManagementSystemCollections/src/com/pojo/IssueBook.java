package com.pojo;

public class IssueBook {
	int bookId;
	String bookName, bookAuthor, issueDate, returnDate;
	Student s;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookid) {
		this.bookId = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student stu) {
		this.s = stu;
	}

	public String toString() {

		return "Book ID : " + getBookId() + ",  Name : " + getBookName() + ",  Author : " + getBookAuthor()
				+ "\n\nStudent ID : " + getS().getStudentid() + ", Name : " + getS().getStudentname()
				+ ", Department : " + getS().getStudentdeptartment() + "\n\nIssue Date : " + getIssueDate()
				+ "\n\nReturn Date : " + getReturnDate();
	}

}
