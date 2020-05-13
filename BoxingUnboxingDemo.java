class BoxingUnboxingDemo{
public static void main(String[]args){
int a=10;
System.out.println(a);//auto-boxing

Integer x=new Integer(100);
int b=x;//auto-unboxing
System.out.println(b);
}
}