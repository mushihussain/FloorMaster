package com.floormaster.entities;

import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    private Double totalAmount;
    private Double depositPaid;

    // Optional client-side or service-layer calculation for balance
    public Double getBalance() {
        return totalAmount - depositPaid;
    }

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getDepositPaid() {
		return depositPaid;
	}

	public void setDepositPaid(Double depositPaid) {
		this.depositPaid = depositPaid;
	}

    // Getters and Setters
    
}
