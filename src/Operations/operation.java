package Operations;

public class operation {
    public void op(String numberArray[]) throws OverTwoOperandExeption {
        if (numberArray.length > 3) {
            throw new OverTwoOperandExeption("������ �������������� �������� �� ������������� ������� - ��� �������� � ���� �������� (+, -, /, *)");
        }
        if (numberArray.length < 3) {
            throw new OverTwoOperandExeption("������ �� �������� �������������� ���������");
        }
        int[] array2 = new int[3];
        array2[0] = Integer.parseInt(numberArray[0]);
        array2[2] = Integer.parseInt(numberArray[2]);

        if (array2[0] > 10) {
            throw new OverTwoOperandExeption("������ ����� ������ 10");
        } else if (array2[2] > 10) {
            throw new OverTwoOperandExeption("������ ����� ������ 10");
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
                    System.err.println("�� ���� ������ ������ !");
                } else {
                    int res = array2[0] / array2[2];
                    System.out.println(res);
                }
            } else {
                System.err.println("�� ����� �������� �������� ");
            }
        }
    }
}
