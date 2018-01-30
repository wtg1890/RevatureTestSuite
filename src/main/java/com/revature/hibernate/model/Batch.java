package com.revature.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BATCH")
public class Batch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="batch_seq")
	@SequenceGenerator(name="batch_seq", allocationSize=1, initialValue=1)
	@Column(name="BATCH_ID", nullable=false, updatable=false)
	private int batchId;
	
	@Column(name = "BATCH_NAME", nullable=false)
	private String batchName;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="trainerId")
	private Trainer trainer;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="roomId")
	private Room room;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="curriculumId")
	private Curriculum curriculum;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="focusId", nullable=true)
	private Focus focus;
	
	public Batch() {
		super();
	}
	
	public Batch(String name) {
		this.batchName = name;
	}
	
	
	
	public int getBatchId() {
		return batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public Room getRoom() {
		return room;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	public Focus getFocus() {
		return focus;
	}

	public void setFocus(Focus focus) {
		this.focus = focus;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchId;
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + ((curriculum == null) ? 0 : curriculum.hashCode());
		result = prime * result + ((focus == null) ? 0 : focus.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		if (batchId != other.batchId)
			return false;
		if (batchName == null) {
			if (other.batchName != null)
				return false;
		} else if (!batchName.equals(other.batchName))
			return false;
		if (curriculum == null) {
			if (other.curriculum != null)
				return false;
		} else if (!curriculum.equals(other.curriculum))
			return false;
		if (focus == null) {
			if (other.focus != null)
				return false;
		} else if (!focus.equals(other.focus))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (trainer == null) {
			if (other.trainer != null)
				return false;
		} else if (!trainer.equals(other.trainer))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + "]";
	}
	
}
