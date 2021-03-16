package Task5.ex8b;

/*
Определить класс Интервал с учетом включения/невключения концов.
Создать методы по определению пересечения и объединения интервалов,
причем интервалы, не имеющие общих точек, пересекаться/объединятся
не могут. Объявить массив/список/множество и n интервалов и определить
расстояние между самыми удаленными концами.
 */
public class Main {
    public static void main(String[] args) {

        Interval[] intervals = new Interval[5];
        intervals[0] = new Interval(1, 6, true);
        intervals[1] = new Interval(-3, 1, false);
        intervals[2] = new Interval(0, 9, false);
        intervals[3] = new Interval(7, 13, true);
        intervals[4] = new Interval(-5, 5, true);

        for (int i = 0; i < intervals.length; i++) {
            intervals[i].combine(intervals[i + 1]);
            intervals[i].crossing(intervals[i + 1]);
            intervals[i].startFinish(intervals[i + 1]);
        }
    }
}
