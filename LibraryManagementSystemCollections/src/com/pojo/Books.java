package com.pojo;

public class Books {
	
	String bookname, authorname;
	int bookid, copyno;
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getCopyno() {
		return copyno;
	}
	public void setCopyno(int copyno) {
		this.copyno = copyno;
	}
	
	public String toString() {
		return "Books ID : " + getBookid() + ",  Name : " + getBookname() + ",\nAuthor Name : " + getAuthorname()
				+ ",  No. of Copys : " + getCopyno();
	}


}
