public class Balance {
    private int leftWeight = 0;
    private int rightWeight = 0;

    public Balance() {
    }

    public void addRight(int weight) {
        if (weight > 0) {
            this.rightWeight += weight;
        } else {
            System.out.println("Вес должен быть положительным.");
        }

    }

    public void addLeft(int weight) {
        if (weight > 0) {
            this.leftWeight += weight;
        } else {
            System.out.println("Вес должен быть положительным.");
        }

    }

    public void result() {
        if (this.leftWeight == this.rightWeight) {
            System.out.println("=");
        } else if (this.leftWeight > this.rightWeight) {
            System.out.println("L");
        } else {
            System.out.println("R");
        }

    }
}
