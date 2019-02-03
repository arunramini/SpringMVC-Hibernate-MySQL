package com.jwt.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Sales")
public class Sales implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 15L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	@Column
	private String county;
	@Column
	private String itemType;
	@Column
	private String sales;
	@Column
	private String channel;
	@Column
	private String priority;
	@Column
	private String date;
	@Column
	private String shipdate;
	@Column
	private int units;
	@Column
	private int price;
	@Column
	private int unitCost;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getShipdate() {
		return shipdate;
	}
	public void setShipdate(String shipdate) {
		this.shipdate = shipdate;
	}

	
}
