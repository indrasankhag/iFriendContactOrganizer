import java.util.*;
class contactList{
	private Contact start;
	
	public void add(Contact contact){
		if (start==null){
			start=contact;
		}else{
			Contact temp=start;
			while (temp.next!=null){
				temp=temp.next;
			}
			temp.next=contact;
		}
	}
	public void updateName(int index, String name){
		Contact temp=start;
		int i=0;
		while (i<index){
			temp=temp.next;
			i++;
		}		
        temp.setName(name);
    }
	public void updateTpno(int index, String tpNumber){
		Contact temp=start;
		int i=0;
		while (i<index){
			temp=temp.next;
			i++;
		}		
        temp.setTpNumber(tpNumber);
    }
	public void updateComName(int index, String comName){
		Contact temp=start;
		int i=0;
		while (i<index){
			temp=temp.next;
			i++;
		}		
        temp.setComName(comName);
    }
    public void updateSalary(int index, double salary){
		Contact temp=start;
		int i=0;
		while (i<index){
			temp=temp.next;
			i++;
		}		
        temp.setSalary(salary);		
    }
	public int searchByNameOrPhoneNumber(String nameOrPhone){
        Contact temp=start;
        int i=0;
        while(temp!=null){
            if(temp.getName().equals(nameOrPhone) || temp.getTpNumber().equals(nameOrPhone)){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    } 
    public void remove(int index){
		Contact temp=start;
		if (index>=0 && size()> index){
			if (index==0){
				start=temp.next;
			}
			int count=0;
			while (count<index-1){
				temp=temp.next;
				count++;
			}
			temp=temp.next.next;
		}
    }
 
    public void printDetails(int index){
		Contact temp=start;
		int i=0;
		while (i<index){
			temp=temp.next;
			i++;
		}
		System.out.println();
        System.out.println("\tContact Id : "+temp.getContactId());
        System.out.println("\tName : "+temp.getName());
        System.out.println("\tPhone Number : "+temp.getTpNumber());
        System.out.println("\tCompany Name : "+temp.getComName());
        System.out.println("\tSalary : "+temp.getSalary());
        System.out.println("\tBirthday : "+temp.getBirthDay());
    }
    public int size(){
		Contact temp=start;
		int size=0;
		while (temp!=null){
			temp=temp.next;
			size++;
		}
		return size;
	}
	
	public void sortName(){
		Scanner input=new Scanner(System.in);
		for(Contact i = start; i.next != null; i = i.next){
			for(Contact j = i.next; j != null; j = j.next){
				if (i.getName().compareTo(j.getName()) > 0){
					String tempName = i.getName();
					i.setName(j.getName());
					j.setName(tempName);
					
					String tempContactId = i.getContactId();
					i.setContactId(j.getContactId());
					j.setContactId(tempContactId);
					
					String tempTpNumber = i.getTpNumber();
					i.setTpNumber(j.getTpNumber());
					j.setTpNumber(tempTpNumber);
					
					String tempComName = i.getComName();
					i.setComName(j.getComName());
					j.setComName(tempComName);
					
					double tempSalary = i.getSalary();
					i.setSalary(j.getSalary());
					j.setSalary(tempSalary);
					
					String tempBirthDay = i.getBirthDay();
					i.setBirthDay(j.getBirthDay());
					j.setBirthDay(tempBirthDay);
				}
			}
		}

		System.out.println();
		System.out.println("                 +------------------------------------------------------------+");
		System.out.println("                 |                   List Contact by Name                     |");
		System.out.println("                 +------------------------------------------------------------+");
		System.out.println();
		System.out.println("+----------------------------------------------------------------------------------------------+");	
		System.out.println("|  Contact ID  |     Name     |  Phone Number  |    Company    |     Salary     |   Birthday   |");
		System.out.println("+----------------------------------------------------------------------------------------------+");
		Contact temp=start;
		while(temp!=null){
			System.out.printf("|     %-9s| %-13s|   %-13s|  %-13s|    %-12.1f|  %-12s|",temp.getContactId(),temp.getName(),temp.getTpNumber(),temp.getComName(),temp.getSalary(),temp.getBirthDay());
			System.out.println();
			temp=temp.next;
		}
		System.out.println("+----------------------------------------------------------------------------------------------+\n");	
		System.out.print("Do you want to go Home page(Y/N): ");
		char ch=input.next().charAt(0);
		iFriendContactOrganizer.clearConsole();
		if(ch=='y'||ch=='Y'){
			iFriendContactOrganizer.homepage();
		}else if(ch=='n'||ch=='N'){
			iFriendContactOrganizer.listContacts();
		}else{
			System.out.println("\n	Incorrect input...");
			return;
		}				
	}	
	public void sortSalary(){
		Scanner input=new Scanner(System.in);
		for(Contact i = start; i.next != null; i = i.next){
			for(Contact j = i.next; j != null; j = j.next){
				if (i.getSalary()>j.getSalary()){
					String tempName = i.getName();
					i.setName(j.getName());
					j.setName(tempName);
					
					String tempContactId = i.getContactId();
					i.setContactId(j.getContactId());
					j.setContactId(tempContactId);
					
					String tempTpNumber = i.getTpNumber();
					i.setTpNumber(j.getTpNumber());
					j.setTpNumber(tempTpNumber);
					
					String tempComName = i.getComName();
					i.setComName(j.getComName());
					j.setComName(tempComName);
					
					double tempSalary = i.getSalary();
					i.setSalary(j.getSalary());
					j.setSalary(tempSalary);
					
					String tempBirthDay = i.getBirthDay();
					i.setBirthDay(j.getBirthDay());
					j.setBirthDay(tempBirthDay);
				}
			}
		}
		System.out.println();
		System.out.println("                 +------------------------------------------------------------+");
		System.out.println("                 |                   List Contact by Salary                   |");
		System.out.println("                 +------------------------------------------------------------+");
		System.out.println();
		System.out.println("+----------------------------------------------------------------------------------------------+");	
		System.out.println("|  Contact ID  |     Name     |  Phone Number  |    Company    |     Salary     |   Birthday   |");
		System.out.println("+----------------------------------------------------------------------------------------------+");
		Contact temp=start;
		while(temp!=null){
			System.out.printf("|     %-9s| %-13s|   %-13s|  %-13s|    %-12.1f|  %-12s|",temp.getContactId(),temp.getName(),temp.getTpNumber(),temp.getComName(),temp.getSalary(),temp.getBirthDay());
			System.out.println();
			temp=temp.next;
		}
		System.out.println("+----------------------------------------------------------------------------------------------+\n");	
		System.out.print("Do you want to go Home page(Y/N): ");
		char ch=input.next().charAt(0);
		iFriendContactOrganizer.clearConsole();
		if(ch=='y'||ch=='Y'){
			iFriendContactOrganizer.homepage();
		}else if(ch=='n'||ch=='N'){
			iFriendContactOrganizer.listContacts();
		}else{
			System.out.println("\n	Incorrect input...");
			return;
		}
	}
	public void sortBirthday(){
		Scanner input=new Scanner(System.in);
		for(Contact i = start; i.next != null; i = i.next){
			for(Contact j = i.next; j != null; j = j.next){
				if (i.getBirthDay().compareTo(j.getBirthDay()) > 0){
					String tempName = i.getName();
					i.setName(j.getName());
					j.setName(tempName);
					
					String tempContactId = i.getContactId();
					i.setContactId(j.getContactId());
					j.setContactId(tempContactId);
					
					String tempTpNumber = i.getTpNumber();
					i.setTpNumber(j.getTpNumber());
					j.setTpNumber(tempTpNumber);
					
					String tempComName = i.getComName();
					i.setComName(j.getComName());
					j.setComName(tempComName);
					
					double tempSalary = i.getSalary();
					i.setSalary(j.getSalary());
					j.setSalary(tempSalary);
					
					String tempBirthDay = i.getBirthDay();
					i.setBirthDay(j.getBirthDay());
					j.setBirthDay(tempBirthDay);
				}
			}
		}
	
		System.out.println();
		System.out.println("                 +------------------------------------------------------------+");
		System.out.println("                 |                   List Contact by Birthday                 |");
		System.out.println("                 +------------------------------------------------------------+");
		System.out.println();
		System.out.println("+----------------------------------------------------------------------------------------------+");	
		System.out.println("|  Contact ID  |     Name     |  Phone Number  |    Company    |     Salary     |   Birthday   |");
		System.out.println("+----------------------------------------------------------------------------------------------+");
		Contact temp=start;
		while(temp!=null){
			System.out.printf("|     %-9s| %-13s|   %-13s|  %-13s|    %-12.1f|  %-12s|",temp.getContactId(),temp.getName(),temp.getTpNumber(),temp.getComName(),temp.getSalary(),temp.getBirthDay());
			System.out.println();
			temp=temp.next;
		}
		System.out.println("+----------------------------------------------------------------------------------------------+\n");	
		System.out.print("Do you want to go Home page(Y/N): ");
		char ch=input.next().charAt(0);
		iFriendContactOrganizer.clearConsole();
		if(ch=='y'||ch=='Y'){
			iFriendContactOrganizer.homepage();
		}else if(ch=='n'||ch=='N'){
			iFriendContactOrganizer.listContacts();
		}else{
			System.out.println("\n	Incorrect input...");
			return;
		}			
	}
	
	static class Contact{
		private String contactId;
		private String name;
		private String tpNumber;
		private String comName;
		private double salary;
		private String birthDay;
		private Contact next;
		
		Contact(String contactId,String name,String tpNumber,String comName,double salary,String birthDay){
			this.contactId=contactId;
			this.name=name;
			this.tpNumber=tpNumber;
			this.comName=comName;
			this.salary=salary;
			this.birthDay=birthDay;
		}
		
		public void setContactId(String contactId){
			this.contactId=contactId;
		}
		public void setName(String name){
			this.name=name;
		}
		public void setTpNumber(String tpNumber){
			this.tpNumber=tpNumber;
		}
		public void setComName(String comName){
			this.comName=comName;
		}
		public void setSalary(double salary){
			this.salary=salary;
		}
		public void setBirthDay(String birthDay){
			this.birthDay=birthDay;
		}
		
		public String getContactId(){
			return contactId;
		}
		public String getName(){
			return name;
		}
		public String getTpNumber(){
			return tpNumber;
		}
		public String getComName(){
			return comName;
		}
		public double getSalary(){
			return salary;
		}
		public String getBirthDay(){
			return birthDay;
		}
	}	
}

class iFriendContactOrganizer{
	public static contactList conList=new contactList();
	public final static void clearConsole() { 
		try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
			}
		} catch (final Exception e) {
				e.printStackTrace();
			
		}
	}	
	public static void homepage(){
		Scanner input=new Scanner(System.in);
		System.out.println("           /$$ /$$$$$$$$/$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$             ");
		System.out.println("           |__/| $$____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$           ");
		System.out.println("            /$$| $$     | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$           ");
		System.out.println("           | $$| $$$$$  | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$           ");
		System.out.println("           | $$| $$__/  | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$           ");
		System.out.println("           | $$| $$     | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$           ");
		System.out.println("           | $$| $$     | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/           ");
		System.out.println("           |__/|__/     |__/  |__/|______/|________/|__/  \\__/|_______/            ");
		System.out.println();
		System.out.println();
		System.out.println();	
		System.out.println("   _____            _             _          ____                        _               ");
		System.out.println("  / ____|          | |           | |        / __ \\                      (_)              ");	
		System.out.println(" | |     ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __  ");	
		System.out.println(" | |    / _ \\| '_ \\| __/ _` |/ __| __/ __| | |  | | '__/ _` |/ _' | '_ \\| |_  / _ \\ '__| ");	
		System.out.println(" | |___| (_) | | | | || |_| | |__| |_\\__ \\ | |__| | | | |_| | |_| | | | | |/ /  __/ |    ");	
		System.out.println("  \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|    ");	
		System.out.println("                                                        __/ |                            ");
		System.out.println("                                                       |___/                             ");	
		System.out.println();
		System.out.println("========================================================================================");
		System.out.println();
		System.out.println("	[01] ADD Contacts\n");
		System.out.println("	[02] UPDATE Contacts\n");
		System.out.println("	[03] DELETE Contacts\n");
		System.out.println("	[04] SEARCH Contacts\n");
		System.out.println("	[05] List Contacts\n");
		System.out.println("	[06] Exit\n");
		System.out.println();
		System.out.print("Enter an option to continue -> ");
		int option=input.nextInt();
		clearConsole();
		switch (option){
			case 1:
				addContacts();
				break;
			case 2:
				updateContacts();
				break;
			case 3:
				deleteContacts();
				break;
			case 4:
				searchContacts();
				break;
			case 5:
				 listContacts();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("\n	Incorrect input...");
		}	
	}
	public static boolean checkValidTp(String tp){
		boolean valid=false;
		int count=1;
		if (tp.charAt(0)=='0'&&tp.length()==10){
			for (int i = 1; i < 10; i++){
				if(tp.charAt(i)=='0'||tp.charAt(i)=='1'||tp.charAt(i)=='2'||tp.charAt(i)=='3'||tp.charAt(i)=='4'||tp.charAt(i)=='5'||tp.charAt(i)=='6'||tp.charAt(i)=='7'||tp.charAt(i)=='8'||tp.charAt(i)=='9'){
					count++;
				}
			}
			if(count==10){
				valid=true;
			}
		}
		return valid;
	}
	public static boolean checkValidBirthDay(String bd){
		boolean validbd=false;
		int year=Integer.valueOf(bd.substring(0,4));
		int month=Integer.valueOf(bd.substring(5,7));
		int days=Integer.valueOf(bd.substring(8,10));
		char leap='N';
		if(year%4==0||year%400==0&&year%100!=0){
			leap='Y';
		}else{
			leap='N';
		}
		char d=' ';
			switch(month){
				case 1:
					if(days<=31){
						d='y';
					}
					break;
				case 2:
					if(leap=='Y'){
						if(days<=29){
						d='y';
						}
					}
					if(leap=='N'){
						if(days<=28){
						d='y';
						}
					}
					break;
				case 3:
					if(days<=31){
						d='y';
					}
					break;
				case 4:
					if(days<=30){
						d='y';
					}
					break;
				case 5:
					if(days<=31){
						d='y';
					}
					break;
				case 6:
					if(days<=30){
						d='y';
					}
					break;
				case 7:
					if(days<=31){
						d='y';
					}
					break;
				case 8:
					if(days<=31){
						d='y';
					}
					break;
				case 9:
					if(days<=30){
						d='y';
					}
					break;
				case 10:
					if(days<=31){
						d='y';
					}
					break;
				case 11:
					if(days<=30){
						d='y';
					}
					break;
				case 12:
					if(days<=31){
						d='y';
					}
					break;
			}
		if(year<2024&&month<=12&&d=='y'&&month>0&&days!=0){
			validbd=true;
		}
		return validbd;
	}	
	public static int contactId=0;
	public static String generateContactId(){
		contactId++;
		String cid=contactId+"";
		String c=cid.length()==1?"C000"+contactId:cid.length()==2?"C00"+contactId:cid.length()==3?"C0"+contactId:"C"+contactId;
		return c;
	}
	public static void addContacts(){
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println(" +---------------------------------------------+");
		System.out.println(" |           Add Contact to the list           |");
		System.out.println(" +---------------------------------------------+");
		System.out.println();
		System.out.println();
		String ci=generateContactId();
		System.out.println(" "+ci);
		System.out.println(" =====\n");
		
		System.out.print(" Name             : ");
		String name=input.nextLine();
		
		char ch=' ';
		String tpNumber="";
		do{
			System.out.print(" Phone Number     : ");
			tpNumber=input.nextLine();
			if(!checkValidTp(tpNumber)){
				System.out.print("	Invalid phone number...\n");
				System.out.print("Do you want to add phone number again(Y/N): ");
				ch=input.nextLine().charAt(0);
				if (ch=='Y'|ch=='y'){
					System.out.print("\033[3A");
					System.out.print("\033[0J");
				}else if(ch=='N'|ch=='n'){
					homepage();
				}else{
					System.out.println("\n	Incorrect input...");
					return;
				} 
			}
		}while(!checkValidTp(tpNumber));

		System.out.print(" Company Name     : ");
		String comName=input.nextLine();
		double salary=0;
		do{
			System.out.print(" Salary           : ");
			salary=input.nextDouble();
			if(salary<0){
				System.out.print("	Invalid salary...\n");
				System.out.print("Do you want to add salary again(Y/N): ");
				ch=input.next().charAt(0);
				if (ch=='Y'|ch=='y'){
					System.out.print("\033[3A");
					System.out.print("\033[0J");
				}else if(ch=='N'|ch=='n'){
					homepage();
				}else{
					System.out.println("\n	Incorrect input...");
					return;
				} 
			}
		}while(salary<0);
		String bDay="";
		do{
			System.out.print(" B'Day(YYYY-MM-DD): ");
			bDay=input.next();
			if(!checkValidBirthDay(bDay)){
				System.out.print("	Invalid Birthday...\n");
				System.out.print("Do you want to add phone number again(Y/N): ");
				ch=input.next().charAt(0);
				if (ch=='Y'|ch=='y'){
					System.out.print("\033[3A");
					System.out.print("\033[0J");
				}else if(ch=='N'|ch=='n'){
					homepage();
				}else{
					System.out.println("\n	Incorrect input...");
					return;
				} 
			}
		}while(!checkValidBirthDay(bDay));
		conList.add(new contactList.Contact(ci,name,tpNumber,comName,salary,bDay));
			
		System.out.print("\n	Contact has been added successfuly...\n\n");
		System.out.print("Do you want to add another Contact(Y/N): ");
		char op=input.next().charAt(0);
		clearConsole();
		if (op=='Y'||op=='y'){
			addContacts();
		}else if(op=='N'||op=='n'){
			homepage();
		}else{
			System.out.println("\n	Incorrect input...");
			return;
		}
	}
	  
	public static void updateContacts(){
			Scanner input=new Scanner(System.in);
			do{System.out.println();
			System.out.println(" +---------------------------------------------+");
			System.out.println(" |                UPDATE Contact               |");
			System.out.println(" +---------------------------------------------+");
			System.out.print("\nSearch contact by name or phone number : ");
			String nameOrPhone=input.next();
            int index = conList.searchByNameOrPhoneNumber(nameOrPhone);
            
            if(index == -1){
                System.out.println("\n\tNo contact found for "+nameOrPhone);
                System.out.print("\nDo you want to try a new search : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    updateContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }
            else{
                conList.printDetails(index);

                System.out.println("\nWhat do you want to update");
                System.out.println("\n\t[01] Name");
                System.out.println("\t[02] Phone number");
                System.out.println("\t[03] Company Name");
                System.out.println("\t[04] Salary");
                System.out.println("\nEnter an option to continue...");
                int option=input.nextInt();
                switch(option){
                    case 1 : updateName(index);break;
                    case 2 : updatePhoneNumber(index);break;
                    case 3 : updateCompanyName(index);break;
                    case 4 : updateSalary(index);break;
                    default : System.out.println("\n\tInvalid option...");
                }
                System.out.println("\nContact has been update successfully.");
                System.out.print("\nDo you want to update another contact : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    updateContacts();
                }else if(ch=='N'|| ch=='n'){
                    clearConsole();
                    homepage();
                }
            }
        }while(true);
	}
    public static void updateName(int index){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Name");
        System.out.println("===================");
        System.out.print("\nInput new name : ");
        String newName = input.next();
        conList.updateName(index,newName);
       
    }
   
    public static void updatePhoneNumber(int index){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Phonenumber");
        System.out.println("========================");
        System.out.print("\nInput new phone number : ");
        String newPhoneNumber = input.next();
       conList.updateTpno(index,newPhoneNumber);
    }
    
    public static void updateCompanyName(int index){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Company Name");
        System.out.println("===========================");
        System.out.print("\nInput new company name : ");
        String newCompanyName = input.next();
        conList.updateComName(index,newCompanyName);
    }

    public static void updateSalary(int index){
        Scanner input=new Scanner(System.in);
        System.out.println("\n Update Salary");
        System.out.println("==================");
        System.out.print("\nInput new salary : ");
        double newSalary = input.nextDouble();
        conList.updateSalary(index,newSalary);			
	}
	
	public static void deleteContacts(){
		Scanner input = new Scanner(System.in);
         do{
		    System.out.println();
		    System.out.println(" +---------------------------------------------+");
			System.out.println(" |                DELETE Contact               |");
			System.out.println(" +---------------------------------------------+");
			System.out.println();
			System.out.println();
            System.out.print("\nSearch contact by name or phone number : ");
            String nameOrPhone=input.next();
            int index = conList.searchByNameOrPhoneNumber(nameOrPhone);

            if(index == -1){
                System.out.println("\n\tNo contact found for "+nameOrPhone);
                System.out.print("\nDo you want to try a new search : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    deleteContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }else{
                conList.printDetails(index);
                L1:do{
                    System.out.print("\nDo you want to delete this contact : ");
                    char ch=input.next().charAt(0);
                    if(ch=='Y'||ch=='y'){
                        conList.remove(index);
                        System.out.println("\nContact has been deleted successfully...");
                        break L1;
                    }else if(ch=='N'||ch=='n'){
                        break L1;
                    }

                }while(true);

                System.out.println("\nDo you want to delete another contact : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    deleteContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }  
            }

        }while(true);	
	}
	
	public static void searchContacts(){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println();
			System.out.println(" +---------------------------------------------+");
			System.out.println(" |                SEARCH Contact               |");
			System.out.println(" +---------------------------------------------+");
			System.out.println();
			System.out.println();
            System.out.print("\nSearch contact by name or phone number : ");
            String nameOrPhone=input.next();
            int index = conList.searchByNameOrPhoneNumber(nameOrPhone);

            if(index == -1){
                System.out.println("\n\tNo contact found for "+nameOrPhone);
                System.out.print("\nDo you want to try a new search : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    searchContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }else{
                conList.printDetails(index);
                System.out.print("\nDo you want to search another contact : ");
                char ch=input.next().charAt(0);
                if(ch=='Y'||ch=='y'){
                    clearConsole();
                    searchContacts();
                }else if(ch=='N'||ch=='n'){
                    clearConsole();
                    homepage();
                }
            }

        }while(true);
    }				
	public static void listContacts(){
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println(" +---------------------------------------------+");
		System.out.println(" |                 SORT Contact                |");
		System.out.println(" +---------------------------------------------+");
		System.out.println();
		System.out.println("\t[01] Sorting by Name");
		System.out.println("\t[02] Sorting by Salary");
		System.out.println("\t[03] Sorting by Birthday\n\n");
		System.out.print("Enter an option to continue -> ");
		int option=input.nextInt();	
		clearConsole();
		switch (option){
			case 1:
				conList.sortName();
				break;
			case 2:
				conList.sortSalary();
				break;
			case 3:
				conList.sortBirthday();
				break;			
			default:
				System.out.println("\n	Incorrect input...");
		}
	}
	public static void main(String[] args){
		homepage();
	}
} 
											//GayashanIndrassankha©
												//ICD109
													//CourseWorkDay08
