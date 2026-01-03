class Main {
    static int index=-1;
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
            return index;
    }
    public static void main(String[] args) {
        int[] arr={1,5,8,10};
        int tag=10;
        System.out.println("element" +tag+" found at index"+linearSearch(arr,tag));
    }
}
