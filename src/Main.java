import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,String> telephoneList = new HashMap<>();

        telephoneList.put("Greta", "1233 5987 654");
        telephoneList.put("Hans", "979 59 87654");
        telephoneList.put("Häxan", "898 9800");


        System.out.println("Hello whos number are you searching for?");
        String searchedPerson = sc.nextLine();
        searchByName(searchedPerson,telephoneList);

    }

    public static void searchByName(String searchedPerson, Map <String,String> telephoneList){

        for(String key: telephoneList.keySet()){

            if (key.equals(searchedPerson)){

                System.out.println("Name "+key+" number: "+ telephoneList.get(key));

            }


        }
    }




}