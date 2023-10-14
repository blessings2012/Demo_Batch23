package ABC;
public class InterfaceWorking implements In1{
	
		public void ok()
		{
			System.out.println("interface");
		}

		public static void main (String[] args)
		{
			InterfaceWorking t = new InterfaceWorking();
			t.ok();
			System.out.println(a);
		}
	}
	interface In1
	{
		
		final int a = 10; 

		void ok();
	}
	


