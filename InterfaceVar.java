interface Samsung{
 void costDetails();
}
interface Nokia{
 void costDetails();
}
class Details implements Nokia, Samsung{
 public void costDetails(){
  System.out.println("The price of Samsung in dollar is 800");
  System.out.println("The price of Nokia in dollar is 700 " );
}
}
class InterfaceVar{
 public static void main(String[]args){
 Details n = new Details();
  n.costDetails();
}
}