package ABC;

public class LocalVariable {
	
		public static void main(String args[]){
		Hyllo h=new Hyllo();
		}
		}
		class Hyllo{
		{
		  int a=10;
		System.out.println("block 1:"+a);
		}
		{

		String a="blessings";
		System.out.println("block 2:"+a);

		}
		}

