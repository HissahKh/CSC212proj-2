
class Contact implements Comparable<String>{
    
	private String contactName;
	private String phoneNumber;
	private String emailAddress;
	private String address;
	private String birthday;
	private String notes;


	public Contact(){
		
		contactName = null;
		phoneNumber = null;
		emailAddress = null;
		address = null;
		birthday = null;
		notes = null;
		
	}

	public Contact(Contact c){
		
		contactName = c.contactName;
		phoneNumber = c.phoneNumber;
		emailAddress = c.emailAddress;
		address = c.address;
		birthday = c.birthday;
		notes = c.notes;
		
	}

	public Contact(String contactName, String phoneNumber, String emailAddress, String address, String birthday, String notes){
		
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		this.birthday =birthday;
		this.notes = notes;
		
	}
	
	
	//setter's
	
	
	public void setContactName(String n){
			
		contactName = n;
			
	}

	public void setPhoneNumber(String p){
			
		phoneNumber = p;
			
	}	

	public void setEmailAddress(String e){
			
		emailAddress = e;
			
	}

	public void setAddress(String a){
			
		address = a;
			
	}

	public void setBirthday(String b){
			
		birthday = b;
			
	}

	public void setNotes(String no){
			
		notes = no;
			
	}


	
	// getter's
	
	
	public String getContactName(){
		
		return contactName;
		
	}

	public String getPhoneNumber(){
		
		return phoneNumber;
		
	}

	public String getEmailAddress(){
		
		return emailAddress;
		
	}

	public String getAddress(){
		
		return address;
		
	}

	public String getBirthday(){
		
		return birthday;
		
	}

	public String getNote(){
		
		return notes;
		
	}
	

	
	public void display(){
		
		System.out.println("\nName:" + getContactName());
		System.out.println("Phone Number:" + getPhoneNumber());
		System.out.println("Email Address:" + getEmailAddress());
		System.out.println("Address:" + getAddress());
		System.out.println("Birthday:" + getBirthday());	
		System.out.println("Notes:" + getNote() + "\n");		

	}

	
	@Override
	public int compareTo(String s){
		
		return contactName.compareTo(s);
		
	}

	public int compareTo(Contact c){
		
		return contactName.compareTo(c.contactName);
		
	}

}