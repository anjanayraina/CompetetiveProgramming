import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LabProgram {

    static class FoodItem{

        String name;
        String cateogry;
        String description;

        FoodItem(String name , String cateogry , String description){

            this.name = name;
            this.cateogry  = cateogry;
            this.description =description;
        }
    }
    public static void main(String args[]) throws IOException {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the name of the file :");
        String fileName = scnr.nextLine();
        InputStream input = LabProgram.class.getResourceAsStream("/"+fileName);
        InputStreamReader inputReader = new InputStreamReader(input);

        BufferedReader br = new BufferedReader(inputReader);
        String line = null;
        ArrayList<FoodItem> map  = new ArrayList<>();
        try {
            while((line = br.readLine())!=null){
                String []temp  = line.split("\t");

                if(temp[temp.length - 1].equals("Not available"))continue;
                map.add(new FoodItem(temp[1] , temp[0] , temp[2]));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }



            for(FoodItem foodItem : map){

                System.out.println(String.format("%s (%s) -- %s" , foodItem.name , foodItem.cateogry , foodItem.description));
            }

    }
}
