import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input :");
        String input = scanner.nextLine();
        printWords(input);

    }

    private static void printWords(String string) {

        List<Character> arrV = new ArrayList<>();
        List<Character> arrK = new ArrayList<>();
        List<Character> result = new ArrayList<>();
        for(int i = 0 ; i < string.length() ; i ++){
            if(string.charAt(i) =='A' || string.charAt(i) =='a'||
                    string.charAt(i) =='E' || string.charAt(i) =='e'||
                    string.charAt(i) =='I' || string.charAt(i) =='i'||
                    string.charAt(i) =='U' || string.charAt(i) =='u'||
                    string.charAt(i) =='O' || string.charAt(i) =='o' ){
                arrV.add(string.charAt(i));
            }
            else {
                arrK.add(string.charAt(i));
            }
        }

        for(int i = 0 ; i < arrV.size() ; i ++){
            result.add(arrV.get(i));
        }
        for(int i = 0 ; i < arrK.size() ; i ++){
            result.add(arrK.get(i));
        }

        for(int i = 0 ; i < result.size() ; i ++){
            System.out.println(result.get(i));
        }
    }

}
