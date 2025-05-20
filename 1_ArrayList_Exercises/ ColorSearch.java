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
  
