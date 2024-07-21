import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        printStringReverse("Vasa");
//        System.out.println(isPhoneNumber("79112905382"));
//        printSubStringReverse("Hello world!", 1, 11);
        printWordsReverseInColumn("Для проверки содержания определённого элемента в ArrayList, применяйте метод contains()");
    }

    public static void printStringReverse(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
            return;
        }
        System.out.println(new StringBuilder(string).reverse());

    }

    public static boolean isPhoneNumber(String phone) {
        if (phone == null || phone.isBlank()) {
            return false;
        }
        return phone.matches("8\\d{11}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (string == null || string.isBlank() ||
                start < 0 || start > string.length() ||
                finish < 0 || finish > string.length() ||
                start > finish) {
            System.out.println("Wrong args");
            return;
        }
//        String firstPart = string.substring(0, start);
//        String reversPart = string.substring(start, finish + 1);
//        String thirdPart = string.substring(finish + 1);
//        System.out.println(firstPart + new StringBuilder(reversPart).reverse() + thirdPart);
        String reversPart = string.substring(start, finish + 1);
        StringBuilder builder = new StringBuilder(reversPart);
        System.out.println(string.replace(reversPart, builder.reverse()));
    }

    public static void printWordsReverseInColumn(String string) {
        String[] s = string.split(" ");
        for (String s1 : s) {
            System.out.println(new StringBuilder(s1).reverse());
        }
    }

    public static int maxCharIndex(String string) {
        int maxChar = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxChar){
                maxChar = entry.getValue();
            }
        }
        return 6;
    }
}
