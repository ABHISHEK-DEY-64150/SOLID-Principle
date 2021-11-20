package Liskov;

public class Facebook extends SocialMedia {

    public void chat(){

        System.out.println("Chatting");
    }
    
    public void post(){
    
        System.out.println("Post Anything");
    }
    
    public void call(){
    
        System.out.println("Call a friend");
    }
    
    public void groupVideoCall(){
    
        System.out.println("Group Video Call going on");
    }
    
}
