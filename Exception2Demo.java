class Exception2Demo{
public static void main(String[]args){
int a=10,b=0;
System.out.println("statement 1 and sum=" +(a+b));
try{
System.out.println("statement 2 and divide=" +(a/b)); //jvm will create the new ArithmeticException() object and throw it
}
catch(ArithmeticException x) // x=new ArithmeticException()
{
//System.out.println(x.getMessage());
//System.out.println(x.toString());
x.printStackTrace();
}
System.out.println("statement 3 and multiply=" +(a*b));
System.out.println("statement 4 and subtract=" +(a-b));
}
}


OUTPUT

$javac Exception1Demo.java
$java -Xmx128M -Xms16M Exception1Demo
statement 1 and sum=10
statement 3 and multiply=0
statement 4 and subtract=10
java.lang.ArithmeticException: / by zero
	at Exception1Demo.main(Exception1Demo.java:6)