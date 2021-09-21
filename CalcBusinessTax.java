package week3day1;

public class CalcBusinessTax implements TaxCalculation {

	public void incomeAdd(String name, double amount1, double amount2) {
	System.out.println("The Company Name is :" + name);
	System.out.println("Amount 1 is :" + amount1);
	System.out.println("Amount 2 is :" + amount2);
	}

	public void incomeReduce(String name, double amount1, double amount2) {
	System.out.println("The Company name is :" + name);
	System.out.println("Amount 1 is :" + amount1);
	System.out.println("Amount 2 is :" + amount2);
	}

	public int publishValue() {
		System.out.println("Print the return value");
		return 0;
	}

}
