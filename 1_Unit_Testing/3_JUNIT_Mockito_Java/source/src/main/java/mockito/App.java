package mockito;

public class App {
	private Calulate calculation;
	 
	public boolean check(int a, int b) {
		int sum = calculation.sum(a, b);
 
		return sum > 10;
	}
 
	public Calulate getCalculation() {
		return calculation;
	}
 
	public void setCalculation(Calulate calculation) {
		this.calculation = calculation;
	}
 
	public static void main(String[] args) {
		App a = new App();
		a.setCalculation(new Calulate());
 
		if (a.check(2, 9)) {
			System.out.println("Greater than 10");
		} else {
			System.out.println("Less than 10");
		}
	}
}
