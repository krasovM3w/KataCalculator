package paket;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import Operations.OverTwoOperandExeption;
import Operations.operation;
import RomanNum.NegativeNumExeption;
import RomanNum.RomanCalc;

public class Main {
    public static void main(String[] args) throws NegativeNumExeption, OverTwoOperandExeption {
        System.out.println("Введите операцию через пробел, например: 5 + 2");
        System.out.println("При вводе римских чисел, ответ будет так же римский");
        Scanner sc = new Scanner(System.in);
        String mew2 = sc.nextLine();
        String[] numberArray = mew2.split(" ");
        int[] array2 = new int[3];
        try {
            if (numberArray.length < 3) {
                throw new OverTwoOperandExeption("строка не является математической операцией");
            }
            array2[0] = Integer.parseInt(numberArray[0]);
            array2[2] = Integer.parseInt(numberArray[2]);
            if (array2[0] > -2147483648 && array2[2] > -2147483648) {
                operation op = new operation();
                op.op(numberArray);
            }
        } catch (NumberFormatException e) {
            RomanCalc calc = RomanCalc.I;
            calc.foo(numberArray);
        }
    }
}
// с божьей помощью работает


