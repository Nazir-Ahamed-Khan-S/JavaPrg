import java.util.*;

public class Stjoin {
    public static void main(String[] args) {
        String[] words = { "Hello,", "how", "are", "you" };
        String sentence = String.join(" ", words);
        System.out.println(sentence);
    }
}