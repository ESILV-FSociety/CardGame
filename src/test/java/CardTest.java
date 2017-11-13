import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.races.*;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class CardTest {

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

        @Test
        public void TestCardAttributes(){
            Elf elf = new Elf();
            Troll troll = new Troll();
            Korrigan korrigan = new Korrigan();
            Dryad dryad = new Dryad();
            Gnome gnome = new Gnome();
            Goblin goblin = new Goblin();

            assertNotNull(elf.getName());
            assertNotNull(elf.getImg());

            assertNotNull(troll.getName());
            assertNotNull(troll.getImg());

            assertNotNull(korrigan.getName());
            assertNotNull(korrigan.getImg());

            assertNotNull(dryad.getName());
            assertNotNull(dryad.getImg());

            assertNotNull(gnome.getName());
            assertNotNull(gnome.getImg());

            assertNotNull(goblin.getName());
            assertNotNull(goblin.getImg());
        }



        
    }

