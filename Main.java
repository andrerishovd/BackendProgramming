import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] unsortedWordsList = {"tear", "rate", "anders", "sander", "warm", "tame", "meat", "team"};
        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();

        for(String unsortedWord : unsortedWordsList) {
            //Sort
            char[] unsortedChar = unsortedWord.toCharArray();
            Arrays.sort(unsortedChar);
            String sortedWord = new String(unsortedChar);

            if(!anagrams.containsKey(sortedWord)){
                // Man kan lage nye lister :)))))
                anagrams.putIfAbsent(sortedWord, new ArrayList<>());
            }
            anagrams.get(sortedWord).add(unsortedWord);
        }

        System.out.println(anagrams);

        int anagramCount = 0;

        for(List<String> list : anagrams.values()) {
            if(list.size() > 1) {
                anagramCount += list.size();
            }
        }

        System.out.println("Anagrams: " + anagramCount);
    }
}