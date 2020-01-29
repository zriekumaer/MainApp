package com.ust.itembatch.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Received_Items")
public class ReceivedItem {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Column(name = "item_num", nullable = false)
	private int itemNumber;
	
	@NotNull
	@Column(name = "rcvd_qty", nullable = false)
	private int rcvdQty;
	
	@NotNull
	@Column(name = "po_num", nullable = false)
	private int poNum;
	
	@NotNull
	@Column(name = "storage_loc", nullable = false)
	private String storageLocation;
	
	@NotNull
	@Column(name = "mov_stat", nullable = false)
	private int movementStatus;
	
	@NotNull
	@Column(name = "comments", nullable = false)
	private String comments;
	
	@NotNull
	@Column(name = "curr_loc", nullable = false)
	private String currentLocation;
	
	@NotNull
	@Column(name = "timestamp", nullable = false)
	private Date timestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getRcvdQty() {
		return rcvdQty;
	}

	public void setRcvdQty(int rcvdQty) {
		this.rcvdQty = rcvdQty;
	}

	public int getPoNum() {
		return poNum;
	}

	public void setPoNum(int poNum) {
		this.poNum = poNum;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public int getMovementStatus() {
		return movementStatus;
	}

	public void setMovementStatus(int movementStatus) {
		this.movementStatus = movementStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
