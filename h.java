package multithread;

public class h {
		void sum(int a,int b){System.out.println("Sum="+(a+b));}
		}
		public class h extends j{
			void sum(int a,int b){System.out.println("Addition="+(a+b));}


		public static void main(String args[]) {
			int a=55;
			int b=45;
			j x=new j();
					x.sum(a,b);

			h y=new h();
					y.sum(a,b);
		}
		}
