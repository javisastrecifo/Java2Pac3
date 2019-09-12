package AirportWorld;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mati
 */
public class FlightService {

    public static void menu(Scanner reader, PlaneDB planeDB, FlightDB flightDB) {
        System.out.println("\nFlight service\n"
                + "------------\n");

        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> ");
            String command = reader.nextLine();
            if (command.equals("1")) {
                planeDB.printPlanes();
            } else if (command.equals("2")) {
                flightDB.printFlights();
            } else if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println(planeDB.findPlane(planeID).toString());

            } else if (command.equals("x")) {
                break;
            }

        }
    }
}
