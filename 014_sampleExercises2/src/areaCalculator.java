public class areaCalculator {

    public static void main(String[] args) {

        System.out.println(area(-1,4));

    }
    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        double PI = 3.14159;
        double areaCircle = radius * radius * PI;
        return areaCircle;

    }
    public static double area(double x, double y){
        if ((x < 0) || (y < 0)){
            return -1;
        }
        double areaRectangle = x * y;
        return areaRectangle;
    }
}
