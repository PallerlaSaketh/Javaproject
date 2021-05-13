import java.util.Scanner;
 class Emp{
   String name;
   int age,sal;
    String desig;
   
   Scanner sc=new Scanner(System.in);

    void create()
   {
    System.out.println();
    name=sc.next();
    System.out.println();
    age=sc.nextInt();
    System.out.println();
    sal=sc.nextInt();
    System.out.println();
    desig=sc.next();
   }
   void display()
   {
   System.out.println("Name :"+ name);
   System.out.println("Age :"+ age);
   System.out.println("Sal :"+sal);
   System.out.println("Desig :"+desig);
   }
   void raise()
   {
    sal=sal+1000;
    System.out.println("Salary is raised");
   }
}
class Main{
     public static void main(String[] args)
     {
      Emp e=new Emp();
        
       int c;
       do{
	Scanner sc = new Scanner(System.in);
        System.out.println("1.create");
        System.out.println("2.display");
        System.out.println("3.raise");
        System.out.println("4.Exit");
        System.out.println("Enter Your Choice");

        
     c= sc.nextInt();
     
     switch(c){
             case 1: e.create(); 
                      break;
            case 2: e.display(); 
                      break;
            case 3: e.raise(); 
                      break;
}
}while(c<4);
}
}
           
    
    