package cn.appsys.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class bookInfo {
	
	public int bookId;
	public String bookCode;
	public String bookName;
	public int bookType;
	public String bookAuthor;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookType() {
		return bookType;
	}
	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getPublishPress() {
		return publishPress;
	}
	public void setPublishPress(String publishPress) {
		this.publishPress = publishPress;
	}
	public String getUblishDate() throws ParseException {
		return ublishDate;
	}
	public void setUblishDate(String ublishDate) {
		this.ublishDate = ublishDate;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getLastUpdatetime() {
		return lastUpdatetime;
	}
	public void setLastUpdatetime(String lastUpdatetime) {
		this.lastUpdatetime = lastUpdatetime;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(int borrowed) {
		this.borrowed = borrowed;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String publishPress;
	public String ublishDate;
	public String tname;
	public int borrowed;
	public String createdBy;
	public String creationTime;
	public String lastUpdatetime;

}
