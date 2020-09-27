class Main {
  public static void main(String[] args) {
  class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   
   int defaultedDays = 10;
   int amountPerDay = 200;
   int amountPaid = 1000;
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for

int amountToPay;
int daysPaid;
int amountLeft;
int daysNotPaid;
  
   // calculate and print total amount the debtor is to pay
  amountToPay = daysNotPaid * amountPerDay;
  System.out.println(amountToPay);
   // calculate and print the days the debtor paid for
  daysPaid = 7 - daysNotPaid;
  System.out.println(daysPaid);
  // calculate and print the amount whose day was not captured becausethe amount was incomplete
 System.out.println("calculate and print the amount whose day was not captured because the amount was incomplete");
   // calculate and print amount the debtor is left to pay
System.out.println ("calculate and print the amount debtor is left to pay");
amountLeft = amountToPay - amountPaid;
System.out.println(amountLeft);
   // calculate and print days the debtor has not payed for
System.out.println("calculate and print days the debtor has not paid for");
daysNotPaid = 7 - daysPaid;
System.out.println(daysNotPaid);

 
   
  }
}