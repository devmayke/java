import java.sql.SQLOutput;

public class Exercicio2 {

    public static void main(String[] args){
        String str= "Curso de Java";
        System.out.println(str.equals("sdsad"));
        System.out.println(str.equals("Curso de Java"));
        System.out.println(str.charAt(2));
        System.out.println(str.startsWith("Cur"));
        System.out.println(str.endsWith("va"));
        System.out.println(str.substring(9));
        System.out.println(str.substring(3,11));
        System.out.println(str.replace("de ","" ));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.concat(" da faculdade"));
    }
}
