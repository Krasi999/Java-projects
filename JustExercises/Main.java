package JustExercises;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Ivan", 200, 30);
        Orc orc1 = new Orc("Jaja", 180, 60);
        Elf elf1 = new Elf("Rudolf", 240, 45);

        human1.ShowInfo();
        orc1.ShowInfo();
        elf1.ShowInfo();
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Enter 1 for attack or 2 for special ability: ");
            int humanAns = scanner.nextInt();
            switch (humanAns){
                case 1: {
                    human1.attack(orc1);
                    break;
                }
                case 2: {
                    human1.useAbility(human1);
                    break;
                }
                default:{
                    System.out.println("This is invalid option! You lose your turn, sorry!");
                    break;
                }
            }

            System.out.println();
            human1.ShowInfo();
            orc1.ShowInfo();
            elf1.ShowInfo();
            System.out.println();

            System.out.print("Enter 1 for attack or 2 for special ability: ");
            int orcAns = scanner.nextInt();
            switch (orcAns){
                case 1:{
                    orc1.attack(elf1);
                    break;
                }
                case 2: {
                    orc1.useAbility(orc1);
                    break;
                }
                default:{
                    System.out.println("This is invalid option! You lose your turn, sorry!");
                    break;
                }
            }

            System.out.println();
            human1.ShowInfo();
            orc1.ShowInfo();
            elf1.ShowInfo();
            System.out.println();

            System.out.print("Enter 1 for attack or 2 for special ability: ");
            int elfAns = scanner.nextInt();
            switch (elfAns){
                case 1: {
                    elf1.attack(human1);
                    break;
                }
                case 2:{
                    elf1.useAbility(orc1);
                    break;
                }
                default:{
                    System.out.println("This is invalid option! You lose your turn, sorry!");
                    break;
                }
            }

            System.out.println();
            human1.ShowInfo();
            orc1.ShowInfo();
            elf1.ShowInfo();
            System.out.println();
        }

        human1.Winner(orc1, elf1);
        orc1.Winner(human1, elf1);
        elf1.Winner(human1, orc1);
    }
}
