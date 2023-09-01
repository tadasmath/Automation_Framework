package Arrays;

public class Arraysumodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int [] arr={1,3,7,8,4};
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==1)
				{
					sum=sum+arr[i];
				}
			}
				System.out.println(sum);
			}
	}

}
