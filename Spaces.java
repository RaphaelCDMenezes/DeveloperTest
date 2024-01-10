public class Spaces {
    public static String Wspace(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String inputString = "H i , M y N a m e I s R a p h a e l";
        String stringWspace = Wspace(inputString);

        System.out.println("Original String: \"" + inputString + "\"");
        System.out.println("String without Spaces: \"" + stringWspace + "\"");
    }
}
