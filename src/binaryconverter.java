
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
public class binaryconverter implements ActionListener {
public static void main(String[] args) {

	binaryconverter bc= new binaryconverter();
	bc.setup();
	

	
}
JTextField answer = new JTextField(20);
JButton button=new JButton();
JLabel ladel=new JLabel();
public void setup() {

		JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	frame.add(panel);
	frame.setVisible(true);
	button.addActionListener(this);
	panel.add(button);
	panel.add(answer);
	panel.add(ladel);
	ladel.setText("Enter 8 bits of binary and then click the button.");
	frame.pack();

}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
   String ugh= answer.getText();
   String last=convert(ugh);
   ladel.setText(ugh+" in binary is "+last+" in ASCII");
   
   }
}