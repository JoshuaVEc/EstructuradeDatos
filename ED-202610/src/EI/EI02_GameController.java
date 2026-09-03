package EI;

import TDAs.LinkedQueue;


public class EI02_GameController {
    LinkedQueue<EI02_Player> players_in_Queue = new LinkedQueue<>();


    public EI02_GameController() {}


    public void addPlayerQueue(EI02_Player player){
        players_in_Queue.enqueue(player);
    }
    public EI02_Player enterPlayerGame(){
        EI02_Player firstPlayer = players_in_Queue.first();
        players_in_Queue.dequeue();
        return firstPlayer;

    }
    public int getQueueSize(){
        return players_in_Queue.size();
    }
    public LinkedQueue<EI02_Player> getPlayerQueue(){
        return players_in_Queue;
    }
    public EI02_Player getFirstPlayer(){
        return players_in_Queue.first();
    }
    public void StartGame(boolean victory, double time){
        EI02_Game game = new EI02_Game();
    }





}
