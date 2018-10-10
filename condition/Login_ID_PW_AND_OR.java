package myprojects.learningjava.condition;

public class Login_ID_PW_AND_OR {

	public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if ((id.equals("nanoyslee") || id.equals("kim") || id.equals("ryan"))
                && password.equals("1234")) {
            System.out.println("Your ID and PW is correct");
        } else {
            System.out.println("Your ID and PW is incorrect");
        }
	}
}
