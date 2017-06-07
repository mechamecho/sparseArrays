import java.util.Scanner;

/**
 * Created by Engineer on 6/7/2017.
 */
public class SparseArrays {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int N,Q;
        N=in.nextInt();
        String[]testedStrings=new String[N];
        for (int i=0;i<N;i++){
            testedStrings[i]=in.next();
        }
        Q=in.nextInt();

        for(int i=0; i<Q;i++){
            int counter=0;
            String searchedFor=in.next();
            for (int j=0;j<N;j++){
                if(searchedFor.equals(testedStrings[j])){
                    counter++;
                }

            }

            System.out.println(counter);

        }

    }
}
