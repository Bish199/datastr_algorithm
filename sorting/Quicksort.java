import java.util.*;

class Program {
  public static int[] quickSort(int[] array) {
		quickSort(array,0,array.length-1);
		return array;
  }
	public static void quickSort(int[] array, int start, int end){
		if(start>=end) return;
		int pivot=start;
		int left=start+1;
		int right=end;
		while(right>=left){
			if(array[left]>array[pivot] && array[right]<array[pivot]) swap(array,left,right);
			else if(array[left]<=array[pivot]) left++;
			else if(array[right]>=array[pivot]) right--;
		}
		swap(array, pivot, right);
		quickSort(array,right+1,end);
		quickSort(array,start,right-1);
	}
	  
	
	public static void swap(int[] array, int i, int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
