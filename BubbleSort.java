public class BubbleSort {
    static void BS(int[] a,int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=1+i;j<n;j++){if(a[i]>a[j]){temp=a[i];
                a[i]=a[j];
                a[j]=temp;}}}}
    public static void main(String[] args){
        int []a  ={4,6,26,58,1};
        int n=a.length ;
               BS(a,n);
        System.out.println("after sorted ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");}}

