
public class Sort {
void selectionSort(int arr[]){
	int min;
	int pos;
	int help;
	for(int i=0;i<=arr.length-2;i++)
	{
	min=arr[i];
	pos=i;
	for(int j=i+1;j<=arr.length-1;j++)
	{
	if(arr[j]<min)
	{
	min=arr[j];
	pos=j;
	}
	}
	//swap arr[i] and arr[pos]
	help=arr[i];
	arr[i]=arr[pos];
	arr[pos]=help;
	}
}
}
