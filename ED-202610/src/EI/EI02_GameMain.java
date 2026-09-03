package EI;

public class EI02_GameMain {
    public static void main(String[] args) {
        EI02_GameController game = new EI02_GameController();
        EI02_Player player1 = new EI02_Player("Saul", "Mago");
        EI02_Player player2 = new EI02_Player("Martin", "Perro");
        EI02_Player player3 = new EI02_Player("Matias", "Ingeniero");

            game.addPlayerQueue(player1);
            System.out.println("First Player in Queue: " + game.getFirstPlayer().getName() +
                    ", Players in Queue: " + game.getQueueSize());
            game.addPlayerQueue(player2);
            System.out.println("A Player has enter the matchmaking.");
            System.out.println("First Player in Queue: " + game.getFirstPlayer().getName() + ", Players in Queue: " + game.getQueueSize());
            EI02_Player firstPlayer = game.getFirstPlayer();
            game.enterPlayerGame();
            System.out.println(firstPlayer.getName() + " has enter the game " + ", Players in Queue: " + game.getQueueSize());
            game.addPlayerQueue(player3);
            System.out.println("A Player has enter the matchmaking.");
            System.out.println("First Player in Queue: " + game.getFirstPlayer().getName() + ", Players in Queue: " + game.getQueueSize());
            firstPlayer = game.getFirstPlayer();
            game.enterPlayerGame();
            System.out.println(firstPlayer.getName() + " has enter the game " + ", Players in Queue: " + game.getQueueSize());
            firstPlayer = game.getFirstPlayer();
            System.out.println(firstPlayer.getName() + " has enter the game " + ", Players in Queue: " + game.getQueueSize());


    }
    public static void queueInfo(){
        System.out.println("---------------------");
        System.out.println("First Player in Queue: ");

    }
}
