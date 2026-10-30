public class Jedi extends Character implements ForceUser {

    public Jedi(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showInfo();
        System.out.println(name + " swings ligthsaber!");
    }

    public void useMeditate() {
        System.out.println(name + " is meditating and focusing the Force...");
    }

    @Override
    public void useForce() {
        System.out.println(name + " uses the Force to push the enemy away!\n");
    }
}
