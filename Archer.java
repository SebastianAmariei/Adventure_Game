
public class Archer extends Creature
{
    private String SpecialAttack;
    private int extraGoldDropped = 15;
     
    public Archer(){
        super((Creature.DEFAULT_HP + 25) , "Accurate Archer", (Creature.DEFAULT_DAMAGE + 1), 5, 8);
        this.SpecialAttack = "Double Shot";
    }
    
    public int GoldDrop(){
        System.out.println("The Archer has dropped " + (DEFAULT_GOLDDROP + extraGoldDropped) + " Gold");
        return (DEFAULT_GOLDDROP + extraGoldDropped);
    }
    
    public int BlockChance(){//Archer has a 1 in 5 chance to block a hit. And overriding from superclass
        int number =(int)(Math.random() * (BlockChance-1+1) + 1);
        if(number == 2){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public boolean DoubleShot(){//Archer has a 1 in 8 chance to doubleshot
        int number =(int)(Math.random() * (CriticalChance-1+1) + 1);
        if(number == 3){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int CriticalHit(){//Archer has a 1 in 6 chance of hitting a critcal hit. and overriding from super class
        int number =(int)(Math.random() * (6-1+1) + 1);
        if(number == 3){
            return 2;
        }
        else{
            return 1;
        }
    }
   
    //Getters/Setters
    public String getSpecialAttack(){
        return SpecialAttack;
    }
    
    public int getGoldDropped(){
        return DEFAULT_GOLDDROP + extraGoldDropped;
    }
}
