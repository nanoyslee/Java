package myprojects.learningjava.io;

import java.util.Scanner;

public class Input_Library_Scanner_Loop {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();

	}

}
