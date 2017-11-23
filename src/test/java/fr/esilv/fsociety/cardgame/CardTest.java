package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.*;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class CardTest {

        @Test
        public void TestCardAttributes(){
            Elf elf = new Elf();
            Troll troll = new Troll();
            Korrigan korrigan = new Korrigan();
            Dryad dryad = new Dryad();
            Gnome gnome = new Gnome();
            Goblin goblin = new Goblin();

            assertNotNull(elf.getName());
            assertNotNull(troll.getName());
            assertNotNull(korrigan.getName());
            assertNotNull(dryad.getName());
            assertNotNull(gnome.getName());
            assertNotNull(goblin.getName());

        }



        
    }

