package cse360assignment02;

public class Test {
	
	public static void main(String[] args) {
		
	AddingMachine myCalculator = new AddingMachine();
	myCalculator.add(4);
	myCalculator.subtract(2);
	myCalculator.add(5);
	System.out.println(myCalculator.toString());
	
	myCalculator.clear();
	System.out.println(myCalculator.toString());
	System.out.println(myCalculator.getTotal());

	}

}
