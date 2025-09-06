public class string {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String s=new String("Hello");
        System.out.println(str);
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(str.concat(s));
        System.out.println(str.compareTo(s));
        System.out.println(s.compareTo(str));
        System.out.println(s.compareTo("Hello"));
    }
}