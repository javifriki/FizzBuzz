public class Multiples {
    public static int main(String[] args){
        return multiples();
    }

    public static int multiples(int n, int a, int b) {
        int numMultiples = 0;

        for (int i = 1; i < n; i++) {

            // Find out which numbers divide i.
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB){

                numMultiples++;

            }
        }

        return numMultiples;
    }

    public static int multiples() {
        int numMultiples = 0;

        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5){

                numMultiples++;

            }
        }

        return numMultiples;
    }
}
