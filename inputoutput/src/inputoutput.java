import java.util.ArrayList;
import java.util.Scanner;

public class inputoutput {

    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );
        while(sc.hasNextLine ()){
            String temp = sc.nextLine ();
            if(temp.isEmpty ()) {
                if(sc.hasNextLine ()){
                    System.out.println (temp );
                    continue;
                }else{
                    break;
                }
            }
            System.out.println (temp );
        }


    }
}
