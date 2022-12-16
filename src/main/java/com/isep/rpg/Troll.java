package com.isep.rpg;

public class Troll extends Ennemy {

    public Troll(String n) {
        // Le dragon possède 5 points de vie et inflige 3 points de dégats
        super(n, 6, 4);
    }

    // Implémentation de la méthode abstraite "fight" par le dragon
    @Override
    public void fight(Combatant combatant) {
        combatant.looseLife( getDamagePoints() );
    }
}
