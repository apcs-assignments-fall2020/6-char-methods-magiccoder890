import java.util.Scanner;

public class MyMain {

    public static char toLower(char ch) {
        // REPLACE WITH YOUR CODE
        int num_var = ch;
        if (num_var >= 65 && num_var <= 90) {
            num_var += 32;
            ch = (char) num_var;
            System.out.print(ch);
        } 
        else if (num_var < 65 || num_var > 90) {
            ch = (char) num_var;
            System.out.print(ch);
        }
        return ch;
    }

    public static char toUpper(char ch) {
        int num_var = ch;
        if (num_var >= 97 && num_var <= 122) {
            num_var -= 32;
            ch = (char) num_var;
            System.out.print(ch);
        } 
        else if (num_var < 97 || num_var > 122) {
            ch = (char) num_var;
            System.out.print(ch);
        } 
        return ch;
    }

    public static String myToUpperCase(String str) {
        String new_sentence = "";
        for (int i = 0; i < str.length(); i++) {
            char every_word = str.charAt(i);
            new_sentence += toUpper(every_word);
        }
        return new_sentence;
    }

    public static String myToLowerCase(String str) {
        String new_sentence = "";
        for (int i = 0; i < str.length(); i++) {
            char every_word = str.charAt(i);
            new_sentence += toLower(every_word);
        }
        return new_sentence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input what service you want");
        String chioce = scanner.next();
        if ("toLower".equals(chioce)) {
            System.out.print("Please input a char");
            char ch = scanner.next().charAt(0);
            toLower(ch);
        }
        if ("toUpper".equals(chioce)) {
            System.out.print("Please input a char");
            char ch = scanner.next().charAt(0);
            toUpper(ch);
        }
        if ("myToLowerCase".equals(chioce)) {
            System.out.print("Please input a string");
            String str = scanner.nextLine();
            myToLowerCase(str);
        }
        if ("myToUpperCase".equals(chioce)) {
            System.out.print("Please input a string");
            String str = scanner.nextLine();
            myToUpperCase(str);
        }
    }
}
