import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String [] choices ={"Камень","Ножницы","Бумага"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int compChoice = random.nextInt(choices.length);//Генерирует случайный индекс от 0 до размера массива

        System.out.println("Начало игры");
        System.out.println("Выберите вариант");
        System.out.println("0. Камень\n"+"1.Ножницы\n"+"2.Бумага\n");
        int playerChoice = scanner.nextInt();
        System.out.println(compChoice);
        if (playerChoice == compChoice){
            System.out.println("Ничья");
        } else if (playerChoice == 0 && compChoice == 1 || playerChoice ==1 && compChoice == 2 || playerChoice == 2 && compChoice == 0) {
            System.out.println("Победил игрок");
        }else {
            System.out.println("Победил компьютер");
        }
    }
}