import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramCheckerTest{
    @Test
    public void isRecognizingAnagrams() throws Exception{
        assertTrue(AnagramChecker.isAnagram("listen", "silent"));
    }

    @Test
    public void isRecognizingNotAnagrams() throws Exception{
        assertFalse(AnagramChecker.isAnagram("not", "good"));
    }

    @Test
    public void isBlockingNumbers() throws Exception{
        assertFalse(AnagramChecker.isAnagram("42", "24"));
    }

    @Test
    public void isHandlingBigLetters() throws Exception{
        assertTrue(AnagramChecker.isAnagram("Elvis", "lives"));
    }

    @Test
    public void isHandlingManyWords() throws Exception{
        assertTrue(AnagramChecker.isAnagram("funeral", "real fun"));
    }

    @Test
    public void isIgnoringSpaces() throws Exception{
        assertTrue(AnagramChecker.isAnagram("  s i l  en t", "li   s te n"));
    }

    @Test
    public void isIgnoringPunctuation() throws Exception{
        assertTrue(AnagramChecker.isAnagram("evangelist", "evil's agent"));
    }

    @Test
    public void isHandlingEmptyStrings() throws Exception{
        assertFalse(AnagramChecker.isAnagram("test", null));
    }

    @Test
    public void isHandlingNotASCIICharacters() throws Exception{
        assertTrue(AnagramChecker.isAnagram("näzwisko: Łeb", "bez słownikä"));
    }
}
