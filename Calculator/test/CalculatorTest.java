import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest{
    @Test
    public void withoutNumbers() throws Exception{
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void isGivingOneNumber() throws Exception{
        assertEquals(91, Calculator.add("91"));
    }

    @Test
    public void isAddingTwoNumbers() throws Exception{
        assertEquals(38, Calculator.add("13,25"));
    }

    @Test
    public void isAddingMoreThanTwoNumbers() throws Exception{
        assertEquals(60, Calculator.add("43,2,4,11"));
    }

    @Test
    public void isAcceptingNumbersInNewLine() throws Exception{
        assertEquals(50, Calculator.add("3\n2,24,8,1\n12\n0"));
    }

    @Test
    public void isAcceptingOtherDelimiters() throws Exception{
        assertEquals(6, Calculator.add("//[*][%]\\n1*2%3"));
    }

    @Test
    public void isDenyingNegatives(){
        try{
            Calculator.add("-2,4,-3");
        }
        catch(RuntimeException e){
            System.out.println("Negatives not allowed.");
        }
    }
}
