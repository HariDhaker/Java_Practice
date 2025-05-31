class BubbleSort{
    static void swap(int x,int y)
    {
        int temp=x;
        x=y;
        y=temp;
    }
    static void bubbleSort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                     // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
       int[] array={4,2,4,5,6};
       int n = 5;
       bubbleSort(array,5);
       System.out.println("Sorted array : ");
       for(int i=0;i<n;i++)
       {
        System.out.println(array[i]);
       }
    }
}