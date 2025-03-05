import geometry2d.*;
import geometry3d.*;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        System.out.println("Демонстрация работы кнопки:");
        button.click();
        button.click();
        button.click();
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        balance.result();
        balance.addRight(5);
        balance.result();
        balance.addRight(3);
        balance.result();
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        separator.even();
        separator.odd();
        Table table = new Table(3, 3);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(1, 0, 4);
        table.setValue(1, 1, 5);
        table.setValue(1, 2, 6);
        table.setValue(2, 0, 7);
        table.setValue(2, 1, 8);
        table.setValue(2, 2, 9);
        System.out.println("Таблица:");
        System.out.println(table);
        System.out.println("Значение в ячейке (1,1): " + table.getValue(1, 1));
        System.out.println("Число строк: " + table.rows());
        System.out.println("Число столбцов: " + table.cols());
        System.out.println("Среднее арифметическое: " + table.average());
        try{
            Circle circle = new Circle(2.54);
            System.out.println(circle);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());

        }
        try{
            Rectangle rectangle = new Rectangle(2.54, 3.86);
            System.out.println(rectangle);
        } catch (HeightException e) {
            System.out.println(e.getMessage());
        } catch (WidthException e) {
            e.getMessage();
        }
        try{
            Cylinder cylinder  = new Cylinder(new Circle(2.37), 5.56);
            System.out.println(cylinder);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /**System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        Cylinder cylinder = new Cylinder(circle, (double)10.0F);
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.volume());**/

    }
}