
public class ContactLinkedList<T>{

	private Node<T> head;
	private Node<T> current; 
			

	public ContactLinkedList() {
			
		head = current = null;
			
	}

	public ContactLinkedList(Node<T> head){
			
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
		 
	public void update(T val){ 
		
		current.data = val;
		
	}
		
		
	public boolean last(){
		
		return current.next == null;
	
	}
		
		
		
    //add
	
	public void add(T n){
			
		Node<T> newNode = new Node<>(n);		
			
		if(exist((Contact) n)){
			
			System.out.println("\nThe contact already exist's");
			
			return;
			
		}
		
		if(isEmpty()){
			
			head = newNode;
			
			return;
			
		}
		
		if(head == null || ((Contact)head.getData()).getContactName().replaceAll("\\s+","").compareToIgnoreCase(((Contact)newNode.getData()).getContactName().replaceAll("\\s+","")) > 0){
				
			newNode.next = head;
				
			head = newNode;
			

			System.out.println("\nContact added successfully!");
			
		}
		else{
				 
			Node current = head;
			
			while(current.next != null && ((Contact)current.next.getData()).getContactName().replaceAll("\\s+","").compareToIgnoreCase(((Contact)newNode.getData()).getContactName().replaceAll("\\s+","")) < 0){
			        
				current = current.next;
			     
			}
			     
			newNode.next = current.next;
			    
			current.next = newNode;
			     
			current = current.next;
			

			System.out.println("\nContact added successfully!");
			
			}
		}
	
	
	// search
	
	public void search(String s, int n){
		
		int c = 0;
			
		if(isEmpty())
		   return; 
				
			
		current = head;
			
		while(current != null){
			
			if(n == 1) {
			
				if(s.equals(((Contact) current.getData()).getContactName())){
					
					System.out.println("\nContact found!");
					
					System.out.println("\nName;" + ((Contact) current.getData()).getContactName());
							
					System.out.println("Phone Number;" + ((Contact) current.getData()).getPhoneNumber());
							
					System.out.println("Email Address;" + ((Contact) current.getData()).getEmailAddress());
				   
					System.out.println("Address;" + ((Contact) current.getData()).getAddress());
											
					System.out.println("Birthday;" + ((Contact) current.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) current.getData()).getNote());
					
					 return; 
				
				
					//System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
				
				}
				
			}
				
			if(n == 2){
			
				if(s.equals(((Contact) current.getData()).getPhoneNumber())){
					
					System.out.println("\nContact found!");
					
					System.out.println("\nName:" + ((Contact) current.getData()).getContactName());
					
					System.out.println("Phone Number:" + ((Contact) current.getData()).getPhoneNumber());
							
					System.out.println("Email Address:" + ((Contact) current.getData()).getEmailAddress());
				   
					System.out.println("Address:" + ((Contact) current.getData()).getAddress());
											
					System.out.println("Birthday:" + ((Contact) current.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) current.getData()).getNote());
			
					 return; 
					 
		     		//System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
							
				}
				
			}
				
			if(n == 3){
				
				if(s.equals(((Contact) current.getData()).getEmailAddress())){
					
					if(c == 0)
					System.out.println("\nContact found!");
					
					System.out.println("\nName:" + ((Contact) current.getData()).getContactName());
					
					System.out.println("Phone Number:" + ((Contact) current.getData()).getPhoneNumber());
							
					System.out.println("Email Address:" + ((Contact) current.getData()).getEmailAddress());
				   
					System.out.println("Address:" + ((Contact) current.getData()).getAddress());
											
					System.out.println("Birthday:" + ((Contact) current.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) current.getData()).getNote());
					
					c++;
					 
			    	//System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
					
				}
				
			}
			
			if(n == 4){
			
				if(s.equals(((Contact) current.getData()).getAddress())){
					
					if(c == 0)
					System.out.println("\nContact found!");
					
					System.out.println("\nName:" + ((Contact) current.getData()).getContactName());
					
					System.out.println("Phone Number:" + ((Contact) current.getData()).getPhoneNumber());
							
					System.out.println("Email Address:" + ((Contact) current.getData()).getEmailAddress());
				   
					System.out.println("Address:" + ((Contact) current.getData()).getAddress());
											
					System.out.println("Birthday:" + ((Contact) current.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) current.getData()).getNote());

					c++;
					
					//System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
				
				}
				
			}
			
			if(n == 5){
			
				if(s.equals(((Contact) current.getData()).getBirthday())){
					
					if(c == 0)
					System.out.println("\nContact found!");
					
					System.out.println("\nName:" + ((Contact) current.getData()).getContactName());
					
					System.out.println("Phone Number:" + ((Contact) current.getData()).getPhoneNumber());
							
					System.out.println("Email Address:" + ((Contact) current.getData()).getEmailAddress());
				   
					System.out.println("Address:" + ((Contact) current.getData()).getAddress());
											
					System.out.println("Birthday:" + ((Contact) current.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) current.getData()).getNote());
					
					c++;

				//System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());	
			
				}
				
			
			}
			
			current = current.next;
			
			}
			
		if(c == 0)
			
			System.out.println("\nContact not found!"); 
			 
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
	
    public boolean displayContactFound(String firstName){
		
		Node<T> current = head;
		
		while(current != null) {
			
			int ind = ((Contact) current.getData()).getContactName().indexOf(' ');
			
			String fName = ((Contact)current.getData()).getContactName().substring(0,ind);
			
			if(fName.equalsIgnoreCase(firstName)){
			
				System.out.println("\nContacts found!");
				
				return true;
				
			}	
			
			current = current.next;
			
		}
		
		System.out.println("\nContacts not found!");
		
		return false;
		
	}
	
	public boolean exist(Contact c){
			
		
		Node<Contact> current = (Node<Contact>) head;
			
		while(current != null){
				
			if(current.getData().getContactName().compareTo(c.getContactName()) == 0 || current.getData().getPhoneNumber().compareTo(c.getPhoneNumber()) == 0)
				
				return true;
				
					
			current = current.getNext();
			
				
			}
			
			return false;

		}


	}


