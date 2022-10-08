import java.util.*;

public class Main {

    public static void main(String[] aguy) {
        Scanner inputNehSiya = new Scanner(System.in);

        // instantiating the class animeInfo
        List<animeInfo> myList = new ArrayList<animeInfo>();

        System.out.println("Welcome to your favorite anime lits!");
        System.out.println("How many anime series you love? Input it as number: ");

        int fnum = inputNehSiya.nextInt();

        try {
            if (fnum < 0) {
                inputNehSiya.close();
            }

            int i = 0;
            while (i < fnum) {

                // ask user the title of the anime
                System.out.print("Anime Title: ");
                String animeT = inputNehSiya.nextLine();

                // ask user the character of the anime
                System.out.print("Anime Character: ");
                String animeChar = inputNehSiya.nextLine();
                myList.add(new animeInfo(animeT, animeChar));

                i++;

            }

            System.out.println("Your Favorite anime: ");
            for (animeInfo newww : myList) {
                System.out.println("*************************************");
                System.out.println("Anime Title: " + newww.animeTitle + "\nCharacter: " + newww.animeChar);
                System.out.println("*************************************");

            }

            inputNehSiya.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}