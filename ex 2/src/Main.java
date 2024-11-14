import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Оцените приложение");
            int rating = scanner.nextInt();
            if (rating == 1){
                System.out.println("спасибо за отзыв будем стараться лучше");
            }
            else if (rating == 2){
                System.out.println("спасибо за отзыв будем мы будем работать над улучшениями");
            }
            else if (rating == 3){
                System.out.println("спасибо за нейтральный отзыв мы будем работать над улучшениями");
            }
            else if (rating == 4){
                System.out.println("спасибо за отзыв, мы очень рады что вам понравилось приложение ");
            }
            else if (rating == 5){
                System.out.println("спасибо за отзыв  ");
            }
            else{11
                System.out.println("error");
            }
        }
    }
}