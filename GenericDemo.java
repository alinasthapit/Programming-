class Example<E>{
void show(E x){
System.out.println(x);
}
}
class GenericDemo{
public static void main(String[]args){
Example<Integer> i=new Example<Integer>();
i.show(new Integer(100));//auto boxing
Example<Double> a=new Example<Double>();
a.show(new Double(3.4));
Example<String> s=new Example<String>();
s.show("Hello");
Example x=new Example();
x.show(20);
x.show(4.5);
x.show("Hey");
}
}
