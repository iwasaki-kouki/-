public abstract class AbstractPerson {
    public abstract String seibetu();
    public void speak() {
        System.out.println("I'm a " + seibetu());
    }
}