import java.util.Random;

public class Main {

    public static void main(String[] args) {

        scenarioOne();
        System.out.println();
        scenarioTwo();
        System.out.println();
        scenarioThree();
        System.out.println();
        scenarioFour();
        System.out.println();
        scenarioFive();

    }

    public static void scenarioOne() {
        Random rand = new Random();

        int trueProb = 0;
        int falseProb = 0;

        for (int i = 0; i < 100000; i++) {
            int randNumber = rand.nextInt(6) + 1;
            if (randNumber % 2 == 0) {
                trueProb++;
            }
            else
                falseProb++;
        }
        double probability = (trueProb / 100000.0)*100;
        System.out.println("Scenario: Expected Result 50%");
        System.out.println("Count of True: " + trueProb);
        System.out.println("Count of False: " + falseProb);
        System.out.println("Condition reached " + probability + "%");
    }

    public static void scenarioTwo() {
        Random rand = new Random();

        int trueProb = 0;
        int falseProb = 0;

        for (int i = 0; i < 100000; i++) {
            int randNumber = rand.nextInt(10) + 1;
            if ((randNumber > 5) || (randNumber % 2 == 0)) {
                trueProb++;
            }
            else
                falseProb++;
        }
        double probability = (trueProb / 100000.0)*100;
        System.out.println("Scenario: Expected Result 70%");
        System.out.println("Count of True: " + trueProb);
        System.out.println("Count of False: " + falseProb);
        System.out.println("Condition reached " + probability + "%");
    }

    public static void scenarioThree() {
        Random rand = new Random();

        int trueProb = 0;
        int falseProb = 0;

        for (int i = 0; i < 100000; i++) {
            int odd = rand.nextInt(6) + 1;
            int even = rand.nextInt(6) + 1;
            if ((even % 2 == 0) && (odd % 2 == 1)) {
                trueProb++;
            }
            else
                falseProb++;
        }
        double probability = (trueProb / 100000.0)*100;
        System.out.println("Scenario: Expected Result 25%");
        System.out.println("Count of True: " + trueProb);
        System.out.println("Count of False: " + falseProb);
        System.out.println("Condition reached " + probability + "%");
    }

    public static void scenarioFour() {
        Random rand = new Random();

        int trueProb = 0;
        int falseProb = 0;

        for (int i = 0; i < 100000; i++) {
            int OnetoTwo = rand.nextInt(6) + 1;
            int ThreetoFour = rand.nextInt(6) + 1;
            int FivetoSix = rand.nextInt(6) + 1;
            if ((OnetoTwo < 3) && (ThreetoFour > 2 && ThreetoFour < 5) && (FivetoSix > 4)) {
                trueProb++;
            }
            else
                falseProb++;
        }
        double probability = (trueProb / 100000.0)*100;
        System.out.println("Scenario: Expected Result 3%");
        System.out.println("Count of True: " + trueProb);
        System.out.println("Count of False: " + falseProb);
        System.out.println("Condition reached " + probability + "%");
    }

    public static void scenarioFive() {
        Random rand = new Random();

        int trueProb = 0;
        int falseProb = 0;

        for (int i = 0; i < 100000; i++) {
            int numberOne = rand.nextInt(6) + 1;
            int numberTwo = rand.nextInt(6) + 1;
            int numberThree = rand.nextInt(6) + 1;
            int numberFour = rand.nextInt(6) + 1;
            if ((numberOne != numberTwo && numberOne != numberThree && numberOne != numberFour) && (numberTwo != numberThree && numberTwo != numberFour) && (numberThree != numberFour)) {
                trueProb++;
            }
            else
                falseProb++;
        }
        double probability = (trueProb / 100000.0)*100;
        System.out.println("Scenario: Expected Result 27%");
        System.out.println("Count of True: " + trueProb);
        System.out.println("Count of False: " + falseProb);
        System.out.println("Condition reached " + probability + "%");
    }
}
