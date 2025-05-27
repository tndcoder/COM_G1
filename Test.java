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

}