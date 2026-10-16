/***
 * Problem: Write a method that takes a sentence and reverses
 * each word individually without changing their positions.
 * Expected output: avaJ si emosewa
 */

public class E_WordReverser {

    public static void main(String[] args) {
        E_WordReverser e = new E_WordReverser();
    }

    public E_WordReverser() {
        String sentence = "Java is awesome";
        reverseWords(sentence);  // Output: avaJ si emosewa
    }

    public void reverseWords(String sentence) {
        String result = "";
        for (String word : sentence.split(" ")) {
            result += new StringBuilder(word).reverse() + " ";
        }
        System.out.println(result.trim());
    }

} 