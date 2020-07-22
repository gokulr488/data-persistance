package com.algols.datapersistance.dos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "T_SUB_EVENT_SEQ", sequenceName = "T_SUB_EVENT_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "EVN_ATR_LIST")
public class EvnAtrListDo {

	public EvnAtrListDo() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_SUB_EVENT_SEQ")
	@Column(name = "EVN_ATR_LIST_ID")
	private long evnAtrListId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUB_EVENT_ID")
	private TSubEventDo tSubEventDo;

	public long getEvnAtrListId() {
		return evnAtrListId;
	}

	public void setEvnAtrListId(long evnAtrListId) {
		this.evnAtrListId = evnAtrListId;
	}

	public TSubEventDo gettSubEventDo() {
		return tSubEventDo;
	}

	public void settSubEventDo(TSubEventDo tSubEventDo) {
		this.tSubEventDo = tSubEventDo;
	}

	@Override
	public String toString() {
		return "EvnAtrListDo [evnAtrListId=" + evnAtrListId + ", tSubEventDo=" + tSubEventDo + "]";
	}

}
