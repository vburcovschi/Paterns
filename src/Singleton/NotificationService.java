package Singleton;

public class NotificationService {
    // Решение проблемы видимости в многопоточности с помощью ключевого слова volatile
    private static volatile NotificationService instance;

    private NotificationService() {
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            synchronized (NotificationService.class) {
                if (instance == null) {
                    instance = new NotificationService();
                }
            }
        }
        return instance;
    }

    public void sendNotification(String message) {
        System.out.printf("Notification sent: %s", message);
    }
}
