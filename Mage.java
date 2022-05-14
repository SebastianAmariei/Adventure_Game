
public class Mage extends Creature
{
    private String AirAttack, WaterAttack, FireAttack;
    private int extraGoldDropped = 30;
    
    public Mage(){
        super((Creature.DEFAULT_HP - 5) , "Mystic Mage", (Creature.DEFAULT_DAMAGE + 6), 8, 6);
        this.AirAttack = "Air Bolt";
        this.WaterAttack = "Water Blast";
        this.FireAttack = "Fire Surge";
    }
    
    public int GoldDrop(){
        System.out.println("The Mage has dropped " + (DEFAULT_GOLDDROP + extraGoldDropped) + " Gold");
        return (DEFAULT_GOLDDROP + extraGoldDropped);
    }
    
    public int BlockChance(){//Archer has a 1 in 8 chance to block a hit. And overriding from superclass
        int number =(int)(Math.random() * (BlockChance-1+1) + 1);
        if(number == 2){
            return 0;
        }
        else{
            return 1;
        }
    }
    public int ElementAttack(){//Decides which attack to use
        int number =(int)(Math.random() * (CriticalChance-1+1) + 1);
        if((number >= 1) & (number <= 3)){//if air attack critical hit chance it 1/6
            print("Mage used a Air Attack");
            return CriticalHit(6);
        }
        else if((number >= 4) & (number <= 5)){
            print("Mage used a Water Attack!!!");
            return CriticalHit(4);//if water attack critical hit chance it 1/4
        }
        else{//if fire attack, crititcal hit chance is 1/2
            print("Mage used a Fire Attack!!!!!");
            return CriticalHit(2);
        }
    }
    
    public int CriticalHit(int chance){//Archer has a 1 in 6 chance of hitting a critcal hit. and overriding from super class
        int number =(int)(Math.random() * (chance-1+1) + 1);
        if(number == 1){
            return 2;
        }
        else{
            return 1;
        }
    }
    
    public static void print(String message) {
        System.out.println(message);
        return;
    } 
    
    //Getters/Setters
    public String getAirAttack(){
        return AirAttack;
    }
    
    public String getWaterAttack(){
        return WaterAttack;
    }
    
    public String getFireAttack(){
        return FireAttack;
    }
    
    public int getGoldDropped(){
        return DEFAULT_GOLDDROP + extraGoldDropped;
    }
}
