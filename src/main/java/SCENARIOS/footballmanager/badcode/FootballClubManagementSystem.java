package SCENARIOS.footballmanager.badcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FootballClubManagementSystem {

    private String clubName;
    private double budget;
    private List<String> players = new ArrayList<>();

    public FootballClubManagementSystem(String clubName, double budget) {
        this.clubName = clubName;
        this.budget = budget;
    }

    public void handlePresidentAction(String action, String playerName, double amount) {

        // UI logic
        System.out.println("President clicked action: " + action);

        if (action.equals("TRANSFER_PLAYER")) {

            // Business logic
            if (budget < amount) {
                System.out.println("Not enough budget for transfer!");
                return;
            }

            players.add(playerName);
            budget -= amount;

            // Persistence logic
            try {
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/club", "root", "1234");

                PreparedStatement ps = connection.prepareStatement(
                        "INSERT INTO players(name, transfer_fee) VALUES (?, ?)");
                ps.setString(1, playerName);
                ps.setDouble(2, amount);
                ps.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }

            // External service
            sendEmailToFans(playerName + " transferred!");

            System.out.println(playerName + " transferred successfully.");

        } else if (action.equals("SELL_PLAYER")) {

            if (!players.contains(playerName)) {
                System.out.println("Player not found!");
                return;
            }

            players.remove(playerName);
            budget += amount;

            System.out.println(playerName + " sold.");

        } else if (action.equals("PAY_SALARIES")) {

            System.out.println("Paying salaries...");
            budget -= players.size() * 100_000;

            System.out.println("Salaries paid.");

        } else if (action.equals("ORGANIZE_MATCH")) {

            System.out.println("Match organized on " + LocalDate.now());

        } else if (action.equals("STADIUM_MAINTENANCE")) {

            budget -= 500_000;
            System.out.println("Stadium maintenance completed.");

        } else {
            System.out.println("Unknown action!");
        }

        System.out.println("Remaining budget: " + budget);
    }

    private void sendEmailToFans(String message) {
        System.out.println("Sending email to fans: " + message);
    }
}