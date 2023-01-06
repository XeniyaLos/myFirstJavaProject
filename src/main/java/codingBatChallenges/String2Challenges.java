package codingBatChallenges;

public class String2Challenges {
    public static void main(String[] args) {
        boolean answer = catDog("catsomedogcat");
        System.out.println(answer);
    }

    public static boolean catDog(String str) {
        int counterCat = 0;
        int counterDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                counterCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                counterDog++;
            }
        }

        if (counterCat == counterDog) {
            return true;
        } else {
            return false;
        }
    }
}
