package EI;

import TDAs.LinkedStack;

public class EI02_Player {
    private String name;
    private String classe;
    private int totalKills=0;
    LinkedStack<EI02_Game> games_records = new LinkedStack<>();
    public EI02_Player(){}
    public EI02_Player(String name,String classe ){
        this.name=name;
        this.classe=classe;

    }

    public String getName(){
        return name;
    }
    public String getClasse(){
        return classe;
    }
    public int getTotalKills(){
        return totalKills;
    }
    public void addTotalKills(int kills){
        totalKills+=kills;
    }
    public void addGameRecords(EI02_Game game){
        games_records.push(game);
    }
    public EI02_Game seeLastGame(){
        return games_records.top();
    }


}
