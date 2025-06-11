public class MergeSort {
    public static void printArr(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void MergeSortFun(int[]arr,int left,int right){
         if (left>=right)return;
        int mid = left + (right - left) / 2;

        MergeSortFun(arr,left,mid);
         MergeSortFun(arr,mid+1,right);
         merge(arr,left,mid,right);
    }
    public static void merge(int []arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++)left[i]=arr[i+l];
        for (j=0;j<n2;j++)right[j]=arr[mid+1+j];
        i=0;j=0;k=l;
        while (i<n1 && j<n2){
            if (left[i]<right[j]){
                arr[k]=left[i];
                i++;k++;
            }else {
                arr[k]=right[j];
                j++;k++;
            }
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }

    }

    public static void main(String[] args) {
        int []arr={1,30,40,20,22,30,80};
        printArr(arr);
        System.out.println();
        MergeSortFun(arr,0,arr.length-1);
        printArr(arr);
    }
}
