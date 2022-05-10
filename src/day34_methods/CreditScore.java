package day34_methods;

public class CreditScore {

    public static void main(String[] args) {

        getCreditScore();   // this value is not used
        int sore = getCreditScore();
        System.out.println(sore);
        System.out.println(getCreditScore());
        System.out.println(getCreditScore()+50);

        System.out.println(isGoodCreditScore(720));
        System.out.println(isGoodCreditScore(680));
        System.out.println(isGoodCreditScore(getCreditScore()));
        System.out.println(isGoodCreditScore(500) ? "Good score" : "Bad score");
    }

    public static int getCreditScore() {
        return 800;
    }

    public static boolean isGoodCreditScore(int creditScore){

        if(creditScore >= 700){
            return true;
        } else {
            return false;
        }
    }
}
