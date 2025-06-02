package com.floormaster.entities;

import jakarta.persistence.*;

@Entity
public class MeasurementDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long measurementId;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    private String locationName;
    private Double length;
    private Double width;
    private String notes;
	public Long getMeasurementId() {
		return measurementId;
	}
	public void setMeasurementId(Long measurementId) {
		this.measurementId = measurementId;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

    // Getters and Setters
    
    
}

