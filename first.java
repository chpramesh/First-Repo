import java.util.Scanner;
class first
{
	public static void main(String[] args)
	{
		int num1, num2, num3=0;
        char c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		num1 = sc.nextInt();
        while (true)
        {
        num2 =0;   
        System.out.println("Do you want to add one more number :");
		c = sc.next().charAt(0);
        if( c !='y')
            break;
        System.out.println("Enter the number :");
		num2 = sc.nextInt();
		num3 = addNum(num1, num2);
        num1=num3;
        }
		System.out.println ("The sum is :" +num3);
		sc.close();
	}

	public static int addNum(int a, int b)
	{
		int sum = a+b;		
		return sum;
	}
}
