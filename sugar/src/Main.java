import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt ();
/**
 *  N = 5*a+3*b
 *  이때 a와 b는?
 */
        int minSum = Integer.MAX_VALUE;

        int  MAX_FIVE = N/5;//5키로 최대개수


        int five = MAX_FIVE;

        for(int i = MAX_FIVE; i>0; i--) {
            int temp = N - (5*five);
            if ( temp % 3 == 0 ) {
                int three = temp / 3;
                if ( minSum > five + three ) {
                    minSum = five + three;
                }
            }else{
                five = i-1;
            }
        }
        if(minSum == Integer.MAX_VALUE) System.out.println (-1 );
        else System.out.println (minSum );
    }
}
