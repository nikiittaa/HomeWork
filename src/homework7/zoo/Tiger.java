package homework7.zoo;

public class Tiger extends AnimalParents implements Run, Climb{
    @Override
    public void run(){
        System.out.println("Tiger run");
    }

    @Override
    public void climb() {
        System.out.println("Tiger climb");
    }
    @Override
    public void getAge() {
        super.getAge();
    }
}
