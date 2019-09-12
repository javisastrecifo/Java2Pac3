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
public class AirportPanel {

    public static void menu(Scanner reader, PlaneDB planeDB, FlightDB flightDB) {
        System.out.print("Airport panel\n"
                + "--------------------\n");
        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");
            String command = reader.nextLine();
            if (command.equals("1")) {
                addPlane(reader, planeDB);
            } else if (command.equals("2")) {
                addFlight(reader, flightDB, planeDB);
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public static void addPlane(Scanner reader, PlaneDB planeDB) {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int passengers = Integer.parseInt(reader.nextLine());
        planeDB.createPlane(planeID, passengers);
    }

    public static void addFlight(Scanner reader, FlightDB flightDB, PlaneDB planeDB) {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        Plane plane = planeDB.findPlane(planeID);
        System.out.print("Give departure airport code: ");
        String ori = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String dest = reader.nextLine();
        flightDB.createFlight(plane, ori, dest);
    }

}
