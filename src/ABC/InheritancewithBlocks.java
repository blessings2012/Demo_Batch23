package ABC;

public class InheritancewithBlocks {
	
		public static void main(String args[]){
		
		Dello h=new Dello();
		}
		}
		class Ha{
		 
		{
		System.out.println("parent->IB:");
		}
		static{
		System.out.println("parent->sB:");
		}
		}

		class Dello extends Ha{
	
		{
		System.out.println("child->IB:");
		}
		static{
		System.out.println("child->SB:");
		} 
		}

