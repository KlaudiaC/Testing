public class Main {
    
    public static void main(String[] args) {

        int a,b,c;

        try {
           a = Integer.parseInt(args[0]);
           b = Integer.parseInt(args[1]);
           c = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("-1");
            return;
        }

        Triangle t = new Triangle(a,b,c);

        System.out.println(t.type());
    }
}
