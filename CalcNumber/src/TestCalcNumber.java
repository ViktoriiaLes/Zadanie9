public class TestCalcNumber {
    public static void main(String[] args) {
       int num=123456;
        System.out.println("Suma cyfr liczby "+num+" jest "+CalcNumber.getSum(num));
        int num1=987;
        System.out.println("Suma cyfr liczby "+num1+" jest "+CalcNumber.getSum(num1));
        int num2=1111;
        System.out.println("Suma cyfr liczby "+num2+" jest "+CalcNumber.getSum(num2));
        int num3=00012;
        System.out.println("Suma cyfr liczby "+num3+" jest "+CalcNumber.getSum(num3));
    }
}
