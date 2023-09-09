public class maximumInTheArray {
    public static void main(String[] args) {
        int arr[] = {1,5,3};
        int mx = -1000000;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        System.out.println("The maximum number is : "+mx);
    }
}
