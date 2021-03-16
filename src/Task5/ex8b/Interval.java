package Task5.ex8b;

public class Interval {
    private int start, finish;
    private boolean isInclude;


    Interval(int start, int end, boolean isInclude) {
        this.start = start;
        this.finish = end;
        this.isInclude = isInclude;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public boolean isInclude() {
        return isInclude;
    }

    public void setInclude(boolean include) {
        isInclude = include;
    }

    @Override
    public String toString() {
        String s1, s2;
        if (isInclude) {
            s1 = "[";
            s2 = "]";
        } else {
            s1 = "(";
            s2 = ")";
        }
        return s1 + start + "; " + finish + s2;
    }

    void combine(Interval inter) {
        System.out.println(this + "\t" + inter);
        if (start < inter.getFinish() && inter.getStart() < finish) {
            int x = Math.min(start, inter.getStart());
            int y = Math.max(finish, inter.getFinish());
            System.out.println("Объединение: " + x + "..." + y);
        } else System.out.println("Нету точек пересечения.");
    }

    void crossing(Interval inter) {
        System.out.println(this + "\t" + inter);
        int x = Math.max(start, inter.getStart());
        int y = Math.min(finish, inter.getFinish());
        if (x < y) System.out.println("Пересечение: " + x + "..." + y);
        else System.out.println("Нету точек пересечения.");
    }
    void startFinish(Interval inter) {
        System.out.println(this + "\t" + inter);
        int min = 0;
        int max = 0;
        int x = Math.min(start, inter.getStart());
        if (x < min) {
            min = x;
        }
        int y = Math.max(finish, inter.getFinish());
        if (y > max){
            max = y;
        }
        System.out.println("Расстояние между самыми удаленными концами: " + x + "..." + y);

    }
}

