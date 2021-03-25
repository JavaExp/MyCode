abstract class Operation{
void msg(){
System.out.println("GoodMorning");
}
abstract void twice(int n);
}
class Programmer1 extends Operation{
void twice(int x){
System.out.println("Result1:"+(x+x));
}
}
class Programmer2 extends Operation{
void twice(int y){
System.out.println("Result2:"+(y*2));
}
}
class Programmer3 extends Operation{
void twice(int z){
System.out.println("Result3:"+(z<<1));
}
}
class AbstractDemo{
	static{
		System.out.println("hai");
	}
	public static void main(String[] arr){
		Programmer1 p1=new Programmer1();
		p1.msg();
		p1.twice(6);
		Programmer2 p2=new Programmer2();
		p2.msg();
		p2.twice(7);
		Programmer3 p3=new Programmer3();
		p3.msg();
		p3.twice(8);
	
		
	}
	
}