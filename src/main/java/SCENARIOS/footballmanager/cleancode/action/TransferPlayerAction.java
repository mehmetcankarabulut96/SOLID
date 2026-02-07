package SCENARIOS.footballmanager.cleancode.action;

import SCENARIOS.footballmanager.cleancode.core.notification.EmailNotificationService;
import SCENARIOS.footballmanager.cleancode.model.Club;
import SCENARIOS.footballmanager.cleancode.model.Player;
import SCENARIOS.footballmanager.cleancode.policy.TransferPolicy;
import SCENARIOS.footballmanager.cleancode.repository.PlayerRepository;

public class TransferPlayerAction extends BasePresidentAction{
    private final Club club;
    private final Player player;
    private final TransferPolicy transferPolicy;
    private final PlayerRepository playerRepository;
    private final EmailNotificationService emailNotificationService;

    public TransferPlayerAction(Club club, Player player, PlayerRepository playerRepository, EmailNotificationService emailNotificationService){
        super(ActionType.TRANSFER_PLAYER);
        this.club = club;
        this.player = player;
        this.transferPolicy = new TransferPolicy(club, player);
        this.playerRepository = playerRepository;
        this.emailNotificationService = emailNotificationService;
    }

    @Override
    public String execute() {

        if(!transferPolicy.canTransfer()){
            return "Not enough budget for transfer";
        }

        club.transfer(player);

        playerRepository.save(player);

        emailNotificationService.send("fans@club.com", player.getName() + " transferred!");

        return player.getName() + " transferred successfully.";
    }
}