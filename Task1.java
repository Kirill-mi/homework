package homeWork1;


public class Task1 {
    public static void main(String[] args) {
        byte numberFortyTwo = 42;
        byte numberFifteen = 15;

        int resultOne;
        int resultTwo;

        // побитовый унарный NOT
        resultOne = ~numberFortyTwo; // 11010101=~00101010
        resultTwo = ~numberFifteen; //  11110000=~00001111

        //Побитовый AND
        resultOne = numberFortyTwo & numberFifteen; //00001010= 00101010 & 00001111

        //Побитовый AND с присваиванием
        numberFortyTwo &= numberFifteen;  //00001010= 00101010 & 00001111
        numberFortyTwo = 42;

        //Побитовый OR
        resultOne = numberFortyTwo | numberFifteen; //00101111= 00101010 | 00001111

        //Побитовый OR с присваиванием
        numberFortyTwo |= numberFifteen;       //00101111= 00101010 | 00001111
        numberFortyTwo = 42;

        //Побитовый исключающий OR
        resultOne = numberFortyTwo ^ numberFifteen; //00100101= 00101010 ^ 00001111

        //Побитовый исключающий OR с присваиванием
        numberFortyTwo ^= numberFifteen; //00100101= 00101010 ^ 00001111
        numberFortyTwo = 42;

        //Сдвиг вправо
        resultOne = numberFortyTwo >> 3;      //00000101=00101010>>3
        resultTwo = numberFifteen >> 2;       //00000011=00001111>>2

        //Сдвиг вправо с присваиванием
        numberFortyTwo >>= 3;          //00000101=00101010>>3
        numberFifteen >>= 2;           //00000011=00001111>>2
        numberFortyTwo = 42;
        numberFifteen = 15;

        //Сдвиг вправо с заполнением нулями
        resultOne = numberFortyTwo >>> 3;   //00000101=00101010>>3
        resultTwo = numberFifteen >>> 2;    //00000011=00001111>>2

        //Сдвиг вправо с заполнением нулями c присваиванием
        numberFortyTwo >>>= 3;     //00000101=00101010>>3
        numberFifteen >>>= 2;      //00000011=00001111>>2
        numberFortyTwo = 42;
        numberFifteen = 15;

        //Сдвиг влево
        resultOne = numberFortyTwo << 2; //10101000=00101010<<2
        resultTwo = numberFifteen << 2;  //00111100=00001111<<2

        //Сдвиг влево с присваиванием
        numberFortyTwo <<= 2;  //10101000=00101010<<2
        numberFifteen <<= 2;   //00111100=00001111<<2


        numberFortyTwo = -42;
        numberFifteen = -15;

        // побитовый унарный NOT
        resultOne = ~numberFortyTwo; // 00101001=~11010110
        resultTwo = ~numberFifteen;  // 00001110=~11110001

        //Побитовый AND
        resultOne = numberFortyTwo & numberFifteen; //11010000= 11010110 & 11110001

        //Побитовый AND с присваиванием
        numberFortyTwo &= numberFifteen; //11010000= 11010110 & 11110001
        numberFortyTwo = -42;

        //Побитовый OR
        resultOne = numberFortyTwo | numberFifteen; //11110111= 11010110 | 11110001

        //Побитовый OR с присваиванием
        numberFortyTwo |= numberFifteen;       //11110111= 11010110 | 11110001
        numberFortyTwo = -42;

        //Побитовый исключающий OR
        resultOne = numberFortyTwo ^ numberFifteen; //00100111= 11010110 ^ 11110001

        //Побитовый исключающий OR с присваиванием
        numberFortyTwo ^= numberFifteen;             //00100111= 11010110 ^ 11110001
        numberFortyTwo = -42;

        //Сдвиг вправо
        resultOne = numberFortyTwo >> 3;      //11111010=11010110>>3
        resultTwo = numberFifteen >> 2;       //11111100=11110001>>2

        //Сдвиг вправо с присваиванием
        numberFortyTwo >>= 3;          //11111010=11010110>>3
        numberFifteen >>= 2;           //11111100=11110001>>2
        numberFortyTwo = -42;
        numberFifteen = -15;

        //Сдвиг вправо с заполнением нулями
        resultOne = numberFortyTwo >>> 3;   //11111010=11010110>>3
        resultTwo = numberFifteen >>> 2;    //11111100=11110001>>2

        //Сдвиг вправо с заполнением нулями c присваиванием
        numberFortyTwo >>>= 3;     //11111010=11010110>>3
        numberFifteen >>>= 2;      //11111100=11110001>>2
        numberFortyTwo = -42;
        numberFifteen = -15;

        //Сдвиг влево
        resultOne = numberFortyTwo << 2; //10110000=11010110<<2
        resultTwo = numberFifteen << 2;  //11000100=11110001<<2

        //Сдвиг влево с присваиванием
        numberFortyTwo <<= 2;  //10110000=11010110<<2
        numberFifteen <<= 2;   //11000100=11110001<<2

        //float numberFortyTwoWithHalf=42.5f;
        //resultOne = ~numberFortyTwoWithHalf;
        String result1 = toBinaryString(resultOne);
        String result2 = toBinaryString(resultTwo);
        System.out.println(toBinaryString(numberFortyTwo));
        System.out.println(toBinaryString(numberFifteen));
        System.out.println(result1);
        System.out.println(result2);
    }

    static String toBinaryString(int numberDec) {
        String numberBin;
        if (numberDec >= 0) {
            numberBin = String.format("%8s", Integer.toBinaryString(numberDec)).
                    replaceAll(" ", "0");
            return numberBin;
        } else {
            numberBin = Integer.toBinaryString(numberDec).substring(24);
            return numberBin;
        }
    }
}