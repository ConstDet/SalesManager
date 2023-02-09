public class SalesManager {
    protected long[] sales;
    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public double cutAverage() {
        double sumArray = 0;
        int count = 0, min = this.min(), max = this.max();
        for (int sale : sales) {
            if (sale != min && sale != max) {
                sumArray += sale;
                count++;
            }
        }
        return sumArray / count;
    }
}
