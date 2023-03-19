
public class ListElement {
	public Person person;
	public ListElement next;
	
	public ListElement() {
		this.person = null;
		this.next = null;
	}
	
	public ListElement(Person person) {
		this.person = person;
		this.next = null;
	}
}
