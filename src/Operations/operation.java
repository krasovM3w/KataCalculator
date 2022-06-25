package Operations;

public class operation {
    public void op(String numberArray[]) throws OverTwoOperandExeption {
        if (numberArray.length > 3) {
            throw new OverTwoOperandExeption("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (numberArray.length < 3) {
            throw new OverTwoOperandExeption("строка не является математической операцией");
        }
        int[] array2 = new int[3];
        array2[0] = Integer.parseInt(numberArray[0]);
        array2[2] = Integer.parseInt(numberArray[2]);

        if (array2[0] > 10) {
            throw new OverTwoOperandExeption("первое число больше 10");
        } else if (array2[2] > 10) {
            throw new OverTwoOperandExeption("второе число больше 10");
        } else {
            if (numberArray[1].equals("+")) {

                int res = array2[0] + array2[2];
                System.out.println(res);

            } else if (numberArray[1].equals(("-"))) {
                int res = array2[0] - array2[2];
                System.out.println(res);

            } else if (numberArray[1].equals(("*"))) {
                int res = array2[0] * array2[2];
                System.out.println(res);

            } else if (numberArray[1].equals(("/"))) {
                if (array2[2] == 0) {
                    System.err.println("На ноль делить нельзя !");
                } else {
                    int res = array2[0] / array2[2];
                    System.out.println(res);
                }
            } else {
                System.err.println("Вы ввели неверную операцию ");
            }
        }
    }
}
