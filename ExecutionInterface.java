package week3day1;

public class ExecutionInterface {

	public static void main(String[] args) {
		CalcBusinessTax obj = new CalcBusinessTax();
		obj.incomeAdd("Siemens", 1234.56, 2345.78);
		obj.incomeReduce("Siemens", 2100.01, 123.23);

	}

}
