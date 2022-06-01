/**
 *
 * @author dchen
 * Display three messages exercise
 */
public class IT205 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Welcome to Java!");
       
       System.out.println("Welcome to Computer Science.");
       
       System.out.println("Programming is fun~");
    }
}


/**
 *
 * @author dchen
 * This program converts feet into meters!
 */
import java.util.Scanner;
public class FeetComputer {
    public static void main(String[] args){
        
        System.out.print("Enter a value in feet: ");
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        
        double meters = feet * .305;
        //Display results
        System.out.println(feet + " feet is "+ meters + " meters");
    }
 }

/**
 *
 * @author dchen
 * This program computes taxes!
 */
import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a filing status
		System.out.print("(0-Single filer, 1-married jointly or "+ "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");
		
		int status = input.nextInt();
		
		//Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		//Compute tax
		double tax;
                 tax = 0.0;
		
		if (status == 0) { //Compute tax for single filers
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 1) { //Compute tax for file jointly or qualifying widower
			if (income <= 16700)
				tax = income * 0.10;
			else if (income <= 67900)
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
			else
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 2) { //Compute tax for married separately
                    if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
		}
		else if (status == 3){ //Compute tax for head of household
                    if (income <= 11950)
				tax = income * 0.10;
			else if (income <= 45500)
				tax = 11950 * 0.10 + (income - 11950) * 0.15;
			else if (income <= 117450)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
			else if (income <= 190200)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
			else if (income <= 372950)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
			else
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
		}
		else {
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		
		//Display the result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
			
	}
}

/**
 *
 * @author dchen
 * This program will display payroll information based off of values inputted. 
 */
import java.util.Scanner;
//import java.text.DecimalFormat;
public class FinancialAppPayroll {
    public static void main(String[] args){
        
        //DecimalFormat df = new DecimalFormat("0.00");
        
        //Prompt user for Employee name
        System.out.print("Enter employee's name: ");
        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        
         System.out.print("Enter number of hours worked in a week: ");
         double Hours = input.nextDouble();
        
         System.out.print("Enter hourly pay rate: ");
         double Payrate = input.nextDouble();
         
         System.out.print("Enter federal tax withholding rate: ");
         double Fedrate = input.nextDouble();
         double DisplayFed = Fedrate * 100.0; //for displaying
         
         System.out.print("Enter state tax withholding rate: ");
         double Staterate = input.nextDouble();
         double DisplayState = Staterate * 100.0; //for displaying
         
         //Calculations
         double Grosspay = Hours*Payrate;
         double Fedwithhold = Grosspay*Fedrate;
         double Statewithhold = (Grosspay*Staterate);
         double Deduction = (Statewithhold + Fedwithhold);
         double Netpay = (Grosspay - Deduction);
         
         //Print out 
        System.out.println("Employee Name: " + Name);
        System.out.println("Hours worked: " + Hours);
        System.out.println("Pay Rate: $" + Payrate);
        System.out.println("Gross Pay: $" + Grosspay);
        System.out.println("Deductions: ");
        System.out.println("  Federal Withholding (" +DisplayFed +"%): $"+Fedwithhold);
        System.out.println("  State Withholding ("+ DisplayState+"%): $"+ Math.floor(Statewithhold*100)/100);
        System.out.println("  Total Deduction: $"+ Math.floor(Deduction*100)/100);
        System.out.println("Netpay: $"+ Math.floor(Netpay*100)/100);        
    }
}

/**
 *
 * @author dchen
 * This program finds the largest integer that qualifies under the cube
 */
import java.lang.Math;
import java.util.Scanner;

public class FindLargestInteger {
     public static void main(String[] args){
         int n = 0;
         
        System.out.print("Enter exponent to check: ");
        Scanner input = new Scanner(System.in);
        int Exponent = input.nextInt();
         
         while(Math.pow(n+1,3)< Exponent){
             n++;
         }    
            System.out.println("Largest integer is: "+ n);
         };
         
        
 }
