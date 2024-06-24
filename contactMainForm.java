import javax.swing.*;
import java.awt.*;
class contactMainForm extends JFrame{
	private JLabel titleLabel;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnSearch;
	private JButton btnList;
	private JButton btnExit;

	
	contactMainForm(){
		setSize(700,500);
		setTitle("iFriendContactOrganizer");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		titleLabel=new JLabel("iFriendContactOrganizer");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",3,50));
		add("North",titleLabel);

		btnAdd=new JButton("    ADD   ");
		btnAdd.setFont(new Font("",1,25));
		add("West",btnAdd);
		
		JPanel centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(2,2));

		btnUpdate=new JButton("UPDATE");
		btnUpdate.setFont(new Font("",1,25));
		centerPanel.add(btnUpdate);

		btnSearch=new JButton("SEARCH");
		btnSearch.setFont(new Font("",1,25));
		btnSearch.setPreferredSize(new Dimension(40,70));
		centerPanel.add(btnSearch);

		btnList=new JButton("List");
		btnList.setFont(new Font("",1,25));
		centerPanel.add(btnList);
		
		btnExit=new JButton("EXIT");
		btnExit.setFont(new Font("",1,25));
		centerPanel.add(btnExit);
		
		btnDelete=new JButton("DELETE");
		btnDelete.setFont(new Font("",1,25));
		add("East",btnDelete);
		
		add("Center",centerPanel);		
		getContentPane().setBackground(Color.green);
	}

	
	public static void main(String args[]){
		contactMainForm homepage = new contactMainForm(); 
		homepage.setVisible(true);
	}
	
}
