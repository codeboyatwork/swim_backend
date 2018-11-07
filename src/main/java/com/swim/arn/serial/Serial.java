package com.swim.arn.serial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.swim.arn.ASN.ASN;

@Entity
public class Serial {
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private long serialId;
	 @ManyToOne
	 @JoinColumn(name = "asn_number")
	 private ASN asn;
	 private String serialStatus;
	public long getSerialId() {
		return serialId;
	}
	public void setSerialId(long serialId) {
		this.serialId = serialId;
	}
	/*public String getAsnNumber() {
		return asnNumber;
	}
	public void setAsnNumber(String asnNumber) {
		this.asnNumber = asnNumber;
	}*/
	public String getSerialStatus() {
		return serialStatus;
	}
	public void setSerialStatus(String serialStatus) {
		this.serialStatus = serialStatus;
	}
}
