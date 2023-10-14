package ABC;

public class Inheritance {
		public static void main(String[] args){
			Cello c=new Cello();
		c.m1();
		c.m2();
		}
		}
		class Hai{
		int a=9;
		void m1(){
		System.out.println("hai.m1:"+a);
		
		}
		}
		class Cello extends Hai{
	
		void m2(){
		System.out.println("hello.m2:"+a);

		} 
		}

