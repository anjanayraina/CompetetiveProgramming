import java.util.ArrayList;

public class PerfectNumbers {
    public static boolean isDivisor(int i , int num){

        return num%i == 0;
    }

    public static ArrayList<Integer> allDivisors(int num){
        ArrayList<Integer> res = new ArrayList<>();
        for(int  i =1;i<num;i++) {
            if(isDivisor(i , num)){

                res.add(i);
            }
        }

        return res;
    }

    public static boolean isPerfect(int num){
        int sum =0;
        for(int  i : allDivisors(num)){
//            System.out.println(i);
            sum+=i;
        }
        return sum == num;
    }

    public static void main(String args[]){
        int count =1;
        System.out.println("Perfect Numbers unitl 10,000");
        for(int i = 2;i<=10000;i++){
            if(isPerfect(i))
            {
                System.out.println(count + ":" + i);
                count++;
            }

        }


    }
}
