import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n  =s.nextInt();

        HashMap<String  , Integer> hash = new HashMap<>();

        for(int i=0;i<n;i++){

            String temp = s.next();
            if(!hash.containsKey(temp)){
                hash.put(temp , 1);
                System.out.println("OK");
                continue;

            }
            int num = hash.get(temp);
            String res=temp+num;
            System.out.println(res);
            hash.put(temp , num +1);
        }

    }
}
