public class SelectionSort {
    static void SS(int []a,int n)
    {int i,j,small;
        for(i=0;i<n;i++) {
            small = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[small]) {
                    small = j;}
                int temp = a[small];
                a[small] = a[i];
                a[i] = temp;}}}
    public static void main(String[] args){
        int []a  ={4,6,26,58,1};
        int n=a.length ;
        SS(a,n);
        System.out.println("after sorted ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");}}
