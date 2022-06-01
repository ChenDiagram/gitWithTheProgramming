

/**

 *

 * @author dchen004

 * Computes future investment value at a given annual RoR for a specified number of years

 */

import java.util.Scanner;

import java.lang.Math;

public class FutureInvestmentValue{

    //defines method for calculation (from assignment description)

    public static double CalcFutureInvestmentValue (double investmentAmount, double annualRoR, int years){

        double futureInvestVal;

        futureInvestVal = investmentAmount*(Math.pow((1+annualRoR),years));

        return futureInvestVal;

    }

    public static void main(String[] args) {

        //defines array and asks for input

        double[] investTable = new double[30];
        
        System.out.print("Please enter your investment amount: ");

        Scanner input = new Scanner(System.in);
        
        double investmentAmount = input.nextDouble();
        
        System.out.print("Please enter your annual Rate of Return: ");
        
        double annualRoR = input.nextDouble();

        for (int i = 1; i <= 30; i++) {
           investTable[i-1] = Math.floor(CalcFutureInvestmentValue(investmentAmount, annualRoR, i)*100)/100;
        }

        System.out.println("The amount invested: "+ investmentAmount);

        System.out.println("Annual RoR: "+annualRoR);
        
        System.out.println("Years   Future Value");
        for (int i=0; i<investTable.length;i++){
            if (i < 9)  
                System.out.println(i+1 + "       " + investTable[i]);
            else 
                System.out.println(i+1 + "      " + investTable[i]);

        }

    

    }

}