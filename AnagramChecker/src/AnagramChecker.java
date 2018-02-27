import java.util.Arrays;

public class AnagramChecker{
    static boolean isAnagram(String word1, String word2){
        if(word1 != null && word2 != null && !(word1.matches(".*\\d.*") || word2.matches(".*\\d.*"))){
            char[] lettersOfWord1 = word1.replaceAll("\\W", "").toLowerCase().toCharArray();
            char[] lettersOfWord2 = word2.replaceAll("\\W", "").toLowerCase().toCharArray();
            Arrays.sort(lettersOfWord1);
            Arrays.sort(lettersOfWord2);
            return Arrays.equals(lettersOfWord1, lettersOfWord2);
        }
        return false;
    }
}
