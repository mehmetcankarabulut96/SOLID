package SCENARIOS.footballmanager.cleancode.action;

public abstract class BasePresidentAction implements PresidentAction{
    private final ActionType type;

    protected BasePresidentAction(ActionType type){
        this.type = type;
    }

    @Override
    public ActionType getType(){
        return this.type;
    }
}