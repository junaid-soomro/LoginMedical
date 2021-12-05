package com.example.dark.login_medical.Models;

/**
 * Created by abd on 09-Feb-18.
 */

public class PatientReports {

    String ID,NAME;

    public PatientReports(String ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }

    public String getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }
}
