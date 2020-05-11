class Employee{
   static class Department{
     void partTime(){
       System.out.println("We are hiring Part Time");
                    }
     static void fullTime(){
       System.out.pintln("We are hiring Full Time");
                           }
                 }
}
class InnerJobDemo{
public static void main(String[]args){
 Employee n=new Employee();
 Employee.Department x=new University.Department();
 x.partTime();
 Employee.University.fullTime();
  }
}
