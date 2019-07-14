import java.util.Scanner;
public class Choose {
	public static int choose(int n,int k){
		return fac(n)/(fac(k)*fac(n-k));
	}
	public static int fac(int n){
		int fac=1;
		for(int i = 1; i<=n;i++)	fac*=i;
		return fac;
	}
	public static String drawPascTr(int height){
		String retun = "";
		for (int i = 0; i< height ; i++){
			for(int k = i+1;k<height;k++){
				retun+=" ";
			}
			for(int j = 0; j<=i;j++){
				int term = choose(i,j);
				retun+=(term+" ");
			}
			retun+="\n";
		}
		return retun;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner ( System.in);
		System.out.println("Enter height of triangle: ");
		int h = sc.nextInt();
		System.out.print(drawPascTr(h));
		sc.close();
	}
	
}