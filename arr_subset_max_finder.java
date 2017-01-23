import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class arr_subset_max_finder 
{

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int value=0,sub_com=0,j=0,sum1=0,sum2=0,k=0,flag=0,i_value=0,cnt=0;
		int arr[]=new int[5],i=0,combin=0;

		System.out.println("enter the values");
		for( i=0;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the sub arr combination");
		sub_com=scan.nextInt();
		combin=5-(sub_com-1);
		
		for(i=0;i<5;i++)
		{
			if(combin!=0&&combin>0)
			{
			k=i;
				
			for(j=k;cnt<sub_com;j++)
			{
				//System.out.print(arr[j]+"\t");
				sum1+=arr[j];
				cnt++;
				k++;
			}
			cnt=0;
			
			//System.out.print(sum1+"\n");
			if(sum1>sum2)
			{
				sum2=sum1;
				i_value=i;
			}
			sum1=0;
			}
			k=0;
			--combin;
			
		}
		for(j=i_value;cnt<sub_com;j++)
		{
			System.out.print(arr[j]+"\t");
			cnt++;
		}
		System.out.print("max sum "+sum2);

		
       
	}
	}
