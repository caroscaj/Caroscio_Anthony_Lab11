import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // scanner instance to take inputs from user
        ArrayList<String> list = new ArrayList<String>(); // arraylist
        String str; System.out.println("Please enter the items in your list, enter (quit) when you would " +
                "like your list to end");
        while ( !(str = input.nextLine()).equals("")&& !(str.equals("quit")) ){
            list.add(str);
        }
        System.out.println("This is your list" + list); System.out.println("Your list has" +list.size()+"items");
    }
}