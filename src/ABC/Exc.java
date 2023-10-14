package ABC;

public class Exc {
	public static void main(String args[]) {
		
		try {
			int x =0;
			int r = 10/x;
			System.out.println("the output" +r);
			
		}catch(Exception e)
		{
			System.exit(0);
			e.printStackTrace();
		}
		finally {
			System.out.println("evertime it will print");
		}
	}

}



//try catch
//throw
//throws
