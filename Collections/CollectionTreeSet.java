import java.util.*;  
public class CollectionTreeSet{  
public static void main(String args[]){  
TreeSet<String> set=new TreeSet<String>();  
set.add("Swetha");  
set.add("Miki");  
set.add("Divya");  
set.add("Rose");   
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  