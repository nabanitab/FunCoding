package practices;

public class Test10 {

    public static void main(String[] args) {
        int input=34567;
        System.out.println(countDigit(input));
    }

    static int countDigit(int n){
        int  count=0;
        while (n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
}
