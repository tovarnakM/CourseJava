public class playingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,45));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if ((temperature < 25) || (temperature > 45)){
            return false;
        }
        if (!summer){
            return temperature <= 35;
        }else {
            return true;
        }
    }
}
