package com.floormaster.entities;


import jakarta.persistence.*;

@Entity
public class TeamMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamMemberId;

    private String name;
    private String phone;
    private String role; // "Measurement", "Fitting", "Admin"
	public Long getTeamMemberId() {
		return teamMemberId;
	}
	public void setTeamMemberId(Long teamMemberId) {
		this.teamMemberId = teamMemberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

    // Getters and Setters
    
}

