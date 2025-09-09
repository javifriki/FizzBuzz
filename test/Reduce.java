public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(1000));
    }

    public static int reduce(int n){
        return reducing(n, 0);
    }

    private static int reducing(int n, int step){
        if (n == 0){
            return step;
        } else if (n % 2 == 1){
            n--;
        } else {
            n /= 2;
        }
        step++;
        return reducing(n, step);
    }
}
