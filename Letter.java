import java.util.List;
import java.util.stream.Collectors;

public class Letter {

    public static List<String> filterStrings(List<String> inputList) {
        return inputList.stream()
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("ant", "aa", "Also", "Awsome", "bbb");

        List<String> result = filterStrings(inputList);

        System.out.println("Input Strings: " + inputList);
        System.out.println("Filtered Strings: " + result);
    }
}
