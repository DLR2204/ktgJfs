package exceptions;
public class Exception3 {
	public static void main(String args[]) {//40     24 1
		try {
			//file
			int a[] = new int[5];// 0,1,2,3,4
			a[2] = 30/6;
			String s= "Hello";
			int x=Integer.parseInt(s,29);
			System.out.println(x);
			System.out.println(s.length());
			System.out.println("11.no error  " + a[2]);}	
		catch (ArithmeticException e) {
			System.out.println("14.dont enter zero denominator");}
		catch (ArrayIndexOutOfBoundsException Ae) {
			System.out.println("16.index maximum size crossed");}
		catch (NumberFormatException e) {
		System.out.println("18.unable to convert string to number");}	
		catch(Exception ea)
		{System.out.println("20.not handled"+ea);}
		finally {//it will print in any case
			System.out.println("22.executes every time for closing connections");
			}
		System.out.println("24.remaining code  executed...");
		//
	}}