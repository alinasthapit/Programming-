class Employee{
 void hiring(){
     class Department{
       void fullTime(){
         System.out.println("We have fulltime hiring in the Department");
                }
             }
       Department d=new Department();
       d.fullTime();
   }
        
}
class InnerClDemo{
 public static void main(String[]args){
  Employee h=new Employee();
  h.hiring();
}
}