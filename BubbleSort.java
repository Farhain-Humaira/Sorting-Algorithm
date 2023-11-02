public class BubbleSort
{
	int bubbleSort(int list[])
	{
		for(int i = 0; i < (list.length)- 1; i++)
		{
			for(int index = 0; index < list.length - (i+1); index++)
			{
				if(list[index] > list[index + 1])
				{
					int temp = list[index];
					list[index] = list[index + 1];
					list[index + 1] = temp;

				}
			}
		}
	return 0;
	}
	int Array(int list[])
	{
		for(int i = 0; i<list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
	return 0;
	}

	public static void main(String[] args)
	{
		BubbleSort bs = new BubbleSort();
		int list[] = {4,9,5,1,3,8};
		bs.bubbleSort(list);
		System.out.println("Bubble Sort Array");
		bs.Array(list);
	}
}

