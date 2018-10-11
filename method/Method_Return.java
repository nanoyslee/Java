package myprojects.learningjava.method;

public class Method_Return {

	    public static String numbering(int initiation, int limit) {
	        int i = initiation;
	        String output = "";
	        while (i < limit) {
	            output += i;	// output = output + i;  (output is string !!!)
	            i++;
	        }
	        return output;
	    }
	 
	    public static void main(String[] args) {
	        String result = numbering(2, 7);
	        System.out.println(result);
	    }

}
