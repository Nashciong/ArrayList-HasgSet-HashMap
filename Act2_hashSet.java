import java.util.*;

public class Act2_hashSet {
    static Set<Integer> mySet = new HashSet<Integer>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] agay) {

        do {
            System.out.println("Adding, removing, displaying, clearing, and exit the program of the HashMap.");
            System.out.println(
                    "Type A if you will add elments in the array. \nType B if you want to remove elements in the array. \nType C if you want to display the elements of an array. \nType D if you want to clear the elements of the array. \nType E if you want to exit the program. ");

            char choices[] = new char[] { 'A', 'B', 'C', 'D', 'E' };
            char chosen = input.next().toUpperCase().charAt(0);

            if (choices[0] == chosen) {
                addNum(mySet);
            } else if (choices[1] == chosen) {
                removeNum(mySet);
            } else if (choices[2] == chosen) {
                displayNum(mySet);
            } else if (choices[3] == chosen) {
                clearNum(mySet);
            } else if (choices[4] == chosen) {
                exit();
            } else {
                System.out.println("Oops you inputted wrong! try again.");
            }

            System.out.println("Do you want to continue the program? yes/no");
        }

        while (input.next().equals("yes"));
        input.close();
    }

    static void addNum(Set<Integer> myList2) {
        myList2 = mySet;

        System.out.print("Enter a number to add in your hashset: ");
        int addNum = input.nextInt();

        if (myList2.contains(addNum)) {
            System.out.println("Ooops the number you input in already on the hashSet!");
        } else {
            System.out.println("Successfully Added " + myList2.add(addNum));
        }

    }

    private static int mySet(int i) {
        return 0;
    }

    static void removeNum(Set<Integer> myList2) {
        myList2 = mySet;

        System.out.println(
                "Removing values in the array starting from index 0 until index 4. These are the array you Stored recently: "
                        + myList2);

        System.out.println("Please input the index of the array you want to remove: ");
        mySet.remove(input.nextInt());
        System.out.println("These are the values after removing: " + myList2);

    }

    static void displayNum(Set<Integer> myList2) {
        myList2 = mySet;

        System.out.println("These are the values of the array named mySet: " + myList2);

        for (Integer newList : myList2) {
            System.out.println(newList);
        }
    }

    static void clearNum(Set<Integer> myList2) {
        myList2 = mySet;
        System.out.println("These are the values of the array named mySet: " + myList2);
        System.out.println("Now we are going to clear all the elements of the array.");
        mySet.removeAll(myList2);
        System.out.println("After removing all of the elements in array: " + myList2);

    }

    static void exit() {
        // exit
        System.out.println("The program stopped!");
        input.close();
    }
}
