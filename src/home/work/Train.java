package home.work;

import java.util.Arrays;
import java.util.Comparator;

public class Train {
    private String destination;
    private int numberOfTrain;
    private String departureTime;

    public Train(String destination, int numberOfTrain, String departureTime) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public static void sortByTrainNumber(Train[] trains) {
        Arrays.sort(trains, Comparator.comparingInt(Train::getNumberOfTrain));
    }

    public static void sortByDestinationAndTime(Train[] trains) {
        Arrays.sort(trains, Comparator.comparing(Train::getDestination)
                .thenComparing(Train::getDepartureTime));
    }

    public static void printTrains(Train[] trains) {
        for (Train train : trains) {
            System.out.println("Train Number: " + train.getNumberOfTrain() +
                    ", Destination: " + train.getDestination() +
                    ", Departure Time: " + train.getDepartureTime());
        }
    }

}
