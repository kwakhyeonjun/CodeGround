import java.util.ArrayList;
        import java.util.Scanner;

public class Main {

    public static boolean isPrime(int sosu){
        if(sosu==1) return false;
        for(int i=2; i<sosu; i++){
            if(sosu % i==0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine ());
        int N = Integer.parseInt(sc.nextLine ());
        ArrayList<Integer> sosu = new ArrayList <> (  );

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i =M; i<N; i++){
            if(isPrime(i)){
                sosu.add ( i );
                sum += i;
            }
        }
        if(sosu.size () != 0){
            min = sosu.get(0);
        }

        if(sosu.isEmpty () || sum == 0 || min==0){
            System.out.println ( -1 );
        }else{
            System.out.println ( sum );
            System.out.println ( min );
        }
    }
}