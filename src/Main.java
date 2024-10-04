import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // entrada de dados
        Scanner keyboard = new Scanner(System.in);
        int options = 0;
        double balance = 0;
        double deposit = 0;
        Data user1 = new Data();

        //menu


        System.out.println("""
               ************************************************
               Initial customer data:                          
                                                              
               Name:                       $s                  
               Account type:               $s                 
               Initial balance:            $d                 
               ************************************************
                """);


        while (options != 4 ){
            System.out.println("\n" +
                    "███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗\n" +
                    "████╗░████║██╔════╝████╗░██║██║░░░██║\n" +
                    "██╔████╔██║█████╗░░██╔██╗██║██║░░░██║\n" +
                    "██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║\n" +
                    "██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝\n" +
                    "╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░");
            System.out.println("1-Check balances");
            System.out.println("2-Receive amount");
            System.out.println("3-Transfer amount");
            System.out.println("4-Exit");

            System.out.println("Enter the desired option");

            options =keyboard.nextInt();

            if (options == 1){
                System.out.println("1-Check balances");
                System.out.println(balance);


            } else if (options ==2) {
                System.out.println("Receive amount");
                deposit = keyboard.nextDouble();
                System.out.println(deposit);

            } else if (options ==3) {
                System.out.println("Transfer amount");

            }
        }



    }
}