package SCENARIOS.footballmanager.cleancode;

import SCENARIOS.footballmanager.cleancode.action.PresidentAction;
import SCENARIOS.footballmanager.cleancode.action.TransferPlayerAction;
import SCENARIOS.footballmanager.cleancode.core.logger.ConsoleLogger;
import SCENARIOS.footballmanager.cleancode.core.logger.Logger;
import SCENARIOS.footballmanager.cleancode.core.notification.EmailNotificationService;
import SCENARIOS.footballmanager.cleancode.core.notification.GmailEmailNotificationManager;
import SCENARIOS.footballmanager.cleancode.model.Club;
import SCENARIOS.footballmanager.cleancode.model.Player;
import SCENARIOS.footballmanager.cleancode.repository.MsqlPlayerRepository;
import SCENARIOS.footballmanager.cleancode.repository.PlayerRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        System.out.println("app init...");

        Logger logger = new ConsoleLogger();
        FootballClubManagementSystem clubManagementSystem = new FootballClubManagementSystem(logger);

        List<Player> playerList = new ArrayList<Player>(3);
        playerList.add(new Player("Victor Osimhen", 100000));
        playerList.add(new Player("Leroy Sane", 90000));
        Player player = new Player("Erling Haaland", 350000);
        Club club = new Club("Galatasaray", 25000000, playerList);
        PlayerRepository repository = new MsqlPlayerRepository(logger);
        EmailNotificationService emailNotificationService = new GmailEmailNotificationManager();
        PresidentAction action = new TransferPlayerAction(club, player, repository, emailNotificationService);
        clubManagementSystem.handlePresidentAction(action);
    }
}
