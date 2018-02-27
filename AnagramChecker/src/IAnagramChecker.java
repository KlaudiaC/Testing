/*
Interfejs obiektu, który sprawdza czy dane słowa są anagramami.
Anagram jest słowem lub frazą, która powstała przez zmianę kolejności liter w oryginalnym słowie lub frazie.
Zobacz kilka przykładów na http://www.wordsmith.org/anagram/hof.html
*/

public interface IAnagramChecker{
    boolean isAnagram(String word1, String word2);
}
