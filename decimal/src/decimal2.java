
import java.util.Scanner;

public class decimal2 {

    public static void main_(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] check = new boolean[n+1];//왜 n+1이지?
        check[0] = true;
        check[1] = true;
        //i의 배수들 지우기
        for(int i=1;i<n;i++) {
            if(check[i]==false) {
                for(int j=(i+1)*2;j<=n;j+=(i+1)) {//i는 n을 포함한 수까지 배수로 늘어나면서 지워줌 ex)2,4,6,8,10...
                    check[j-1] = true;
                }
            }else continue;
        }//2부터 n까지의 수 중에 2의배수 3의배수...들을 ture로 바꿧음
        for(int i=0;i<n; i++) {
            if(check[i]==false && i>=m) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
