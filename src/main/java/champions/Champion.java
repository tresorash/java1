package champions;

public class Champion {

    private String player;
    
    private boolean aPerdu;
    
    private int victory;
    
    public Champion(String player) {
        this.player = player;
        this.victory = 5;
        this.aPerdu = false;
    }
    
    public String getPlayer() {
        return player;
    }
    
    public void setPlayer(String player) {
        this.player = player;
    }
    
    public int getVictory() {
        return victory;
    }
    
    public void setVictory(int victory) {
        this.victory = victory;
    }
    
    public boolean aPerdu() {
        return aPerdu;
    }
    
    public void setAPerdu(boolean aPerdu) {
        this.aPerdu = aPerdu;
    }
    
    public void attack(Champion champion) {
      
        int degats = (int) (Math.random() *2);
        if (this.aPerdu()) {
            degats = degats * 5;
            this.aPerdu = false;
        }
        int initialChampionVictory = champion.getVictory();
        int VictoryAfterAttack = initialChampionVictory - degats;
        champion.setVictory(VictoryAfterAttack);
        System.out.println(this.getPlayer() + " attaque aufensive " + champion.getPlayer());
  
    }
    
    public void steroid() {
        this.aPerdu = true;
    
}
}