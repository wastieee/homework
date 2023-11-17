//Определение времени суток: Пользователь вводит текущее время (часы), программа должна определить, утро, день, вечер или ночь.
//Входные данные 14
//
//Результат День
public class third2 {
    public static void main(String[] args) {
        int target = 14;
        outer:

        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j < 6; j++) {
                if (i ==target) {
                    System.out.println("Резултат день ");
                    break outer;




                    }
                }
            }


        }


    }