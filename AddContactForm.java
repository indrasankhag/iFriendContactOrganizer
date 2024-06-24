import javax.swing.*;
import java.awt.*;
class AddContactForm extends JFrame{
	private JLabel titleLabel;
	private JButton btnAdd;
	private JButton btnCansel;
	private JLabel ttl_Id;
	private JLabel ttl_Name;
	private JLabel ttl_tpNo;
	private JLabel ttl_ComName;
	private JLabel ttl_Salary;
	private JLabel ttl_Bdy;

	AddContactForm(){
		setSize(500,300);
		setTitle("AddContacts");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("Add Contact Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
		
		JPanel westPanel=new JPanel(new GridLayout(5,1));
		
		
		ttl_Id=new JLabel("Id");
		ttl_Id.setFont(new Font("",1,20));
		westPanel.add(ttl_Id);
		
		ttl_Name=new JLabel("Name");
		ttl_Name.setFont(new Font("",1,20));
		westPanel.add(ttl_Name);
		
		ttl_tpNo=new JLabel("Phone Number");
		ttl_tpNo.setFont(new Font("",1,20));
		westPanel.add(ttl_tpNo);
		
		ttl_ComName=new JLabel("Company Name");
		ttl_ComName.setFont(new Font("",1,20));
		westPanel.add(ttl_ComName);
		
		ttl_Salary=new JLabel("Salary");		
		ttl_Salary.setFont(new Font("",1,20));
		westPanel.add(ttl_Salary);
		
		ttl_Bdy=new JLabel("B'Day");		
		ttl_Bdy.setFont(new Font("",1,20));
		westPanel.add(ttl_Bdy);
		
		add("West",westPanel);
		
		
	}

	public static void main(String args[]){
		AddContactForm addContact = new AddContactForm(); 
		addContact.setVisible(true);
	}
	
}
