package Leetcode;

import java.util.Scanner;

public class MoveNegativeToBeginning {

    public static void moveToTheBeginning(int a[] , int n){
        int  l =0;
        int h=n-1;
        while(l < h){
            if(a[l] < 0)l++;
            else if(a[h] < 0){
                int temp  = a[l];
                a[l] = a[h];
                a[h] = temp;
                l++;
                h--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int n  = s.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]  = s.nextInt();
        }
        moveToTheBeginning(a , n);
        for(int i : a) System.out.print(i + " ");


    }
}
