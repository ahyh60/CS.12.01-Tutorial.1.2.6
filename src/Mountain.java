public class Mountain {
    public static boolean isIncreasing(int[] arr, int stop){
        for(int i = 0; i< stop; i++){
            if(!(arr[i]< arr[i+1]))
                return false;

        }
        return true;
    }

    public static boolean isDecreasing(int[] arr, int start){
        for(int i = start; i < arr.length -1; i++){
            if(!(arr[i] > arr[i+1]))
                return false;
        }
        return true;
    }

    public static int getPeakIndex(int[] arr){
        for(int i = 1; i< arr.length -1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
                return i;
        }
        return -1;
}

    public static boolean isMountain(int[] arr){

        if(getPeakIndex(arr) == -1){
            return false;
        }
        else{
            int p = getPeakIndex(arr);
            if(isIncreasing(arr,p) && isDecreasing(arr,p))
                return true;
        }
        return false;
        }


    }
