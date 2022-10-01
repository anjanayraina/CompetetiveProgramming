import java.util.Scanner;

public class RecursiveSolution2 {


    public static long shell(int n ){

        if(n == 0)return  1;
        return shell(n-1 )*2;
    }
    public static  void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int  n =s.nextInt();
        System.out.println("The Solution is : ");
        System.out.println(shell(n));

    }
}
