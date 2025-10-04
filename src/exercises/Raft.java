package exercises;

// този клас съдържа логиката за намиране на минимален капацитет

import java.util.Scanner;

public class Raft {
    // функция, която проверява дали даден капацитет е достатъчен за К курса

    public static boolean canTransport(int[] goats, int K, int capacity) {

        // копираме масива с теглата на козичките, за да не променяме оригинала
        int[] sorted = java.util.Arrays.copyOf(goats, goats.length);

        // сортираме масива по нарастващ ред
        java.util.Arrays.sort(sorted);

        // обръщаме реда на масива, за да стане низходящо (най-тежката козичка първа)
        for (int i = 0; i < sorted.length / 2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[sorted.length - 1 - i];
            sorted[sorted.length - 1 - i] = temp;
        }

        // масив, който отбелязва кои козички вече са пренесени

        boolean[] used = new boolean[sorted.length];

        int trips = 0; // броят на курсовете, започваме от 0
        int i = 0; // индекс за най - тежката невзета козичка

        // докато има козички за пренасяне
        while (i < sorted.length) {
            trips++; // започваме нов курс
            int total = 0; // теглото на сал за текущия курс

            // минаваме през всички козички от текущата към края
            for (int j = 0; j < sorted.length; j++) {

                // ако козичката не е пренесена и се побира в сал
                if (!used[j] && total + sorted[j] <= capacity) {
                    total = total + sorted[j]; // добавяме козичката на сал
                    used[j] = true; // отбелязваме, че е пренесена
                }
            }

            // придвижваме индекса i към следващата най - тежка невзета козичка
            while (i < sorted.length && used[i]) {
                i++;
            }
        }

        // връщаме true, ако броят на курсовете е <= К
        return trips <= K;
    }

    // функция за намиране на минималния капацитет на сал
    public static int minimalCapacity(int[] goats, int K) {

        // най - малко възможен капацитет = теглото на най-тежката козичка
        int low = java.util.Arrays.stream(goats).max().getAsInt();

        // най - голям възможен капацитет = сумата от всички козички
        int high = java.util.Arrays.stream(goats).sum();

        int answer = high; // променлива за най - малкия намерен капацитет

        // бинарно търсене между low и high

        while (low <= high) {
            int mid = (low + high) / 2; // средният капацитет за проверка

            // проверяваме дали mid е достатъчен
            if (canTransport(goats, K, mid)) {
                answer = mid; // запазваме го като възможен отговор
                high = mid - 1; // пробваме по - малък капацитет
            } else {
                low = mid + 1; // капацитетът е малък --> увеличаваме
            }
        }
        return answer; // връщаме минималния достатъчен капацитет
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // създаваме обект за четене на вход

        int N = scanner.nextInt(); // четем брой козички
        int K = scanner.nextInt(); // четем максимален брой курсове

        int[] goats = new int[N]; // масив за теглата на козичките

        // четем теглата на всички козички
        for (int i = 0; i < N; i++) {
            goats[i] = scanner.nextInt();
        }

        // извикваме функцията от клас Raft за минимален капацитет
        int minCapacity = Raft.minimalCapacity(goats, K);

        // отпечатваме резултата
        System.out.println(minCapacity);
    }
}


