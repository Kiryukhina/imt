public class BmiService {

    public int calculate(double height, int weight) {
        double result;
        result = (int) (weight / (height*height));
        return (int) result;
    }
}
