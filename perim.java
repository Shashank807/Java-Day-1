import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = scanner.nextInt();
        System.out.print("Enter Breadth: ");
        int b = scanner.nextInt();
        Calci obj=new Calci();
        int area=obj.area(l,b);
        int peri=obj.perim(l,b);
        System.out.println(area);
        System.out.println(peri);
    }
}

class Calci
{
int area(int l,int b)
  {
    return l*b;
  }
int perim(int l,int b)
  {
    return l+b;
  }
}