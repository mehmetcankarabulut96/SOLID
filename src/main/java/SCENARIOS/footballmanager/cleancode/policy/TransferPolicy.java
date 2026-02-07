package SCENARIOS.footballmanager.cleancode.policy;

import SCENARIOS.footballmanager.cleancode.model.Club;
import SCENARIOS.footballmanager.cleancode.model.Player;

public class TransferPolicy {
    private final Club club;
    private final Player player;

    public TransferPolicy(Club club, Player player) {
        this.club = club;
        this.player = player;
    }

    public boolean canTransfer() {
         return club.getBudget() < player.getTransferAmount();
    }
}