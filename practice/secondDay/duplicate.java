package practice.secondDay;
public class duplicate {
    public static void duplicateValue(int ar1[],int len){
        int flag=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
              if (ar1[i]==ar1[j]) {
                System.out.println("Duplicate value :"+ar1[j]);
                
              }

            }
            flag++;
        }
        if (flag==0) {{
            System.out.println("duplicate value not present in array");
        }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,40,80,20,10,20,10,20};
        int len=arr.length;
        duplicateValue(arr,len);

    }
    
}
