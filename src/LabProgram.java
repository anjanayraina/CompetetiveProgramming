import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LabProgram {

    class FoodItem{

        String name;
        String cateogry;
        String description;

        FoodItem(String name , String cateogry , String description){

            this.name = name;
            this.cateogry  = cateogry;
            this.description =description;
        }
    }
    public static void main(String args[]) throws FileNotFoundException {


        File file = new File("C:\\Users\\anjan\\IdeaProjects\\CompetetiveProgramming\\src\\food.txt");
        // add the path of the food file that you saved in your system in the file class above
        Scanner snc = new Scanner(file);
        HashMap<String  , ArrayList<String >> map  = new HashMap<>();
        while(snc.hasNext()){

            String []temp  = snc.nextLine().split("\t");
            if(!map.containsKey(temp[0]))map.put(temp[0] , new ArrayList<String>());
            if(temp[temp.length - 1].equals("Not available"))continue;

        }
    }
}
