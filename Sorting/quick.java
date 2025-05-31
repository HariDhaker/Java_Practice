class QuickSort{
    static int partition(int arr[],int st,int end)
    {
        int pvt=arr[end];
        int idx=st-1;
        for(int i=st;i<end;i++)
        {
           if(pvt>=arr[i])
           {
            idx++;
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
           }
        }
        idx++;
        int temp = arr[end];
        arr[end]=arr[idx];
        arr[idx]=temp;
        return idx;
    }
    static void quickSort(int arr[],int st,int end)
    {
        if(st>end)
        {
            return;
        }
        int pvtIndx=partition(arr,st,end);
        quickSort(arr,st,pvtIndx-1);
        quickSort(arr,pvtIndx+1,end);
    }
    public static void main(String args[])
    {
        int[] array={4,2,3,5,6};
       int n = 5;
       quickSort(array,0,array.length-1);
       System.out.println("Sorted array : ");
       for(int i=0;i<n;i++)
       {
        System.out.println(array[i]);
       }
    }
}