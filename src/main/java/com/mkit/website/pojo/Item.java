package com.mkit.website.pojo;

import java.util.Date;

/**
 * Items对应页面的每一个标签
 * @author yang
 *
 */
public class Item {

	private String title;
	private String author;
	private String postDate;
	private String imgURL;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	
	@Override
	public String toString() {
		return "Items [title=" + title + ", author=" + author + ", postDate="
				+ postDate + ", imgURL=" + imgURL + "]";
	}
	
}