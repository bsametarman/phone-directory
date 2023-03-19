
public class Person {
	private String personName;
	private String workPhoneNumber;
	private String homePhoneNumber;
	private String cellPhoneNumber;
	
	public Person(String personName, String workPhoneNumber, String homePhoneNumber, String cellPhoneNumber) {
		this.personName = personName;
		this.workPhoneNumber = workPhoneNumber;
		this.homePhoneNumber = homePhoneNumber;
		this.cellPhoneNumber = cellPhoneNumber;
	}
	
	public Person() {
		
	}
	
	public String getPersonName(){
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getWorkPhoneNumber() {
		return workPhoneNumber;
	}
	
	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}
	
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}	
	
}
