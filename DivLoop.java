class DivLoop
{
	public static void main(String args[])
	{
		int num = 75, res;
		do
		{
			if(num % 5 == 0)
			{
				System.out.println("Number is divisible by 5 ");
			}
			else
			{
				System.out.println("Number is not divisible by 5");
			}
			res=num%5;
		}while(res!=0);
		do
		{
			if(num % 7==0)
			{
				System.out.println("Number is divisible by 7");
			}
		}while(res!=0);
	}
}