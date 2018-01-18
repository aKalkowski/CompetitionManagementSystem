package com.andrzejkalkowski.CompetitionManagementSystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "competitor")
public class Competitor {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String licence;
    private int overallPoints;
    private boolean disqualified;

    public Competitor() {
    }

    public Competitor(String firstName, String lastName, String licence) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (licence != null) {
            this.licence = licence;
        } else {
            this.licence = "No licence id";
        }
        this.overallPoints = 0;
        this.disqualified = false;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLicence() {
        return licence;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public int getOverallPoints() {
        return overallPoints;
    }

    public void setOverallPoints(int overallPoints) {
        this.overallPoints = overallPoints;
    }

    public boolean isDisqualified() {
        return disqualified;
    }

    public void setDisqualified(boolean disqualified) {
        this.disqualified = disqualified;
    }

    public void disqualify() {
        this.setDisqualified(true);
    }

    public void addPoints(int points) {
        this.setOverallPoints(this.getOverallPoints() + points);
    }
}
