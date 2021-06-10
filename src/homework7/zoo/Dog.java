package homework7.zoo;

public class Dog extends AnimalParents implements Run, Climb{

    @Override
    public void run(){
        System.out.println("Dog run");
    }

    @Override
    public void climb() {
        System.out.println("Dog climb");
    }

    @Override
    public void getAge() {
        super.getAge();
    }
}
