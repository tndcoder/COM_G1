public class Test
{
	private int stk[];
	private int top;


	public Test ()

	{
		stk= new int[10];
  		



	}

	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==stk.length-1;
	}

	public int pop()
	{
		if(isEmpty())
		{
			System.out.println(x:"Stack is underflow");
			return 0;


		}else
		{
				int item=stk[top++];
				return item;

		}


	}
	

}