package OpenClose;

public class DriverClass {


    public static void main(String arges[]) {


        EmailNotification emailNotification = new EmailNotification();

        emailNotification.SendNotification("email");
        emailNotification.SendUpdate("email");

        MobileNotification mobileNotification = new MobileNotification();
        mobileNotification.SendNotification("Mobile");
        mobileNotification.SendUpdate("Mobile");

        WhatsappNotification whatsappNotification = new WhatsappNotification();
        whatsappNotification.SendNotification("Whatsapp");
        whatsappNotification.SendUpdate("Whatsapp");

        System.out.println("This is Open Close principle");
    }
    
}
