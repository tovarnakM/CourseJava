public class flourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(6,2,17));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if (bigCount * 5 + smallCount == goal) {
            return true;
        }
        if (bigCount * 5 + smallCount > goal) {
            return smallCount >= goal % 5;
        }
        return false;
    }
}
