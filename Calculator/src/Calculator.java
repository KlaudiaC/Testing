public class Calculator{
    public static int add(String numbers){
        int res = 0;
        int howMany = 0;
        int i = 1;
        int j = 0;
        boolean extraDelimiter = false;
        int[] negatives = new int[100];

        if(numbers.equals(""))
            return 0;
        if(numbers.charAt(0) >= '0' || numbers.charAt(0) <= '9')
            howMany++;
        else if(numbers.charAt(0) == '-')
            throw new RuntimeException();
        else if(numbers.startsWith("\\")){
            extraDelimiter = true;
            i = 2;
        }
        for(; i < numbers.length(); i++){
            if(numbers.charAt(i) < '0' || numbers.charAt(i) > '9'){
                if((numbers.charAt(i) == ',' || numbers.charAt(i) == '\n') && (numbers.charAt(i + 1) > '0' || numbers.charAt(i + 1) < '9'))
                    howMany++;
                else
                    break;
            }
        }
        if(howMany > 0){
            String onlyNumbers = numbers.replaceAll("[^0-9]"," ");
            String elements[] = onlyNumbers.split(" ");
            for(int idx = elements.length - 1; idx > 0; idx--)
                    res += Integer.parseInt(elements[idx]);
        }
        else{
            String elements[];
            if(extraDelimiter)
                elements = numbers.split(",|\n|numbers.charAt(2)");
            else
                elements = numbers.split(",|\n");
            for(i = 0; i < howMany; i++){
                if(elements[i].startsWith("-")){
                    negatives[j++] = Integer.parseInt(elements[i]);
                    //throw new RuntimeException("lol");
                    System.out.print(negatives[j - 1] +" ");
                }
                else
                    res += Integer.parseInt(elements[i]);
            }
        }
        return res;
    }
}
