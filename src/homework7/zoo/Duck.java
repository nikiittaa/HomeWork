package homework7.zoo;

public class Duck extends AnimalParents implements Fly, Climb, Run {

    @Override
    public void fly(){
        System.out.println("Duck fly");
    }

    @Override
    public void climb(){
        System.out.println("Duck climb");
    }

    @Override
    public void run(){
        System.out.println("Duck run");
    }
    
    @Override
    public void getAge() {
        super.getAge();
    }
}
