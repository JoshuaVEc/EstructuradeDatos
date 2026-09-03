package EI;

import TDAs.LinkedQueue;
import TDAs.LinkedStack;


public class EI02_GameController {
    LinkedQueue<EI02_Player> players_in_Queue = new LinkedQueue<>();
    LinkedStack<EI02_Game> games_records = new LinkedStack<>();

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


    public LinkedStack<EI02_Game> getGames_records() {
        return games_records;
    }


    public void addGameRecords(EI02_Game game){
        games_records.push(game);
    }
    public EI02_Game seeLastGame(){
        return games_records.top();
    }




}
