package SCENARIOS.footballmanager.cleancode.action;

import SCENARIOS.footballmanager.cleancode.model.Club;
import SCENARIOS.footballmanager.cleancode.model.Player;

public class SellPlayerAction extends BasePresidentAction{
    private final Club club;
    private final Player player;

    public SellPlayerAction(Club club, Player player){
        super(ActionType.SELL_PLAYER);
        this.club = club;
        this.player = player;
    }

    @Override
    public String execute() {
        if (!club.getPlayers().contains(player)) {
            return "Player not found!";
        }

        club.getPlayers().remove(player);
        club.setBudget(club.getBudget() - player.getTransferAmount());

        return player.getName() + " sold.";
    }
}