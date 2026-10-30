public class Sith extends Character implements ForceUser {

    public Sith(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showInfo();
        System.out.println(name + " unleashes Force lightning!");
    }

    @Override
    public void useForce() {
        System.out.println(name + " uses the Force to choke the enemy!\n");
    }
}
