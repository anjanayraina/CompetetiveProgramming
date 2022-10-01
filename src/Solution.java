import java.util.HashMap;

public class Solution {

    public static int shell(int x , int target , HashMap<Integer , Integer> dp){
        if(x == target )return 0;

        if(dp.containsKey(x))return dp.get(x);

        if(x > target){

            int res = shell(x - 2 , target , dp) + 1;
            dp.put(x , res);

        }

        else{

            int res = shell(x + 3 , target , dp) +1;
            dp.put(x , res);


        }

        return dp.get(x);



    }
public static void main(String args[]){




}

}
