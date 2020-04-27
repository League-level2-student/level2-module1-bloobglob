package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewNames = new JButton("View Names");
	ArrayList<String> guests = new ArrayList<String>();
	String guestList = "";
	void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		frame.pack();
		frame.setVisible(true);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
	}
	public static void main(String[] args) {
		new GuestBook().run();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == addName) {
			guests.add(JOptionPane.showInputDialog("Please enter a name."));
		}
		if(buttonPressed == viewNames) {
			guestList = "";
			for(int i = 0; i<guests.size(); i++) {
				guestList+="Guest #"+(i+1)+": "+guests.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, guestList);
		}
	}
}
