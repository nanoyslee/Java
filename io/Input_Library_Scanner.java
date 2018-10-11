package myprojects.learningjava.io;

import java.util.Scanner;

public class Input_Library_Scanner {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();

	}

}
