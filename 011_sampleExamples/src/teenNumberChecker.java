public class teenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(1,100,13));
    }

    public static boolean hasTeen(int first, int second, int third){
        if ((first >= 13) && (first <= 19)){
            return true;
        }else if ((second >= 13) && (second <= 19)){
            return true;
        }else if ((third >= 13) && (third <= 19)){
            return true;
        }
        return false;
    }
}
