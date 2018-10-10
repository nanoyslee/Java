package myprojects.learningjava.array;

public class Array_Loop {

	public static void main(String[] args) {
        String[] group1 = { "name1", "name2", "name3" };
        for (int i = 0; i < group1.length; i++) {
            String member_name = group1[i];
            System.out.println(member_name + " finished job.");
        }

	}

}
