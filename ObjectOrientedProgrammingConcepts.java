/*
 * A method that finds the number of occurrences of a specified character in a string
 */
public class CharacterCounter {
    public static int count (String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
   
  public static void main(String[] args) {
        System.out.println("Please enter string to search: ");
        Scanner input = new Scanner(System.in);
        String SearchString = input.nextLine();
        System.out.println("Please enter character to count: ");
        char a = input.next().charAt(0);
        int count = CharacterCounter.count(SearchString, a);
        System.out.println("There are " + count + " " + a + "'s in " + SearchString);
    }
}

/**
 *
 * Finds the smallest element in an array of double values
 */
public class SmallestElement {
    public static double min (double [] array){
        double min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    //test program
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        double [] testNum = new double[10];
          for (int i = 0; i < testNum.length; i++){
             testNum[i] = input.nextDouble();
          }
        double testOut = min(testNum);
        System.out.println("The minimum number is: " + testOut);
    }
}    

/**
 *
 * a method that returns the sum of all the elements in a specified column in a matrix 
 */
public class SumElementsbyColumns {
    //define method that calculates sum of a specified column
    public static double sumColumn (double [][] m, int columnIndex){
        double total = 0;
        for (int row = 0; row < m.length; row++) {
            total += m[row][columnIndex];
        }
        return total;
    }
   
     //test program
    public static void main(String[] args) {
        //defining array from user input
        System.out.println("DEFINE YOUR ARRAY: How many rows?");
        Scanner input = new Scanner(System.in);
        int Rows = input.nextInt();
        System.out.println("DEFINE YOUR ARRAY: How many columns?");
        int Columns = input.nextInt();
        double [][] inMatrix = new double[Rows][Columns];
        
        //initializing array from user input
        System.out.println("Enter a " + Rows + "-by-" + Columns + " matrix row by row:");
        for (int row = 0; row < inMatrix.length; row++) {
            for (int column = 0; column < inMatrix[row].length; column++){
                inMatrix[row][column] = input.nextDouble();
            }
        }
        
        //Calculate sum for each column of the matrix using method defined earlier
        for (int c = 0; c < Columns; c++){
            System.out.println("Sum of the elements at column " + c + " is " + sumColumn(inMatrix,c));
        }
    }
}

/**
 *
 * creates "Stock" object with symbol, name, and previous & current prices
 */
public class Stock {
    public static void main(String[] args){
        DecimalFormat df1 = new DecimalFormat("0.###");
        System.out.println("What's your stock symbol?");
        Scanner input = new Scanner(System.in);
        String Symbol2 = input.nextLine();
        System.out.println("What's your stock's name?");
        String Name2 = input.nextLine();
        System.out.println("What was the previous price?");
        double previousPrice2 = input.nextDouble();
        System.out.println("What is the current price?");
        double currentPrice2 = input.nextDouble();
        Stock stock1 = new Stock(Symbol2,Name2,previousPrice2,currentPrice2);
        System.out.println("STOCK SUMMARY \n" + 
                           "Stock details:" + stock1.symbol + " " + stock1.name + " \n" 
                            + "Previous Closing Price: $" + stock1.previousClosingPrice + " \n"
                            + "Current Price: $" + stock1.currentPrice + " \n"
                            + "Percentage Price Change: " + df1.format(stock1.getChangePercent()) +"%");
        /**
        Stock stock1 = new Stock("ORCL","Oracle Corporation",34.5,34.35);
        System.out.println("STOCK SUMMARY \n" + 
                           "Stock details: " + stock1.symbol + " " + stock1.name + " \n" 
                            + "Previous Closing Price: $" + stock1.previousClosingPrice + " \n"
                            + "Current Price: $" + stock1.currentPrice + " \n"
                            + "Percentage Price Change: " + stock1.getChangePercent() +"%");
         **/
    }
    
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    Stock(String newSymbol, String newName, double newPreviousPrice, double newCurrentPrice){
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreviousPrice;
        currentPrice = newCurrentPrice;
    }
    
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice)/currentPrice)*100;
    }
}

/**
 *
 * display the area, perimeter, color, and true or false to indicate whether it is filled or not
 */
public class Triangle extends GeometricObject{  
    public static void main(String[] args){
        System.out.println("Length of first side?");
        Scanner input = new Scanner(System.in);
        double newSide1 = input.nextDouble();
        System.out.println("Length of second side?");
        double newSide2 = input.nextDouble();
        System.out.println("Length of third side?");
        double newSide3 = input.nextDouble();
        input.nextLine(); //consume leftover
        System.out.println("Colour of the triangle?");
        String colour = input.nextLine();
        System.out.println("Is the triangle filled? (true for Yes, false for No)");
        Boolean InFill = input.nextBoolean();
        Triangle triangle = new Triangle(newSide1, newSide2, newSide3,colour, InFill);
        System.out.println("Triangle description: " + triangle.toString()); 
        System.out.println("Your triangle's area is " + triangle.getArea()); 
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The colour is " + triangle.color + " and filled: " + triangle.isFilled());
    }
        //Three sides
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;
        
        //no arg constructor
        Triangle(){
        }
        
        Triangle(double side1, double side2, double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        
        Triangle(double side1, double side2, double side3, String color, Boolean filled){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            setColor(color);
            setFilled(filled);
        }
        
        public double getSide1(){
            return side1;
        }    
        
        public double getSide2(){
            return side2;
        }
        
        public double getSide3(){
            return side3;
        }
        
        double getArea(){
            double s = (side1 + side2 + side3)/2.0;
            double radicand = s*(s - side1)*(s - side2)*(s-side3);
            double area = Math.sqrt(radicand);
            return area;
        }
        
        double getPerimeter(){
            double perimeter = side1 + side2 + side3;
            return perimeter;
        }
        
        @Override
        public String toString (){
            return "Triangle: side1 = " + side1  + " side2 = " + side2 + " side3 = " + side3;
        }
        
}
