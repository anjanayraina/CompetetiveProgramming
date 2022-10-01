import java.util.Scanner;

public class MonthQuadrant {


    public static void main(String args[]){

        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the month :");
        int  n =s.nextInt();

        if(n < 0){

            System.out.println("Enter a valid Month!!");
        }

        else if(n >=1 && n<=3){

            System.out.println("1");
        }

        else if(n>=4 && n<=6){

            System.out.println("2");
        }

        else if(n>=7 && n<=9){

            System.out.println("3");
        }

        else if(n>=10 && n<=12){

            System.out.println("4");
        }

        else {

            System.out.println("Enter a valid Month!!");
        }



    }
}
