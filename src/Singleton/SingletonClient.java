package Singleton;

public class SingletonClient {
    public  static  void  main (String[] args) {
        // Получение одноэлементного экземпляра службы уведомлений
        NotificationService  NotificationService  = Singleton.NotificationService.getInstance();

        // Отправка уведомлений
        NotificationService.sendNotification( "Hello world!" );
    }
}
