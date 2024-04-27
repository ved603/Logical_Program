package Arrays;

public class Merge {

    public static int[] sorted(int a[]){
        for(int i = 0; i<a.length;i++){
            int temp = i;
            for(int j = i+1; j<a.length;j++){
                if(a[j] < a[temp]){
                    temp = j;
                }
            }
            int flag = a[temp];
            a[temp] = a[i];
            a[i] = flag;
        }
        return a;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,3,5,7,8};
        int [] arr2 = {0,4,6,9};
        int j = 0;
        int [] res = new int[(arr1.length) + (arr2.length)];
        for(int i=0; i<arr1.length; i++){
            res[j] = arr1[i];
            j++;
        }
        for(int i=0; i<arr2.length; i++){
            res[j] = arr2[i];
            j++;
        }
        int [] arr = sorted(res);
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
