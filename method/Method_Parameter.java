package myprojects.learningjava.method;

public class Method_Parameter {
	public static void numbering(int initiation, int limit) {
        int i = initiation;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
	public static void main(String[] args) {
		numbering(0, 5);
		numbering(3, 10);
		numbering(2, 7);
	}

}
