package EI;

import TDAs.LinkedQueue;
import TDAs.LinkedStack;

public class EI02_GameController {
    LinkedQueue<EI02_Player> players_in_Queue = new LinkedQueue<>();


    public EI02_GameController() {}
    public void startGame(){
        EI02_Game game = new EI02_Game();

    }

    public void addPlayerQueue(EI02_Player player){
        players_in_Queue.enqueue(player);
    }
    public EI02_Player enterFirstPlayerGame(){
        EI02_Player firstPlayer = players_in_Queue.first();
        players_in_Queue.dequeue();
        return firstPlayer;

    }
    public int getQueueSize(){
        return players_in_Queue.size();
    }






}
