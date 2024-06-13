package com.sse.ooseproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends Person{
    private String staffNumber;
    private boolean isProfessor;

    // Default constructor required by Spring
    public Employee() {}

    // Constructor with parameters
    public Employee(String firstName, String lastName, String email, String staffNumber, boolean isProfessor) {
        super(firstName, lastName, email);
        this.staffNumber = staffNumber;
        this.isProfessor = isProfessor;
    }

    // Getters and setters
    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public boolean isProfessor() {
        return isProfessor;
    }

    public void setProfessor(boolean isProfessor) {
        this.isProfessor = isProfessor;
    }
}
