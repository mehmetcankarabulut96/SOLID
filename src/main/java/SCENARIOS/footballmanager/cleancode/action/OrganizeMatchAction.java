package SCENARIOS.footballmanager.cleancode.action;

import SCENARIOS.footballmanager.cleancode.core.notification.EmailNotificationService;

import java.time.LocalDate;

public class OrganizeMatchAction extends BasePresidentAction{
    private final EmailNotificationService emailNotificationService;

    public OrganizeMatchAction(EmailNotificationService emailNotificationService){
        super(ActionType.ORGANIZE_MATCH);
        this.emailNotificationService = emailNotificationService;
    }

    @Override
    public String execute() {
        emailNotificationService.send("fans@club.com", "Match organized!");

        return "Match organized on " + LocalDate.now();
    }
}