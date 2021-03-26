####################################################

class AA {
 static int add(int i, int j){
 return i+j;
 }
}
public class B extends AA{
public static void main(String argv[]){
 short s = 9;
 System.out.println(add(s,6));
 }
}
