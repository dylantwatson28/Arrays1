public class Astronaut {
    public String name;
    public int eyes;

    public Astronaut(){
        name = "Dylan";
        eyes = 2;

    }
    public void printInfo(){
        System.out.println("My astro's name is " + name + " and he has " + eyes + " eyes");
    }
}
//todo: make constructor for astro class that gives the int vars default values
//also make a printinfo method that prints the info of our int vars