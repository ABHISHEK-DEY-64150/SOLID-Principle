package singleResponsibility.singleSolution;

public class bankService {

    public void service(String tyoeofservice){

        if (tyoeofservice.equals("createAccount")) {
            System.out.println("account  is successfully created");
        }

        if (tyoeofservice.equals("deposit")) {
            System.out.println("desposit is successful");
        }

        
    }

    
}
