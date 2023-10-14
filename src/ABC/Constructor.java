package ABC;

public class Constructor {
		public static void main(String[] args){
		Student stu1=new Student(88);
		stu1.show();
		
		}}
		class Student{
		int sid;
		String sname;
		Student(int id){
		System.out.println("student 1 arg constructor");
		sid=id;
		//sname=sn;
		}
		void show(){
		System.out.println(sid);
		}}
 
