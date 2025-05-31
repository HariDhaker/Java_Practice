class SelectionSort{
    static void selectionSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int curr=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[curr]>arr[j])
                {
                    curr=j;
                }
            }
            int temp = arr[curr];
            arr[curr]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[])
    {
         int[] array={4,2,3,5,6};
       int n = 5;
       selectionSort(array,5);
       System.out.println("Sorted array : ");
       for(int i=0;i<n;i++)
       {
        System.out.println(array[i]);
       }
    }
}