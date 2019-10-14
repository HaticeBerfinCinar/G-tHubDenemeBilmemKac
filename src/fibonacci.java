
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n1=0, n2=1, n3, i, count=10;
				System.out.print(n1+" "+n2);
				for(i=2; i<count ; ++i) {
					n3=n1+n2;
					System.out.print(" "+n3);
					n1=n2;
					n2=n3;
				}
				System.out.println();
				fibonacci  fb= new fibonacci ();
				for(i=0; i<10; i++) {
					System.out.print(fb.calculate(i)+" ");
				}
	}
//
	public int calculate(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}else {
			return calculate(n-1)+ calculate(n-2);
		}
	}

}
