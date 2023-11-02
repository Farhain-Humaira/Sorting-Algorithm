public class Insertion
{
	int insertion(int list[])
	{
		for(int i = 0; i < list.length; i++)
		{
			int currentElement = list[i];
			int index;

			for(index = i -1; index >= 0 && list[index] > currentElement; index--)
			{
				list[index+1] = list[index];
			}
			list[index + 1] = currentElement;
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
		Insertion it = new Insertion();
		int list[] = {4,9,5,1,3,8};
		it.insertion(list);
		System.out.println("Insertion Sort Array");
		it.Array(list);
	}
}