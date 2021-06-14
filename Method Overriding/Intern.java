class Intern extends Tasks{   
  void run(){System.out.println("It's the duty of the intern to complete all the tasks before deadline");}  
  
  public static void main(String args[]){  
  Intern obj = new Intern();  
  obj.run();
  Tasks obj1 = new Tasks();
  obj1.run();
  Tasks obj2 = new Intern();
  obj2.run();
  }  
}  