Sebastian Amariei	


Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE

My code demonstrates inheritance in the following way...

I have a superclass called [Creature]

This superclass is extended into at least two subclasses called [Player, Bat, Mage and Archer]

For each of the named subclasses complete the following...

Subclass 1.

Subclass [Player] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [Armour and Sword, where they were both given values in the constructor]

These/this new properties/property are used by the subclass in the following way: [They show us what the players armour currently is when we are printing out the details of the player character]

Subclass [Player] extends the superclass by overriding the following methods (there must be at least one): [Block Chance and Critical Hit chance]

These overridden methods are used in the working code in the following places: [They are used to determine the chance of the mage blocking a hit, or doing extra damage, this is used in the main class where the fighting happens]

Subclass 2.

Subclass [Mage] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [Air Attack, Water Attack, Fire attack, extra Gold Dropped]

These/this new properties/property are used by the subclass in the following way: [This is used in the Critical Hit method, where depending on what spell is used, the critical change changes, where air has least chance, and fire has the most]

Subclass [Mage] extends the superclass by overriding the following methods (there must be at least one): [Block Chance and Critical Hit chance and elementAttack methods]

These overridden methods are used in the working code in the following places: [used in the main method to decide how much damage the mage does to the player, and how much damage the mage takes from the player. Also the elementAttack is used to to determine the critical hit chance.]


LEVEL TWO

Polymorphism consists of the use of the Substitution principle and Late Dynamic binding.

In my code, polymorphism is implemented in at least two places…

Example 1.

The substitution principle can be seen in use in [Game class, line 1 and 2 of FightArcher Class]. The name of the superclass used this example is [Creature] and the subclasses used are [Archer].

Late dynamic binding can be seen in [Class Game, line 3 in the fightBat method].

[PolyMorphism is used in order for the player and the archer to attack eachother. first we need variables in the creature class like, Defaul Hp, Damage, and name. and some variables in the Archer class like doubleshot
This is so that i am able to display each creatures hp, and determine how much damage each creature does.]

Example 2.

The substitution principle can be seen in use in [Class Game, and line 1 and 2 of the FightMage method]. The name of the superclass used this example is [Creature] and the subclasses used are [Mage].

Late dynamic binding can be seen in [Class Mage, line 3 in the fightMage method].

[Polymorphism is very important in my code as it allows me to use the variables and method in the super class and the variables and methods in the Mage class. For example i need the HP variable from the creature calss,
but i also need my Different element variables in order to decide what critical chance the mage has for a specific attack.]
