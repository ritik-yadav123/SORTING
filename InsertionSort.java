public class InsertionSort {
    static void IS(int [] a,int n){
        int i,j,temp;
        for(i=0;i<n;i++){temp=a[i];
            j=i-1;
            while(j>=0&&temp<=a[j]){
                a[j+1]=a[j];
                j--;}
            a[j+1]=temp;}}
    public static void main(String[] args){
        int []a  ={4,6,26,58,1};
        int n=a.length ;
        IS(a,n);
        System.out.println("after sorted ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");}}
