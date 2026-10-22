//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 43, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 188;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }


    //search the target and return true or false

    static boolean linearsearch3(int[] arr, int target){
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for(int element : arr){
            if (element == target) {
                return true;
            }
        }

        //this line will execute if none of the return statements above has executed
        // hence the target not found
        return false;
    }


    //search the target and return the element
    static int linearsearch2(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int element : arr){
            if (element == target) {
                return element;
            }
        }

        //this line will execute if none of the return statements above has executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }


    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int index = 0; index < arr.length; index++){
            //check for every element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line will execute if none of the return statements above has executed
        // hence the target not found
        return -1;
    }
}