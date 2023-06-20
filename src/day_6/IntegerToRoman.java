package src.day_6;

public class IntegerToRoman {
    public String intToRoman(int num) {
        // thousand[0] = ""
        // thousand[1] = "M"
        String[] thousands = {"", "M", "MM", "MMM", "MMMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String thousand = thousands[num / 1000];
        String hundred = hundreds[(num / 100) % 10];
        String ten = tens[(num / 10) % 10];
        String one = ones[num % 10];
        return thousand + hundred + ten + one;
    }
    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(1994));
    }
}
