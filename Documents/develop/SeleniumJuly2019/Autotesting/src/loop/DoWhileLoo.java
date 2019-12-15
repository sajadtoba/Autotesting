package loop;

public class DoWhileLoo {

    // while (expression)


    public static void main(String[] args) {

        int numberOfContestants = 0;

        while (numberOfContestants < 5) {

            System.out.println(" The total number of contestants in this raffle are:" + numberOfContestants);
            numberOfContestants++; // because we need increment in the while loop and for we don't need it
        }

        int count =0;
         do {
             System.out.println("Count is" + count);
             count++;
         }
         while (count<6);
         }
    }

