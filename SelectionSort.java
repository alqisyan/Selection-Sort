public class SelectionSort {
	public static int[] urutkanSelection(int[] arr){
		for(int i=0; i < arr.length - 1; i++)
		{  
            int indexTerkecil = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[indexTerkecil]){  
                    indexTerkecil = j;
                }  
            }  
            int nilaiTerkecil = arr[indexTerkecil];   
            arr[indexTerkecil] = arr[i];  
            arr[i] = nilaiTerkecil;  
        }
		return arr;
	}
		
		public static void main(String args[]){  
        int[] array = {10,34,2,56,7,67};   
        urutkanSelection(array);
        System.out.println("Data terurut : ");  
        for(int i:array){  
            System.out.print(i+", ");  
        }  
    }  
}  