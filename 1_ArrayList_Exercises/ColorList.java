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
