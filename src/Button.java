public class Button {
    private int clickCount = 0;

    public Button() {
    }

    public void click() {
        ++this.clickCount;
        System.out.println("Количество нажатий: " + this.clickCount);
    }
}