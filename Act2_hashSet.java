import java.util.*;

public class Act2_hashSet {
    static Set<Integer> mySet = new HashSet<Integer>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] agay) {

        do {
            System.out.println("Adding, removing, displaying, clearing, and exit the program of the HashSet.");
            System.out.println(
                    "Type A to Add Numbers. \nType B to Remove Numbers. \nType C to Display Numbers. \nType D to Clear Numbers. \nType E to Exit. ");

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

    static void removeNum(Set<Integer> myList2) {
        myList2 = mySet;

        System.out.println(
                "Removing values in the array starting from index 0 until index 4. These are the values you Stored recently: "
                        + myList2);

        System.out.println("Please input the specific index: ");
        mySet.remove(input.nextInt());
        System.out.println("These are the values after removing: " + myList2);

    }

    static void displayNum(Set<Integer> myList2) {
        myList2 = mySet;

        System.out.println("These are the values of the HashSet named mySet: " + myList2);

        for (Integer newList : myList2) {
            System.out.println(newList);
        }
    }

    static void clearNum(Set<Integer> myList2) {
        myList2 = mySet;
        System.out.println("These are the values of the HashSet named mySet: " + myList2);
        System.out.println("Now we are going to clear all the elements of the HashSet.");
        mySet.removeAll(myList2);
        System.out.println("After removing all of the elements in the HashSet: " + myList2);

    }

    static void exit() {
        // exit
        System.out.println("The program stopped!");
        input.close();
    }
}
