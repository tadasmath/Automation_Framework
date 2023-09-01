package Arrays;

public class Arraycntodd {

	public static void main(String[] args)
	{
	int[] arr={1,3,7,8,4};
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==1)
		{
			count++;
		}
	}
			System.out.println(count);
		}

	}


