import java.util.*;
import java.util.List;

public class linkedlist {
    public static void main(String [] args){

        LinkedList <String> shoppingList = new LinkedList<>();
        shoppingList.add("Ishfaq");
        shoppingList.add("Subhan");
        shoppingList.add("Nouman");
        shoppingList.add("Himira");
        shoppingList.add("Mama");

        System.out.println("The elemtns are: " + ": " + shoppingList);
        shoppingList.add(1, "Name");
        System.out.println("The new ones are: " + shoppingList);
        shoppingList.removeFirst();
        System.out.println(shoppingList);
//  Synchronized linkedlist in java:

        List <String> syncroShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(syncroShoppingList);
    }
}
