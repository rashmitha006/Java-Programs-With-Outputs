//3A Exercise

//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty()
.
import java.util.Scanner;
public class StringCheck {
    // User-defined function to check if the string is null or contains only whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using the user-defined function
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }
        scanner.close();
    }
}
//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
import java.util.Scanner;

public class SubstringCount {

    // User-defined function to count the occurrences of a substring in the main string
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;
        // Loop to find all occurrences of the substring
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward to search for the next occurrence
        }
        return count;
    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        // Prompt user for main string and substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String subString = scanner.nextLine();
        // Count occurrences using the user-defined function
        int result = countOccurrences(mainString, subString);
        // Display the result
        System.out.println("The substring '" + subString + "' appears " + result + " times in the main string.");

        scanner.close();
    }
}
//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().
import java.util.Scanner;

public class StringReversal {

    // User-defined function to reverse the string
    public static String reverseString(String str) {
        String reversed = "";
        
        // Loop through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using the user-defined function
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
import java.util.Scanner;

public class PalindromeCheck {

    // User-defined function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        // Compare characters from both ends towards the center
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }

        return true; // String is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome using the user-defined function
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
import java.util.Scanner;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace characters from the string
    public static String removeWhitespace(String str) {
        // Replace all whitespace characters (spaces, tabs, newlines, etc.) with an empty string
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove whitespace using the user-defined function
        String result = removeWhitespace(input);

        // Display the result
        System.out.println("String without whitespace: " + result);

        scanner.close();
    }
}
//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()

import java.util.Scanner;

public class CapitalizeWords {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word
        for (String word : words) {
            // Capitalize the first letter and keep the rest of the word in lowercase
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase())
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        
        // Remove the trailing space and return the result
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Capitalize words using the user-defined function
        String result = capitalizeWords(input);

        // Display the result
        System.out.println("String with capitalized words: " + result);

        scanner.close();
    }
}
//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
import java.util.Scanner;

public class StringTruncation {

    // User-defined function to truncate the string and add an ellipsis
    public static String truncate(String str, int length) {
        // If the string length is greater than the specified length, truncate it
        if (str.length() > length) {
            return str.substring(0, length) + "...";
        }
        // If the string is shorter or equal to the specified length, return it as is
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Prompt the user to enter the desired length
        System.out.print("Enter the length to truncate to: ");
        int length = scanner.nextInt();

        // Truncate the string using the user-defined function
        String result = truncate(input, length);

        // Display the truncated string
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}
//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
import java.util.Scanner;

public class NumericCheck {

    // User-defined function to check if the string contains only numeric characters
    public static boolean isNumeric(String str) {
        // Check if the string is not empty and contains only digits using regex
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Verify if the string contains only numeric characters
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }

        scanner.close();
    }
}
//Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // User-defined function to generate a random string of specified length
    public static String generateRandomString(int length) {
        // Characters to choose from (uppercase, lowercase, and digits)
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        // Generate random characters from the characters string
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());  // Random index
            randomString.append(characters.charAt(index));  // Append character to result
        }

        return randomString.toString();  // Return the random string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the desired length of the random string
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        // Generate a random string using the user-defined function
        String randomStr = generateRandomString(length);

        // Display the generated random string
        System.out.println("Generated Random String: " + randomStr);

        scanner.close();
    }
}
//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()

import java.util.Scanner;

public class WordCounter {

    // User-defined function to count the number of words in a string
    public static int countWords(String str) {
        // Trim the string to remove leading and trailing spaces and split by one or more whitespace characters
        String[] words = str.trim().split("\\s+");

        // If the string is empty, return 0 (no words)
        if (str.isEmpty()) {
            return 0;
        }

        // Return the length of the array, which represents the number of words
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the words using the user-defined function
        int wordCount = countWords(input);

        // Display the word count
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
