/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {

    public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new FileInputStream("input.txt"));

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {

            // Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////

            //입력받을 수가N개
            int N = sc.nextInt();

            //N개의 수를 입력받음
            int[] inputNumber = new int[N];

            int XOR = 0;

            for(int i = 0; i < inputNumber.length; i++){
                inputNumber[i] = sc.nextInt ();
            }

            /**
             * 모든 입력된 수들에 대하여
             * 짝수번 나오는 수를 XOR하더라도 그 결과는 같다.(a xor a = 0)
             * 즉, 모든 수를 xor연산(^)하는 것으로 홀수번 입력된 수를 xor하는 것과
             * 동일한 결과를 도출할 수 있다.
             */
            for ( int anInputNumber : inputNumber ) {
                XOR = XOR ^ anInputNumber;
            }



            // Print the answer to standard output(screen).
            System.out.println("Case #"+(test_case+1));
            System.out.println(XOR);
        }
    }
}