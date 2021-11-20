package singleResponsibility;
import singleResponsibility.singleSolution.bankService;
import singleResponsibility.singleSolution.bankloanService;
import singleResponsibility.singleSolution.notificationService;

class DriverClass{


    public static void main(String arges[]){

      ///////////SingleResponsibility ////////////////

        bankService bankService = new bankService();
    
        bankService.service("deposit");

        bankService.service("createAccount");

        bankloanService bankloanService = new bankloanService();
        bankloanService.loan(5000, "Car");

        notificationService notificationService = new notificationService();
        notificationService.sendOTP("mobile");
       System.out.println("HI this is Single responsibility");
    }
}