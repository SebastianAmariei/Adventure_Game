
public abstract class Creature
{
    public static final int DEFAULT_GOLDDROP = 20, DEFAULT_HP = 35, DEFAULT_DAMAGE = 3;
    
    protected int Hp, Damage, BlockChance, CriticalChance;
    protected String Name;
 
    public Creature(int Hp, String Name, int Damage, int BlockChance, int CriticalChance){
        super();
        this.Hp = Hp;
        this.Name = Name;
        this.Damage = Damage;
        this.BlockChance = BlockChance;
        this.CriticalChance = CriticalChance;

    }
    
    public int GoldDrop(){//overriden
        System.out.println(DEFAULT_GOLDDROP + "Has Dropped");
        return DEFAULT_GOLDDROP;
    }
    public int BlockChance(){//overriden
        return 1;
    }
    public int CriticalHit(){//overridden
        return 1;
    }
    public boolean DoubleShot(){//overridden
        return false;
    }
    public int ElementAttack(){//overridden
        return 1;
    }
    
    
    //Getter/Setters
    public void setHp(int newHp){
        Hp = newHp;
    }
    public int getHp(){
        return Hp;
    }
    
    public void setName(String newName){
        Name = newName;
    }
    public String getName(){
        return Name;
    }
    
    public void setDamage(int newDamage){
        Damage = newDamage;
    }
    public int getDamage(){
        return Damage;
    }
}
