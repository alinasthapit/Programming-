import java.util.*;
class SetDemo{
public static void main(String[]args){
TreeSet<String> hs=new TreeSet<String>();
System.out.println(hs.isEmpty());

hs.add("A");
hs.add("L");
hs.add("I");
hs.add("N");
hs.add("A");
hs.add("S");
hs.add("T");
hs.add("H");
hs.add("A");
hs.add("P");
hs.add("I");
hs.add("T");
System.out.println(hs);
System.out.println(hs.size());
System.out.println(hs.contains("A"));
System.out.println(hs.remove("S"));
System.out.println(hs);
System.out.println(hs.headSet("I",true));
System.out.println(hs.tailSet("I",false));
System.out.println("First: " + hs.first());
System.out.println("Last: " + hs.last());
System.out.println("Lower: " + hs.lower("L"));
System.out.println("Floor: " + hs.floor("I"));
System.out.println("Ceiling: " + hs.ceiling("I"));
System.out.println("Higher: " + hs.higher("A"));
System.out.println("PollFirst: " + hs.pollFirst());
System.out.println("PollLast: " + hs.pollLast());
}
}


output

$javac SetDemo.java
$java -Xmx128M -Xms16M SetDemo
true
[A, H, I, L, N, P, S, T]
8
true
true
[A, H, I, L, N, P, T]
[A, H]
[I, L, N, P, T]
First: A
Last: T
Lower: I
Floor: I
Ceiling: I
Higher: H
PollFirst: A
PollLast: T





