package com.athensoft.entity;

public class ItemViewObjectItemCategory extends Item{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5042581075401565743L;
	private Long categoryId;
	private String categoryCode;
	private String categoryName;
	private Integer CategoryStatusId;
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getCategoryStatusId() {
		return CategoryStatusId;
	}
	public void setCategoryStatusId(Integer categoryStatusId) {
		CategoryStatusId = categoryStatusId;
	}
	
	

}
