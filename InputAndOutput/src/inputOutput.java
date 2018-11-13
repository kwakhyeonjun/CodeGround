import java.util.ArrayList;
import java.util.Scanner;

public class inputOutput {

    public static void main(String[] args){
        ArrayList<String> sentence = new ArrayList <> (  );
        Scanner sc = new Scanner ( System.in );
        while(sc.hasNextLine ()){
            String temp = sc.nextLine ();
            if(temp.isEmpty ()) {
                break;
            }
            sentence.add ( temp );
        }
        for(int i =0; i<sentence.size (); i++){
            System.out.println (sentence.get(i) );
        }


    }
}
