package SCENARIOS.footballmanager.cleancode.model;

import java.util.List;

public class Club {
    private String name;
    private double budget;
    private List<Player> players;

    public Club(String name, double budget, List<Player> players){
        this.name = name;
        this.budget = budget;
        this.players = players;
    }

    public String getName(){
        return this.name;
    }

    public double getBudget(){
        return this.budget;
    }

    public List<Player> getPlayers(){
        return this.players;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBudget(double budget){
        this.budget = budget;
    }

    public void setPlayers(List<Player> players){
        this.players = players;
    }

    public void transfer(Player player){
        players.add(player);
        budget = budget - player.getTransferAmount();
    }
}