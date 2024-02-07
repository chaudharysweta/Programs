package Programs;

public class CustomException {

	public static void main(String[] args) {
		
		int age=16;
		try {
			if(age<18)
			{
				throw new UnderAgeException();  //Here we can pass message too to display desired output
			}
			else
			{
				System.out.println("You can vote now...");
			}
			
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}

	}

}
class UnderAgeException extends Exception{
	
	UnderAgeException()
	{
		super("You are under age");
	}
	UnderAgeException(String message)
	{
		super(message);
	}
}