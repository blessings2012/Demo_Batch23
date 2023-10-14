package ABC;

public class LocalBlock {

		public static void main(String args[]){
		Hlo h =new Hlo();
		
		}
		}
		class Hlo{
		
		{
		System.out.println(" i am iib");
		{
		System.out.println("i am local block in iib");
		}
		}
		static{
		System.out.println(" i am sib");
		{
		System.out.println(" i am local block in sib");
		}
		}
		}

