package myprojects.learningjava.condition;

public class Switch_Break {

	public static void main(String[] args) {
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");   // run
            break;
        case 2:
            System.out.println("two");   // don't run
            break;
        case 3:
            System.out.println("three"); // don't run
            break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");   // don't run
            break;
        case 2:
            System.out.println("two");   // run
            break;
        case 3:
            System.out.println("three"); // don't run
            break;
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");   // don't run
            break;
        case 2:
            System.out.println("two");   // don't run
            break;
        case 3:
            System.out.println("three"); // run
            break;
        }
        // below code is same result as above code
        int val = 1;
        if(val == 1){
            System.out.println("one");
        } else if(val == 2){
            System.out.println("two");
        } else if(val == 2){
            System.out.println("three");
        }
        
	}

}
