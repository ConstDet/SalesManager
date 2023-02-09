public class Main {
    public static void main(String[] args) {
        long[] sales = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальное число в массиве: " + salesManager.max());
    }
}