package myprojects.learningjava.operator;

public class equalstring {

	public static void main(String[] args) {
		String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));  // .equals()

	}

}
