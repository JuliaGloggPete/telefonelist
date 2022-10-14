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
        // telephoneList.put("Greta","nononon"); //if I have two Gretas in this list - it does not work



        boolean validAnswer = true;

        menue(sc, telephoneList, validAnswer);

        

    }

    private static void menue(Scanner sc, Map<String, String> telephoneList, boolean validAnswer) {
        do{System.out.println("What do you want to do? Press 1 for searching for a number, " +
                "press 2 for adding a number to the list");
            String choice = sc.nextLine();



            switch (choice){
                case "1": System.out.println("Hello who's number are you searching for?");
                    String searchedPerson = sc.nextLine();
                    searchByName(searchedPerson, telephoneList);
                   break;

                case "2":
                    System.out.println("Please insert the name");
                    String newPerson = sc.nextLine();
                    System.out.println("Please insert the number");
                    String newNumber = sc.nextLine();
                    telephoneList.put(newPerson,newNumber);
                    break;
                default: System.out.println("Not a valid choice"); validAnswer =false;


        }}while (!validAnswer);
    }

    public static void searchByName(String searchedPerson, Map <String,String> telephoneList){

        for(String key: telephoneList.keySet()){

            if (key.equals(searchedPerson)){

                System.out.println("Name "+key+" number: "+ telephoneList.get(key));

            }

            //else {
             //   System.out.println("Person was not found in the list");break;
           // }


        }
    }




}