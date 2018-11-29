
public class duckrunner {
	public static void main(String[] args) {
		duck d = new duck("ice cream", 32);
		for (int i = 0; i < 2; i++) {
			d.quack();
			d.wadddle();
		}
		for (int i = 0; i < 4; i++) {
			d.quack();
		}
	}
}
