public class SearchInRange {
    public static void main(String[] args) {
        int[] numbers = {12,34,45,56,79,31,69,10,-4};
        System.out.println(linearSearch(numbers,31,0,4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <end+1; i++){
            if(arr[i] == target){
                return i; // return index of the target
            }
        }
        return -1;
    }
}

