package ABC;

public class TEx {
static void validateage(int age)
{
	if(age <18)
		throw new ArithmeticException("invalid");
	else
		System.out.println("valid age");
}
public static void main(String args[]) {
	validateage(2);
	
}
}
