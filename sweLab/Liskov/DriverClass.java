package Liskov;

import Liskov.solution.Facebook2;
import Liskov.solution.Instegram2;
import Liskov.solution.Whatsapp2;

public class DriverClass {

    public static void main(String[] args) {
     ////Liskov's Violation

     Facebook facebook = new Facebook();
     facebook.chat();
     facebook.post();
     facebook.call();
     facebook.groupVideoCall();

     Whatsapp whatsapp = new Whatsapp();

     whatsapp.chat();
     whatsapp.post();
     whatsapp.call();
     whatsapp.groupVideoCall();


     System.out.println("This is not following  Liskov Principle"); 

     //////////Implementation of Liskovs

     Facebook2 facebook2 = new Facebook2();
     facebook2.chat();
     facebook2.post();
     facebook2.call();
     facebook2.groupVideoCall();

     Whatsapp2 whatsapp2 = new Whatsapp2();

     whatsapp2.chat();
     whatsapp2.call();
     whatsapp2.groupVideoCall();

     Instegram2 instegram = new Instegram2();
     instegram.chat();
     instegram.post();


       System.out.println("This is Liskov Principle"); 
    }
    
}
