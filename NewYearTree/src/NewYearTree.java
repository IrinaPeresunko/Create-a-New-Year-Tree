
public class NewYearTree {
	public static void drawTree(int start,int end,int n)
	{
		for(int j=0;j<n;j++)
		{
		if(j==start)
		for(int k=start;k<end+1;k++) System.out.print("^");
		else System.out.print(" ");
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		int n=19,start=(n/2),end=(n/2);
		for(int i=0;i<n;i++)
		{
			if(i==start || i==end)
			{
				drawTree(start,end,n);
				start--;end++;
			}
		}	
	}
}
