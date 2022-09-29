import java.util.*;

public class Act2_hashMap {
    static Map<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();
    static Scanner input = new Scanner(System.in);
    static String answer = "yes";

    public static void main(String[] agay) {

        do {
            System.out.println("Adding, removing, displaying, clearing, and exit the program of the HashMap.");
            System.out.println(
                    "Type A to Add Numbers. \nType B to Remove Numbers. \nType C to Display Numbers. \nType D to Clear Numbers. \nType E to Exit. ");

            char choices[]=new char[]{'A','B','C','D','E'};
            char chosen = input.next().toUpperCase().charAt(0);

            if (choices[0] == chosen) {
                addNum(myHashMap);
            } else if (choices[1] == chosen) {
                removeNum(myHashMap);
            } else if (choices[2] == chosen) {
                displayNum(myHashMap);
            } else if (choices[3] == chosen) {
                clearNum(myHashMap);
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

    static void addNum(Map<Integer, Integer> myHashMap2) {
        myHashMap2 = myHashMap;

        System.out.print("Enter your ID as a value: ");
        int addNum = input.nextInt();

        int j = addNum / 2;
        int isPrime = 0;

        if (addNum == 0 || addNum == 1) {
            System.out.print("Enter your age as a key: ");
            Integer myKey = input.nextInt();

            myHashMap2.put(myKey, addNum);
            System.out.println(myKey + " " + addNum + " is successfully added to the HashMap!");

        } else {
            for (int i = 2; i <= j; i++) {
                if (addNum % i == 0) {
                    System.out.print("Enter a key for the number you want to add: ");
                    int myKey = input.nextInt();
                    System.out.println("");

                    myHashMap.put(myKey, addNum);
                    System.out.println(myKey + " " + addNum + " is successfully added to the HashMap!");
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0) {
                System.out.println("It is a prime number. Auto declined by the program.");
            }
        }
    }

    static void removeNum(Map<Integer, Integer> myHashMap2) {
        myHashMap2 = myHashMap;

        System.out.println(
                "Removing values in the array starting from index 0 until index 4. These are the keys and values you Stored recently: "
                        + myHashMap2);

        System.out.println("Please input the key of the array you want to remove: ");
        myHashMap.remove(input.nextLine());
        System.out.println("These are the values after removing: " + myHashMap2);

    }

    static void displayNum(Map<Integer, Integer> myHashMap2) {
        myHashMap2 = myHashMap;

        System.out.println("These are the values of the array named myHashMap: " + myHashMap2);

        Set<Integer> newSet = myHashMap.keySet();

        System.out.println("Displaying the keys:");
        for (Integer myNewSet : newSet) {
            System.out.println(myNewSet);
        }
        System.out.println("Displaying the Values: ");
        Iterator it = newSet.iterator();
        while (it.hasNext()) {
            System.out.println(myHashMap.get(it.next()));
        }
    }

    static void clearNum(Map<Integer, Integer> myHashMap2) {
        myHashMap2 = myHashMap;
        System.out.println("These are the keys and values of the HashMap named myHashMap: " + myHashMap2);
        System.out.println("Now we are going to clear all the elements of the HashMap.");
        myHashMap.clear();
        System.out.println("After removing all of the elements in HashMap: " + myHashMap2);

    }

    static void exit() {
        // exit
        System.out.println("The program stopped!");
        input.close();
    }
}
