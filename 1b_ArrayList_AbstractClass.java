//1. Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not

import java.util.ArrayList;
import java.util.List;

public class ColorSearch {

    public static void main(String[] args) {
        // Create an ArrayList to store colors
        List<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Purple");

        // Search for the color "Red"
        String searchColor = "Red";
        boolean isRedAvailable = colors.contains(searchColor);

        // Print the results
        if (isRedAvailable) {
            System.out.println("The color " + searchColor + " is available in the list.");
        } else {
            System.out.println("The color " + searchColor + " is not available in the list.");
        }
        System.out.println("All colors in the list: " + colors);
    }
}

//2.Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList

import java.util.ArrayList;
import java.util.Iterator;

public class ColorList {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original ArrayList: " + colors);

        // Removing the 2nd element (index 1)
        if (colors.size() > 1) {
            colors.remove(1);
        } else {
            System.out.println("ArrayList has less than 2 elements. Cannot remove the 2nd element.");
        }


        // Removing the color "Blue"
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Blue")) {
                iterator.remove();
            }
        }


        System.out.println("ArrayList after removing 2nd element and 'Blue': " + colors);
    }
}
        
