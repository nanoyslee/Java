package myprojects.learningjava.object;

class Class {
    static int sv = 1;
    int iv = 2;
    static void staticMethod_staticVariables(){
        System.out.println(sv);
    }
    static void staticMethod_instnceVariables(){
        // System.out.println(iv);
    }
    void instanceMethod_staticVariables(){
        System.out.println(sv);
    }
    void instanceMethod_intanceVariables(){        
        System.out.println(iv);
    }
}

public class ClassMember_InstanceMember {

	public static void main(String[] args) {
        Class Instance = new Class();
        
        Instance.staticMethod_staticVariables();		// 1
        // Instance.staticMethod_instnceVariables();	// No, error
        Instance.instanceMethod_staticVariables();		// 1
        Instance.instanceMethod_intanceVariables();	// 2
        
        Class.staticMethod_staticVariables();		// 1
        // Class.staticMethod_instnceVariables();		// No, error
        // Class.instanceMethod_staticVariables();		// No, error
        // Class.instanceMethod_intanceVariables();		// No, error

	}

}
