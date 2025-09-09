package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(1000, 0));
    }

    private static int reduce(int n, int step){
        if (n == 0){
            return step;
        } else if (n % 2 == 1){
            n--;
        } else {
            n /= 2;
        }
        step++;
        return reduce(n, step);
    }
}
