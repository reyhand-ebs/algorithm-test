public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Saya sangat senang mengerjakan soal algoritma";
        String longestWord = findLongestWord(sentence);
        System.out.println(longestWord + ": " + longestWord.length() + " characters");
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
