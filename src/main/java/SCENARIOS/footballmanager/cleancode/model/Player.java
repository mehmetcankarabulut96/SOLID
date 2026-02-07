package SCENARIOS.footballmanager.cleancode.model;

public class Player {
    private String name;
    private double transferAmount;

    public Player(String name, double transferAmount){
        this.name = name;
        this.transferAmount = transferAmount;
    }

    public String getName(){
        return this.name;
    }

    public double getTransferAmount(){
        return this.transferAmount;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTransferAmount(double transferAmount){
        this.transferAmount = transferAmount;
    }
}