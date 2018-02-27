import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleTest{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        int allTests = 0;
        int passedTests = 0;
        String line = null;
        String[] par;
        String result = null;
        BufferedReader testFile = new BufferedReader(new FileReader("testy.txt"));
        
        while((line = testFile.readLine()) != null){
            allTests++;
            System.out.println("\nParameters: " +line);
            par = line.split(" ");            
            ProcessBuilder program = new ProcessBuilder("java", "Main", par[0], par[1], par[2]);
            line = testFile.readLine();
            System.out.println("Expected output: " +line);
            System.out.print("Output: ");
            try{
                Runtime.getRuntime().exec("javac *.java");
                Process process = program.start(); 
                BufferedReader out = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String temp = null;
                
                while((temp = out.readLine()) != null){
                    result = temp.toString();
                System.out.println(result);
                }
                if(result.equals(line))
                    passedTests++;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("\nSummary:");
        System.out.println("Number of tests: " +allTests);
        System.out.println("Passed tests: " +passedTests);
        System.out.println("Failed tests: " +(allTests - passedTests));
    }
}
