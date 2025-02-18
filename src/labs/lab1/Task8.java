package Tasks.lab1;//Вам предоставлены два списка длиной по 20 элементов каждый.
// Первый список содержит правильные ответы на вопросы теста, где каждый ответ —
// это одна из букв от A до D. Второй список содержит ответы студента на те же вопросы.
// Ваша задача — написать программу, которая сравнивает ответы студента с правильными ответами и
// подсчитывает количество правильных и неправильных ответов студента.
//Задача: Подсчитать и вывести количество правильных и неправильных ответов студента.
//Пример:
//Ввод:
//correct_answers = ["A", "C", "B", "D", "A", "B", "C", "D", "A", "C", "B", "D", "A", "B", "C", "D", "A", "C", "B", "D"]
//student_answers = ["A", "D", "B", "C", "A", "B", "D", "C", "A", "C", "B", "D", "A", "B", "C", "D", "A", "B", "C", "D"]

public class Task8 {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "C", "B", "D", "A", "B", "C", "D", "A", "C",
                "B", "D", "A", "B", "C", "D", "A", "C", "B", "D"};

        String[] studentAnswers = {"A", "D", "B", "C", "A", "B", "D", "C", "A", "C",
                "B", "D", "A", "B", "C", "D", "A", "B", "C", "D"};

        int correctCount = 0;
        int incorrectCount = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equals(studentAnswers[i])) {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }

        // Вывод результатов
        System.out.println("Правильные ответы: " + correctCount);
        System.out.println("Неправильные ответы: " + incorrectCount);
    }
}
