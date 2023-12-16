package com.pojo;

public class ReturnBook {
	int bookId;
	String bookName, bookAuthor, returnDate;
	Student s;
//	String  issueDate;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
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

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

//	public String getIssueDate() {
//		return issueDate;
//	}
//
//	public void setIssueDate(String issueDate) {
//		this.issueDate = issueDate;
//	}

	public String toString() {

		return "Book ID : " + getBookId() + ",  Name : " + getBookName() + ",  Author : " + getBookAuthor() + "\n\n" + getS()
		/* + "\n\nIssue Date : " + getIssueDate() */ + "\n\nReturn Date : " + getReturnDate();
	}
}
