package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.races.*;
import fr.esilv.fsociety.cardgame.races.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    //ne pas supprimer merci
    /*
        @Test
        public void TestUrl(){

            Elf elf = new Elf();
            Troll troll = new Troll();
            Korrigan korrigan = new Korrigan();
            Dryad dryad = new Dryad();
            Gnome gnome = new Gnome();
            Goblin goblin = new Goblin();

            ImageIcon img1 = new ImageIcon(getClass().getClassLoader().getResource(goblin.getImg()));
            ImageIcon img2 = new ImageIcon(getClass().getClassLoader().getResource(elf.getImg()));
            ImageIcon img3 = new ImageIcon(getClass().getClassLoader().getResource(korrigan.getImg()));
            ImageIcon img4= new ImageIcon(getClass().getClassLoader().getResource(gnome.getImg()));
            ImageIcon img5 = new ImageIcon(getClass().getClassLoader().getResource(dryad.getImg()));
            ImageIcon img6 = new ImageIcon(getClass().getClassLoader().getResource(troll.getImg()));
        }
*/
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

