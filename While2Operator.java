class While2Operator{
public static void main(String[]args){
int n=123, x=0, rem=0;
while(n>0){
rem=n%10;
x=x*10+rem;
n=n/10;
}
System.out.println("Reverse " +x);
}
}