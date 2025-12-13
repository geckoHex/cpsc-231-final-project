public abstract class Flowering extends Plant {
    
    public Flowering {
        super();
        this.flowers = true;
    }

    public Flowering (double price, String name) {
        super(price, true, name);
    }

    public double getPrice () {
        return price;
    }

    public abstract void bloom ();

}
