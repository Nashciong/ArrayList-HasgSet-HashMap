import java.util.*;

public class Act1_hashSet {
    public static void main(String[] aguy){
        try (Scanner cio = new Scanner(System.in)) {
            System.out.println("This is my simple program in java using HashSet with getting the users input");

            Set<Integer> mySet = new HashSet<Integer>();
            String ans = "yes";

            System.out.println("Start the program by typing yes/no");
            String choice = cio.nextLine();

            if (choice.equals(ans)) {

                System.out.println("Enter your first number: ");
                mySet.add(cio.nextInt());
                System.out.println("Enter your second number: ");
                mySet.add(cio.nextInt());
                System.out.println("Enter your third number: ");
                mySet.add(cio.nextInt());
                System.out.println("Enter your fourth number: ");
                mySet.add(cio.nextInt());
                System.out.println("Enter your fifth number: ");
                mySet.add(cio.nextInt());
                System.out.println("These are the numbers you stored on the array named myList : " + mySet);

                // using forEach to display the values of the array
                for (Integer newList : mySet) {
                    System.out.println(newList);
                }
            }

            else {
                System.out.println("Oops you stopped the program");
            }
    }
    }
}
