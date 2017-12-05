import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
	String date=JOptionPane.showInputDialog("What's your Birthday?");
	if(date.equals("12/4")) {
		JOptionPane.showMessageDialog(null,"Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Un-Birthday");
	}
	}

}
