package com.lockedme;

public class Driver {
    public static void main(String args[]) {
        String applicationName = "LockedMe.com";
        String developerName = "JUNAD ALI";
        String developerEmail = "JUNAIDALIBESWA@GMAIL.com";
        String developerAddress = "Bangalore";
        WelcomeScreenModel welcomeScreenModel = new WelcomeScreenModel(applicationName,developerName,developerEmail,developerAddress);

        WelcomeScreenDisplay welcomeScreenDisplay = new WelcomeScreenDisplay(welcomeScreenModel);
        welcomeScreenDisplay.displayScreen();
    }
}
