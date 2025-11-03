package learning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create two ArrayLists of String type
        ArrayList<String> li = new ArrayList<>();
        ArrayList<String> li1 = new ArrayList<>();

        // Add elements to li
        li.add("apple"); // add element at end
        System.out.println("Element at index 0: " + li.get(0)); // get element at index 0 and print

        // Add element at index 1 (end of list now)
        li.add(1, "Banana");
        System.out.println("Element at index 1: " + li.get(1)); // get element at index 1

        // Add all elements from li1 to li (li1 is empty now, so no change)
        li.addAll(li1);
        System.out.println("After addAll(li1): " + li);

        // Add all from li1 starting at index 2 (still empty so no change)
        li.addAll(2, li1);
        System.out.println("After addAll(2, li1): " + li);

        // Check if list contains "apple"
        boolean containsApple = li.contains("apple");
        System.out.println("List contains 'apple'? " + containsApple);

        // Ensure capacity to hold at least 10 elements (optimizes internal array size)
        li.ensureCapacity(10);

        // Print all elements using foreach loop (preferred way to print)
        System.out.println("List elements:");
        for (String item : li) {
            System.out.println(item);
        }

        // Get element at index 0
        System.out.println("Element at index 0 again: " + li.get(0));

        // Get index of "Banana" (returns -1 if not found)
        int bananaIndex = li.indexOf("Banana");
        System.out.println("Index of 'Banana': " + bananaIndex);

        // Check if list is empty
        boolean isEmpty = li.isEmpty();
        System.out.println("Is list empty? " + isEmpty);

        // Remove element by index - remove element at index 0
        li.remove(0);
        System.out.println("After removing element at index 0: " + li);

        // Remove element by element ("apple")
        li.remove("apple");
        System.out.println("After removing 'apple': " + li);

        // Replace all elements with their uppercase versions using method reference
        li.replaceAll(String::toUpperCase);
        System.out.println("After replaceAll to uppercase: " + li);

        // Add some elements to make sure index 3 exists for set()
        li.add("CHERRY");
        li.add("DATE");
        li.add("ELDERBERRY");

        // Set element at index 3 (replaces existing element)
        li.set(3, "Mango");
        System.out.println("After set at index 3 to 'Mango': " + li);

        // Get size of the list
        int size = li.size();
        System.out.println("Size of the list: " + size);

        // Get a subList from index 1 (inclusive) to 4 (exclusive)
        List<String> subList = li.subList(1, 4);
        System.out.println("Sublist (1 to 4): " + subList);

        // Convert list to array of Object type
        Object[] arr = li.toArray();
        System.out.println("Elements in Object array:");
        for (Object o : arr) {
            System.out.println(o);
        }

        // Convert list to array of String type
        String[] ar = li.toArray(new String[0]);
        System.out.println("Elements in String array:");
        for (String s : ar) {
            System.out.println(s);
        }

        // Trim ArrayList capacity to current size (releases unused internal memory)
        li.trimToSize();

        // Get hash code of the list (based on content)
        int hashCode = li.hashCode();
        System.out.println("Hash code of the list: " + hashCode);

        li.removeIf(item -> item.startsWith("a"));
        System.out.println(li);

        ArrayList<Integer> z= new ArrayList<>();
        z.add(1);
        z.add(2);
        z.add(3);
        z.toString();   
        String y=z.toString();
        System.out.println(y);

       
    }
}
