import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static void printMenu() {
		System.out.println("\nWelcome to The Phone Directory!\n" 
					+ "1. Add new person\n"
					+ "2. Delete\n" 
					+ "3. Count of persons\n" 
					+ "4. Search with name\n" 
					+ "5. Search with number\n" 
					+ "6. List all\n" 
					+ "7. Exit\n");
	}
	
	public static ListElement generateListElement(String personName, String personWorkPhoneNumber, String personHomePhoneNumber, String personCellPhoneNumber) {
		Person person = new Person(personName, personWorkPhoneNumber, personHomePhoneNumber, personCellPhoneNumber);
		ListElement listElement = new ListElement(person);
		return listElement;
	}
	
	private static void waitTime() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		int key;
		
		String personName, personWorkPhoneNumber, personHomePhoneNumber, personCellPhoneNumber, personGeneralNumber;
		
		Scanner sc = new Scanner(System.in);
		
		List list = new List();
		
		
		do {
			printMenu();
			key = sc.nextInt();
			
			switch(key) {
				case 1:
					sc.nextLine();
					System.out.println("Enter a name: ");
					personName = sc.nextLine();
					System.out.println("Enter business phone number: ");
					personWorkPhoneNumber = sc.nextLine();
					System.out.println("Enter home phone number: ");
					personHomePhoneNumber = sc.nextLine();
					System.out.println("Enter cell phone number: ");
					personCellPhoneNumber = sc.nextLine();
					list.add(generateListElement(personName, personWorkPhoneNumber, personHomePhoneNumber, personCellPhoneNumber));
					waitTime();
					break;
				case 2:
					System.out.println("Enter the name of person you want to delete from directory: ");
					sc.nextLine();
					personName = sc.nextLine();
					list.delete(personName);
					waitTime();
					break;
				case 3:
					list.getNumberOfElements();
					waitTime();
					break;
				case 4:
					System.out.println("Enter the name of person you want to search: ");
					sc.nextLine();
					personName = sc.nextLine();
					list.findPersonByName(personName);
					waitTime();
					break;
				case 5:
					System.out.println("Enter the phone number of person you want to search: ");
					sc.nextLine();
					personGeneralNumber = sc.nextLine();
					list.findPersonByNumber(personGeneralNumber);
					waitTime();
					break;
				case 6:
					list.printList();
					waitTime();
					break;
				case 7:
					System.out.println("Exit was successful !!!");
					waitTime();
					break;
			}
		}
		while(key != 7);
	}
}
