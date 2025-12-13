public abstract class NonFlowering extends Plant {

    public NonFlowering() {
        super();
        this.flowers = false;
    }

    public NonFlowering(double price, String name) {
        super(price, false, name);
    }

    public double getPrice() {
        return price;
    }

    public abstract void bloom();

}