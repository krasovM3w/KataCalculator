package RomanNum;

public enum RomanCalc {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10),
    XII(12), XIV(14), XV(15), XVI(16), XVIII(18), XX(20), XXI(21), XXIV(24), XXV(25),
    XXVII(27), XXVIII(28), XXX(30), XXXII(32), XXXV(35), XXXVI(36), XL(40), XLII(42), XLV(45),
    XLVIII(48), XLIX(49), L(50), LIV(54), LVI(56), LX(60), LXIII(63), LXIV(64), LXX(70), LXXII(72),
    LXXX(80), LXXXI(81), XC(90), C(100);
    private int value;
    RomanCalc(int value) {
        this.value = value;
    }
    public void foo(String numberArray[]) throws NegativeNumExeption {
        if (numberArray.length > 3) {
            throw new NegativeNumExeption("формат математической операции не удовлетвор€ет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (numberArray.length < 3) {
            throw new NegativeNumExeption("строка не €вл€етс€ математической операцией");
        }
        int[] arr2 = new int[3];

        try {
            if (Integer.parseInt(numberArray[0]) > -2147483648 || Integer.parseInt(numberArray[2]) > -2147483648){
                throw new NegativeNumExeption("используютс€ одновременно разные системы счислени€");
            }
        } catch (NumberFormatException e) {
            for (int i = 0; i < 3; i++) {
                switch (numberArray[i]) {
                    case "I":
                        arr2[i] = 1;
                        break;
                    case "II":
                        arr2[i] = 2;
                        break;
                    case "III":
                        arr2[i] = 3;
                        break;
                    case "IV":
                        arr2[i] = 4;
                        break;
                    case "V":
                        arr2[i] = 5;
                        break;
                    case "VI":
                        arr2[i] = 6;
                        break;
                    case "VII":
                        arr2[i] = 7;
                        break;
                    case "VIII":
                        arr2[i] = 8;
                        break;
                    case "IX":
                        arr2[i] = 9;
                        break;
                    case "X":
                        arr2[i] = 10;
                        break;
                    default:
                        arr2[i] = 11;
                        break;
                }
            }
            if (arr2[0] > 10) {
                throw new NegativeNumExeption("¬ы ввели первое число в неправильном диапозоне, вводить нужно от I до X !");
            } else if (arr2[2] > 10) {
                throw new NegativeNumExeption("¬ы ввели второе число в неправильном диапозоне, вводить нужно от I до X !");
            } else {
                int resRom = 0;

                if (numberArray[1].equals("+")) {
                    resRom = arr2[0] + arr2[2];
                    //System.out.println(resRom);
                } else if (numberArray[1].equals("-")) {
                    resRom = arr2[0] - arr2[2];
                    //System.out.println(resRom);
                } else if (numberArray[1].equals("*")) {
                    resRom = arr2[0] * arr2[2];
                    //System.out.println(resRom);
                } else if (numberArray[1].equals("/")) {
                    resRom = arr2[0] / arr2[2];
                    //System.out.println(resRom);
                } else {
                    throw new NegativeNumExeption("¬ы ввели неверную операцию");
                }
                for (RomanCalc el : RomanCalc.values()) {
                    if (resRom == el.value) {
                        System.out.println("–езультат " + el);
                    }
                }
                if (resRom < 0) {
                    throw new NegativeNumExeption("в римской системе нет отрицательных чисел");
                }
            }
        }
    }
}

