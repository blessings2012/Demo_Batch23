package ABC;

public class MethodOverriding {
	
		public static void main(String[] args)
		{
			Parent obj = new Child();
			obj.show();
		}
	}
class Parent{
		protected void show()
		{
			System.out.println("Parent's show()");
		}
	}

	
	class Child extends Parent {
		public  void show()
		{
			System.out.println("Child's show()");
		} 
	}
 //remember for interview
	//Private methods can not be overridden
	//Static methods can not be overridden(method hiding)
	//Final methods can not be overridden
	//The overriding method must have same return type
	/*
	 * The access modifier for an overriding method can allow more, but not
	 * less, access than the overridden method. For example, a protected instance
	 * method in the super-class can be made public, but not private, in the
	 * subclass.  
	 * see program MethodOverridingAccessModifier
	 */	


