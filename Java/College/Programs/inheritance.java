class class_A {
        int id;
        String name;
    }

class class_B extends class_A{
        int rno;
        char rank;
    }

public class inheritance {
    public static void main(String[] args){
        class_B b1 = new class_B();
        b1.id=101;
        b1.name="Vidit";
        b1.rno=73;
        b1.rank='A';
        System.out.println(b1.id+" "+b1.name+" "+b1.rno+" "+b1.rank);
    }
}
