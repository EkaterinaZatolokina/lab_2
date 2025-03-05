public class Bell {
    private boolean isDing = true;

    public Bell() {
    }

    public void sound() {
        if (this.isDing) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }

        this.isDing = !this.isDing;
    }
}
