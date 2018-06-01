package one;

public class SavingAccount {
public static double annualIN;
private double savingBal;


      public SavingAccount(int a) {
    	this.savingBal= a;
      }

public void  CalculateIN() {
	double intrest = (savingBal*(annualIN/100.0))/12;
	savingBal = savingBal+intrest;
}

public static void  modifyRate(double newvalue) {
	annualIN = newvalue;
}
 public void  showbal() {
	 System.out.println("Your balance : "+ savingBal);
	 
 }



public static void main(String[] args) {
	double annaulIN=2000.0;
	double savingBal=300;
	SavingAccount saver1=new SavingAccount(2000);
	SavingAccount saver2= new SavingAccount(3000);
	SavingAccount.modifyRate(4);
	saver1.showbal();
	saver2.showbal();
	saver1.CalculateIN();
	saver2.CalculateIN();
	saver1.showbal();
	saver2.showbal();
	SavingAccount.modifyRate(5);
	saver1.showbal();
	saver2.showbal();
	saver1.CalculateIN();
	saver2.CalculateIN();
	saver1.showbal();
	saver2.showbal();
}





}







