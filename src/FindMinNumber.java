public class FindMinNumber {
    public static void main(String[] args) {
        int[] numbers = {12,34,45,56,79,31,69,10,-4};
        System.out.println(min(numbers));
    }

    static int min(int[] arr){
        int minNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(minNumber > arr[i]){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }
}
