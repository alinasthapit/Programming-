class Exception4Demo{
public static void main(String[]args){
int a=10,b=2;
String name=null;
System.out.println("statement 1 and sum=" +(a+b));
try{
   System.out.println("statement 2 and divide=" +(a/b)); //jvm will create throw new ArithmeticException() object and throw it
    try{
        System.out.println("statement 3 and length=" +name.length());//jvm create throw new NullPointerException() object and throw it
      }
    catch(NullPointerException y){
    y.printStackTrace();
    }
}
catch(ArithmeticException x){
x.printStackTrace();
}
System.out.println("statement 4 and multiply=" +(a*b));
}
}


OUTPUT

$javac Exception3Demo.java
$java -Xmx128M -Xms16M Exception3Demo
statement 1 and sum=12
statement 2 and divide=5
statement 4 and multiply=20
java.lang.NullPointerException
	at Exception3Demo.main(Exception3Demo.java:9)