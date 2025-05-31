class InsertionSort{
    static void insertionSort(int arr[],int n)
    {
        for(int i=1;i<n;i++){
            int prvs=i-1;
            while(prvs>=0)
            {
                if(arr[prvs]>arr[prvs+1])
                {
                    int temp = arr[prvs];
                    arr[prvs]=arr[prvs+1];
                    arr[prvs+1]=temp;
                    prvs--;
                }
                else{
                    prvs--;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int[] array={4,2,3,5,6};
       int n = 5;
       insertionSort(array,5);
       System.out.println("Sorted array : ");
       for(int i=0;i<n;i++)
       {
        System.out.println(array[i]);
       }
    }
}