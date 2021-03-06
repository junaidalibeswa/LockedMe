package com.lockedme;

public class WelcomeScreenDisplay {
    private WelcomeScreenModel screenInformation;

    public WelcomeScreenDisplay(WelcomeScreenModel screenInformation) {
        this.screenInformation = screenInformation;
    }

    public void displayHorizontalLines(int length) {
        String line = "";
        for(int i=0; i < length; i++) {
            line += "-";
        }
        System.out.println(line);
    }

    public void displaySpaceTab(int length) {
        String space = "";
        for(int i=0; i < length; i++){
            space += " ";
        }
        System.out.print(space);
    }

    public void displayApplicationDetails(int spaceTab) {
        displaySpaceTab(spaceTab);
        System.out.println("APPLICATION:"+screenInformation.getApplicationName().toUpperCase());
        displaySpaceTab(spaceTab);
        System.out.println("DEVELOPER"+screenInformation.getDeveloperName().toUpperCase());
        displaySpaceTab(spaceTab);
        System.out.println("EMAL:"+screenInformation.getDeveloperEmail().toUpperCase());
        displaySpaceTab(spaceTab);
        System.out.println("ADDRESS:"+screenInformation.getDeveloperAddress().toUpperCase());
    }

    public void displayScreen() {
        displayHorizontalLines(50);
        displayHorizontalLines(50);
        displayApplicationDetails(5);
        displayHorizontalLines(50);
        displayHorizontalLines(50);
    }

}
