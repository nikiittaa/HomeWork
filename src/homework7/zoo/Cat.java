package homework7.zoo;

public class Cat extends AnimalParents implements Climb, Run{

    @Override
    public void climb() {
        System.out.println("Cat climb");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void getAge() {
        super.getAge();
    }
}