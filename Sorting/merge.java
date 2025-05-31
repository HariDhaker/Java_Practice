class MergeSort{
    static void merge(int arr[],int st,int mid,int end)
    {
        int i=st;
        int j=mid+1;
        int[] res = new int[end - st + 1];
        int k=0;
        while(i<=mid && j<=end)
        {
            if(arr[i]>arr[j])
            {
                res[k]=arr[j];
                k++;
                j++;
            }
            else
            {
                res[k]=arr[i];
                i++;
                k++;
            }
        }
        while(i<=mid)
        {
            res[k++]=arr[i++];
        }
        while(j<=end)
        {
            res[k++]=arr[j++];
        }
          for (int m = 0; m < res.length; m++) {
            arr[st + m] = res[m];
        }
    }
    static void mergeSort(int arr[],int st,int end)
    {
        if(st>=end)
        {
            return;
        }
        int mid = st+(end-st)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,st,mid,end);
    }
    public static void main(String args[])
    {
        int[] array={4,2,3,5,6};
       int n = 5;
       mergeSort(array,0,array.length-1);
       System.out.println("Sorted array : ");
       for(int i=0;i<n;i++)
       {
        System.out.println(array[i]);
       }
    }
}