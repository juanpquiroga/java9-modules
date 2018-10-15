package academy.learnprogramming.jokeapp;

import academy.learnprogramming.jokeserver.JokeServer;
//import academy.programming.jokeserver.kid.KidJokeServer;
//import academy.programming.jokeserver.programmer.ProgrammerJokeServer;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

    public static void main(String [] args) {
        LinkedHashMap<String,JokeServer> servers = new LinkedHashMap<>();

        ServiceLoader<JokeServer> loader = ServiceLoader.load(JokeServer.class);

        int key = 1;
        for ( JokeServer s: loader) {
            System.out.println("Entro");
            servers.put(String.valueOf(key),s);
            key++;
        }

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {

            servers.forEach((k,v)-> System.out.printf("%s:%s\n",k,v.name()));
            System.out.println("(Q to quit)");
            choice = scanner.nextLine().trim().toUpperCase();

            if (servers.containsKey(choice)) {
                System.out.println(servers.get(choice).getJoke());
            } else {
                System.out.println("Sorry, try again.");
            }

        } while (!choice.equals("Q"));

        /*JokeServer programmer = new ProgrammerJokeServer();
        JokeServer kid = new KidJokeServer();
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {

            System.out.print("\n(K)id joke or (P)rogrammer joke? (Q to quit) : ");
            choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("K")) {
                System.out.println(kid.getJoke());
            } else if (choice.equals("P")) {
                System.out.println(programmer.getJoke());
            }

        } while (!choice.equals("Q"));*/

        System.out.println("Thanks! I hope you laughed!!");

    }
}