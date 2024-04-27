import java.util.Scanner;
class password_checking{
    public static void main(String[] args){
        System.out.println("My name is mustafa");
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------");
        int cout = 1 ;
        do{
            System.out.print("Enter Your password : ");
            String password= scan.nextLine();
            if (password.equals("Mustafa")){
            System.out.println("You are Crack Me !!!");
            break;}
            else{
            System.out.println("Your input invalid " );
            if(cout==3){
            System.out.print("The number of attempts has expired");
            break;
            }
            }
        }while(cout++<=3);
    }
}
