
public class i {

	
public int length(){
		
		if(isEmpty())
			return 0;
		
		int c = 0;
		
		Node<T> current = head;
		
		while(current != null) {
			
			c++;
			
			current = current.next;
			
		}
		
		return c;
		
	}

 
case 3:
	
	//Delete we are using the phone number since it's unique 
	
	System.out.println("\nEnter delete criteria: ");
	
	System.out.println("1.Name");

	System.out.println("2.PhoneNumber");
	
	

	System.out.print("\nEnter your choice:");
	
	int choice2 = input.nextInt();
	

	if(choice2 == 1){
		
		System.out.print("\nEnter the contact's name that you want to delete:");
		
		input.nextLine();
		
		String n = input.nextLine();
		
		contactList.findfirst();
		
		for(int i = 0 ; i < contactList.length() ; i++) {
			
			
			if(contactList.retrieve().getContactName().equals(n)){
				
				if(!EventList.isEmpty()){
					
				EventList.findfirst();
				
				for(int j = 0 ; i < EventList.length() ; i++) {
					
					if(EventList.retrieve().getContact().getContactName().equals(n)){
						
						EventList.delete(EventList.retrieve());
						
					}
					
					EventList.findnext();
				}
				
				}
				
				if(contactList.retrieve().getContactName().equals(n)) {
					
					contactList.delete(contactList.retrieve());
					System.out.println("\nThe contact has been deleted");
					
					break;

				}
				
			}
			
			contactList.findnext();
		
		}
		
	}
	
	if(choice2 == 2) {

	System.out.print("\nEnter the contact's phone number that you want to delete:");

	String ph = input.next();

	contactList.findfirst();
	
	for(int i = 0 ; i < contactList.length() ; i++) {
		
		
		if(contactList.retrieve().getPhoneNumber().equals(ph)){
			
			if(!EventList.isEmpty()){
				
			EventList.findfirst();
			
			for(int j = 0 ; i < EventList.length() ; i++) {
				
				if(EventList.retrieve().getContact().getPhoneNumber().equals(ph)){
					
					EventList.delete(EventList.retrieve());
					
				}
				
				EventList.findnext();
			}
			
			}
			
			if(contactList.retrieve().getPhoneNumber().equals(ph)) {
				
				contactList.delete(contactList.retrieve());
				System.out.println("\nThe contact has been deleted");
				
				break;

			}
			
		}
		
		contactList.findnext();
	
	}
	
}

	break;


	
	
}
