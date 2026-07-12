interface NotificationService {
    public void sendNotification(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }

}

class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }

}

class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }

}

class SlackNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending slack notification: " + message);
    }

}

class NotificationSender {
    private NotificationService notificationService;

    NotificationSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }

    public void printStatus()
    {
        System.out.println("Notification sent successfully.");
    }
}
public class OCP2{
    public static void main(String[]args)
    {
        NotificationSender emailSender = new NotificationSender(new EmailNotification());
        emailSender.sendNotification("Hello via Email!");
        emailSender.printStatus();

        NotificationSender smsSender = new NotificationSender(new SMSNotification());
        smsSender.sendNotification("Hello via SMS!");
        smsSender.printStatus();

        NotificationSender pushSender = new NotificationSender(new PushNotification());
        pushSender.sendNotification("Hello via Push Notification!");
        pushSender.printStatus();

        NotificationSender slackSender = new NotificationSender(new SlackNotification());
        slackSender.sendNotification("Hello via Slack!");
        slackSender.printStatus();
    }
}