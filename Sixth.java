public class Sixth
{
public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    double celsius = convert(fahrenheit);

    System.out.println(celsius);
}
}


public double convert(int f)
{
   int ans=9/5*f-32;
   return ans;
}