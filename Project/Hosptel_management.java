import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
class Login{
    
    void input(){
        System.out.println("*************** Hospital Mangement *****************");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("1) For Login ");
        System.out.println("2) For Registration ");
        System.out.println();
        System.out.println("Choose any one option from above : ");
        int a= sc.nextInt();
        switch(a){
            
            case 1:
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the Login ID : ");
            String id =sc1.nextLine();
            System.out.println("Enter the Password : ");
            String pass =sc1.nextLine();
            break;
            case 2:
            Scanner sc2 = new Scanner(System.in);
            System.out.println(" Enter your Name : ");
            String name =sc2.nextLine();
            System.out.println(" Enter your Email : ");
            String email =sc2.nextLine();
            System.out.println(" Enter your Address : ");
            String add =sc2.nextLine();
            System.out.println(" Enter your Mobile No : ");
            int no =sc2.nextInt();
            System.out.println();
            System.out.println("************************** Thanks for Registration ****************************");
            break;
            default:
            System.out.println("Choose any one option from above");
            break;
            
        }
        System.out.println();
        // System.out.println("***********************************************");
    }
}
class Hospital_info{
    void output(){
        Scanner sc= new Scanner(System.in);
        System.out.println("You want to known Hospital Infomation Yes or No");
        String hos =sc.nextLine();
        if(hos.equals("Yes") || hos.equals("yes") ){
            System.out.println();
            System.out.println("************************** Hospital Info ********************************");
            System.out.println();
            System.out.println("Hospital Id : 16201-7111");
            System.out.println("Hospital Doctor Id : 5468791");
            System.out.println("Hospital Name : ACMH Hospital");
            System.out.println("Hospital Place : Ram Nagar,Delhi");
            System.out.println();
        }else if(hos.equals("NO") || hos.equals("no")){
            System.out.println(" OK ");
        }
    }
}
class Patient_Info{
    void input1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Patient ID :");
        int id=sc.nextInt();
        System.out.println();
    }
    void output(){
        System.out.println("********************** Patient Information ***************************");
        System.out.println();
        System.out.println("Patient Name : Praful Dudhe");
        System.out.println("Patinet Mobile No : 8600585513");
        System.out.println("Patinet Email :praful123@gmail.com");
        System.out.println("Patient Room no : 30 / Third Floor");
        System.out.println("Patient Address : Laxminagar , Delhi");
    }
     
}
class Doctor_Info{
    void output(){
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("You Want to Known Assigned Doctors Information Yes or No: ");
        String doc = sc.nextLine();
        if(doc.equals("Yes") || doc.equals("yes") ){
            System.out.println();
            System.out.println("********************** Doctor Information ***************************");
            System.out.println("Doctor Id : 5468791");
            System.out.println("Doctor Name : Dr.Teena Pise");
            System.out.println("Doctor Mobile No : 9923194762");
            System.out.println("Doctor Email Id : teenapise123@gmail.com");
            System.out.println("Doctor Address : Shantinagar, Delhi");
            System.out.println();
            System.out.println("****************************");
            System.out.println("Thanks for Visiting ....... ");
            System.out.println("****************************");
        }else if(doc.equals("No") || doc.equals("no")){
            System.out.println();
            System.out.println("****************************");
            System.out.println("Thanks for Visiting ....... ");
            System.out.println("****************************");
        }
    }
    
    
}
public class Hosptel_management{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Login lg = new Login();
        lg.input();
        Hospital_info info=new Hospital_info();
        info.output();
        Patient_Info pi =new Patient_Info();
        pi.input1();
        pi.output();
        Doctor_Info doc_info = new Doctor_Info();
        doc_info.output();
    }
}