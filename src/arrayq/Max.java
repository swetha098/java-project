package arrayq;

public class Max {

	public static void main(String[] args) {
		int arr[]= {5,3,8,1,7,2};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				 max=arr[i];
			}
			
		}
		System.out.println(max);

	}


	}


