
public class Player extends Creature
{
    private String Armour, Sword;
    
    public Player(){
        super((Creature.DEFAULT_HP + 15) , "Jack", (Creature.DEFAULT_DAMAGE + 4), 3, 4);
        this.Armour = "Bronze Armour";
        this.Sword = "Dagger";
        
    }
    
    public int GoldDrop(){
        System.out.println("You Have died, therefore you lost " + DEFAULT_GOLDDROP + " Gold");
        return -(DEFAULT_GOLDDROP);
    }
    
    public int BlockChance(){//Bronze armour has a 1 in 3 chance to block a hit
        int number =(int)(Math.random() * (BlockChance-1+1) + 1);
        if(number == 1){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public int CriticalHit(){//Dagger has a 1 in 4 chance of hitting a critcal hit
        int number =(int)(Math.random() * (CriticalChance-1+1) + 1);
        if(number == 1){
            return 2;
        }
        else{
            return 1;
        }
    }
    
    //Getters And Setters
    public String getArmour(){
        return Armour;
    }
    
    public String getSword(){
        return Sword;
    }
    
 
}
