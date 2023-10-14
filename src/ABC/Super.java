package ABC;

public class Super {
	
		public static void main(String args[]){
		Eello h=new Eello();
		h.show();
		}
		}
		class Hii{
		static int a=10;
		}
		class Eello extends Hii{
		 static int a=20;
		void show(){
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		}}



 