package ABC;

public class MethodOverridingAccessModifier {

		public static void main(String[] args)
		{
			
			Parentt obj = new Childd();
			obj.m1();
		}
	}

	class Parentt {
		
		protected void m1()
		{
			System.out.println("From parent m1()");
		}
	}

	class Childd extends Parentt {
		
		public void m1()   //access modifer is higher for child class than parent class
		{
			System.out.println("From child m1()");
		}

	}

	