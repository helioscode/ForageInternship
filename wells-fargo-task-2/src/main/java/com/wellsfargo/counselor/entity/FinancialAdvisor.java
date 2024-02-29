package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="advisor_id")
    private int advisorId;

    @Column(name="first_name")
    private String firstName;

    @Column (name="last_name")
    private String lastName;

    @Column (name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="working_hours")
    private String workingHours;

    public FinancialAdvisor(int advisorId, String firstName, String lastName, String email, String phone, String workingHours) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.workingHours = workingHours;
    }

    public int getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
}
