import java.util.*;

public class Act2_arrayList {
    static List<Integer> myList = new ArrayList<Integer>();
    static Scanner input = new Scanner(System.in);
    static String answer = "yes";

    public static void main(String[] agay) {

        do {
            System.out.println("Adding, removing, displaying, clearing, and exit the program of the ArrayList.");
            System.out.println(
                    "Type A to Add Numbers. \nType B to Remove Numbers. \nType C to Display Numbers. \nType D to Clear Numbers. \nType E to Exit. ");

            char choices[] = new char[] { 'A', 'B', 'C', 'D', 'E' };
            char chosen = input.next().toUpperCase().charAt(0);

            if (choices[0] == chosen) {
                addNum(myList);
            } else if (choices[1] == chosen) {
                removeNum(myList);
            } else if (choices[2] == chosen) {
                displayNum(myList);
            } else if (choices[3] == chosen) {
                clearNum(myList);
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

    static void addNum(List<Integer> num) {
        num = myList;

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if (n >= 0) {
            System.out.println(myList.add(n) + ". " + " Successfully Added Positive Integer!");
        } else {
            System.out.println("Oops Negative Numbers declined by the program!");
        }

    }

    static void removeNum(List<Integer> num) {
        num = myList;

        System.out.println(
                "Removing values in the array starting from index 0 until index 4. These are the array you Stored recently: "
                        + num);

        System.out.println("Please input the index of the array you want to remove: ");
        myList.remove(input.nextInt());
        System.out.println("These are the values after removing: " + num);

    }

    static void displayNum(List<Integer> num) {
        num = myList;

        System.out.println("These are the values of the array named myList: " + num);

        for (Integer newList : num) {
            System.out.println(newList);
        }
    }

    static void clearNum(List<Integer> num) {
        num = myList;
        System.out.println("These are the values of the array named myList: " + num);
        System.out.println("Now we are going to clear all the elements of the array.");
        myList.removeAll(num);
        System.out.println("After removing all of the elements in array: " + num);

    }

    static void exit() {
        // exit
        System.out.println("The program stopped!");
        input.close();
    }
}
