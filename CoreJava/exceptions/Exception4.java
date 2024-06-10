package exceptions;

class Exception4 {
	public static void main(String args[]) {
		try {
			int c = 12 / 2;
			try {
				System.out.println("8.Division");
				int b = 30 / 0;
			} catch (ArithmeticException e) {
				System.out.println("11."+e);
			}
			try {
				int a[] = new int[3];
				a[6] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("17.array index problem");
			} finally {
				System.out.println("19.always will execute finally block 	");
			}
			System.out.println("21.remaing try  statements");
		} catch(Exception e) {
			System.out.println("23.handeled");
		}
		System.out.println("25.normal execution..");
	}
}