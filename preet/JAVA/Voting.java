import java.util.ArrayList;
import java.util.Random;

/*******************************************
 * Complete your program from here.
 *******************************************/


/*******************************************
 * Do not modify the next part of code
 *******************************************/

class Utils {

    private static final Random RANDOM = new Random();

    // DO NOT USE THIS METHOD INSIDE YOUR CODE
    public static void setSeed(long seed) {
        RANDOM.setSeed(seed);
    }

    // generate a whole number between 0 and max (max not included)
    public static int randomInt(int max) {
        return RANDOM.nextInt(max);
    }
}

/**
 * Class for testing the simulation
 */

class Voting {

    public static void main(String args[]) {
        Utils.setSeed(20000);
        // TEST 1
        System.out.println("Test part I:");
        System.out.println("--------------");

        ArrayList<Applicant> applicants = new ArrayList<Applicant>();
        applicants.add(new Applicant("Tarek Oxlama", 2));
        applicants.add(new Applicant("Nicolai Tarcozi", 3));
        applicants.add(new Applicant("Vlad Imirboutine", 2));
        applicants.add(new Applicant("Angel Anerckjel", 4));

        // 30 -> nombre maximal of voters
        // 15 day of poll 
        Ballot ballot = new Ballot(applicants, 30, 15, false);

        ballot.results();

        // END OF TEST 1

        // TEST 2
        System.out.println("Test part II:");
        System.out.println("---------------");

        ballot = new Ballot(applicants, 20, 15);
        // all the ballots pass the check of the date
        // the parameters to simulate are in order:
        // the percentage of voters and the day of the vote
        ballot.simulate(0.75, 12);
        ballot.countVotes();
        ballot.results();

        ballot = new Ballot(applicants, 20, 15);

        ballot.simulate(0.75, 15);
        ballot.countVotes();
        ballot.results();

        ballot = new Ballot(applicants, 20, 15);

        ballot.simulate(0.75, 15);
        ballot.countVotes();
        ballot.results();
        //END OF TEST 2

    }
}
