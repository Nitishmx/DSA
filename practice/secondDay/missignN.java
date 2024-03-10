package practice.secondDay;

class missignN {
    public static int  duplicateValue(int arr[],int leng){
        int totalsum=((leng+1)*(leng+2)/2);
        // System.out.println(totalsum);
        int sum=0;
        for(int i=0;i<leng;i++){
            sum=sum+arr[i];
        }
        int result=totalsum-sum;
        // System.out.println(result);
        return result;
        // int a=10;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8};
        int n=arr.length;
        int a=duplicateValue(arr,n);
        System.out.println("missing number:"+a);
    }
}