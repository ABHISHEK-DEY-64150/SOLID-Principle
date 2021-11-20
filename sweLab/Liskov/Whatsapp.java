package Liskov;

public class Whatsapp extends SocialMedia {

    public void chat(){

        System.out.println("Chatting");
    }

    public void call(){

        System.out.println("Call a friend");
    }
    
    public void groupVideoCall(){
    
        System.out.println("Group Video Call going on");
    }

    @Override
    public void post() {
        System.out.println("Post is not available on Whatsapp and Hence violates Liskovs Principle ");
        
    }
    
    
}
