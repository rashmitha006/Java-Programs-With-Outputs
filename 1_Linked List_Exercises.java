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

//4.Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )

import java.util.LinkedList;

public class DisplayElementsWithPositions {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display elements with their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}

//5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))
import java.util.LinkedList;
import java.util.Collections;

public class SwapElementsInLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");     // index 0
        colors.add("Blue");    // index 1
        colors.add("Green");   // index 2
        colors.add("Yellow");  // index 3

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Swap the first (index 0) and third (index 2) elements
        Collections.swap(colors, 0, 2);

        // Display the updated list
        System.out.println("LinkedList after swapping first and third elements: " + colors);
    }
}
