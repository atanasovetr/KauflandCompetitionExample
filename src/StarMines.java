import java.util.Scanner;

public class StarMines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sizes = scan.nextLine().split(",");
        Table t1 = new Table(Integer.parseInt(sizes[0]), Integer.parseInt(sizes[1]));

        while(true){
            String command = scan.nextLine();
            if(command.equals("GAME OVER")){
                break;
            }

            String takeDamage[]= command.split(",");
            t1.attackingCell(Integer.parseInt(takeDamage[0]),
                             Integer.parseInt(takeDamage[1]),
                             Integer.parseInt(takeDamage[2]));
        }
        t1.printTable();
    }
}
