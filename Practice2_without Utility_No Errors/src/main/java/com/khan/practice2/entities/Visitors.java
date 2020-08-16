package com.khan.practice2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class Visitors {

	@Id
	private int id;
	private String permitNo;
	private String dateValidFrom;
	private String dateValidTo;
	private String address;

	private String contactDetails;
	private String issuedBy;
	private String comments;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPermitNo() {
		return permitNo;
	}
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}
	public String getDateValidFrom() {
		return dateValidFrom;
	}
	public void setDateValidFrom(String dateValidFrom) {
		this.dateValidFrom = dateValidFrom;
	}
	public String getDateValidTo() {
		return dateValidTo;
	}
	public void setDateValidTo(String dateValidTo) {
		this.dateValidTo = dateValidTo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Visitors [id=" + id + ", permitNo=" + permitNo + ", dateValidFrom=" + dateValidFrom + ", dateValidTo="
				+ dateValidTo + ", address=" + address + ", contactDetails=" + contactDetails + ", issuedBy=" + issuedBy
				+ ", comments=" + comments + "]";
	}
	
	
}
