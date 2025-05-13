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
//3.Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
      import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");

        // Print colors before sorting
        System.out.println("Colors before sorting: " + colors);

        // Sort the colors using Collections.sort()
        Collections.sort(colors);

        // Print colors after sorting
        System.out.println("Colors after sorting: " + colors);
    }
}
//4.  Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()

        import java.util.ArrayList;
import java.util.List;

public class ColorExtractor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display all colors
        System.out.println("All colors: " + colors);

        // Extracting 1st and 2nd elements using subList
        List<String> extracted = colors.subList(0, 2);

        // Display extracted colors
        System.out.println("Extracted (1st and 2nd) colors: " + extracted);
    }
}
//5.Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index
  import java.util.ArrayList;
import java.util.Scanner;

public class ColorRemover {
    public static void main(String[] args) {
        // Create an ArrayList and add colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original colors list: " + colors);

        // Get the n-th element to remove from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the color to delete (1-based index): ");
        int n = scanner.nextInt();

        // Convert to 0-based index
        int indexToRemove = n - 1;

        // Check if index is valid
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            // Remove the element
            String removedColor = colors.remove(indexToRemove);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid position! Please enter a number between 1 and " + colors.size());
        }

        // Display the updated list
        System.out.println("Updated colors list: " + colors);
    }
}
  
