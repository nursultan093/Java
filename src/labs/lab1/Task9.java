package Tasks.lab1;

//Вам дан список, представляющий количество часов, отработанных сотрудником в
// каждый рабочий день за месяц. Часы работы могут варьироваться от 30 до 40 часов в
// неделю или быть равными 0, если сотрудник не работал в этот день. Учитывая,
// что рабочая неделя состоит из 5 дней (суббота и воскресенье — выходные),
// задача состоит в том, чтобы вычислить общее количество отработанных часов за каждую из четырех недель месяца,
// а также среднее количество отработанных часов в день, исходя из фактически отработанных дней.
public class Task9 {

    public static void main(String[] args) {
        int[] hoursWorked = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};
        calculateWorkHours(hoursWorked);
    }

    public static void calculateWorkHours(int[] hoursWorked) {
        int totalHours = 0;
        int daysWorked = 0;
        int weekHours = 0;
        int weekCount = 1;

        for (int i = 0; i < hoursWorked.length; i++) {
            if ((i % 5 == 0) && (i != 0)) {
                System.out.println(weekCount + "- " + weekHours);
                weekHours = 0;
                weekCount++;
            }
            if (hoursWorked[i] > 0) {
                totalHours += hoursWorked[i];
                daysWorked++;
            }
            weekHours += hoursWorked[i];
        }
        if (weekHours > 0) {
            System.out.println(weekCount + "- " + weekHours);
        }

        double averageHoursPerDay = (double) totalHours / daysWorked;
        System.out.println("Среднее количество часов в день (учитывая только рабочие дни): " + averageHoursPerDay);
    }
}
