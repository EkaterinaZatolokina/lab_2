import java.util.ArrayList;
import java.util.List;


    public class OddEvenSeparator {
        private final List<Integer> numbers = new ArrayList();

        public OddEvenSeparator() {
        }

        public void addNumber(int number) {
            this.numbers.add(number);
        }

        public void even() {
            System.out.print("Чётные числа: ");

            for(int num : this.numbers) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }

            System.out.println();
        }

        public void odd() {
            System.out.print("Нечётные числа: ");

            for(int num : this.numbers) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }

            System.out.println();
        }
    }


