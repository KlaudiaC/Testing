public class Triangle{
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle(){
        return (a + b > c)  &  (a + c > b)  &  (b + c > a);
    }

    public int type(){
        if(!isTriangle())
            return 0;
        if((a == b) & (b == c))
            return 1;
        else if(a == b | b == c)
            return 2;
        return 3;
    }

    private int a, b, c;
}
