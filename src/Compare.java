import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Compare {
    @Test
    public void compareAverage() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        CompareVal compare = new CompareVal(array1, array2);
        String result = compare.compareAv();

        assertEquals("Первый список имеет большее среднее значение", результат);
    }
}

