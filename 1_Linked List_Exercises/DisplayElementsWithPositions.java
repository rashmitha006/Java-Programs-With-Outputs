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
