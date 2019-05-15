import java.util.ArrayList;
import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        //Skapar en arryalist där jag kan spara både namn och poäng med hjälp av en egen data typ
        Scanner tgb = new Scanner(System.in);
        ArrayList<playerData> players = new ArrayList<>();
        playerData data = new playerData("????", 0);
        players.add(data);
        do {
            data = new playerData("???", 0);
            System.out.println("What's your name?");
            data.setName(tgb.nextLine());
            System.out.println("Type in a score, enter -1 to quit");
            data.setScore(tgb.nextInt());
            tgb.nextLine();
            if (data.getScore() != -1) {
                //Sätter in datan i listan beroende på om den är större eller mindre än dem andra värderna
                int size = players.size();
                for (int i = 0 ; i<size ; i++) {
                    if (data.getScore() > players.get(i).getScore()) {
                        players.add(i,data);
                        break;
                    }
                }
                for (playerData player : players) {
                    System.out.println(player.getName() + " : \n" + player.getScore());
                }
            }
        } while (data.getScore() != -1);
    }
}
