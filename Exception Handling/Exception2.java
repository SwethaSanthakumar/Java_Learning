class Exception2 extends Exception1{  
void check(int workingHours)throws Exception
{
   if(workingHours < 8)  
      throw new ArithmeticException("Not valid");  
     else  
      System.out.println("You have completed your working hours for today");
}  
  
  public static void main(String args[]){  
   Exception1 e=new Exception2();  
   try{  
   e.check(7);  
   }catch(Exception s){}  
  }  
}  