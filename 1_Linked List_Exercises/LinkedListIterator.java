//1.Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");     // index 0
        colors.add("Blue");    // index 1
        colors.add("Green");   // index 2
        colors.add("Yellow");  // index 3
        colors.add("Orange");  // index 4

        // Display all colors
        System.out.println("All colors: " + colors);

        // Create an iterator starting from the 2nd position (index 1)
        Iterator<String> iterator = colors.listIterator(1);

        // Iterate and print elements starting from 2nd position
        System.out.println("Iterating from the 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
