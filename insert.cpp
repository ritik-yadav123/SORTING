#include<stdio.h>
void insert(int A[],int N){int j;
	for(int i=1;i<N;i++){
		int temp=A[i];
		for(j=i-1;j>=0&&temp<A[j];j--){
			if(A[j]>temp)
				A[j+1]=A[j];
				A[j+1]=temp;
				else break;
				}}
	}
int main(){
	int A[]={2,45,32,5,532,445};
	insert(A,6);
	for(int i=0;i<6;i++)
	printf("%d \t",A[i]);
}

