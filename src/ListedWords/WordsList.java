package ListedWords;

import java.util.Random;

public class WordsList {

    public static String[] Words() {

        return new String[] {"Cars", "Phonebook", ""};
    }

    public static String randomWordSelected(String[] word) {
        Random r = new Random();
        int length = r.nextInt(word.length);
        return word[length];
    }
}
