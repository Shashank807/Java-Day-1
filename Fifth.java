public class Fifth
{
public static void main(String [] args)
{
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter first number");
  int a=scanner.nextInt();
  System.out.print("Enter Second Number");
  int b=scanner.nextInt();
   Calci obj=new Calci();
   obj.swap(a,b);
  
}
}

class Calci 
{
   void swap(int &a, int &b)
   {
     a=a^b;
     b=a^b;
     a=a^b;
     System.out.println("a");
     System.out.println("b");
   }
}