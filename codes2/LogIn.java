import java.util.Scanner;

public class LogIn {
    static Scanner input=new Scanner(System.in);
    //type , admin , customer , supplier
    //method l kol wahda fehom
    //validate el input
    //  3shan a3raf howa dakhal username w pass sa7 aw la
    //check if banned = true exit el program cerr
    //if false n continue
    static int type=1;
    static boolean found=false;

    public static int getType() {
        return type;
    }

    public static int login(){
        String userName;
        String password;
        System.out.println("Enter the type of login :  0 : Customer   1 : Admin  2 : Supplier ");
        type=input.nextInt();

        while(type != 0 || type !=1 || type != 2){

            System.out.println("Wrong.....Enter the type of login : 0 : Customer   1 : Admin   2 : Supplier ");
            type=input.nextInt();
        }

        if(type == 0){
            System.out.println("Enter your username : ");
            userName = input.nextLine();
            System.out.println("Enter your password : ");
            password =input.nextLine();
            for(int i = 0; i < Database.Customers.size(); i++){
                if(Database.Customers.get(i).getUsername().equals(userName) && Database.Customers.get(i).getPassword().equals(password)){
                    return i;
                }
            }
        }else if(type == 1){
            System.out.println("Enter your username : ");
            userName = input.nextLine();
            System.out.println("Enter your password : ");
            password =input.nextLine();
            for(int i = 0; i < Database.Admins.size(); i++){
                if(Database.Admins.get(i).getUsername().equals(userName) && Database.Admins.get(i).getPassword().equals(password)){
                    return i;
                }
            }
        }else if(type == 2){
            System.out.println("Enter your username : ");
            userName = input.nextLine();
            System.out.println("Enter your password : ");
            password =input.nextLine();
            for(int i = 0; i < Database.suppliers.size(); i++) {
                if (Database.suppliers.get(i).getName().equals(userName) && Database.suppliers.get(i).getPassword().equals(password)) {
                    return i;
                }
            }
        }
        return -1;










// System.out.println("Enter your username :");
// username=input.nextLine();

// if (type==1) {

// for(int i=0;i<Database.Admins.size();i++){
//    if (username.equals(Database.Admins.get(i).username)) {
//     found=true;
//     return i;
//    }
// }
// }

    }






}