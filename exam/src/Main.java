import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int temperature = random.nextInt(41);
        System.out.println("Температура:" + temperature);
        String mode;
        if (temperature > 25){
            mode = "cool";
        } else if (temperature >= 8 && temperature <= 24) {
            mode = "off";
        }
        else {
            mode = "heat";

        }
        System.out.println("Режим кондея: " + mode);
    }
}