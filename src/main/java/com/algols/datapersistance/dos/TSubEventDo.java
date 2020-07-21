package com.algols.datapersistance.dos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "T_SUB_EVENT_SEQ", sequenceName = "T_SUB_EVENT_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "T_SUB_EVENT")
public class TSubEventDo {

	public TSubEventDo() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_SUB_EVENT_SEQ")
	@Column(name = "EVENT_SEQ")
	private long eventSeq;

	@Column(name = "EVENT_TYPE")
	private String eventType;

	@Column(name = "BUS_EVENT_TYPE")
	private String busEventType;

	@Column(name = "REQUEST_SEQ")
	private long requestSeq;

	@Column(name = "EVENT_DATE")
	private Date eventDate;

	@Column(name = "ICAP_ID")
	private long icapId;

	@Column(name = "CUSTOMER_ID")
	private String customerId;

	@Column(name = "ICAP_EVENT_SEQ")
	private long icapEventSeq;

	@Column(name = "REF_NO")
	private String refNo;

	// private List<SubDtlListDo> subDtlListDos;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getBusEventType() {
		return busEventType;
	}

	public void setBusEventType(String busEventType) {
		this.busEventType = busEventType;
	}

	public long getEventSeq() {
		return eventSeq;
	}

	public void setEventSeq(long eventSeq) {
		this.eventSeq = eventSeq;
	}

	public long getRequestSeq() {
		return requestSeq;
	}

	public void setRequestSeq(long requestSeq) {
		this.requestSeq = requestSeq;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public long getIcapId() {
		return icapId;
	}

	public void setIcapId(long icapId) {
		this.icapId = icapId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public long getIcapEventSeq() {
		return icapEventSeq;
	}

	public void setIcapEventSeq(long icapEventSeq) {
		this.icapEventSeq = icapEventSeq;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "TSubEventDo [eventSeq=" + eventSeq + ", eventType=" + eventType + ", busEventType=" + busEventType
				+ ", requestSeq=" + requestSeq + ", eventDate=" + eventDate + ", icapId=" + icapId + ", customerId="
				+ customerId + ", icapEventSeq=" + icapEventSeq + ", refNo=" + refNo + "]";
	}

}
