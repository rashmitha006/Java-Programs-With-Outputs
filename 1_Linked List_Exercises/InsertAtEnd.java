//3.Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))
import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Insert "Pink" at the end of the LinkedList
        colors.offerLast("Pink");

        // Display the updated list
        System.out.println("LinkedList after adding 'Pink' at the end: " + colors);
    }
}
