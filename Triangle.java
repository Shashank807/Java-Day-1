import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Side 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter Side 2: ");
        int b = scanner.nextInt();
        System.out.print("Enter Side 3: ");
        int c = scanner.nextInt();
        Calci obj=new Calci();
        int peri=obj.perim(a,b,c);
        System.out.println(peri);
    }
}

class Calci
{
int perim(int l,int b,int c)
  {
    return a+b+c;
  }
}