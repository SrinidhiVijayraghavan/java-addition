package addition;

public class overrid {
	void sum(int a,int b){System.out.println("Sum="+(a+b));}
	}
	public class overriding extends overrid{
		void sum(int a,int b)
		{
			System.out.println("Addition="+(a+b));}


	public static void main(String args[]) {
		int a=55;
		int b=45;
		overriding x=new overriding();
				x.sum(a,b);

		overrid y=new overrid();
				y.sum(a,b);
	}
	}


