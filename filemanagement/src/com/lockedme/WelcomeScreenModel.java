package com.lockedme;

public class WelcomeScreenModel {
    private String applicationName;
    private String developerName;
    private String developerEmail;
    private String developerAddress;

    public WelcomeScreenModel(String applicationName, String developerName, String developerEmail, String developerAddress) {
        this.applicationName = applicationName;
        this.developerName = developerName;
        this.developerEmail = developerEmail;
        this.developerAddress = developerAddress;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getDeveloperEmail() {
        return developerEmail;
    }

    public void setDeveloperEmail(String developerEmail) {
        this.developerEmail = developerEmail;
    }

    public String getDeveloperAddress() {
        return developerAddress;
    }

    public void setDeveloperAddress(String developerAddress) {
        this.developerAddress = developerAddress;
    }
}
