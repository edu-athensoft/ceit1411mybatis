package com.athensoft.test.entity;

import java.io.Serializable;

public class Item implements Serializable {
	private static final long serialVersionUID = 5086111460442658533L;
	private Long itemId;
	private String itemCode;
	private String itemName;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemCode=" + itemCode + ", itemName=" + itemName + "]";
	}

}
