import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        printStringReverse("Vasa");
//        System.out.println(isPhoneNumber("79112905382"));
//        printSubStringReverse("Hello world!", 1, 11);
//        printWordsReverseInColumn("Для проверки содержания определённого элемента в ArrayList, применяйте метод contains()");
//        System.out.println(maxCharIndex("ddcccabbbb"));
        //System.out.println(getWordsReverse("Hello my nice world"));
        printWordsReverseInColumn("Hello my nice world");
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

        String reversPart = string.substring(start, finish + 1);
        StringBuilder builder = new StringBuilder(reversPart);
        System.out.println(string.replace(reversPart, builder.reverse()));
    }

    public static String getWordsReverse(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            return null;
        }
        return String.join(" ", Arrays.asList(string.split(" ")).reversed());
    }

    public static void printWordsReverseInColumn(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            return;
        }
        String collect = Arrays.stream(string.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining("\n"));
        System.out.println(collect);

    }

    public static int maxCharIndex(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            return -1;
        }

        Map<String, Integer> map = new HashMap<>();
        string.chars()
                .mapToObj(Character::toString)
                .forEach(str -> map.merge(str, 1, Integer::sum));
        return string.indexOf(map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(map.values().stream()
                        .max(Comparator.naturalOrder())
                        .orElseThrow()))
                .findFirst().orElseThrow().getKey());
    }
}
