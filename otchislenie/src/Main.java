public class Main{

    public static void main(String[] args) {
        // Стоимость 6 месяцев обучения
        double semesterCost = 160000;

        // Количество семестров в году
        int semestersPerYear = 2;

        // Количество лет обучения
        int yearsOfStudy = 4;

        // Рассчитываем общую стоимость обучения
        double totalCost = semesterCost * semestersPerYear * yearsOfStudy;

        // Выводим результат
        System.out.println("Общая стоимость обучения за 4 года: " + totalCost);
    }
}