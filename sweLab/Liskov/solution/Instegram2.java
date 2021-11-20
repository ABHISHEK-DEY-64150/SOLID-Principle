package Liskov.solution;

public class Instegram2 implements PostManager{

    @Override
    public void chat(){

        System.out.println("Chatting");
    }
    

    @Override
    public void post(){
    
        System.out.println("Post Anything");
    }
    
    
}
