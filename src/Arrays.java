public class Arrays {
    public int[] nums;

    public static void main(String[] args) {
        System.out.println("Welcome to awesome arrays!");
        new Arrays();
    }
    public Arrays(){
        nums = new int[10];
        nums[9] = 11;
        //todo: add all nums to all buckets in labels 0-8
        nums[8] = 10;
        nums[7] = 8;
        nums[6] = 15;
        nums[5] = 7;
        nums[4] = 6;
        nums[3] = 5;
        nums[2] = 4;
        nums[1] = 3;
        nums[0] = 2;
        for (int x = 0; x < nums.length; x++){
            nums[x] = (int) (Math.random() * 100) + 1;
        }
        //todo: make method called displayArray that prints all of the number in the array and only use one sout

        System.out.println(nums[9]);
        displayArray();
        sumArray();
    }
    public void displayArray(){
        for (int x = 0; x < nums.length; x++) {
            System.out.println(x + ": " + nums[x]);
        }
    }
    public void sumArray(){
        int total = 0;
        for (int x = 0; x < nums.length; x++){
            total = total + nums[x];
        }
        System.out.println(total);
    }
}
//todo: use for loops to fill the array with random numbers 1 - 100
//make method called someArray that adds all the numbers in num together
//hint: use for loop