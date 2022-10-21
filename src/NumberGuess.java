import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class NumberGuess {
    public static boolean canKeepRunning(int guess , int val , int max , int min){
        if(guess == -1){
            System.out.println("Program Ended!!");
            return false;
        }
        if(guess < min  || guess  > max){

            System.out.println(String.format("Please keep the guess in between the bound %d and %d" , min ,max));
            return true;
        }

        else if(guess == val){
            System.out.println("The guess is correct !!");
            return false;
        }


        else if(guess < val){
            System.out.println("The guess is low , try making a higher guess!!");
            return true;
        }

            System.out.println("The guess is high , try making a lower guess!!");
            return true;




    }
    public static void main(String args[]){
        int min = 225;
        int max = 870;
        int val = min + (int)(Math.random() * (max - min + 1));
        Scanner s = new Scanner(System.in);
        System.out.println(val);
        int guess = -1;

        do{

            System.out.println("Enter your Guess : ");
           try{

               guess = s.nextInt();
           }

           catch(Exception e){

                System.out.println("Please enter a valid integer");
                guess= 0;
                continue;
            }


        }while(canKeepRunning(guess ,val , max, min));

    }
}
