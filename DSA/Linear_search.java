
public class Linear_search {
	public static void main(String[] args){
		int[] array={1,2,3,4,5,6,7,8,9};
		int index=linear_search(array,3);
		if(index!=0){
			System.out.println("element index :"+index);
		}
		else{
			System.out.println("element not found");
		}
	}
	private static int linear_search(int[] array , int value){
		for(int i=0;i<array.length;i++){
			if(array[i]==value){
				return i;
			}
		}
		return 0;
}}

