import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a = "Да";
        String b = "Гейминг";
        String с = "Графика";


        PC pc1 = new PC("Alienware", "Intel Core i9", "Nvidia RTX 2080 Ti", "200GB", "Water Cooler");
        PC pc2 = new PC("Invasion", "Intel Xeon E5-2600 v4", "NVIDIA Quadro P6000", "124GB", "Air Cooler");

        System.out.println(pc1);
        System.out.println(pc2);

        Scanner scan = new Scanner(System.in);
        System.out.println("Привет ты уже ознкомился со списком ПК, мы поможем тебе выбрать, готов ли ты?");

        String ph1 = scan.nextLine();

        if (ph1.equals(a)) {
            System.out.println("Отлично идем дальше");
            System.out.println("Какова твоя цель Гейминг или Работа с графикой?");
        } else {
            System.out.println("Ошибка 1");
        }

        String ph2 = scan.nextLine();

        if (ph2.equals(b)) {
            System.out.println("Удачной тебе игры, также поздровляю тебя с подписанием контракта на пожизненное питание доширками");
            System.out.println(pc1);
        } else if (ph2.equals(с)) {
            System.out.println("Ты у нас дизайер тогда этот выбор для тебя");
            System.out.println(pc2);
        } else {
            System.out.println("Ошибка 2");
        }
    }
}

