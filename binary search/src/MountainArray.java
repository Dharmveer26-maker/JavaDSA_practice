public class MountainArray {
    public static void main(String[] args) {

        // leetcode 852
    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decc part of the array
                // this may be the ans, but look at left
                // this is why end != mid - 1;
                end = mid;
            }else{
                // you are in asc part of the array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end , start == end and pointing to the largest number because of the 2 checks
        // start and end are always to find max element in the above 2 checks
        // hence, what they are pointing to just one element, that is the max one because that is what the check say
        // more elaboration : at every point of time for start and end they have the best possible answer till that time
        // and if we are saying that only one item id remaining, hence cuz of above line that is the best possible answer
        return start; // or return end as both are equal
    }
}
