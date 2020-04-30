abstract class Laptop{
abstract void price();
abstract void memory();
}
class Dell extends Laptop{
void price(){
System.out.println("Dell's price is 800 dollars");
}
void memory(){
System.out.println("Dell has 64 GB memory");
}
}
class Lenovo extends Laptop{
void price(){
System.out.println("Lenovo's price is 700 dollars");
}
void memory(){
System.out.println("Lenovo has 32 GB memory");
}
}
class AbstractMethodOverriding{
public static void main(String[]args){
Laptop x = new Dell();
x.price();
x.memory();
Laptop y = new Lenovo();
y.price();
y.memory();
}
}
