
public class JamesBond {
public static void main(String[] args) {
	Vault v=new Vault();
	for (int i = 0; i < 1000001; i++) {
		v.tryCode(i);
		v.tryCode(1000001-i);
	}
}
}
