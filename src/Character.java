public class Character {

    protected String name;
    protected int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void action() {
        System.out.println("Character is picking up an item");
    }

    public void showInfo() {
        System.out.println("Navn: " + name);
        System.out.println("Alder: " + age);
    }

    public final void goLive() {
        System.out.println(name + " is now live!");
    }
}
