public class Main
{
	public static void main(String[] args) {
	    int num=5;
	    int fact=findFactorial(num);
		System.out.println(fact);
	}
	public static int findFactorial(int num){
	    if(num==0)
	      return 1;
	    return num*findFactorial(num-1);
	}
}
