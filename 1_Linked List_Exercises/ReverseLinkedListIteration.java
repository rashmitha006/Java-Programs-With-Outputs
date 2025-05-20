//2.Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original list: " + colors);

        // Get the descending iterator
        Iterator<String> reverseIterator = colors.descendingIterator();

        // Iterate and print elements in reverse order
        System.out.println("LinkedList in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
