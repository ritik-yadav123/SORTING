public class QuickSort {
    static void QS(int [] a,int p,int q){
        int i,j,pivot,temp;
        if(p<q){pivot=p;
            i=p;
            j=q;
            while(i<j){
                while(a[i]<=a[pivot]&&i<q){ i++;}
                while(a[j]>a[pivot]){ j--;}
                if(i<j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;}}
            temp=a[pivot];
            a[pivot]=a[j];
            a[j]=temp;
            QS(a,p,j-1);
            QS(a,j+1,q);}}
    public static void main(String[] args){
        int []a  ={4,6,26,58,1};
        int n=a.length ;
        QS(a,0,n-1);
        System.out.println("after sorted ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");}}

