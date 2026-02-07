package SCENARIOS.footballmanager.cleancode.action;

import SCENARIOS.footballmanager.cleancode.model.Club;

public class PaySalariesAction extends BasePresidentAction{
    private final Club club;

    public PaySalariesAction(Club club){
        super(ActionType.PAY_SALARIES);
        this.club = club;
    }

    @Override
    public String execute() {
        club.setBudget(club.getBudget() - club.getPlayers().size() * 100_000);

        return "Salaries paid.";
    }
}