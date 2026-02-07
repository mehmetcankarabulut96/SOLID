package SCENARIOS.footballmanager.cleancode.core.notification;

public interface EmailNotificationService {
    void send(String email, String message);
}