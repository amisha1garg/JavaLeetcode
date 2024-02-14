package array;

public class Sample {
    public static void main(String[] args) {
        int [] array = new int[9];

        int value = (getAllOnes(array, 0, array.length-1));
        if(value != -1) {
            int count = array.length - value;
        }
        int count = 0;
    }

    public static int getAllOnes(int arr[], int start, int end){

        int length = arr.length; // 9
        int mid = (start + end )/2; // 4 //1 // 2 // 3
        int firstIndex = -1;
//        int count = 0;
//        if (arr[mid] == 1){ // true
////            count += 1; //count =
//           getAllOnes(arr, start, mid-1);
//            getAllOnes(arr, mid+1, end);
//        } else if (arr[mid] == 0) {
//            if (mid == 0 || mid == length-1){
//                return 0;
//            }
//            getAllOnes(arr, mid+1, end);
//        }
//        if (mid == 0 || mid == length-1){
//            return count;
//        }

        if (start == end && arr[mid] == 0){
            return firstIndex;
        }
        if (start == end && arr[mid] == 1){
            firstIndex = mid;
            return firstIndex;
        }

        if (arr[mid] == 1){
            firstIndex = mid; //4
            getAllOnes(arr, start, mid - 1);
        }
        if (arr[mid] == 0){
            getAllOnes(arr, mid+1, end);
        }

        return firstIndex; // 5
    }


}
