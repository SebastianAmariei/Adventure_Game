import java.util.Scanner;

public class Game
{
    public static void main(String args[]){
        print("The aim of the Game is to defeat the creatures that appear");
        String answer;
        boolean flag = true;
        while(flag == true){
            answer = inputString("Would you like to Play, Read Characters Statistics or End?");
            if(answer.equalsIgnoreCase("Play")){
                String dif;
                boolean flag1 = true;
                while(flag1 == true){ 
                    dif = inputString("Choose a difficulty(Easy, Medium or Hard), enter Back");
                    if(dif.equalsIgnoreCase("Easy")){
                        print("A bat has attacked. Kill it");
                        FightBat();
                    }
                    else if(dif.equalsIgnoreCase("Medium")){
                        print("A bat has appeared. Kill it");
                        FightBat();
                        print("A mystic mage has appeared. Kill it");
                        FightMage();
                    }
                    else if(dif.equalsIgnoreCase("Hard")){
                        print("A bat has appeared. Kill it");
                        FightBat();
                        print("A mystic mage has appeared. Kill it");
                        FightMage();
                        print("A Accurate Archer has appeared. Kill it");
                        FightArcher();
                    }
                    else if(dif.equalsIgnoreCase("Back")){
                        flag1 = false;
                        
                    }
                    else{
                        print("You Have entered the wrong input");
                    }
                }
            }
            else if ((answer.equalsIgnoreCase("Statistics")) ){
                String stat;
                boolean flag2 = true;
                while(flag2 == true){
                    stat = inputString("Which Character do you need the stats of? (Player, Bat, Mage, Archer) else write Back to go back");
                    if(stat.equalsIgnoreCase("Player")){
                        PrintStatsPlayer();
                    }
                    else if(stat.equalsIgnoreCase("Bat")){
                        PrintStatsBat();
                    }
                    else if(stat.equalsIgnoreCase("Mage")){
                        PrintStatsMage();
                    }
                    else if(stat.equalsIgnoreCase("Archer")){
                        PrintStatsArcher();
                    }
                    else if (stat.equalsIgnoreCase("Back")){
                        flag2 = false;
                        
                    }
                    else{
                        print("You entered the wrong input.");
                    }
                }
            }
            else if ((answer.equalsIgnoreCase("End"))){
                return;
            }
            else{
                print("You entered the wrong thing!");
            }
        }  
    }
    public static void FightBat(){
        Creature p = new Player();
        Creature b = new Bat();
        int BatHealth = b.getHp();
        int PlayerHealth = p.getHp();
        while((BatHealth > 0) & (PlayerHealth > 0)){
            
            print("Your HP: " + PlayerHealth);
            print("The Bats Hp is: " + BatHealth);
            String attack = inputString("Type att to attack the bat, else heal to get more Hp or type run to run away");
            if(attack.equalsIgnoreCase("att")){
                int Playerdam = (b.BlockChance() * p.CriticalHit() * p.Damage);
                print("Damage Dealt to bat is: " + Playerdam);
                int Batdam = (p.BlockChance() * b.CriticalHit() * b.Damage);
                print("Damage recieved: " + Batdam);
                BatHealth = BatHealth - Playerdam;
                PlayerHealth = PlayerHealth - Batdam;
                print("");
            }
            if(attack.equalsIgnoreCase("heal")){
                PlayerHealth = PlayerHealth + 20;
                int Batdam = (p.BlockChance() * b.CriticalHit() * b.Damage);
                PlayerHealth = PlayerHealth - Batdam;
                print("Damage recieved: " + Batdam);
                print("Your Hp is now " + PlayerHealth);
            }
            else if (attack.equals("run")){
                print("");
                return;
            }
           
        }
        print("Your HP: " + PlayerHealth);
        print("The Bats Hp is: " + BatHealth);
        print("You have Defeated the " + b.getName());
        print("");
    }
    
    public static void FightArcher(){
        Creature p = new Player();
        Creature a = new Archer();
        int ArcherHealth = a.getHp();
        int PlayerHealth = p.getHp();
        while((ArcherHealth > 0) & (PlayerHealth > 0)){
            
            print("Your HP: " + PlayerHealth);
            print("The Archers Hp is: " + ArcherHealth);
            String attack = inputString("Type att to attack the Archer. or type run to run away");
            if(attack.equals("att")){
                int Archerdam2 = 0;
                if(a.DoubleShot() == true){
                    Archerdam2 = (p.BlockChance() * a.CriticalHit() * a.Damage);
                    print("Archer shot twice");
                }
                int Playerdam = (a.BlockChance() * p.CriticalHit() * p.Damage);
                print("Damage Dealt to Archer is: " + Playerdam);
                int Archerdam1 = (p.BlockChance() * a.CriticalHit() * a.Damage);
                int Archerdam = Archerdam2 + Archerdam1;
                print("Damage recieved: " + Archerdam);
                ArcherHealth = ArcherHealth - Playerdam;
                PlayerHealth = PlayerHealth - Archerdam;
                print("");
            }
            if(attack.equalsIgnoreCase("heal")){
                PlayerHealth = PlayerHealth + 20;
                int Archerdam1 = (p.BlockChance() * a.CriticalHit() * a.Damage);
                PlayerHealth = PlayerHealth - Archerdam1;
                print("Damage recieved: " + Archerdam1);
                print("Your Hp is now " + PlayerHealth);
            }
            else if (attack.equals("run")){
                print("");
                return;
            }
            
        }
        print("Your HP: " + PlayerHealth);
        print("The Archers Hp is: " + ArcherHealth);
        print("You have Defeated the " + a.getName());
        print("");
    }
    
    public static void FightMage(){
        Creature p = new Player();
        Creature m = new Mage();
        int MageHealth = m.getHp();
        int PlayerHealth = p.getHp();
        while((MageHealth > 0) & (PlayerHealth > 0)){
            
            print("Your HP: " + PlayerHealth);
            print("The Mages Hp is: " + MageHealth);
            String attack = inputString("Type att to attack the Mage. or type run to run away");
            if(attack.equals("att")){
                int Playerdam = (m.BlockChance() * m.ElementAttack() * p.Damage);
                print("Damage Dealt to Mage is: " + Playerdam);
                int Magedam = (p.BlockChance() * m.CriticalHit() * m.Damage);
                print("Damage recieved: " + Magedam);
                MageHealth = MageHealth - Playerdam;
                PlayerHealth = PlayerHealth - Magedam;
                print("");
            }
            if(attack.equalsIgnoreCase("heal")){
                PlayerHealth = PlayerHealth + 20;
                int Magedam = (p.BlockChance() * m.CriticalHit() * m.Damage);
                PlayerHealth = PlayerHealth - Magedam;
                print("Damage recieved: " + Magedam);
                print("Your Hp is now " + PlayerHealth);
            }
            else if (attack.equals("run")){
                print("");
                return;
            }
           
        }
        print("Your HP: " + PlayerHealth);
        print("The Mages Hp is: " + MageHealth);
        print("You have Defeated the " + m.getName());
        print("");
    }
    public static void PrintStatsPlayer(){
        Player p = new Player();
        print(p.getName() + " has " + p.getHp() + " hp, does " + p.getDamage() + " damage and loses " + p.DEFAULT_GOLDDROP + " gold when he dies.");
        print(p.getName() + " is equipped with a " + p.getSword() + " and is wearing " + p.getArmour() + ".");
        print(p.getName() + " has a 1 in " + p.BlockChance + " chance to block a hit. and a 1 in " + p.CriticalChance + " chance to perform a critical hit.");
        print("");
    }
    public static void PrintStatsBat(){
        Bat b = new Bat();
        print("The " + b.getName() + " has " + b.getHp() + " hp, does " + b.getDamage() + " damage and drops " + b.DEFAULT_GOLDDROP + " gold when it dies.");
        print("The " + b.getName() + " has a 1 in " + b.BlockChance + " chance to block a hit. and a 1 in " + b.CriticalChance + " chance to perform a critical hit.");
        print("");
    }
    public static void PrintStatsArcher(){
        Archer a = new Archer();
        print("The " + a.getName() + " has " + a.getHp() + " hp, does " + a.getDamage() + " damage and drops " + a.getGoldDropped() + " gold when it dies.");
        print("The " + a.getName() + " has a special attack called: " + a.getSpecialAttack());
        print("The " + a.getName() + " has a 1 in " + a.BlockChance + " chance to block a hit. and a 1 in " + a.CriticalChance + " chance to perform a critical hit.");
        print("");
    }
    public static void PrintStatsMage(){
        Mage m = new Mage();
        print("The " + m.getName() + " has " + m.getHp() + " hp, does " + m.getDamage() + " damage and drops " + m.getGoldDropped() + " gold when it dies.");
        print("The " + m.getName() + " has 3 special attacks called: " + m.getAirAttack() + ", " + m.getWaterAttack() + ", " + m.getFireAttack() + ".");
        print("The " + m.getName() + " has a 1 in " + m.BlockChance + " chance to block a hit. and a 1 in " + m.CriticalChance + " chance to perform a critical hit.");
        print("");
    }
    
    
    // Helpful methods
    public static void print(String message) {
        System.out.println(message);
        return;
    }   
    public static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        print(message);
        String answer  = scanner.nextLine();
        return answer;
    }
    public static int inputInt(String message) {
        Scanner scanner = new Scanner(System.in);
        print(message);
        try {
        int answer  = scanner.nextInt();
        return answer;
        }catch(Exception e) {
            print("You didnt enter the right thing!");
            return 0;
        }
    }
}
