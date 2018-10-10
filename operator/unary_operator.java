package myprojects.learningjava.operator;

public class unary_operator {

	public static void main(String[] args) {
		int i = 3;
        i++;                     // i=i+1
        System.out.println(i);   // 4
        ++i;                     // i=i+1
        System.out.println(i);   // 5
        System.out.println(++i); // 6   +1 --> print
        System.out.println(i++); // 6   print --> +1
        System.out.println(i);   // 7

	}

}
