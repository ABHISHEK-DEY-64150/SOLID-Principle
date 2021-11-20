package OpenClose;

public class EmailNotification  implements notificationService{

    @Override
    public void SendNotification(String medium) {
        // send notification via email

        System.out.println(medium+" notification sent");
        
    }

    @Override
    public void SendUpdate(String medium) {
        
        System.out.println(medium+" notification sent and details");
        
    }

   
    
    
}
