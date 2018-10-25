/**
 * 다시한번 문제를 보면서 이해 필요
 * 1. 조합식의 변환
 * 2. 팩토리얼의 구현
 * 3. 페르마의 소정리 (!꼭)
 * 4. 페르마의 소정리 응용 (제곱수의 나머지)
 */

import java.util.Scanner;

class Solution {
    public static int N, M;

    public static final long P = 1000000007;

    public static long[] fact = new long[2000003];

    public static long combination(int n, int r) {
        long A = fact[n];
        long B = fact[n-r] * fact[r] % P;

        return A * findMMI(B, P-2) % P;
    }

    public static long findMMI(long B, long p) {
        if(p == 0)
            return 1;
        else if(p == 1)
            return B;
        else {
            long half = findMMI(B, p/2);

            if(p % 2 == 0)
                return (half * half) % P;
            else
                return  ((half * half) % P * B) % P;
        }
    }

    public static void main(String args[]) throws Exception	{
		/* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
		   만약 본인의 PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
		   표준입력 대신 input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
		   또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
		   단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
        //Scanner sc = new Scanner(new FileInputStream("input.txt"));

        Scanner sc = new Scanner(System.in);

        long TC;
        long test_case;

        fact[0] = 1;

        for(int i = 1; i < 2000003; i++)
            fact[i] = i * fact[i-1] % P;

        TC = sc.nextInt();
        for(test_case = 1; test_case <= TC; test_case++) {
            // 이 부분에서 알고리즘 프로그램을 작성하십시오.
            N = sc.nextInt();
            M = sc.nextInt();

            // 이 부분에서 정답을 출력하십시오.
            System.out.println("Case #" + test_case);
            System.out.println(combination(M+N+2, N+1) - 1);
        }
    }
}