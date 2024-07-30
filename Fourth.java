import java.util.Scanner;
public class Fourth
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Score 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter Score 2: ");
        int b = scanner.nextInt();
        System.out.print("Enter Score 3: ");
        int c = scanner.nextInt();
        Calci obj=new Calci();
        int total=obj.total(a,b,c);
        System.out.println(total);
        System.out.println(percent(a,b,c));
    }
}


class Calci
{
int total(int a,int b,int c)
  {
    return a+b+c;
  }
double percent(int a,int b,int c)
{
return ((a+b+c)/300)*100;
}
}