public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(17, 30, 45));
        System.out.println(hasTeen(46, 30, 45));
        System.out.println(hasTeen(27, 30, 45));
        System.out.println(hasTeen(50, 30, 16));
        System.out.println(isTeen(50));
        System.out.println(isTeen(15));
        System.out.println(isTeen(14));


    }

    private static boolean hasTeen(int num1, int num2, int num3) {

        if (num1 >= 13 && num1 <= 19) {
            return true;

        } else if (num2 >= 13 && num2 <= 19) {
            return true;
        } else if (num3 >= 13 && num3 <= 19) {
            return true;
        } else {
            return false;
        }


    }
    private static boolean isTeen( int num4){
        if (num4 >= 13 && num4 <= 19){
            return true;
        }else{
            return false;
        }
    }
}
