public class EventLinkedList<T>{

	private Node<T> head;
	private Node<T> current; 
		

	public EventLinkedList() {
				
		head = current = null;
			
	}

	public EventLinkedList(Node<T> head) {
			
		this.head = head;
			
	}
	
	
		
	public boolean isEmpty(){
			
		return head == null;
			
	}
		
	public void findfirst(){
		
		current = head;
		
	}
		
	public void findnext(){ 
		
		current = current.next;
	}
	
	public T retrieve(){
		
		return current.data; 
		
	}
		 
	public void update (T val){ 
		
		current.data = val;
		
	}
		
		
	public boolean last(){
			
		return current.next == null;
			
	}
		
		
		
	// add
	
	public void add(T n){
		
		Node<T> newNode = new Node<>(n);
		
		Contact contact = ((Event)newNode.getData()).getContact();
		
		
		if ( head == null || ((Event)head.getData()).getEventTitle().replaceAll("\\s+","").compareToIgnoreCase(((Event)newNode.getData()).getEventTitle().replaceAll("\\s+","")) > 0){
			
			newNode.next = head;
			
			head = newNode;
			
			System.out.println("\nEvent scheduled successfully!");
			
		}
		
		else{
			
			Node current = head;
			
			while (current.next != null && ((Event)current.next.getData()).getEventTitle().replaceAll("\\s+","").compareToIgnoreCase(((Event)newNode.getData()).getEventTitle().replaceAll("\\s+","")) < 0){
			
				current = current.next;
			
			}
			
			newNode.next = current.next;
			
			current.next = newNode;
			
			current = current.next;
			
			System.out.println("\nEvent scheduled successfully!");
			
		}
	}


	// search
	
	public void search(String s, int n) {
			
		if(isEmpty()){
			
		System.out.print("There is no events");
		
		return;
		
		}
			
		current = head;
			
		while(current != null){
		
		if(n == 1){
			
			if(s.equals(((Event) current.getData()).getContact().getContactName())){
				
				System.out.println("\nEvent found!");
				
				System.out.println("Event title:" + ((Event)current.getData()).getEventTitle());
				
				System.out.println("Contact name:" + ((Event)current.getData()).getContact().getContactName());
				
				System.out.println("Event date and time(MM/DD/YYYYHH:MM):" + ((Event)current.getData()).getDateAndTime());
				
				System.out.println("Event location:" + ((Event)current.getData()).getLocation());
		
				
				//System.out.println(((Event)current.getData()).getEventTitle() + " , " + ((Event) current.getData()).getDateAndTime() + " , "  + ((Event) current.getData()).getLocation() + " , " + "Contact: " + ((Event) current.getData()).getContact().getContactName() + " , " + ((Event) current.getData()).getContact().getPhoneNumber() + " , " + ((Event) current.getData()).getContact().getEmailAddress() + " , " + ((Event) current.getData()).getContact().getAddress() + " , " + ((Event) current.getData()).getContact().getBirthday());;
				
			}
		}
			
		
		if(n == 2){
			
			if(s.equals(((Event)current.data).getEventTitle())){
				
				System.out.println("\nEvent found!");
				
				System.out.println("Event title:" + ((Event)current.getData()).getEventTitle());
				
				System.out.println("Contact name:" + ((Event)current.getData()).getContact().getContactName());
				
				System.out.println("Event date and time(MM/DD/YYYYHH:MM):" + ((Event)current.getData()).getDateAndTime());
				
				System.out.println("Event location:" + ((Event)current.getData()).getLocation());
					
				//System.out.println(((Event) current.getData()).getEventTitle() + " , " + ((Event) current.getData()).getDateAndTime() + " , "  + ((Event) current.getData()).getLocation() + " , " + "Contact: " + ((Event) current.getData()).getContact().getContactName() + " , " + ((Event) current.getData()).getContact().getPhoneNumber() + " , " + ((Event) current.getData()).getContact().getEmailAddress() + " , " + ((Event) current.getData()).getContact().getAddress() + " , " + ((Event) current.getData()).getContact().getBirthday());;					
			
			}
				
		}
			
		current = current.next;
		
	}
		
	return;
			
	}
	
	
	public void delete(T d){
		
		if(isEmpty())
			return ;
		
		if(head.getData().equals(d)){
			
			head = head.getNext();
			return;
			
		}
		else{
			
            Node<T> current = head.getNext();
           
            Node<T> previous = head;
            	
			while (current != null){
				
				if(current.getData().equals(d))
					
					previous.setNext(current.getNext());
				
				else{
					
					previous = current;
					
					current = current.getNext();
		
				}
				
			}
					
		}
		
	}
	
	public void displayEvents(){
		
		if(isEmpty())
			System.out.println("\nTheres no event's");
		else 
			System.out.println("\nevent's:");
		
		Node<T> current = head;
		
		while(current != null) {
			
			((Event)current.data).display();
			
			current = current.next;
			
		}
		
	}
		
}