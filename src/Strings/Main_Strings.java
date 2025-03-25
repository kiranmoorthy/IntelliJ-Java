package Strings;

public class Main_Strings {
    public static void main(String[] args) {
        //System.out.println("Main Strings");
        //String s=1234+"";
        //System.out.println();

        String a="* ";
        String b=a.repeat(5);
        //System.out.print(b);

        String c="THE    md324 g345fJHBdnhTHTHEEJrdt4OIIJ5n4JJyrrtwPIUH4gtIIHe53tHHJ";
        System.out.println(c.replaceAll("[0-9a-zA-z ]",""));


    }
}
