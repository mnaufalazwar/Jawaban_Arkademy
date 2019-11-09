import java.awt.*;
import java.awt.event.WindowStateListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal_3 {

    public static List<Integer> arrInt = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input :");
        String input = scanner.nextLine();
        checkInput(input);

    }

    private static void checkInput(String input) {

        if(input.contains("[") && input.contains("]")){
            System.out.println("array");
            String[] items = input.trim().split("[,\\]\\[.]+");

            if(items.length < 3){
                System.out.println("Minimal array length is 3!");
            }
            else {
                boolean arrayOfInt = true;
                for(int i = 0 ; i < items.length ; i ++){
                    try {
                        System.out.println(items[i]);
                        Integer.parseInt(items[i].trim());
                    }
                    catch (NumberFormatException e){
                        System.out.println(e.getMessage());
                        System.out.println(items.length);
                        arrayOfInt = false;
                    }
                }
                if(!arrayOfInt){
                    System.out.println("hasilnya 0");
                }
                else{
                    for(int i = 0 ; i < items.length ; i ++){
                        arrInt.add(Integer.parseInt(items[i]));
                    }
                    thirdHighest(arrInt);
                }
            }
        }
        else {
            System.out.println("Parameter should be an array!");
        }

    }

    private static void thirdHighest(Object object) {

        System.out.println(object.getClass().getSimpleName());
        if (object.getClass().getSimpleName().equals("int[]")
        || object.getClass().getSimpleName().equals("ArrayList")){
            System.out.println("tipe = array of integer");
        }
        else {
            System.out.println("tipe = bukan array of integer");
        }

    }
}
