package SOLID.D.messageservice.cleancode;

class NotificationManager {

    private final MessageService messageService;

    public NotificationManager(MessageService messageService){
        this.messageService = messageService;
    }

    public void notify(String message) {
        messageService.sendMessage(message);
    }
}