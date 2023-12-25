package taxcalculator;

import java.util.Scanner;

/**
 * @Author--------------------------------TEMESGEN TESFAYE.
 * @Id------------------------------------15/21.
 * @Section-------------------------------cs(564cr).
 * 
 *            !================================= FORMULA'S USED ===========================================!
         1, Income tax =          Gross salary * Tax rate - Deduction
         2, Net salary =          Gross salary - Salary income tax - Employee pension - Other expenses
         3, Gross salary =        Basic salary + Allowances
         4, Pension =             Gross salary * 0.07(7%) payment for the 
         5, Total deduction =     Pension + Income tax 
 *       
 */
public class taxcalculator {

    public static void main(String[] args) {
        
       
        System.out.println("<======================    VERY GLAD AND PROUD TO PRESENT THIS SIMPLE TAX CALCULATOR CONSOLE APP    ==========================>");
        System.out.println("\n\n\t\t\t\tAUTHOR:-  TEMESGEN TESFAYE");
        System.out.println("\t\t\t\tID:- 15395/21, SECTION CS(2)");
        System.out.println("\n\t\tWELCOME TO THE TAX CALCULATOR APP\n");
        System.out.println("\t\tPlease Enter Every Data That you Are Asked Properly.\n");
       
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String name = userInput.nextLine();

        System.out.println("Enter your Last Name: ");
        String fName = userInput.nextLine();

        System.out.println("Enter your Gender: ");
        String gender = userInput.nextLine();

        System.out.println("Enter your Job occupation: ");
        String posN = userInput.nextLine();

        System.out.println("Enter your Basic Salary: ");
        double slry = userInput.nextDouble();

        System.out.println("Enter your Allowance: ");
        int allwnc = userInput.nextInt();

        System.out.println("Enter your Department: ");
        String dep = userInput.next();
        
        if(slry <= 600){
                    // NON----TAXABLE
            
             double gross = (slry + allwnc);
             double incomeTax = 0;
             double net = (gross - incomeTax);             
             double pension = (gross * 0.07);
             double deduct = (incomeTax + pension);
             
            System.out.println("\n\n\t\tHi,  " + name + "  There is your detail information.");
            System.out.println("\n\t\tName: " + name +" " +fName);
            System.out.println("\t\tGender: " + gender);
            System.out.println("\t\tposition: " + posN);
            System.out.println("\t\tDepartement: " + dep);
            System.out.println("\t\tYour Gross salary: "+ gross+ " birr");
            System.out.println("\t\tYour Income tax: " + incomeTax+" birr");
            System.out.println("\t\tPension payment: "+pension+" birr");
            System.out.println("\t\tTotal Deduction: "+deduct+" birr");
            System.out.println("\t\tNet salary: " + net+" birr");
           
        }        
        else if (slry >= 601 && slry <= 1650) {
             double gross = (slry + allwnc);
             double incomeTax = (gross * 0.15);
             double net = (slry - incomeTax);             
             double pension = (gross * 0.07);
             double deduct = (incomeTax + pension);
             
            System.out.println("\n\n\t\tHi,  " + name + "  There is your detail information.");
            System.out.println("\n\t\tName: " + name +" " +fName);
            System.out.println("\t\tGender: " + gender);
            System.out.println("\t\tposition: " + posN);
            System.out.println("\t\tDepartement: " + dep);
            System.out.println("\t\tYour Gross salary: "+ gross+ " birr");
            System.out.println("\t\tYour Income tax: " + incomeTax+" birr");
            System.out.println("\t\tPension payment: "+pension+" birr");
            System.out.println("\t\tTotal Deduction: "+deduct+" birr");
            System.out.println("\t\tNet salary: " + net+" birr");
        }
         else if (slry >= 1651 && slry <= 3200) {
             double gross = (slry + allwnc);
             double incomeTax = (gross * 0.15);
             double net = (slry - incomeTax);             
             double pension = (gross * 0.07);
             double deduct = (incomeTax + pension);
             
            System.out.println("\n\n\t\tHi,  " + name + "  There is your detail information.");
            System.out.println("\n\t\tName: " + name +" " +fName);
            System.out.println("\t\tGender: " + gender);
            System.out.println("\t\tposition: " + posN);
            System.out.println("\t\tDepartement: " + dep);
            System.out.println("\t\tYour Gross salary: "+ gross+ " birr");
            System.out.println("\t\tYour Income tax: " + incomeTax+" birr");
            System.out.println("\t\tPension payment: "+pension+" birr");
            System.out.println("\t\tTotal Deduction: "+deduct+" birr");
            System.out.println("\t\tNet salary: " + net+" birr");
            
        }
        else if (slry >= 3201 && slry <= 5250) {
            double gross = (slry + allwnc);
             double incomeTax = (gross * 0.2);
             double net = (slry - incomeTax);             
             double pension = (gross * 0.07);
             double deduct = (incomeTax + pension);
             
            System.out.println("\n\n\t\tHi,  " + name + "  There is your detail information.");
            System.out.println("\n\t\tName: " + name +" " +fName);
            System.out.println("\t\tGender: " + gender);
            System.out.println("\t\tposition: " + posN);
            System.out.println("\t\tDepartement: " + dep);
            System.out.println("\t\tYour Gross salary: "+ gross+ " birr");
            System.out.println("\t\tYour Income tax: " + incomeTax+" birr");
            System.out.println("\t\tPension payment: "+pension+" birr");
            System.out.println("\t\tTotal Deduction: "+deduct+" birr");
            System.out.println("\t\tNet salary: " + net+" birr");
            

        } 
         else if (slry >= 5251 && slry <= 7800) {
            double gross = (slry + allwnc);
             double incomeTax = (gross * 0.25);
             double net = (slry - incomeTax);             
             double pension = (gross * 0.07);
             double deduct = (incomeTax + pension);
             
            System.out.println("\n\n\t\tHi,  " + name + "  There is your detail information.");
            System.out.println("\n\t\tName: " + name +" " +fName);
            System.out.println("\t\tGender: " + gender);
            System.out.println("\t\tposition: " + posN);
            System.out.println("\t\tDepartement: " + dep);
            System.out.println("\t\tYour Gross salary: "+ gross+ " birr");
            System.out.println("\t\tYour Income tax: " + incomeTax+" birr");
            System.out.println("\t\tPension payment: "+pension+" birr");
            System.out.println("\t\tTotal Deduction: "+deduct+" birr");
            System.out.println("\t\tNet salary: " + net+" birr");
            

        } 
         else if (slry >= 7801 && slry <= 10900) {
             double gross = (slry + allwnc);
             double incomeTax = (gross * 0.3);
             double net = (slry - incomeTax);             
             double pension = (gross * 0.07);
             double deduct = (incomeTax + pension);
             
            System.out.println("\n\n\t\tHi,  " + name + "  There is your detail information.");
            System.out.println("\n\t\tName: " + name +" " +fName);
            System.out.println("\t\tGender: " + gender);
            System.out.println("\t\tposition: " + posN);
            System.out.println("\t\tDepartement: " + dep);
            System.out.println("\t\tYour Gross salary: " + gross+" birr");
            System.out.println("\t\tYour Income tax: " + incomeTax+" birr");
            System.out.println("\t\tPension payment: "+pension+" birr");
            System.out.println("\t\tTotal Deduction: "+deduct+" birr");
            System.out.println("\t\tNet salary: " + net+" birr");
            
        } 
         else if (slry > 10900) {
             double gross = (slry + allwnc);
             double incomeTax = (gross * 0.35);
             double net = (slry - incomeTax);             
             double pension = (gross * 0.07);
             double deduct = (incomeTax + pension);
             
            System.out.println("\n\n\t\tHi,  " + name + "  There is your detail information.");
            System.out.println("\n\t\tName: " + name +" " +fName);
            System.out.println("\t\tGender: " + gender);
            System.out.println("\t\tposition: " + posN);
            System.out.println("\t\tDepartement: " + dep);
            System.out.println("\t\tYour Gross salary: "+ gross+ " birr");
            System.out.println("\t\tYour Income tax: " + incomeTax+" birr");
            System.out.println("\t\tPension payment: "+pension+" birr");
            System.out.println("\t\tTotal Deduction: "+deduct+" birr");
            System.out.println("\t\tNet salary: " + net+" birr");
            
        } 
   
        else {
            System.out.println("INVALID INPUT PLEASE TRY AGAIN LATER!!! ");
        }
    }

}
    

