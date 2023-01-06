package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemSolving {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of queries: ");
        int n = in.nextInt();
        in.nextLine();

        HashMap<String, Integer> phonebook = new HashMap<>();

        for(int i = 0; i < n; i++) {

            System.out.println("Enter person's name: ");
            String name=in.nextLine();

            System.out.println("Enter person's phone number: ");
            int phone=in.nextInt();

            System.out.println("What person's number do you want to find? ");
            in.nextLine();

            phonebook.put(name, phone);
        }
        while(in.hasNext()) {

            String person = in.nextLine();
            String result = "";

            for(String name : phonebook.keySet()){
                if(name.equals(person)){
                    result = name + "=" + phonebook.get(name);
                    break;
                }else{
                    result = "Not found";
                }
            }
            System.out.println(result);
        }
    }
}
