import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        //Inputs
        System.out.println("What is the bill amount in $: ");
        double bill = scan.nextDouble();
        System.out.println("What is the tip percentage as a whole number: ");
        int tipPercentage = scan.nextInt();
        System.out.println("How many people are there: ");
        int numOfPeople = scan.nextInt();
        System.out.println();

        //Calculations
        double tip = bill * ((double) tipPercentage / 100);  //Dividing tip percent by 100 to convert to decimal and then multiplying by bill to find tip
        double totalBill = tip + bill;                       //Adding the tip to the bill to find total bill
        double tipPerPerson = tip / numOfPeople;             //Dividing tip by number of people to find tip per person
        double totalPerPerson = totalBill / numOfPeople;     //Dividing total bill by number of people to find total per person

        //Outputs
        System.out.println("The Total Tip Amount Is $" + (df.format(tip))); //Using formatting to round decimal
        System.out.println("The Total Bill Amount Is $" + (df.format(totalBill)));
        System.out.println("The Tip Amount Per Person Is $" + (df.format(tipPerPerson)));
        System.out.println("The Total Amount Per Person Is $" + (df.format(totalPerPerson)));
    }
}
