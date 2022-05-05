class Twostack
	{
		static int max=10;
		int top1,top2;
		int Array[]=new int[max];
		
		Twostack()
		{
			top1=2;
			top2=6;
		}
		
		int push1(int k){
			Array[--top1]=k;
				return k;
		}
		
		int push2(int k){
			Array[++top2]=k;
			return k;
		}
		
		int pop1(int x)
		{
			x=Array[top1++];
			return x;
		}
		
		int pop2(int x)
		{
			x=Array[top2--];
			return x;
		}
		
		void display(){
			
			System.out.print("\ndispaly\n");
			for(int i=0;i<max;i++)
			System.out.print(Array[i]+" ");
		}
		
		public static void main(String... args)
		{
			Twostack t1= new Twostack();
			t1.push1(5);
			t1.push2(10);
			t1.push2(15);
			t1.push1(11);
			t1.push2(7);
			t1.push2(40);	
			t1.display();
			t1.pop1(11);
			t1.pop2(40);
			t1.display();
	
		}
	}