interface Vehicle{
 void speed();
 void cost();
}
abstract class Car implements Vehicle{
void wiper(){
System.out.println("All the car has thepubl wiper.");
}
}
abstract class Bike implements Vehicle{
void brakes(){
System.out.println("All the bikes has brakes.");
}
}
class Audi extends Car{
public void speed(){
System.out.println("Audi speed is 120");
}
public void cost(){
System.out.println("Audi costs 70 lakhs.");
}
}
class Bmw extends Car{
public void speed(){
System.out.println("Bmw speed is 140.");
}
public void cost(){
System.out.println("Bmw cost is 80 lakhs.");
}
}
class Honda extends Bike{
public void speed(){
System.out.println("Honda speed is 70.");
}
public void cost(){
System.out.println("Honda costs 4 lakhs.");
}
}
class Pulsar extends Bike{
public void speed(){
System.out.println("Pulsar speed is 90.");
}
public void cost(){
System.out.println("Pulsar cost is 8 lakhs.");
}
}

class Interface{
public static void main(String[]args){
Car a=new Audi();
a.speed();
a.cost();
a.wiper();
a=new Bmw();
a.speed();
a.cost();
a.wiper();
Bike x=new Honda();
x.speed();
x.cost();
x.brakes();
x=new Pulsar();
x.speed();
x.cost();
x.brakes();
}
}

