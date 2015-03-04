import java.swing.JOptionpane;
import java.util.Scanner;
public class chap4{

	public static void main(String[] args)
{

		String username = ""; String password= ""; String userright=""; String passright="";
		username = JOptionPane.showInputDialog("Enter username: ");
		password = JOptionPane.showInputDialog("Enter password: ");
		userright = JOptionPane.showInputDialog("re-enter username ");
		passright = JOptionPane.showInputDialog("re-enter password ");
		
	while ('username.equals(userright)){
		JOptionPane.showMessageDialog(null," Incorrect username");
		userright = JOptionpane.showInputDialog("Enter username ");
}
	while ('passwor.equals(passright)){
		JOptionPane.showMessageDialog(null," Incorrect password");
		passright = JOptionpane.showInputDialog("Enter password ");
}

JOptionPane.showMessageDialog(null,"Correct password and username");

}
}