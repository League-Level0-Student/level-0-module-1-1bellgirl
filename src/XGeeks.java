//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a super power. Mine is writing recipes. This program will store
* the super powers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's super power is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the super power for each person in a variable.
String MattsPower="talking with cats";
String MaClarynsPower="flying";
String NolansPower="fat minipulation";
String DaelynsPower="turing into a fox";
String JensensPower="crustacean mimicry";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name=JOptionPane.showInputDialog("Enter your name");
		// 3. Show the super power in a pop-up, depending on the name entered. 
if(name.equals("Matt")) {
	JOptionPane.showMessageDialog(null, "Matt's super power is "+MattsPower );
}
else if(name.equals("MaClaryn")) {
	JOptionPane.showMessageDialog(null, "MaClaryn's super power is "+MaClarynsPower);
}
else if(name.equals("Nolan")) {
	JOptionPane.showMessageDialog(null, "Nolan's super power is "+NolansPower);
}
else if(name.equals("Daelyn")) {
	JOptionPane.showMessageDialog(null, "Daelyn's super power is "+DaelynsPower);
}
else if(name.equals("Jensen")) {
	JOptionPane.showMessageDialog(null, "Jansen's super power is "+JensensPower);
}
else {
	JOptionPane.showMessageDialog(null, "You don't have a super power");
}
		
	}
}

