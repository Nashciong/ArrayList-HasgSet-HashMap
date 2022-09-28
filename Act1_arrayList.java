
import java.util.*;

public class Act1_arrayList {
    public static void main(String[] aguy) {
        try (Scanner cio = new Scanner(System.in)) {
            System.out.println("This is my simple ArrayList with getting the users input");

            List<Integer> myList = new ArrayList<Integer>();
            String ans = "yes";

            System.out.println("Start the program by typing yes/no");
            String choice = cio.nextLine();

            if (choice.equals(ans)) {

                System.out.println("Enter your first number: ");
                myList.add(cio.nextInt());
                System.out.println("Enter your second number: ");
                myList.add(cio.nextInt());
                System.out.println("Enter your third number: ");
                myList.add(cio.nextInt());
                System.out.println("Enter your fourth number: ");
                myList.add(cio.nextInt());
                System.out.println("Enter your fifth number: ");
                myList.add(cio.nextInt());
                System.out.println("These are the numbers you stored on the array named myList : " + myList);

                // using forEach to display the values of the array
                for (Integer newList : myList) {
                    System.out.println(newList);
                }
            }

            else {
                System.out.println("Oops you stopped the program");
            }

        }
    }

}
