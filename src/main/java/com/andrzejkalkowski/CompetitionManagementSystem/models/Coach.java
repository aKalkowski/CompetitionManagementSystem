package com.andrzejkalkowski.CompetitionManagementSystem.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Coach {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String coachLicence;
    private Category category;

    public Coach() {
    }

    public Coach(int id, String firstName, String lastName, String coachLicence, Category category) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.coachLicence = coachLicence;
        this.category = category;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCoachLicence(String coachLicence) {
        this.coachLicence = coachLicence;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCoachLicence() {
        return coachLicence;
    }

    public Category getCategory() {
        return category;
    }
}
