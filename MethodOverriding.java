abstract class Laptop(){
abstract void price();
abstract void memory();
void start(){
System.out.println("Laptop starts with the power button");
}
}
class Dell extends Laptop{
void price(){
System.out.println("Dell's price is 800 Dollars");
}
void memory(){
System.out.println("Dell has 32 GB memory");
}
}
class Lenovo extends Laptop{
void price(){
System.out.println("Lenovo's price is 700 Dollars");
}
void memory(){
System.out.println("Lenovo has 64 GB memory"):
}
}
class MethodOverriding{
public static void main(String[]args){
Laptop x = new Dell();
x.start();
x.price();
x.memory();
Laptop y = new Lenovo();
y.start();
y.price();
y.memory();
}
}


