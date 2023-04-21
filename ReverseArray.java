class ReverseArray
{
public static void main(String args[])
{
int num[]={1,2,3,4,5};
int n=num.length;

System.out.println(" Original Array Elements :");
for(int i=0; i<num.length; i++){
System.out.print(num[i]+" ");
}

System.out.println("\n Reversed Array Elements :");
for(int i=n-1; i>=0; i--){
System.out.print(num[i]+" ");
}
}
}