package basicJava;
      
import java.util.Scanner;

public class doubleArray {

	public static void main(String[] args) {
		
	
	int a[][]= {{2,3,9},{4,5,3},{11,0,5}};
	
	int min=a[0][0];
	int mincol=0;
	
	for(int i=0;i<3;i++)
	{
		
		for(int j=0;j<3;j++)
		{
			
			if(a[i][j]<min)
			{
				min=a[i][j];
				mincol=j;
			}
			
			
			
			
		}
			
	}
		
	System.out.println(min);
	int maxvalue=a[0][mincol];
	int k=0;
	while(k<3)
	{
		if(a[k][mincol]>maxvalue)
		{
			
			maxvalue=a[k][mincol];
			
		}
		
		k++;
	}
	System.out.println(maxvalue);	
	}

}
