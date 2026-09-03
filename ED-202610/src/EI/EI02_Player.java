package EI;

import TDAs.LinkedStack;

public class EI02_Player {
    private String name;
    private String classe;
    private int totalKills=0;

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



}
