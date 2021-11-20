package singleResponsibility.singleSolution;

public class notificationService {


    public void sendOTP(String str){

        if (str.equals("mobile")) {
            System.out.println("otp is sent to "+str);
        }

       if (str.equals("email")) {
        System.out.println("otp is sent to  "+str);
       }
    }
    
}
