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
    static int Answer = 0;

    public static void main ( String args[] ) throws Exception {
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
        Scanner sc = new Scanner ( System.in );
        //Scanner sc = new Scanner(new FileInputStream("input.txt"));

        int T = sc.nextInt ( );
        for ( int test_case = 0 ; test_case < T ; test_case++ ) {

            // Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////

            //원판에서 각각의 반지름을 입력받는다.
            //각각의 점수를 계산할때에는 (x,y)의 길이로써 계산
            int bull = sc.nextInt ( );
            int startTriple = sc.nextInt ( );
            int endTriple = sc.nextInt ( );
            int startDouble = sc.nextInt ( );
            int endDouble = sc.nextInt ( );

            //다트의 개수 N
            int N = sc.nextInt ( );

            for ( int i = 0 ; i < N ; i++ ) {
                int x = sc.nextInt ( );
                int y = sc.nextInt ( );
                double length = Math.sqrt ( x * x + y * y );
                if ( length < bull ) {
                    Answer += 50;
                    continue;
                }
                if ( length > endDouble )
                    continue;

                int mult = 1;
                if ( length > startTriple && length < endTriple )
                    mult = 3;
                if ( length > startDouble && length < endDouble )
                    mult = 2;

                int score;
                int[] arrayScore = { 6, 13, 4, 18, 1, 20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10 };

                double degree = Math.atan ( y / (double)x );
                degree *= ( 180 / Math.PI );
                if ( x < 0 )
                    degree += 180;
                degree += 9;
                degree = ( degree + 360 ) % 360;
                int temp = ( int ) ( degree / 18 );
                score = mult * arrayScore[ temp ];
                Answer += score;
            }


            // Print the answer to standard output(screen).
            System.out.println ( "Case #" + ( test_case + 1 ) );
            System.out.println ( Answer );
        }
    }
}