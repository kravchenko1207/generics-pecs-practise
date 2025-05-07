package solution;

public abstract class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void speak();

    public String getName() {
        return name;
    }
}
