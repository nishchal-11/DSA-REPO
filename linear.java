public class linear{
    public static void main(String[] args) {
        int[] nums ={23,23 ,44,34,8,7,91,0};
        int target= 9;
        int ans = linear(nums,target);
        System.out.println(ans);
        
    }
            static int linear(int []arr, int target){
                    if(arr.length==0){
                            return -1;
                    }
                    for( int i=0;i<arr.length;i++){
                        if(arr[i]==target){
                        return arr[i];
            }
            
        }
        return -1;
    }
}

