package SCENARIOS.footballmanager.cleancode.repository;

import SCENARIOS.footballmanager.cleancode.core.logger.Logger;
import SCENARIOS.footballmanager.cleancode.model.Player;


public class MsqlPlayerRepository implements PlayerRepository {
    private Logger logger;

    public MsqlPlayerRepository(Logger logger){
        this.logger = logger;
    }

    @Override
    public void save(Player player) {
        logger.log("Player logged to mysql, " + player.getName());
    }
}