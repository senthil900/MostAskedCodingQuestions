// sorting array without using built-in functions
public class Main
{
	public static void main(String[] args) {
	    int[] num={3,2,1,5,4,7,6};
	    int len = num.length;
	    int[] sortedArray = sortArray(num,len);
	    // Printing the sorted array.
	    for(int i=0;i<len;i++){
	        System.out.println(sortedArray[i]);
	    }
	}
	public static int[] sortArray(int[] numbers,int length){
	        int temp = 0;
	   for(int i=0;i<length;i++){
	       for(int j=i+1;j<length;j++){
	           if(numbers[i]>numbers[j]){
	               temp = numbers[i];
	               numbers[i]=numbers[j];
	               numbers[j]=temp;
	           }
	       }
	   }
	   return numbers;
	}
}
