package program;

public class Type {

	

	public static void main(String[] args)
    {
        // Upcasting
        Parent p = new Child();
        p.name = "GeeksforGeeks";
 
        // This parameter is not accessible
        // p.id = 1;
        System.out.println(p.name);
        p.method();
 
        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error
 
        // Downcasting Explicitly
        Child c = (Child)p;
 
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}