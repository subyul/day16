package day16;
class Ex03{
	int [] arr = {87,100,11,72,92};
}
public class ClassEx03 {
public static void main(String[] args) {
	Ex03 e = new Ex03();
	int sum = 0;
	for(int i = 0;i<e.arr.length;i++)
	{
		sum = sum+e.arr[i];
	}
	System.out.println("합 = "+sum);
	
	sum = 0;
	for(int i = 0;i<e.arr.length;i++)
	{
		if(e.arr[i]%4==0)
		{
			sum = sum+e.arr[i];
		}
	}
	System.out.println("4의 배수 합 = "+sum);
	
	int count = 0;
	for(int i = 0;i<e.arr.length;i++)
	{
		if(e.arr[i]%4==0)
		{
			count +=1;
		}
	}
	System.out.println("4의 배수 개수 = "+count);
	
	count = 0;
	for(int i = 0;i<e.arr.length;i++)
	{
		if(e.arr[i]%2==0)
		{
			count +=1;
		}
	}
	System.out.println("짝수 개수 = "+count);
	
}
}
