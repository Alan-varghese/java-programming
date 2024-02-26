import java.util.Scanner;

public class String_man {
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Length of string=" + str1.length());
        System.out.println("Character at first position=" + str1.charAt(0)); // Corrected index to 0 for first character
        System.out.println("String contains 'Col' sequence:" + str1.contains("Col"));
        System.out.println("String ends with:" + str1.endsWith("e"));
        System.out.println("Replace 'Col' with 'Kol':" + str1.replaceAll("Col", "Kol")); // Corrected quotation marks
        System.out.println("LOWERCASE:" + str1.toLowerCase());
        System.out.println("UPPERCASE:" + str1.toUpperCase());
    }
}

