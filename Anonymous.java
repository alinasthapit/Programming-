abstract class Person{
abstract void plays();
}
class Demo{
 public static void main(String[]args){
 Person x=new Person(){
 void plays(){
  System.out.println("Roby is playing Football");
 }

};
 x.plays();
}
}
 
