class Stack
{
	 int [] arr;
	 int top;
	 int topp;
	 
	 
	 Stack(int size)
	 {
	
		arr =new int[size];
		top =-1;
		topp=arr.length;
	 }
	 
	 
	 public boolean isEmpty()
	 {
		 return(top==-1 && topp ==size);
		 
	 }
	 
	 public boolean isFull()
	 {
		 return(top+1 == topp);
		 
	 }
	 
	 public static void display()
	 {
		 for(int i=0;i<=top;i++)
			 System.out.println(arr[i]);
		 for(int j=arr.length-1;j>=topp;j--);
			System.out.println(arr[j]);
	 }
	 void push(int x)
	{
		if(top>0)
		{
			top--;
			arr[top] =x;
		}
		else
		{
			return;
		}
	}
	
	void push1(int x)
	{
		if(isfull())
			{
			System.out.println("Stack is full");
			}
		else
		{
			top--;
			arr[top]=val;
		}
	}
	
	void push2(int x)
	{
		if(isfull())
			{
			System.out.println("Stack is full");
			}
		else
		{
			topp--;
			arr[topp]=val;
		}
	}	
	
	
	int pop1()
	{
		if(isEmpty())
		{
			System.out.println(" stack is Empty");
		}
		else
		{
			top--;
		}
	}

	
	
	
public static void main(String args[])
	{
	Stack s = new Stack(6);
	s.push(5);
	s.push2(10);
	s.push2(15);
	s.push1(11);
	s.push2(7);
	s.push2(40);
	System.out.println("Before pop" );
	s.display();
	s.pop1();
	s.pop2();
	s.display();
	}
}
	
  