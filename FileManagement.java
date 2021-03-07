package collectiondemo;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FileManagement {
	public String directoryPath;
	
	public FileManagement(String directoryPath) {
		this.directoryPath = directoryPath;
	}

	public static void main(String[] args) throws IOException {
		String defaultPath = "D:/";
		FileManagement fileManagement = new FileManagement(defaultPath);
		WelcomeScreenDisplay screenDisplay = new WelcomeScreenDisplay("LockedMe","Junaid Ali","junaidalibeswa@gmail.com","bangalore");
		
		screenDisplay.displayScreen();
		fileManagement.startApplication();
		
	}
	
	public void startApplication() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			displayNavigation();
			
			int option = sc.nextInt();
			switch(option) {
			case 1: 
				displayFiles();
				break;
			case 2:
				System.out.print("Please Enter file name: ");
				addFile(sc.next());
				break;
			case 3:
				System.out.print("Please Enter file name: ");
				removeFile(sc.next());
				break;
			case 4:
				System.out.print("Please Enter directory path: ");
				setPath(sc.next());
			case 5: 
				System.out.println("Application is stopped");
				System.exit(0);
				break;
			default: System.out.println("Please Specify correct option");
				
			}
		}
		
	}
	
	public void displayNavigation() {
		WelcomeScreenDisplay screenDisplay = new WelcomeScreenDisplay();
		System.out.println();
		screenDisplay.displayHorizontalLines(50);
		
		System.out.println("1. Display all files under directory:"+directoryPath);
		System.out.println("2. Add file under directory:"+directoryPath);
		System.out.println("3. Remove file under directory:"+directoryPath);
		System.out.println("4. Change directory path");
		System.out.println("5. Exit from application");
		System.out.print("Please select one of the options given above: ");
	}
	
	// create new file under directory path which is already set
	public void addFile(String fileName ) {
		File file = new File(directoryPath,fileName);
		try {
			if(file.createNewFile()) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("There is some problem with File creation. Please retry");
			}
		}
		catch(IOException ex) {
			System.out.println("There is an Exception ocured while creating file:"+ex.getMessage());
		}
		
	}
	
	//remove the file from directory if it exists
	public void removeFile(String fileName) {
		File file = new File(directoryPath,fileName);
		if(file.exists()) {
			if(file.delete()) {
				System.out.println("File successfully deleted");
			}
			else {
				System.out.println("There is some problem with File deletion. Please retry");
			}
		}
		else {
			System.out.println("File does not exist");
		}
	}
	
	// display all files under same directory in ascending order
	public void displayFiles() {
		File file = new File(directoryPath);
		String fileLists[] = file.list();
		if(fileLists == null || fileLists.length == 0) {
			System.out.println("The directory "+directoryPath+ " is empty i.e. it contains no file");
		}
		else {
			List<String> list = Arrays.asList(fileLists);
			Collections.sort(list,String.CASE_INSENSITIVE_ORDER);;
			System.out.println("Files in Ascending order under directory:"+directoryPath);
			System.out.println(List.of(fileLists));
		}
	}
	
	public void setPath(String path) {
		this.directoryPath = path;
	}

}

class WelcomeScreenDisplay {
    
	private String applicationName;
    private String developerName;
    private String developerEmail;
    private String developerAddress;
    
    WelcomeScreenDisplay(){
    	
    }

    public WelcomeScreenDisplay(String applicationName, String developerName, String developerEmail, String developerAddress) {
        this.applicationName = applicationName;
        this.developerName = developerName;
        this.developerEmail = developerEmail;
        this.developerAddress = developerAddress;
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
        System.out.println("APPLICATION: "+applicationName.toUpperCase());
        displaySpaceTab(spaceTab);
        System.out.println("DEVELOPER: "+developerName.toUpperCase());
        displaySpaceTab(spaceTab);
        System.out.println("EMAL: "+developerEmail.toUpperCase());
        displaySpaceTab(spaceTab);
        System.out.println("ADDRESS: "+developerAddress.toUpperCase());
    }
    
    //to display apllication and developers details on screen
    public void displayScreen() {
        displayHorizontalLines(50);
        displayHorizontalLines(50);
        
        displayApplicationDetails(5);
        
        displayHorizontalLines(50);
        displayHorizontalLines(50);
    }

}