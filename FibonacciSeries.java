import java.util.*;

class FibonacciSeries {
   static int a=0,b=1,c,value;
	 public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
                System.out.println("Enter a value");
		value = sc.nextInt();
		System.out.print(a+" "+b);
		printFib(value);
	}
  static  void printFib(int i)
	{
  		if(i>=1){
	     	c=a+b;
		    System.out.print(" "+c);
		    a=b;
		    b=c;
		printFib(i-1);
		}
	}
}
	   
