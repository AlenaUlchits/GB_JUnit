public class CompareVal {
    private final int[] array1;
    private final int[] array2;

    public CompareVal(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public String compareAv() {
        double avrVal1 = getAvr(array1);
        double avrVal2 = getAvr(array2);

        if (avrVal1 > avrVal2) {
            return "Первый список имеет большее среднее значение";
        } else if (avrVal2 > avrVal1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private double getAvr(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return (double) sum / array.length;
    }
}
