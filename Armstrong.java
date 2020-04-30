class Armstrong{
public static void main(String[]args){
int n=153, sum=0, rem=0;
for(sum=0; n>0; n=n/10){
rem=n%10;
sum=sum+rem*rem*rem;
}
System.out.println("Sum is " + sum);
}
}