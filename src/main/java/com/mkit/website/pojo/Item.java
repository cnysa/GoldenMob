package com.mkit.website.pojo;


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
	private String uuid;
	private String keyWords;
	private String category;
	
	
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
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [title=" + title + ", author=" + author + ", postDate="
				+ postDate + ", imgURL=" + imgURL + ", uuid=" + uuid
				+ ", keyWords=" + keyWords + ", category=" + category + "]";
	}
	
	
	
}
