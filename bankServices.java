package singleResponsibility;


public class bankServices {


    public void createAccount(String attr){

        System.out.println("account  is successfully created");
    }


    public void deposit(int amount){

        System.out.println("desposit is successful");
    }


    public void loan(int amount,String loanType){


        if (loanType.equals("home")){
            //HOME LOADN
        }

        if (loanType.equals("Car")) {
         //Car loan   
        }

        System.out.println("loan is successful");
    }

    public void sendOTP(int otp){

        System.out.println("otp is sent");
    }

    public void sendEmail(String email){

        System.out.println("email is sent");
    }
    
    public void sendtoMobile(int number){

        System.out.println("number is sent");
    }
    
    
}
