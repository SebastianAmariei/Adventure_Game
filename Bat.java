
public class Bat extends Creature
{
    
    public Bat(){
        super(Creature.DEFAULT_HP , "Big Bat", Creature.DEFAULT_DAMAGE, 3, 8);
    }
    
    public int GoldDrop(){
        System.out.println("The bat has dropped " + DEFAULT_GOLDDROP + " Gold");
        return (DEFAULT_GOLDDROP);
    }
    
    public int BlockChance(){//Bat has a 1 in 3 chance to block a hit
        int number =(int)(Math.random() * (BlockChance-1+1) + 1);
        if(number == 2){
            return 0;
        }
        else{
            return 1;
        }
    }
 
    public int CriticalHit(){//Bat has a 1 in 8 chance of hitting a critcal hit
        int number =(int)(Math.random() * (CriticalChance-1+1) + 1);
        if(number == 3){
            return 2;
        }
        else{
            return 1;
        }
    }
   
}
