package myprojects.learningjava.condition;

public class Switch_Case {

	public static void main(String[] args) {
        System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");   // run
        case 2:
            System.out.println("two");   // run
        case 3:
            System.out.println("three"); // run
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");   // don't run
        case 2:
            System.out.println("two");   // run
        case 3:
            System.out.println("three"); // run
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");   // don't run
        case 2:
            System.out.println("two");   // don't run
        case 3:
            System.out.println("three"); // run
        }

	}

}
