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
	
	}

	
	public static void main(String args[]){
		contactMainForm homepage = new contactMainForm(); 
		homepage.setVisible(true);
	}
	
}
