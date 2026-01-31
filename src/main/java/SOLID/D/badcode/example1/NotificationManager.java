package SOLID.D.badcode.example1;

class NotificationManager {

    // Dependency Inversion violated, NotificationManager is tightly coupled with GmailService
    // Open-Closed violated, This class can not be extended without modifying. For example adding new mail provider
    private final GmailService gmailService;

    public NotificationManager(GmailService gmailService){
        this.gmailService = gmailService;
    }

    public void notify(String message) {
        gmailService.sendEmail(message);
    }
}