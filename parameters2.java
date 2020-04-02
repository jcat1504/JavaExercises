//multiple parameters example
class parameters2 {
    public static void main(String[] args) {
    printNumber(4, 9);
    printNumber(17, 6);
    printNumber(8, 0); //this one will not print
    printNumber(0, 8);
}

public static void printNumber(int number, int count) {
    for (int i = 1; i <= count; i++){
        System.out.print(number);
    }
    System.out.println();
    }
}