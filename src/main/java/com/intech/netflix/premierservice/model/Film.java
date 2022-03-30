package com.intech.netflix.premierservice.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.ForeignKey;

@Entity
@PrimaryKeyJoinColumn(name="id")
@DiscriminatorValue("F")
public class Film extends Media {

	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
