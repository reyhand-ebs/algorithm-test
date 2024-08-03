public class ReverseAlphabet {
    public static void main(String[] args) {
        String input = "NEGIE1";
        String result = reverseAlphabet(input);
        System.out.println(result);
    }

    public static String reverseAlphabet(String input) {
        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabets.append(c);
            } else if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        return alphabets.reverse().toString() + numbers.toString();
    }
}
