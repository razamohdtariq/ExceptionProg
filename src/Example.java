public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int balance =5000;
int withdrawlAmount=6000;
try {
if(balance<withdrawlAmount)
	throw new ArithmeticException("Insufficient Balance");
balance=balance-withdrawlAmount;
System.out.println("Transaction Successfully Completed");
}
catch(ArithmeticException e)
{
System.out.println("Exception : "+e.getMessage());
	}
System.out.println("Program Continue...");
	}
}
