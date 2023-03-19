
public class List {
	private ListElement first;
	private int numberOfElements;
	private boolean isSuccess;
	
	public List() {
		first = null;
		numberOfElements = 0;
		isSuccess = false;
	}
	
	public void add(ListElement newList) {
		if(first == null) {
			first = newList;
			numberOfElements++;
			System.out.println("Person has been added successfully !");
		}
		else {
			ListElement temp = first;
			while(temp != null) {
				if(temp.next == null) {
					temp.next = newList;
					numberOfElements++;
					System.out.println("Person has been added successfully !");
					break;
				}
				temp = temp.next;
			}
		}
	}
	
	public void printList() {
		if(first == null)
			System.out.println("List is empty !!!");
		else {
			ListElement temp = first;
			while(temp != null) {
				System.out.println("\n-------------------\n" 
								+ "Name: " + temp.person.getPersonName() + "\n" 
								+ "Office Phone Number: " + temp.person.getWorkPhoneNumber() + "\n" 
								+ "Home Phone Number: " + temp.person.getHomePhoneNumber() + "\n" 
								+ "Cell Phone Number: " + temp.person.getCellPhoneNumber() + "\n"
								+ "-------------------");
				temp = temp.next;
			}
		}
	}
	
	public void delete(String personName) {
		
		ListElement temp = first;
		ListElement prev = null;
		
		if(temp == null)
			System.out.println("List is empty !!!");
		else if(first.person.getPersonName().equalsIgnoreCase(personName)) {
			first = first.next;
			isSuccess = true;
			numberOfElements--;
			System.out.println(temp.person.getPersonName() + " has been deleted successfully !!!");
		}
		else {
			while(temp != null) {
				if(temp.person.getPersonName().equalsIgnoreCase(personName)) {
					prev.next = temp.next;
					numberOfElements--;
					isSuccess = true;
					System.out.println(temp.person.getPersonName() + " has been deleted successfully !!!");
					break;
				}
				prev = temp;
				temp = temp.next;
			}
			if(!isSuccess)
				System.out.println("The person is not in the directory !");
			isSuccess = false;
		}
	}
	
	public void getNumberOfElements() {
		System.out.println(numberOfElements + " person is in the directory.");
	}
	
	public void findPersonByName(String personName) {
		
		ListElement temp = first;
		int index = 1;
		
		if(temp == null)
			System.out.println("List is empty !!!");
		else {
			while(temp != null) {
				if(temp.person.getPersonName().equalsIgnoreCase(personName)) {
					System.out.println("\nThe Person is in the " + index + ". order."
							+ "\n-------------------\n" 
							+ "Name: " + temp.person.getPersonName() + "\n" 
							+ "Office Phone Number: " + temp.person.getWorkPhoneNumber() + "\n" 
							+ "Home Phone Number: " + temp.person.getHomePhoneNumber() + "\n" 
							+ "Cell Phone Number: " + temp.person.getCellPhoneNumber() + "\n"
							+ "-------------------");
					isSuccess = true;
					break;
				}
				index++;
				temp = temp.next;
			}
		}
		if(!isSuccess)
			System.out.println("The person is not in the directory !!!");
		isSuccess = false;
	}
	
	public void findPersonByNumber(String personPhoneNumber) {
		
		ListElement temp = first;
		int index = 1;
		
		if(temp == null)
			System.out.println("List is empty !!!");
		else {
			while(temp != null) {
				if(temp.person.getWorkPhoneNumber().equalsIgnoreCase(personPhoneNumber) || temp.person.getHomePhoneNumber().equalsIgnoreCase(personPhoneNumber) || temp.person.getCellPhoneNumber().equalsIgnoreCase(personPhoneNumber)) {
					System.out.println("\nThe Person is in the " + index + ". order."
							+ "\n-------------------\n" 
							+ "Name: " + temp.person.getPersonName() + "\n" 
							+ "Office Phone Number: " + temp.person.getWorkPhoneNumber() + "\n" 
							+ "Home Phone Number: " + temp.person.getHomePhoneNumber() + "\n" 
							+ "Cell Phone Number: " + temp.person.getCellPhoneNumber() + "\n"
							+ "-------------------");
					isSuccess = true;
					break;
				}
				index++;
				temp = temp.next;
			}
			if(!isSuccess)
				System.out.println("The person with " + personPhoneNumber + " number is not in the directory !!!");
			isSuccess = false;
		}
	}
}
