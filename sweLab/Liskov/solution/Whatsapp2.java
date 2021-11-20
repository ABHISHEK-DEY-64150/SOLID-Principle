package Liskov.solution;

public class Whatsapp2 implements VdoCallmanager, ChatManager{

    @Override
    public void call(){
    
        System.out.println("Call a friend");
    }
    

    @Override
    public void groupVideoCall(){
    
        System.out.println("Group Video Call going on");
    }


    @Override
    public void chat(){

        System.out.println("Chatting");
    }
}
