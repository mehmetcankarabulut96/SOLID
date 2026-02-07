package SCENARIOS.footballmanager.cleancode.action;

import SCENARIOS.footballmanager.cleancode.model.Club;

public class StadiumMaintenanceAction extends BasePresidentAction{
    private final Club club;

    public StadiumMaintenanceAction(Club club){
        super(ActionType.STADIUM_MAINTENANCE);
        this.club = club;
    }

    @Override
    public String execute() {
        club.setBudget(club.getBudget() - 500_000);
       return "Stadium maintenance completed.";
    }
}