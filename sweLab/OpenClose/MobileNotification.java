package OpenClose;

public class MobileNotification implements notificationService {

    @Override
    public void SendNotification(String medium) {
        // notification sent via mobile

        System.out.println(medium+" notification sent");
        
    }

    @Override
    public void SendUpdate(String medium) {
        
        System.out.println(medium+" notification sent and details");
        
    }
    
}
