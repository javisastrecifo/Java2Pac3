package AirportWorld;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PlaneDB planeDB = new PlaneDB();
        FlightDB flightDB = new FlightDB();
        AirportPanel.menu(reader, planeDB, flightDB);
        FlightService.menu(reader, planeDB, flightDB);
    }
    
}
