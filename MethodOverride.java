package week3.day1;

public class MethodOverride {
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		AxisBank a = new AxisBank();
		b.saving();
		b.fixed();
		b.deposit();
		System.out.println(" Method Overriding with same Method name and different class");
		a.deposit();
	}

}
