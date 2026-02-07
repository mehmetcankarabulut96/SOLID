package SCENARIOS.footballmanager.cleancode;

import SCENARIOS.footballmanager.cleancode.action.PresidentAction;
import SCENARIOS.footballmanager.cleancode.core.logger.Logger;

public class FootballClubManagementSystem {
    private final Logger logger;

    public FootballClubManagementSystem(Logger logger) {
        this.logger = logger;
    }

    public void handlePresidentAction(PresidentAction presidentAction) {

        logger.log("President clicked action: " + presidentAction.getType());

        String actionResult = presidentAction.execute();

        logger.log(actionResult);
    }
}