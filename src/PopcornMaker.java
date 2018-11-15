import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String type=JOptionPane.showInputDialog("What flavor of popcorn would you like?");
	String time=JOptionPane.showInputDialog("How long would you like it to cook? Enter a number.");
	int num= Integer.parseInt(time);
	Microwave m=new Microwave();
	Popcorn p=new Popcorn(type);

m.putInMicrowave(p);
m.setTime(num);
m.startMicrowave();
}
}
