import java.util.Scanner;

public class PhoneBook {
	
	static Scanner input = new Scanner(System.in);
	
	
	static ContactLinkedList <Contact> contactList = new ContactLinkedList<Contact>();
	
	static EventLinkedList <Event> EventList = new EventLinkedList<Event>();
	
	
	public static void main(String [] args) {
		
		
		System.out.println("Welcome to the Linked Tree Phonebook!");
		
		int ch = 0;
		
		do{
			System.out.println("\nPlease choose an option:");
			System.out.println("1.Add a contact");
			System.out.println("2.Search for a contact");
			System.out.println("3.Delete a contact");
			System.out.println("4.Schedule an event");
			System.out.println("5.Print event details");
			System.out.println("6.Print contacts by firstname");
			System.out.println("7.Print all events alphabetically");
			System.out.println("8.Exit");
			
			System.out.print("\nEnter your choice:");
			
			int choice = input.nextInt();
			
			
			switch (choice){
	
			case 1:
	
				//Add a Contact
	
				System.out.print("\nEnter the contact's name:");
	
				input.nextLine();
	
				String name = input.nextLine();
		
				System.out.print("Enter the contact's phone number:");
		
				String number = input.next();
		
				System.out.print("Enter the contact's email address:");
		
				String email = input.next();
	
				System.out.print("Enter the contact's address:");
				
				input.nextLine();
	
				String adress = input.nextLine();
	
				System.out.print("Enter the contact's birthday:");
	
				String Birthday = input.next();
	
				System.out.print("Enter any notes for the contact:");
				
				input.nextLine();
	
				String note = input.nextLine();
				
		
				Contact newContact = new Contact(name , number , email , adress , Birthday , note); //creating new contact
	
	
				contactList.add(newContact); //adding the contact to the list by order
		
				break;
		
		
		
				case 2:
					
					//search
		
					System.out.println("\nEnter search criteria: ");
	
					System.out.println("1.Name");
		
					System.out.println("2.PhoneNumber");
		
					System.out.println("3.Email Address");
		
					System.out.println("4.Address");
		
					System.out.println("5.Birthday");
					
					
					System.out.print("\nEnter your choice:");
		
					
					int choice1 = input.nextInt();
					
					input.nextLine();
	
					
					switch (choice1){
		
					case 1:
		
						System.out.print("\nEnter the contact name:");
		
						String n2 = input.nextLine();
		
						contactList.search(n2, choice1); //in the search method it will print the details of the contacts
		
						break;
		
					case 2:
		
						System.out.print("\nEnter the phone number:");
		
						String p2 = input.next();
		
						contactList.search(p2, choice1);
		
						break;
		
					case 3:
		
						System.out.print("\nEnter the Email:");
		
						String e2 = input.next();
			
						contactList.search(e2, choice1);
			
						break;
		
					case 4:
		
						System.out.print("\nEnter the Address:");
		
		
						String a2 = input.nextLine();
		
						contactList.search(a2, choice1);
		
						break;
		
					case 5:
	
						System.out.print("\nEnter the Birthday:");
		
						String b2 = input.next();
		
						contactList.search(b2, choice1);
		
						break;
		
					}
					
					input.nextLine();
		
					break;
		
		
		
	
				case 3:
		
					//Delete we are using the phone number since it's unique 
					
					System.out.println("\nEnter delete criteria: ");
					
					System.out.println("1.Name");
		
					System.out.println("2.PhoneNumber");
					
					
				
					System.out.print("\nEnter your choice:");
					
					int choice2 = input.nextInt();
					

					if(choice2 == 1) {
						
						System.out.print("\nEnter the contact's name that you want to delete:");
						
						input.nextLine();
						
						String n = input.nextLine();
						
						contactList.findfirst();
						
						while(!contactList.last()){
			
							if(contactList.retrieve().getContactName().equals(n)){
								
								if(!EventList.isEmpty()) {
									
								EventList.findfirst();
								
							while(!EventList.last()){
								
								if(EventList.retrieve().getContact().getContactName().equals(n)){
									
									EventList.delete(EventList.retrieve());
									
								}
								
								EventList.findnext();
								
							}
							
							if(EventList.retrieve().getContact().getContactName().equals(n)){
								
								EventList.delete(EventList.retrieve());
							
							}
							
							}
							}
							if(contactList.retrieve().getContactName().equals(n)) {
								
								contactList.delete(contactList.retrieve());
								System.out.println("\nThe contact has been deleted"); 
								
							}
							
							contactList.findnext();
						}
						
						if(contactList.retrieve().getContactName().equals(n)) {
							
							if(!EventList.isEmpty()) {
							EventList.findfirst();
							
							while(!EventList.last()) {
								
								if(EventList.retrieve().getContact().getContactName().equals(n)) {
									
									EventList.delete(EventList.retrieve());
								}
								
								EventList.findnext();
							}
							
							if(EventList.retrieve().getContact().getContactName().equals(n)) {
								
								EventList.delete(EventList.retrieve());
							}
							
							}

							contactList.delete(contactList.retrieve());
							
							System.out.println("\nThe contact has been deleted");}
						
						
						
					}
					
					
					if(choice2 == 2) {
		
					System.out.print("\nEnter the contact's phone number that you want to delete:");
		
					String ph = input.next();
	
					contactList.findfirst();
	
					while(!contactList.last()){
		
						if(contactList.retrieve().getPhoneNumber().equals(ph)){
							
							if(!EventList.isEmpty()) {
								
							EventList.findfirst();
							
						while(!EventList.last()){
							
							if(EventList.retrieve().getContact().getPhoneNumber().equals(ph)){
								
								EventList.delete(EventList.retrieve());
								
							}
							
							EventList.findnext();
							
						}
						
						if(EventList.retrieve().getContact().getPhoneNumber().equals(ph)){
							
							EventList.delete(EventList.retrieve());
						
						}
						
						}
						}
						if(contactList.retrieve().getPhoneNumber().equals(ph)) {
							
							contactList.delete(contactList.retrieve());
							System.out.println("\nThe contact has been deleted"); 
							
						}
						
						contactList.findnext();
					}
					
					if(contactList.retrieve().getPhoneNumber().equals(ph)) {
						
						if(!EventList.isEmpty()) {
						EventList.findfirst();
						
						while(!EventList.last()) {
							
							if(EventList.retrieve().getContact().getPhoneNumber().equals(ph)) {
								
								EventList.delete(EventList.retrieve());
							}
							
							EventList.findnext();
						}
						
						if(EventList.retrieve().getContact().getPhoneNumber().equals(ph)) {
							
							EventList.delete(EventList.retrieve());
						}
						
						}

						contactList.delete(contactList.retrieve());
						
						System.out.println("\nThe contact has been deleted");}
					
					}
		
					break;
		
		
				case 4:
					
					//add an event 
					
					System.out.print("\nEnter event title:");
					
					input.nextLine();
	
					String title = input.nextLine();
	
					System.out.print("Enter contact name:");
	
					String contact_n = input.nextLine();
	
					Contact contact1 = null;
	
					contactList.findfirst();
	
	
					while(!contactList.last()){
						
						if(contactList.retrieve().getContactName().replaceAll("\\s+","").equalsIgnoreCase(contact_n.replaceAll("\\s+",""))){//Search for the contact by name and retrieve it 
							
							contact1 = contactList.retrieve();
						}
						
						contactList.findnext();
						
					}
					
					if(contactList.retrieve().getContactName().replaceAll("\\s+","").equalsIgnoreCase(contact_n.replaceAll("\\s+",""))){ //check for the last element
						
						contact1 = contactList.retrieve();
						
					}
					
					if(contact1 == null) {
						
						System.out.println("\nThe contact doesn't exist");
						
						break;
					}
					
					System.out.print("Enter event date and time(MM/DD/YYYY HH:MM):");
				
					String date_time = input.nextLine();
					
					System.out.print("Enter event location:");
		
					String location = input.nextLine();
	
					Event newEvent = new Event(title , date_time , location , contact1);
		
					EventList.add(newEvent);
					
					break;
		
				case 5:
		
					System.out.println("\nEnter search criteria:");
		
					System.out.println("1.contact name");
	
					System.out.println("2.Event tittle");
					
					System.out.print("\nEnter your choice:");
	
					int ch1 = input.nextInt();
					
					input.nextLine();
	
					if(ch1 == 1){
						
						System.out.print("\nEnter the contact name:");
						
					
						String name2 = input.nextLine();
						
						EventList.search(name2, ch1);
						
					}
					
					if(ch1 == 2) {
						
						System.out.print("\nEnter the event title:");
						
						
						String title2 = input.nextLine();
						
						EventList.search(title2, ch1);
						
					}
					
					System.out.print("\nif you want to see the contacts that shares the same event please press (y):");
					
					char enter = input.next().charAt(0);
					
					if( enter == 'y' || enter == 'Y') {
						
					System.out.print("\nPlease enter the event title:");
					
					input.nextLine();
					
					String event_title = input.nextLine();
									
					displaySameEvent(event_title);
					
					}
					
					input.nextLine();

					break;

		
	
				case 6:
	
					
					System.out.print("\nEnter the first name:");
		
					String Contact_firstName = input.next();
	
					displayContactFirstName(Contact_firstName);
	
					
				break;
		
		
				case 7:
					
					EventList.displayEvents(); //>> calling the method for display
					
				break;


				case 8:
					
					System.out.println("\nGoodbye!");
					
					ch = 8; //Exit
					
					break;
	
				default:
	
					System.out.println("Please enter the correct number!");
	
			}
	

		}while(ch != 8);

contactList.findfirst();
while(!contactList.last()) {
	System.out.println(contactList.retrieve().getContactName());
	contactList.findnext();
	
}
System.out.println(contactList.retrieve().getContactName());
contactList.findnext();

}

	public static void displayContactFirstName(String n){ //display contact who have the same first name.{
			
			
			if(contactList.displayContactFound(n)){

				contactList.findfirst();
			
				while(!contactList.last()){ 
			
				String [] full_name = contactList.retrieve().getContactName().split(" ");
			
				String first_name = full_name[0]; //to get the first name
			
					
					if(first_name.equalsIgnoreCase(n)){
			
						System.out.println("\nName:" + contactList.retrieve().getContactName());
					
						System.out.println("Phone Number:" + contactList.retrieve().getPhoneNumber());
							
						System.out.println("Email Address:" + contactList.retrieve().getEmailAddress());
				   
						System.out.println("Address:" + contactList.retrieve().getAddress());
											
						System.out.println("Birthday:" + contactList.retrieve().getBirthday());
													
						System.out.println("Notes:" + contactList.retrieve().getNote());
			
						contactList.findnext();
					}
				}
					
				String [] all_name = contactList.retrieve().getContactName().split(" ");
				
				String first_name = all_name[0];
				
				if(first_name.equalsIgnoreCase(n)) {
						
					System.out.println("\nName:" + contactList.retrieve().getContactName());
					
					System.out.println("Phone Number:" + contactList.retrieve().getPhoneNumber());
						
					System.out.println("Email Address:" + contactList.retrieve().getEmailAddress());
			   
					System.out.println("Address:" + contactList.retrieve().getAddress());
										
					System.out.println("Birthday:" + contactList.retrieve().getBirthday());
												
					System.out.println("Notes:" + contactList.retrieve().getNote());
				}
		}
		
	}

	public static void displaySameEvent(String e) { //display contact with the same event
		
		EventList.findfirst();
		
			while(!EventList.last()){
				
				if(EventList.retrieve().getEventTitle().equalsIgnoreCase(e)){
				
					System.out.println(EventList.retrieve().getContact().getContactName());
				}
				
				EventList.findnext();
			
		}
			
		if(EventList.retrieve().getEventTitle().equalsIgnoreCase(e)){
			
			System.out.println(EventList.retrieve().getContact().getContactName());
			
		}
	}
	
	/*public static void displayEventDetails(int c)
	{
		if(c == 1) {
		
			System.out.println("Enter the contact name: ");
			input.nextLine();
			String name1 = input.nextLine();
			e1.search(name1, c);
			
		}
		
		if(c == 2) {
		
			System.out.println("Enter the event title: ");
			input.nextLine();
			String name1 = input.nextLine();
			e1.search(name1, c);
		
		}
	}*/
	
	//displayEvents >> O(n)
	/*public static void displayEvents()// Print all events alphabetically >> its already ordered when we add the events >> so we just need to print it normally
	{
				e1.findfirst();
		while(!e1.last())
		{
			Event e2 = e1.retrieve();
			System.out.println(e2.getEventTitle() + "," + e2.getDateAndTime() + "," + e2.getLocation() + "," + e2.getContact().getContactName());
			e1.findnext();
		}
		Event e2 = e1.retrieve();
		System.out.println(e2.getEventTitle() + "," + e2.getDateAndTime() + "," + e2.getLocation() + "," + e2.getContact().getContactName());// for the last element
	}
	
	
	*/
	
}