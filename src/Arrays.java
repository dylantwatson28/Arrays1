public class Arrays {
    public int[] nums;
    public Astronaut[] astros;

    public static void main(String[] args) {
        System.out.println("Welcome to awesome arrays!");
        new Arrays();
    }

    public Arrays() {
        nums = new int[10];

        astros = new Astronaut[7];
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
        for (int x = 0; x < nums.length; x++) {
            nums[x] = (int) (Math.random() * 100) + 1;
        }
        //todo: make method called displayArray that prints all of the number in the array and only use one sout

        System.out.println(nums[9]);
        displayArray();
        sumArray();
        averageNum();
        maxNum();
        minNum();


        Astronaut a1 = new Astronaut();
        a1.eyes = 40;
        a1.printInfo();
        astros[4] = new Astronaut();

        astros[4].eyes = 20;
        astros[4].name = "Gerald";
        astros[4].printInfo();
    }

    public void displayArray() {
        for (int x = 0; x < nums.length; x++) {
            System.out.println(x + ": " + nums[x]);
        }
    }

    public void sumArray() {
        int total = 0;
        for (int x = 0; x < nums.length; x++) {
            total = total + nums[x];
        }
        System.out.println(total);
    }

    public void averageNum() {
    double total = 0;
    for (int a = 0; a < nums.length; a++){
        System.out.println(total/nums.length);
    }
    }

    public void maxNum() {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    public void minNum() {
        int smallest = nums[0];
        for (int z = 0; z < nums.length; z++) {
            if (nums[z] < smallest) {
                smallest = nums[z];
            }
        }
        System.out.println("Min: " + smallest);
    }
}
//todo: use for loops to fill the array with random numbers 1 - 100
//make method called someArray that adds all the numbers in num together
//hint: use for loop