package com.lxs.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBook<M extends BaseBook<M>> extends Model<M> implements IBean {

	public M setBookId(java.lang.Integer bookId) {
		set("book_id", bookId);
		return (M)this;
	}
	
	public java.lang.Integer getBookId() {
		return getInt("book_id");
	}

	public M setBookTypes(java.lang.Integer bookTypes) {
		set("book_types", bookTypes);
		return (M)this;
	}
	
	public java.lang.Integer getBookTypes() {
		return getInt("book_types");
	}

	public M setBookTypesMore(java.lang.String bookTypesMore) {
		set("book_types_more", bookTypesMore);
		return (M)this;
	}
	
	public java.lang.String getBookTypesMore() {
		return getStr("book_types_more");
	}

	public M setBookTitle(java.lang.String bookTitle) {
		set("book_title", bookTitle);
		return (M)this;
	}
	
	public java.lang.String getBookTitle() {
		return getStr("book_title");
	}

	public M setBookUser(java.lang.Integer bookUser) {
		set("book_user", bookUser);
		return (M)this;
	}
	
	public java.lang.Integer getBookUser() {
		return getInt("book_user");
	}

	public M setBookAuto(java.lang.String bookAuto) {
		set("book_auto", bookAuto);
		return (M)this;
	}
	
	public java.lang.String getBookAuto() {
		return getStr("book_auto");
	}

	public M setBookHot(java.lang.Integer bookHot) {
		set("book_hot", bookHot);
		return (M)this;
	}
	
	public java.lang.Integer getBookHot() {
		return getInt("book_hot");
	}

	public M setBookImg(java.lang.String bookImg) {
		set("book_img", bookImg);
		return (M)this;
	}
	
	public java.lang.String getBookImg() {
		return getStr("book_img");
	}

	public M setBookChapter(java.lang.Integer bookChapter) {
		set("book_chapter", bookChapter);
		return (M)this;
	}
	
	public java.lang.Integer getBookChapter() {
		return getInt("book_chapter");
	}

	public M setBookHots(java.lang.Integer bookHots) {
		set("book_hots", bookHots);
		return (M)this;
	}
	
	public java.lang.Integer getBookHots() {
		return getInt("book_hots");
	}

	public M setBookView(java.lang.Integer bookView) {
		set("book_view", bookView);
		return (M)this;
	}
	
	public java.lang.Integer getBookView() {
		return getInt("book_view");
	}

	public M setBookContent(java.lang.String bookContent) {
		set("book_content", bookContent);
		return (M)this;
	}
	
	public java.lang.String getBookContent() {
		return getStr("book_content");
	}

	public M setBookDates(java.util.Date bookDates) {
		set("book_dates", bookDates);
		return (M)this;
	}
	
	public java.util.Date getBookDates() {
		return get("book_dates");
	}

}