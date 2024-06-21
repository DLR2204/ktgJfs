package java8;

@FunctionalInterface
interface Calculator {

	public void add(int a, int b);
}



public class Addition implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("The sum of two integers is:-" + (a + b));

	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * Calculator cal = new Calculator() {
	 * 
	 * @Override public void add(int a, int b) {
	 * System.out.println("The sum of two integers is:-" + (a + b));
	 * 
	 * }
	 * 
	 * };
	 * 
	 * cal.add(54,34); }
	 */

}
