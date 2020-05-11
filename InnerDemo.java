class Employee{
 void hiring(){
   System.out.println("We are hiring new employee's");
 }
     class Department{
       void fullTime(){
         System.out.println("We have fulltime hiring in the Department");
        }
     }
}
class InnerDemo{
 public static void main(String[]args){
  Employee h=new Employee();
  h.hiring();
 Employee.Department d=h.new Department();
  d.fullTime();
}
}