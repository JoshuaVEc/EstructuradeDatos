package EI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class EI02_GameMain {
    public static void main(String[] args) {
        EI02_GameController game = new EI02_GameController();
        ArrayList<EI02_Player> players = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do {
            printInterface();

            int option = input.nextInt();
            input.nextLine();
            if (option == 5) {
                break;
            }
            switch (option) {
                case 1: {

                    System.out.println("Player name: ");
                    String name = input.nextLine();
                    System.out.println("Player Class: ");
                    String classe = input.nextLine();
                    EI02_Player player = new EI02_Player(name, classe);

                    game.addPlayerQueue(player);
                    queueInfo(game);
                    break;
                }
                case 2: {
                    if(game.getPlayerQueue().size() == 0){
                        System.out.println("No player in queue");
                        break;
                    }else {
                        players.add(game.getFirstPlayer());
                    logPlayer(game);

                    break;}
                }
                case 3: {
                    if (players.size() <=1) {
                        System.out.println("Not enought players in the match");
                        break;
                    } else {
                        StartGame(game, players);
                        break;}
                }
                case 4: {
                    if(game.games_records.size() == 0){
                        System.out.println("No match yet played");
                        break;
                    } else {
                    EI02_Game gamerecord = game.seeLastGame();
                    System.out.println("Last Match");
                    System.out.println("Winner: " + gamerecord.getVictor() + " Time(s): " + gamerecord.getTimeSeconds() +" s");
                    break;}
                }
                case 5: {
                    System.out.println("Closing game... ");
                }
                default:{
                    System.out.println("Invalid option");
                }
            }

        }while(true);



    }
    public static void queueInfo(EI02_GameController game) {

        System.out.println("First Player in Queue: " + game.getFirstPlayer().getName() + ", Players in Queue: " + game.getQueueSize());

    }
    public static void logPlayer(EI02_GameController game) {

        EI02_Player firstPlayer = game.getFirstPlayer();
        System.out.println( firstPlayer.getName() + " has enter the match");
        game.enterPlayerGame();

    }
    public static void printInterface(){
        System.out.println("Game Hub");
        System.out.println("Options: ");
        System.out.println("1. Add player to the queue ");
        System.out.println("2. log first player in queue to the game ");
        System.out.println("3. Start Game ");
        System.out.println("4. Show latest games played");
        System.out.println("5. Quit");
    }
    public static void StartGame(EI02_GameController game, ArrayList<EI02_Player> players){
        Random rand = new Random();
        System.out.println("Game started! ");
        EI02_Game game1 = new EI02_Game();
        int randomIndex= rand.nextInt(players.size());
        double randomTime= rand.nextDouble(((1000-300)+1)+300);
        EI02_Player winner=players.get(randomIndex);
        game1.setVictory("Winner: "+ winner.getName() + " Class: " + winner.getClasse());
        game1.setTimeSeconds(randomTime);



        System.out.println("Game over! ");
        game.addGameRecords(game1);
    }
}
