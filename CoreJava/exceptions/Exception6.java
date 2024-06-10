package exceptions;//our class should extends exception

//parameterized constructor

class AgeNotValidException extends Exception {
	private int age;// global instance var

	public AgeNotValidException(int age) // paramatrized constructor

	{
		this.age = age;// to access the current class parameters.
	}
}

public class Exception6 {
	static void validation(int age) throws AgeNotValidException {

		if (age < 18)// real time exception
			throw new AgeNotValidException(age);// ---------------->create an obj//creates the obj for exception cls
		else
			System.out.println("you are eligable to vote");
	}

	public static void main(String args[])

	{
		try {
			validation(9);
		} catch (AgeNotValidException e) {

			e.printStackTrace();

		} finally {
			System.out.println("executes every time");
		}
		System.out.println("rest of the code...");
	}
}