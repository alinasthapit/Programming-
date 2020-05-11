interface Samsung{
 int cost_dollar = 800;
interface Nokia{
 int cost_dollar= 700;
 }
}
class Phone implements Nokia, Samsung{
 void display(){
  System.out.println("The price of Samsung in dollar is " + Samsung.cost_dollar);
  System.out.println("The price of Nokia in dollar is " + Nokia.cost_dollar);
}
}
class InterfaceLoop{
 public static void main(String[]args){
  Phone n = new Phone();
  n.display();
}
}