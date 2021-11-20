package OpenClose;

public class WhatsappNotification  implements notificationService{

    @Override
    public void SendNotification(String medium) {
       
        System.out.println(medium+" notification sent ");
    }

    @Override
    public void SendUpdate(String medium) {
       
        System.out.println(medium+" notification sent and details");      
    }
    
}
