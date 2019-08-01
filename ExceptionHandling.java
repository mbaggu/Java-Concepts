package javaBasics;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int i = 50 / 0;
			System.out.println("Didn't catch the execption");

		}
		
		 catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  

		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic Exception");
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Exception");
		}
		
		finally{
			System.out.println("Final code to execute");
		}

	}

}
