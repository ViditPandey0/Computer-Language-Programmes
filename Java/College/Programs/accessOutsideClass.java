public class accessOutsideClass {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.id=1003;
        e1.name="Vidit";
        System.out.println(e1.id);
        e1.displayDetails();

        Student s1 = new Student();
        System.out.println(s1.id+" "+s1.name);
        s1.id=1073;
        s1.name="Gopal";
        System.out.println(s1.id+" "+s1.name);
    }
}
