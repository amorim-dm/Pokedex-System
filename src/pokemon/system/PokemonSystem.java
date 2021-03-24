/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.system;
import java.awt.Color;

import java.awt.Font;
import java.sql.Connection;
import connection.connection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class PokemonSystem extends javax.swing.JFrame {
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
    public PokemonSystem() {
        initComponents();
        conexao = connection.conector();
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Types of Pokemon">
    
    private void monotype(){
        type2_txt.setText(null);
        type2_background.setBackground(null);
        type2_txt.setIcon(null);
        type2_background.setBorder(null);
        String y = "monotype";
    }
    
    private void eletric1(){
        type_txt.setText("ELETRIC");
        type_background.setBackground(new java.awt.Color(248,208,48));
        type_txt.setIcon(null);
        String x = "eletric";
    }
    
    private void eletric2(){
        type2_txt.setText("ELETRIC");
        type2_background.setBackground(new java.awt.Color(248,208,48));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "eletric";
    }
    
    private void grass1(){
        type_txt.setIcon(null);
        type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        type_txt.setText("GRASS");
        type_background.setBackground(new java.awt.Color(120,200,80));
        String x = "grass";
    }
    
    private void grass2(){
        type2_txt.setIcon(null);
        type2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        type2_txt.setText("GRASS");
        type2_background.setBackground(new java.awt.Color(120,200,80));
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "grass";
    }
    
    private void poison1(){
        type_txt.setText("POISON");
        type_background.setBackground(new java.awt.Color(160,64,160));
        type_txt.setIcon(null);
        String x = "poison";
    }
    
    private void poison2(){
        type2_txt.setText("POISON");
        type2_background.setBackground(new java.awt.Color(160,64,160));
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        type2_txt.setIcon(null);
        String y = "poison";
    }
    
    private void fire1(){
        type_txt.setText("FIRE");
        type_background.setBackground(new java.awt.Color(255, 102, 51));
        type_txt.setIcon(null);
        type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        String x = "fire";
    }
    
    private void fire2(){
        type2_txt.setText("FIRE");
        type2_background.setBackground(new java.awt.Color(255, 102, 51));
        type2_txt.setIcon(null);
        type2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "fire";
    }
    
    private void flying1(){
        type_txt.setText("FLYING");
        type_background.setBackground(new java.awt.Color(153, 153, 255));
        type_txt.setIcon(null);
        type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        String x = "flying";
    }
    
    private void flying2(){
        type2_txt.setText("FLYING");
        type2_background.setBackground(new java.awt.Color(153, 153, 255));
        type2_txt.setIcon(null);
        type2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "flying";
    }
    
    private void water1(){
        type_txt.setText("WATER");
        type_background.setBackground(new java.awt.Color(51,102,255));
        type_txt.setIcon(null);
        type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        type_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String x = "water";
    }
    
    private void water2(){
        type2_txt.setText("WATER");
        type2_background.setBackground(new java.awt.Color(51,102,255));
        type2_txt.setIcon(null);
        type2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "water";
    }
    
    private void bug1(){
        type_txt.setText("BUG");
        type_background.setBackground(new java.awt.Color(168,184,32));
        type_txt.setIcon(null);
        String x = "bug";
    }
    
    private void bug2(){
        type2_txt.setText("BUG");
        type2_background.setBackground(new java.awt.Color(168,184,32));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "bug";
    }
    
    private void normal1(){
        type_txt.setText("NORMAL");
        type_background.setBackground(new java.awt.Color(168,168,120));
        type_txt.setIcon(null);
        String x = "normal";
        
    }
    
    private void normal2(){
        type2_txt.setText("NORMAL");
        type2_background.setBackground(new java.awt.Color(168,168,120));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "normal";
    }
    
    private void ground1(){
        type_txt.setText("GROUND");
        type_background.setBackground(new java.awt.Color(224,192,104));
        type_txt.setIcon(null);
        type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        String x = "ground";
    }
    
    private void ground2(){
        type2_txt.setText("GROUND");
        type2_background.setBackground(new java.awt.Color(224,192,104));
        type2_txt.setIcon(null);
        type2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "ground";
    }
    
    private void rock1(){
        type_txt.setText("ROCK");
        type_background.setBackground(new java.awt.Color(204, 153, 0));
        type_txt.setIcon(null);
        String x = "rock";
    }
    
    private void rock2(){
        type2_txt.setText("ROCK");
        type2_background.setBackground(new java.awt.Color(204, 153, 0));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "rock";
    }
    
    private void dragon1(){
        type_txt.setText("DRAGON");
        type_background.setBackground(new java.awt.Color(112,56,248));
        type_txt.setIcon(null);
        String x = "dragon";
    }
    
    private void dragon2(){
        type2_txt.setText("DRAGON");
        type2_background.setBackground(new java.awt.Color(112,56,248));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "dragon";
    }
    
    private void fighting1(){
        type_txt.setText("FIGHTING");
        type_background.setBackground(new java.awt.Color(204,0,102));
        type_txt.setIcon(null);
        String x = "fighting";
    }
    
    private void fighting2(){
        type2_txt.setText("FIGHTING");
        type2_background.setBackground(new java.awt.Color(204,0,102));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "fighting";
    }
    
    private void fairy1(){
        type_txt.setText("FAIRY");
        type_background.setBackground(new java.awt.Color(255, 153, 204));
        type_txt.setIcon(null);
        String x = "fairy";
    }
    
    private void fairy2(){
        type2_txt.setText("FAIRY");
        type2_background.setBackground(new java.awt.Color(255, 153, 204));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "fairy";
    }
    
    private void psychic1(){
        type_txt.setText("PSYCHIC");
        type_background.setBackground(new java.awt.Color(248,88,136));
        type_txt.setIcon(null);
        String x = "psychic";
    }
    
    private void psychic2(){
        type2_txt.setText("PSYCHIC");
        type2_background.setBackground(new java.awt.Color(248,88,136));
        type2_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "psychic";
    }
    
    private void steel1(){
        type_txt.setText("STEEL");
        type_background.setBackground(new java.awt.Color(211,211,204));
        type_txt.setIcon(null);
        String x = "steel";
    }
    
    private void steel2(){
        type2_txt.setText("STEEL");
        type2_background.setBackground(new java.awt.Color(211,211,204)); 
        type_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "steel";
    }
    
    private void ice1(){
        type_txt.setText("ICE");
        type_background.setBackground(new java.awt.Color(152,216,216));
        type_txt.setIcon(null);
        String x = "ice";
    }
    
    private void ice2(){
        type2_txt.setText("ICE");
        type2_background.setBackground(new java.awt.Color(152,216,216));
        type_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "ice";
    }
    
    private void ghost1(){
        type_txt.setText("GHOST");
        type_background.setBackground(new java.awt.Color(73,57,99));
        type_txt.setIcon(null);
        String x = "ghost";
    }
    
    private void ghost2(){
        type2_txt.setText("GHOST");
        type2_background.setBackground(new java.awt.Color(73,57,99));
        type_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "ghost";
    }
    
    private void dark1(){
        type_txt.setText("DARK");
        type_background.setBackground(new java.awt.Color(112,88,72));
        type_txt.setIcon(null);
        String x = "dark";
    }
    
    private void dark2(){
        type2_txt.setText("DARK");
        type2_background.setBackground(new java.awt.Color(112,88,72));
        type_txt.setIcon(null);
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        String y = "dark";
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Total Base Stats">
        
    private void total(){
        int hp = Integer.parseInt(hp_stats.getText());
        int atk = Integer.parseInt(atk_stats.getText());
        int def = Integer.parseInt(def_stats.getText());
        int spatk = Integer.parseInt(spatk_stats.getText());
        int spdef = Integer.parseInt(spdef_stats.getText());
        int spd = Integer.parseInt(spd_stats.getText());
        int x = hp+atk+def+spatk+spdef+spd;
        String total = String.valueOf(x);
        total_stats.setText(total);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Pokemons">
    public void mostrar(){
        String name = pokemon_name.getSelectedItem().toString();
        String variation = pokemon_variations.getSelectedItem().toString();
       
        if(name.equals(" #001 Bulbasaur")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/001 (1).png"))); 
            pokemon_desc.setText(null);
            pokemon_desc.setText("There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.");
            grass1();
            poison2();
            grass_poison();
            hp_stats.setText("45");
            atk_stats.setText("49");
            def_stats.setText("49");
            spatk_stats.setText("65");
            spdef_stats.setText("65");
            spd_stats.setText("45");
            total();
        } else if (name.equals(" #002 Ivysaur")) {
            total_stats.setText("x");
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/002.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.");
            grass1();
            poison2();
            grass_poison();
            hp_stats.setText("60");
            atk_stats.setText("62");
            def_stats.setText("65");
            spatk_stats.setText("80");
            spdef_stats.setText("80");
            spd_stats.setText("60");
            total();
        } else if (name.equals(" #003 Venusaur")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/003.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.");
            grass1();
            poison2();
            grass_poison();
            hp_stats.setText("80");
            atk_stats.setText("82");
            def_stats.setText("83");
            spatk_stats.setText("100");
            spdef_stats.setText("100");
            spd_stats.setText("80");
            total();
        } else if (name.equals(" #004 Charmander")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/004.png"))); 
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.");
            fire1();
            monotype();
            fire_monotype();
            hp_stats.setText("39");
            atk_stats.setText("52");
            def_stats.setText("43");
            spatk_stats.setText("60");
            spdef_stats.setText("50");
            spd_stats.setText("65");
            total();
        } else if (name.equals(" #005 Charmeleon")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/005.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has a barbaric nature. In battle, it whips its fiery tail around and slashes away with sharp claws.");
            fire1();
            monotype();
            fire_monotype();
            hp_stats.setText("58");
            atk_stats.setText("64");
            def_stats.setText("58");
            spatk_stats.setText("80");
            spdef_stats.setText("65");
            spd_stats.setText("80");
            total();
        } else if (name.equals(" #006 Charizard")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/006.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It spits fire that is hot enough to melt boulders. It may cause forest fires by blowing flames.");
            fire1();
            flying2();
            fire_flying();
            hp_stats.setText("78");
            atk_stats.setText("84");
            def_stats.setText("78");
            spatk_stats.setText("109");
            spdef_stats.setText("85");
            spd_stats.setText("100");
            total();
        } else if (name.equals(" #007 Squirtle")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/007.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When it retracts its long neck into its shell, it squirts out water with vigorous force.");
            water1();
            monotype();
            water_monotype();
            hp_stats.setText("44");
            atk_stats.setText("48");
            def_stats.setText("65");
            spatk_stats.setText("50");
            spdef_stats.setText("64");
            spd_stats.setText("43");
            total();
        } else if (name.equals(" #008 Wartortle")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/008.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is recognized as a symbol of longevity. If its shell has algae on it, that Wartortle is very old.");
            water1();
            monotype();
            water_monotype();
            hp_stats.setText("59");
            atk_stats.setText("63");
            def_stats.setText("80");
            spatk_stats.setText("65");
            spdef_stats.setText("80");
            spd_stats.setText("58");
            total();
        } else if (name.equals(" #009 Blastoise")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/009.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It crushes its foe under its heavy body to cause fainting. In a pinch, it will withdraw inside its shell.");
            water1();
            monotype();
            water_monotype();
            hp_stats.setText("79");
            atk_stats.setText("83");
            def_stats.setText("100");
            spatk_stats.setText("85");
            spdef_stats.setText("105");
            spd_stats.setText("78");
            total();
        }  else if (name.equals(" #010 Caterpie")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/010.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("For protection, it releases a horrible stench from the antenna on its head to drive away enemies.");
            bug1();
            monotype();
            bug_monotype();
            hp_stats.setText("45");
            atk_stats.setText("30");
            def_stats.setText("35");
            spatk_stats.setText("20");
            spdef_stats.setText("20");
            spd_stats.setText("45");
            total();
        }  else if (name.equals(" #011 Metapod")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/011.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is waiting for the moment to evolve. At this stage, it can only harden, so it remains motionless to avoid attack.");
            bug1();
            monotype();
            bug_monotype();
            hp_stats.setText("50");
            atk_stats.setText("20");
            def_stats.setText("55");
            spatk_stats.setText("25");
            spdef_stats.setText("25");
            spd_stats.setText("30");
            total();
        }  else if (name.equals(" #012 Butterfree")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/012.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("In battle, it flaps its wings at great speed to release highly toxic dust into the air.");
            bug1();
            flying2();
            bug_flying();
            hp_stats.setText("60");
            atk_stats.setText("45");
            def_stats.setText("50");
            spatk_stats.setText("90");
            spdef_stats.setText("80");
            spd_stats.setText("70");
            total();
        }  else if (name.equals(" #013 Weedle")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/013.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Beware of the sharp stinger on its head. It hides in grass and bushes where it eats leaves.");
            bug1();
            poison2();
            bug_poison();
            hp_stats.setText("40");
            atk_stats.setText("35");
            def_stats.setText("30");
            spatk_stats.setText("20");
            spdef_stats.setText("20");
            spd_stats.setText("50");
            total();
        }  else if (name.equals(" #014 Kakuna")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/014.png")));
            pokemon_desc.setText("POISON");
            pokemon_desc.setText("Beware of the sharp stinger on its head. It hides in grass and bushes where it eats leaves.");
            bug1();
            poison2();
            bug_poison();
            hp_stats.setText("45");
            atk_stats.setText("25");
            def_stats.setText("50");
            spatk_stats.setText("90");
            spdef_stats.setText("80");
            spd_stats.setText("70");
            total();
        }  else if (name.equals(" #015 Beedrill")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/015.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has three poisonous stingers on its forelegs and its tail. They are used to jab its enemy repeatedly.");
            bug1();
            poison2();
            bug_poison();
            hp_stats.setText("65");
            atk_stats.setText("90");
            def_stats.setText("40");
            spatk_stats.setText("45");
            spdef_stats.setText("80");
            spd_stats.setText("75");
            total();
        }  else if (name.equals(" #016 Pidgey")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/016.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Very docile. If attacked, it will often kick up sand to protect itself rather than fight back.");
            normal1();
            flying2();
            normal_flying();
            hp_stats.setText("40");
            atk_stats.setText("45");
            def_stats.setText("40");
            spatk_stats.setText("35");
            spdef_stats.setText("35");
            spd_stats.setText("56");
            total();
        }  else if (name.equals(" #017 Pidgeotto")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/017.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon is full of vitality. It constantly flies around its large territory in search of prey.");
            normal1();
            flying2();
            normal_flying();
            hp_stats.setText("63");
            atk_stats.setText("80");
            def_stats.setText("55");
            spatk_stats.setText("50");
            spdef_stats.setText("50");
            spd_stats.setText("71");
            total();
        }  else if (name.equals(" #018 Pidgeot")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/018.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon flies at Mach 2 speed, seeking prey. Its large talons are feared as wicked weapons.");
            normal1();
            flying2();
            normal_flying();
            hp_stats.setText("83");
            atk_stats.setText("80");
            def_stats.setText("75");
            spatk_stats.setText("70");
            spdef_stats.setText("70");
            spd_stats.setText("101");
            total();
        }  else if (name.equals(" #019 Rattata")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/019.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Will chew on anything with its fangs. If you see one, you can be certain that 40 more live in the area.");
            normal1();
            monotype();
            normal_monotype();
            hp_stats.setText("30");
            atk_stats.setText("56");
            def_stats.setText("35");
            spatk_stats.setText("25");
            spdef_stats.setText("35");
            spd_stats.setText("72");
            total();
        }  else if (name.equals(" #020 Raticate")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/020.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its hind feet are webbed. They act as flippers, so it can swim in rivers and hunt for prey.");
            normal1();
            monotype();
            normal_monotype();
            hp_stats.setText("55");
            atk_stats.setText("81");
            def_stats.setText("60");
            spatk_stats.setText("50");
            spdef_stats.setText("70");
            spd_stats.setText("97");
            total();
        }  else if (name.equals(" #021 Spearow")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/021.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Inept at flying high. However, it can fly around very fast to protect its territory.");
            normal1();
            flying2();
            normal_flying();
            hp_stats.setText("40");
            atk_stats.setText("60");
            def_stats.setText("30");
            spatk_stats.setText("31");
            spdef_stats.setText("31");
            spd_stats.setText("70");
            total();
        }  else if (name.equals(" #022 Fearow")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/022.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("A Pokémon that dates back many years. If it senses danger, it flies high and away, instantly.");
            normal1();
            flying2();
            normal_flying();
            hp_stats.setText("65");
            atk_stats.setText("90");
            def_stats.setText("65");
            spatk_stats.setText("61");
            spdef_stats.setText("61");
            spd_stats.setText("100");
            total();
        }  else if (name.equals(" #023 Ekans")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/023.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The older it gets, the longer it grows. At night, it wraps its long body around tree branches to rest.");
            poison1();
            monotype();
            poison_monotype();
            hp_stats.setText("35");
            atk_stats.setText("60");
            def_stats.setText("65");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }  else if (name.equals(" #024 Arbok")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/024.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The frightening patterns on its belly have been studied. Six variations have been confirmed.");
            poison1();
            monotype();
            poison_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #025 Pikachu")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/025.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Pikachu that can generate powerful electricity have cheek sacs that are extra soft and super stretchy.");
            eletric1();
            monotype();
            eletric_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #026 Raichu")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/026.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its long tail serves as a ground to protect itself from its own high-voltage power.");
            eletric1();
            monotype();
            eletric_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #027 Sandshrew")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/027.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It loves to bathe in the grit of dry, sandy areas. By sand bathing, the Pokémon rids itself of dirt and moisture clinging to its body.");
            ground1();
            monotype();
            ground_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #028 Sandslash")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/028.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The drier the area Sandslash lives in, the harder and smoother the Pokémon’s spikes will feel when touched.");
            ground1();
            monotype();
            ground_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #029 Nidoran♀")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/029.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Females are more sensitive to smells than males. While foraging, they’ll use their whiskers to check wind direction and stay downwind of predators.");
            poison1();
            monotype();
            poison_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #030 Nidorina")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/030.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The horn on its head has atrophied. It’s thought that this happens so Nidorina’s children won’t get poked while their mother is feeding them.");
            poison1();
            monotype();
            poison_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #031 Nidoqueen")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/031.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Nidoqueen is better at defense than offense. With scales like armor, this Pokémon will shield its children from any kind of attack.");
            poison1();
            ground2();
            poison_ground();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #032 Nidoran♂")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/032.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The horn on a male Nidoran’s forehead contains a powerful poison. This is a very cautious Pokémon, always straining its large ears.");
            poison1();
            monotype();
            poison_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #033 Nidorino")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/033.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("With a horn that’s harder than diamond, this Pokémon goes around shattering boulders as it searches for a moon stone.");
            poison1();
            monotype();
            poison_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #034 Nidoking")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/034.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When it goes on a rampage, it’s impossible to control. But in the presence of a Nidoqueen it’s lived with for a long time, Nidoking calms down.");
            poison1();
            ground2();
            poison_ground();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #035 Clefairy")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/035.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is said that happiness will come to those who see a gathering of Clefairy dancing under a full moon.");
            fairy1();
            monotype();
            fairy_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #036 Clefable")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/036.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("A timid fairy Pokémon that is rarely seen, it will run and hide the moment it senses people.");
            fairy1();
            monotype();
            fairy_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #037 Vulpix")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/037.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("While young, it has six gorgeous tails. When it grows, several new tails are sprouted.");
            fire1();
            monotype();
            fire_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #038 Ninetales")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/038.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is said to live 1,000 years, and each of its tails is loaded with supernatural powers.");
            fire1();
            monotype();
            fire_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #039 Jigglypuff")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/039.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Jigglypuff has top-notch lung capacity, even by comparison to other Pokémon. It won’t stop singing its lullabies until its foes fall asleep.");
            normal1();
            fairy2();
            fairy_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #040 Wigglytuff")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/040.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The more air it takes in, the more it inflates. If opponents catch it in a bad mood, it will inflate itself to an enormous size to intimidate them.");
            normal1();
            fairy2();
            fairy_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #041 Zubat")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/041.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It emits ultrasonic waves from its mouth to check its surroundings. Even in tight caves, Zubat flies around with skill.");
            poison1();
            flying2();
            poison_flying();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #042 Golbat")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/042.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It loves to drink other creatures’ blood. It’s said that if it finds others of its kind going hungry, it sometimes shares the blood it’s gathered.");
            poison1();
            flying2();
            poison_flying();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #043 Oddish")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/043.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("If exposed to moonlight, it starts to move. It roams far and wide at night to scatter its seeds.");
            grass1();
            poison2();
            grass_poison();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #044 Gloom")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/044.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its pistils exude an incredibly foul odor. The horrid stench can cause fainting at a distance of 1.25 miles.");
            grass1();
            poison2();
            grass_poison();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #045 Vileplume")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/045.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has the world’s largest petals. With every step, the petals shake out heavy clouds of toxic pollen.");
            grass1();
            poison2();
            grass_poison();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #046 Paras")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/046.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Burrows under the ground to gnaw on tree roots. The mushrooms on its back absorb most of the nutrition.");
            bug1();
            grass2();
            bug_grass();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #047 Parasect")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/047.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The bug host is drained of energy by the mushroom on its back. The mushroom appears to do all the thinking.");
            bug1();
            grass2();
            bug_grass();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #048 Venonat")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/048.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its large eyes act as radar. In a bright place, you can see that they are clusters of many tiny eyes.");
            bug1();
            poison2();
            bug_poison();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #049 Venomoth")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/049.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The powdery scales on its wings are hard to remove from skin. They also contain poison that leaks out on contact.");
            bug1();
            poison2();
            bug_poison();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #050 Diglett")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/050.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("If a Diglett digs through a field, it leaves the soil perfectly tilled and ideal for planting crops.");
            ground1();
            monotype();
            ground_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #051 Dugtrio")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/051.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("A team of Diglett triplets. It triggers huge earthquakes by burrowing 60 miles underground.");
            ground1();
            monotype();
            ground_monotype();
            hp_stats.setText("");
            atk_stats.setText("");
            def_stats.setText("");
            spatk_stats.setText("");
            spdef_stats.setText("");
            spd_stats.setText("");
            total();
        }   else if (name.equals(" #052 Meowth")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/052.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It loves to collect shiny things. If it’s in a good mood, it might even let its Trainer have a look at its hoard of treasures.");
            normal1();
            monotype();
            normal_monotype();
        }   else if (name.equals(" #053 Persian")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/053.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Getting this prideful Pokémon to warm up to you takes a lot of effort, and it will claw at you the moment it gets annoyed.");
            normal1();
            monotype();
            normal_monotype();
        }   else if (name.equals(" #054 Psyduck")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/054.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Psyduck is constantly beset by headaches. If the Pokémon lets its strange power erupt, apparently the pain subsides for a while.");
            water1();
            monotype();
            water_monotype();
        }   else if (name.equals(" #055 Golduck")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/055.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon lives in gently flowing rivers. It paddles through the water with its long limbs, putting its graceful swimming skills on display.");
            water1();
            monotype();
            water_monotype();
        }   else if (name.equals(" #056 Mankey")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/056.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("An agile Pokémon that lives in trees. It angers easily and will not hesitate to attack anything.");
            fighting1();
            monotype();
            fighting_monotype();
        }   else if (name.equals(" #057 Primeape")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/057.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It stops being angry only when nobody else is around. To view this moment is very difficult.");
            fighting1();
            monotype();
            fighting_monotype();
        }   else if (name.equals(" #058 Growlithe")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/058.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has a brave and trustworthy nature. It fearlessly stands up to bigger and stronger foes.");
            fire1();
            monotype();
            fire_monotype();
        }   else if (name.equals(" #059 Arcanine")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/059.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The sight of it running over 6,200 miles in a single day and night has captivated many people.");
            fire1();
            monotype();
            fire_monotype();
        }   else if (name.equals(" #060 Poliwag")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/060.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("For Poliwag, swimming is easier than walking. The swirl pattern on its belly is actually part of the Pokémon’s innards showing through the skin.");
            water1();
            monotype();
            water_monotype();
        }   else if (name.equals(" #061 Poliwhirl")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/061.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Staring at the swirl on its belly causes drowsiness. This trait of Poliwhirl’s has been used in place of lullabies to get children to go to sleep.");
            water1();
            monotype();
            water_monotype();
        }   else if (name.equals(" #062 Poliwrath")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/062.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its body is solid muscle. When swimming through cold seas, Poliwrath uses its impressive arms to smash through drift ice and plow forward.");
            water1();
            fighting2();
            water_fighting();
        }   else if (name.equals(" #063 Abra")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/063.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon uses its psychic powers while it sleeps. The contents of Abra’s dreams affect the powers that the Pokémon wields.");
            psychic1();
            monotype();
            psychic_monotype();
        }   else if (name.equals(" #064 Kadabra")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/064.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Using its psychic power, Kadabra levitates as it sleeps. It uses its springy tail as a pillow.");
            psychic1();
            monotype();
            psychic_monotype();
        }   else if (name.equals(" #065 Alakazam")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/065.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has an incredibly high level of intelligence. Some say that Alakazam remembers everything that ever happens to it, from birth till death.");
            psychic1();
            monotype();
            psychic_monotype();
        }   else if (name.equals(" #066 Machop")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/066.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its whole body is composed of muscles. Even though it’s the size of a human child, it can hurl 100 grown-ups.");
            fighting1();
            monotype();
            fighting_monotype();
        }   else if (name.equals(" #067 Machoke")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/067.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its muscular body is so powerful, it must wear a power-save belt to be able to regulate its motions.");
            fighting1();
            monotype();
            fighting_monotype();
        }   else if (name.equals(" #068 Machamp")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/068.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It quickly swings its four arms to rock its opponents with ceaseless punches and chops from all angles.");
            fighting1();
            monotype();
            fighting_monotype();
        }   else if (name.equals(" #069 Bellsprout")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/069.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Prefers hot and humid places. It ensnares tiny bugs with its vines and devours them.");
            grass1();
            poison2();
            grass_poison();
        }   else if (name.equals(" #070 Weepinbell")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/070.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When hungry, it swallows anything that moves. Its hapless prey is dissolved by strong acids.");
            grass1();
            poison2();
            grass_poison();
        }   else if (name.equals(" #071 Victreebel")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/071.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Lures prey with the sweet aroma of honey. Swallowed whole, the prey is dissolved in a day, bones and all.");
            grass1();
            poison2();
            grass_poison();
        }   else if (name.equals(" #072 Tentacool")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/072.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Tentacool is not a particularly strong swimmer. It drifts across the surface of shallow seas as it searches for prey.");
            water1();
            poison2();
            water_poison();
        }   else if (name.equals(" #073 Tentacruel")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/073.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When the red orbs on Tentacruel’s head glow brightly, watch out. The Pokémon is about to fire off a burst of ultrasonic waves.");
            water1();
            poison2();
            water_poison();
        }   else if (name.equals(" #074 Geodude")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/074.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Commonly found near mountain trails and the like. If you step on one by accident, it gets angry.");
            rock1();
            ground2();
            rock_ground();
        }   else if (name.equals(" #075 Graveler")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/075.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Often seen rolling down mountain trails. Obstacles are just things to roll straight over, not avoid.");
            rock1();
            ground2();
            rock_ground();
        }   else if (name.equals(" #076 Golem")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/076.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Once it sheds its skin, its body turns tender and whitish. Its hide hardens when it’s exposed to air.");
            rock1();
            ground2();
            rock_ground();
        }   else if (name.equals(" #077 Ponyta")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/077.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It can’t run properly when it’s newly born. As it races around with others of its kind, its legs grow stronger.");
            fire1();
            monotype();
            fire_monotype();
        }   else if (name.equals(" #078 Rapidash")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/078.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon can be seen galloping through fields at speeds of up to 150 mph, its fiery mane fluttering in the wind.");
            fire1();
            monotype();
            fire_monotype();
        }   else if (name.equals(" #079 Slowpoke")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/079.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Slow-witted and oblivious, this Pokémon won’t feel any pain if its tail gets eaten. It won’t notice when its tail grows back, either.");
            water1();
            psychic2();
            water_psychic();
        }   else if (name.equals(" #080 Slowbro")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/080.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Slowpoke became Slowbro when a Shellder bit on to its tail. Sweet flavors seeping from the tail make the Shellder feel as if its life is a dream.");
            water1();
            psychic2();
            water_psychic();
        }   else if (name.equals(" #081 Magnemite")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/081.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("At times, Magnemite runs out of electricity and ends up on the ground. If you give batteries to a grounded Magnemite, it’ll start moving again.");
            eletric1();
            steel2();
            eletric_steel();
        }   else if (name.equals(" #082 Magneton")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/082.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon is three Magnemite that have linked together. Magneton sends out powerful radio waves to study its surroundings.");
            eletric1();
            steel2();
            eletric_steel();
        }   else if (name.equals(" #083 Farfetch'd")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/083.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The stalk this Pokémon carries in its wings serves as a sword to cut down opponents. In a dire situation, the stalk can also serve as food.");
            normal1();
            flying2();
            normal_flying();
        }   else if (name.equals(" #084 Doduo")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/084.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its short wings make flying difficult. Instead, this Pokémon runs at high speed on developed legs.");
            normal1();
            flying2();
            normal_flying();
        }    else if (name.equals(" #085 Dodrio")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/085.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("One of Doduo’s two heads splits to form a unique species. It runs close to 40 mph in prairies.");
            normal1();
            flying2();
            normal_flying();
        }    else if (name.equals(" #086 Seel")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/086.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Loves freezing-cold conditions. Relishes swimming in a frigid climate of around 14 degrees Fahrenheit.");
            water1();
            monotype();
            water_monotype();
        }    else if (name.equals(" #087 Dewgong")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/087.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its entire body is a snowy white. Unharmed by even intense cold, it swims powerfully in icy waters.");
            water1();
            ice2();
            water_ice();
        }    else if (name.equals(" #088 Grimer")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/088.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Made of congealed sludge. It smells too putrid to touch. Even weeds won’t grow in its path.");
            poison1();
            monotype();
            poison_monotype();
        }    else if (name.equals(" #089 Muk")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/089.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Smells so awful, it can cause fainting. Through degeneration of its nose, it lost its sense of smell.");
            poison1();
            monotype();
            poison_monotype();
        }    else if (name.equals(" #090 Shellder")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/090.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It swims facing backward by opening and closing its two-piece shell. It is surprisingly fast.");
            water1();
            monotype();
            water_monotype();
        }    else if (name.equals(" #091 Cloyster")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/091.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its shell is extremely hard. It cannot be shattered, even with a bomb. The shell opens only when it is attacking.");
            water1();
            ice2();
            water_ice();
        }    else if (name.equals(" #092 Gastly")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/092.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Born from gases, anyone would faint if engulfed by its gaseous body, which contains poison.");
            ghost1();
            poison2();
            ghost_poison();
        }    else if (name.equals(" #093 Haunter")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/093.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its tongue is made of gas. If licked, its victim starts shaking constantly until death eventually comes.");
            ghost1();
            poison2();
            ghost_poison();
        }    else if (name.equals(" #094 Gengar")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/094.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("On the night of a full moon, if shadows move on their own and laugh, it must be Gengar’s doing.");
            ghost1();
            poison2();
            ghost_poison();
        }    else if (name.equals(" #095 Onix")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/095.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("As it digs through the ground, it absorbs many hard objects. This is what makes its body so solid.");
            rock1();
            ground2();
            rock_ground();
        }    else if (name.equals(" #096 Drowzee")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/096.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("If you sleep by it all the time, it will sometimes show you dreams it had eaten in the past.");
            psychic1();
            monotype();
            psychic_monotype();
        }    else if (name.equals(" #097 Hypno")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/097.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Avoid eye contact if you come across one. It will try to put you to sleep by using its pendulum.");
            psychic1();
            monotype();
            psychic_monotype();
        }    else if (name.equals(" #098 Krabby")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/098.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It can be found near the sea. The large pincers grow back if they are torn out of their sockets.");
            water1();
            monotype();
            water_monotype();
        }    else if (name.equals(" #099 Kingler")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/099.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its large and hard pincer has 10,000-horsepower strength. However, being so big, it is unwieldy to move.");
            water1();
            monotype();
            water_monotype();
        }    else if (name.equals(" #100 Voltorb")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/100.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is said to camouflage itself as a Poké Ball. It will self-destruct with very little stimulus.");
            eletric1();
            monotype();
            eletric_monotype();
        }    else if (name.equals(" #101 Electrode")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/101.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Stores electrical energy inside its body. Even the slightest shock could trigger a huge explosion.");
            eletric1();
            monotype();
            eletric_monotype(); 
        }    else if (name.equals(" #102 Exeggcute")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/102.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Stores electrical energy inside its body. Even the slightest shock could trigger a huge explosion.");
            grass1();
            psychic2();
            grass_psychic();
        }    else if (name.equals(" #103 Exeggutor")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/103.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Each of Exeggutor’s three heads is thinking different thoughts. The three don’t seem to be very interested in one another.");
            grass1();
            psychic2();
            grass_psychic(); 
        }    else if (name.equals(" #104 Cubone")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/104.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When the memory of its departed mother brings it to tears, its cries echo mournfully within the skull it wears on its head.");
            ground1();
            monotype();
            ground_monotype();
        }    else if (name.equals(" #105 Marowak")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/105.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon overcame its sorrow to evolve a sturdy new body. Marowak faces its opponents bravely, using a bone as a weapon.");
            ground1();
            monotype();
            ground_monotype();
        }    else if (name.equals(" #106 Hitmonlee")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/106.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This amazing Pokémon has an awesome sense of balance. It can kick in succession from any position.");
            fighting1();
            monotype();
            fighting_monotype();
        }    else if (name.equals(" #107 Hitmonchan")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/107.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its punches slice the air. They are launched at such high speed, even a slight graze could cause a burn.");
            fighting1();
            monotype();
            fighting_monotype();
        }    else if (name.equals(" #108 Lickitung")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/108.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("If this Pokémon’s sticky saliva gets on you and you don’t clean it off, an intense itch will set in. The itch won’t go away, either.");
            normal1();
            monotype();
            normal_monotype();
        }    else if (name.equals(" #109 Koffing")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/109.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its body is full of poisonous gas. It floats into garbage dumps, seeking out the fumes of raw, rotting trash.");
            poison1();
            monotype();
            poison_monotype();
        }    else if (name.equals(" #110 Weezing")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/110.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It mixes gases between its two bodies. It’s said that these Pokémon were seen all over the Galar region back in the day.");
            poison1();
            monotype();
            poison_monotype();
        }    else if (name.equals(" #111 Rhyhorn")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/111.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Strong, but not too bright, this Pokémon can shatter even a skyscraper with its charging tackles.");
            ground1();
            rock2();
            rock_ground();
        }     else if (name.equals(" #112 Rhydon")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/112.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It begins walking on its hind legs after evolution. It can punch holes through boulders with its horn.");
            ground1();
            rock2();
            rock_ground();
        }     else if (name.equals(" #113 Chansey")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/113.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The egg Chansey carries is not only delicious but also packed with nutrition. It’s used as a high-class cooking ingredient.");
            normal1();
            monotype();
            normal_monotype();
        }     else if (name.equals(" #114 Tangela")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/114.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Hidden beneath a tangle of vines that grows nonstop even if the vines are torn off, this Pokémon’s true appearance remains a mystery.");
            grass1();
            monotype();
            grass_monotype();
        }     else if (name.equals(" #115 Kangaskhan")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/115.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Although it’s carrying its baby in a pouch on its belly, Kangaskhan is swift on its feet. It intimidates its opponents with quick jabs.");
            normal1();
            monotype();
            normal_monotype();
        }     else if (name.equals(" #116 Horsea")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/116.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Horsea makes its home in oceans with gentle currents. If this Pokémon is under attack, it spits out pitch-black ink and escapes.");
            water1();
            monotype();
            water_monotype();
        }     else if (name.equals(" #117 Seadra")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/117.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s the males that raise the offspring. While Seadra are raising young, the spines on their backs secrete thicker and stronger poison.");
            water1();
            monotype();
            water_monotype();
        }     else if (name.equals(" #118 Goldeen")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/118.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its dorsal, pectoral, and tail fins wave elegantly in water. That is why it is known as the Water Dancer.");
            water1();
            monotype();
            water_monotype();
        }     else if (name.equals(" #119 Seaking")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/119.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("In autumn, its body becomes more fatty in preparing to propose to a mate. It takes on beautiful colors.");
            water1();
            monotype();
            water_monotype();
        }     else if (name.equals(" #120 Staryu")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/120.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("If you visit a beach at the end of summer, you’ll be able to see groups of Staryu lighting up in a steady rhythm.");
            water1();
            monotype();
            water_monotype();
        }     else if (name.equals(" #121 Starmie")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/121.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon has an organ known as its core. The organ glows in seven colors when Starmie is unleashing its potent psychic powers.");
            water1();
            psychic2();
            water_psychic();
        }     else if (name.equals(" #122 Mr. Mime")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/122.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The broadness of its hands may be no coincidence—many scientists believe its palms became enlarged specifically for pantomiming.");
            psychic1();
            fairy2();
            psychic_fairy();
        }     else if (name.equals(" #123 Scyther")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/123.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("As Scyther fights more and more battles, its scythes become sharper and sharper. With a single slice, Scyther can fell a massive tree.");
            bug1();
            flying2();
            bug_flying();
        }     else if (name.equals(" #124 Jynx")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/124.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("In certain parts of Galar, Jynx was once feared and worshiped as the Queen of Ice.");
            ice1();
            psychic2();
            ice_psychic();
        }     else if (name.equals(" #125 Electabuzz")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/125.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Many power plants keep Ground-type Pokémon around as a defense against Electabuzz that come seeking electricity.");
            eletric1();
            monotype();
            eletric_monotype();
        }     else if (name.equals(" #126 Magmar")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/126.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Magmar dispatches its prey with fire. But it regrets this habit once it realizes that it has burned its intended prey to a charred crisp.");
            fire1();
            monotype();
            fire_monotype();
        }     else if (name.equals(" #127 Pinsir")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/127.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("These Pokémon judge one another based on pincers. Thicker, more impressive pincers make for more popularity with the opposite gender.");
            bug1();
            monotype();
            bug_monotype();
        }     else if (name.equals(" #128 Tauros")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/128.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When Tauros begins whipping itself with its tails, it’s a warning that the Pokémon is about to charge with astounding speed.");
            normal1();
            monotype();
            normal_monotype();
        }     else if (name.equals(" #129 Magikarp")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/129.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is virtually worthless in terms of both power and speed. It is the most weak and pathetic Pokémon in the world.");
            water1();
            monotype();
            water_monotype();
        }     else if (name.equals(" #130 Gyarados")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/130.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has an extremely aggressive nature. The Hyper Beam it shoots from its mouth totally incinerates all targets.");
            water1();
            flying2();
            water_flying();
        }     else if (name.equals(" #131 Lapras")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/131.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("A smart and kindhearted Pokémon, it glides across the surface of the sea while its beautiful song echoes around it.");
            water1();
            ice2();
            water_ice();
        }     else if (name.equals(" #132 Ditto")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/132.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It can reconstitute its entire cellular structure to change into what it sees, but it returns to normal when it relaxes.");
            normal1();
            monotype();
            normal_monotype();
        }     else if (name.equals(" #133 Eevee")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/133.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has the ability to alter the composition of its body to suit its surrounding environment.");
            normal1();
            monotype();
            normal_monotype();
        }     else if (name.equals(" #134 Vaporeon")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/134.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When Vaporeon’s fins begin to vibrate, it is a sign that rain will come within a few hours.");
            water1();
            monotype();
            water_monotype();
        }     else if (name.equals(" #135 Jolteon")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/135.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("If it is angered or startled, the fur all over its body bristles like sharp needles that pierce foes.");
            eletric1();
            monotype();
            eletric_monotype();
        }     else if (name.equals(" #136 Flareon")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/136.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Once it has stored up enough heat, this Pokémon’s body temperature can reach up to 1,700 degrees Fahrenheit.");
            fire1();
            monotype();
            fire_monotype();
        }     else if (name.equals(" #137 Porygon")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/137.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("State-of-the-art technology was used to create Porygon. It was the first artificial Pokémon to be created via computer programming.");
            normal1();
            monotype();
            normal_monotype();
        }     else if (name.equals(" #138 Omanyte")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/138.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Because some Omanyte manage to escape after being restored or are released into the wild by people, this species is becoming a problem.");
            rock1();
            water2();
            rock_water();
        }     else if (name.equals(" #139 Omastar")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/139.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Weighed down by a large and heavy shell, Omastar couldn’t move very fast. Some say it went extinct because it was unable to catch food.");
            rock1();
            water2();
            rock_water();
        }     else if (name.equals(" #140 Kabuto")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/140.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This species is almost entirely extinct. Kabuto molt every three days, making their shells harder and harder.");
            rock1();
            water2();
            rock_water();
        }     else if (name.equals(" #141 Kabutops")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/141.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Kabutops slices its prey apart and sucks out the fluids. The discarded body parts become food for other Pokémon.");
            rock1();
            water2();
            rock_water();
        }     else if (name.equals(" #142 Aerodactyl")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/142.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This is a ferocious Pokémon from ancient times. Apparently even modern technology is incapable of producing a perfectly restored specimen.");
            rock1();
            flying2();
            rock_flying();
        }     else if (name.equals(" #143 Snorlax")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/143.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is not satisfied unless it eats over 880 pounds of food every day. When it is done eating, it goes promptly to sleep.");
            normal1();
            monotype();
            normal_monotype();
        }     else if (name.equals(" #144 Articuno")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/144.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s said that this Pokémon’s beautiful blue wings are made of ice. Articuno flies over snowy mountains, its long tail fluttering along behind it.");
            ice1();
            flying2();
            ice_flying();
        }     else if (name.equals(" #145 Zapdos")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/145.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon has complete control over electricity. There are tales of Zapdos nesting in the dark depths of pitch-black thunderclouds.");
            eletric1();
            flying2();
            eletric_flying();
        }     else if (name.equals(" #146 Moltres")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/146.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s one of the legendary bird Pokémon. When Moltres flaps its flaming wings, they glimmer with a dazzling red glow.");
            fire1();
            flying2();
            fire_flying();
        }     else if (name.equals(" #147 Dratini")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/147.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Dratini dwells near bodies of rapidly flowing water, such as the plunge pools of waterfalls. As it grows, Dratini will shed its skin many times.");
            dragon1();
            monotype();
            dragon_monotype();
        }     else if (name.equals(" #148 Dragonair")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/148.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon lives in pristine oceans and lakes. It can control the weather, and it uses this power to fly into the sky, riding on the wind.");
            dragon1();
            monotype();
            dragon_monotype();
        }     else if (name.equals(" #149 Dragonite")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/149.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s a kindhearted Pokémon. If it spots a drowning person or Pokémon, Dragonite simply must help them.");
            dragon1();
            flying2();
            dragon_flying();
        }     else if (name.equals(" #150 Mewtwo")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/150.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its DNA is almost the same as Mew’s. However, its size and disposition are vastly different.");
            psychic1();
            monotype();
            psychic_monotype();
        }     else if (name.equals(" #151 Mew")) {
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/151.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When viewed through a microscope, this Pokémon’s short, fine, delicate hair can be seen.");
            psychic1();
            monotype();
            psychic_monotype();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Pokemon Weakness">
    
    private void fire_monotype(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);
        
        weak_background.setBackground(new java.awt.Color(51,102,255));
        weak2_background.setBackground(new java.awt.Color(224,192,104));
        weak3_background.setBackground(new java.awt.Color(204, 153, 0));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);
        
        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);
        
        weak_txt.setText("WATER");
        weak2_txt.setText("GROUND");
        weak3_txt.setText("ROCK");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void grass_poison(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);
        
        weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(248,88,136));
        weak3_background.setBackground(new java.awt.Color(153, 153, 255));
        weak4_background.setBackground(new java.awt.Color(152,216,216));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);
        
        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);
        
        weak_txt.setText("FIRE");
        weak2_txt.setText("PSYCHIC");
        weak3_txt.setText("FLYING");
        weak4_txt.setText("ICE");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void water_monotype(){
        
        
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);
        
        weak_background.setBackground(new java.awt.Color(120,200,80));
        weak2_background.setBackground(new java.awt.Color(248,208,48));
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);
        
        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);
        
        weak_txt.setText("GRASS");
        weak2_txt.setText("ELETRIC");
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void fire_flying(){
 	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(51,102,255));
        weak2_background.setBackground(new java.awt.Color(248,208,48));
        weak3_background.setBackground(new java.awt.Color(204, 153, 0));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("WATER");
        weak2_txt.setText("ELETRIC");
        weak3_txt.setText("ROCK*");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);       
    }
    
    private void bug_monotype(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(153, 153, 255));
        weak3_background.setBackground(new java.awt.Color(204, 153, 0));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("FLYING");
        weak3_txt.setText("ROCK");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void bug_flying(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(153, 153, 255));
        weak3_background.setBackground(new java.awt.Color(248,208,48));
        weak4_background.setBackground(new java.awt.Color(152,216,216));
        weak5_background.setBackground(new java.awt.Color(204, 153, 0));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("FLYING");
        weak3_txt.setText("ELETRIC");
        weak4_txt.setText("ICE");
        weak5_txt.setText("ROCK*");
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void bug_poison(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(248,88,136));
        weak3_background.setBackground(new java.awt.Color(153, 153, 255));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("PSYCHIC");
        weak3_txt.setText("FLYING");
        weak4_txt.setText("ROCK");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void normal_flying(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(248,208,48));
        weak2_background.setBackground(new java.awt.Color(152,216,216));
        weak3_background.setBackground(new java.awt.Color(204, 153, 0));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("ELETRIC");
        weak2_txt.setText("ICE");
        weak3_txt.setText("ROCK");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void normal_monotype(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(null);
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(204,0,102));
        weak2_background.setBackground(null);
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIGHTING");
        weak2_txt.setText(null);
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void dark_normal(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBackground(new java.awt.Color(168,184,32));
        weak3_background.setBackground(new java.awt.Color(204,0,102));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FAIRY");
        weak2_txt.setText("BUG");
        weak3_txt.setText("FIGHTING*");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void poison_monotype(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(248,88,136));
        weak2_background.setBackground(new java.awt.Color(224,192,104));
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("PSYCHIC");
        weak2_txt.setText("GROUND");
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void eletric_monotype(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(null);
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(224,192,104));
        weak2_background.setBackground(null);
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GROUND");
        weak2_txt.setText(null);
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void eletric_psychic(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(112,88,72));
        weak3_background.setBackground(new java.awt.Color(168,184,32));
        weak4_background.setBackground(new java.awt.Color(224,192,104));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("DARK");
        weak3_txt.setText("BUG");
        weak4_txt.setText("GROUND");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void ground_monotype(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(51,102,255));
        weak2_background.setBackground(new java.awt.Color(120,200,80));
        weak3_background.setBackground(new java.awt.Color(152,216,216));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("WATER");
        weak2_txt.setText("GRASS");
        weak3_txt.setText("ICE");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void ice_steel(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(204,0,102));
        weak3_background.setBackground(new java.awt.Color(224,192,104));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE*");
        weak2_txt.setText("FIGHTING*");
        weak3_txt.setText("GROUND");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    } 
    
    private void poison_ground(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(51,102,255));
        weak2_background.setBackground(new java.awt.Color(248,88,136));
        weak3_background.setBackground(new java.awt.Color(152,216,216));
        weak4_background.setBackground(new java.awt.Color(224,192,104));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("WATER");
        weak2_txt.setText("PSYCHIC");
        weak3_txt.setText("ICE");
        weak4_txt.setText("GROUND");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void fairy_monotype(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(211,211,204));
        weak2_background.setBackground(new java.awt.Color(160,64,160));
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("STEEL");
        weak2_txt.setText("POISON");
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void ice_monotype(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(211,211,204));
        weak3_background.setBackground(new java.awt.Color(204,0,102));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("STEEL");
        weak3_txt.setText("FIGHTING");
        weak4_txt.setText("ROCK");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void ice_fairy(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(211,211,204));
        weak3_background.setBackground(new java.awt.Color(160,64,160));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("STEEL*");
        weak3_txt.setText("POISON");
        weak4_txt.setText("ROCK");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void poison_flying(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(248,88,136));
        weak2_background.setBackground(new java.awt.Color(248,208,48));
        weak3_background.setBackground(new java.awt.Color(152,216,216));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("PSYCHIC");
        weak2_txt.setText("ELETRIC");
        weak3_txt.setText("ICE");
        weak4_txt.setText("ROCK");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);        
    }
    
    private void water_ice(){
	weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(120,200,80));
        weak2_background.setBackground(new java.awt.Color(248,208,48));
        weak3_background.setBackground(new java.awt.Color(204,0,102));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GRASS");
        weak2_txt.setText("ELETRIC");
        weak3_txt.setText("FIGHTING");
        weak4_txt.setText("ROCK");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
   
    private void psychic_monotype(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(112,88,72));
        weak3_background.setBackground(new java.awt.Color(168,184,32));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("DARK");
        weak3_txt.setText("BUG");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null); 
    }    
    
    private void fighting_monotype(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(248,88,136));
        weak2_background.setBackground(new java.awt.Color(153, 153, 255));
        weak3_background.setBackground(new java.awt.Color(255, 153, 204));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("PSYCHIC");
        weak2_txt.setText("FLYING");
        weak3_txt.setText("FAIRY");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null); 
    }
    
    private void water_poison(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(248,88,136));
        weak2_background.setBackground(new java.awt.Color(248,208,48));
        weak3_background.setBackground(new java.awt.Color(224,192,104));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("PSYCHIC");
        weak2_txt.setText("ELETRIC");
        weak3_txt.setText("GROUND");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void ghost_poison(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(112,88,72));
        weak3_background.setBackground(new java.awt.Color(248,88,136));
        weak4_background.setBackground(new java.awt.Color(224,192,104));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("DARK");
        weak3_txt.setText("PSYCHIC");
        weak4_txt.setText("GROUND");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void water_fighting(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBackground(new java.awt.Color(120,200,80));
        weak3_background.setBackground(new java.awt.Color(153, 153, 255));
        weak4_background.setBackground(new java.awt.Color(248,88,136));
        weak5_background.setBackground(new java.awt.Color(248,208,48));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FAIRY");
        weak2_txt.setText("GRASS");
        weak3_txt.setText("FLYING");
        weak4_txt.setText("PSYCHIC");
        weak5_txt.setText("ELETRIC");
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void water_psychic(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(112,88,72));
        weak3_background.setBackground(new java.awt.Color(120,200,80));
        weak4_background.setBackground(new java.awt.Color(248,208,48));
        weak5_background.setBackground(new java.awt.Color(168,184,32));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("DARK");
        weak3_txt.setText("GRASS");
        weak4_txt.setText("ELETRIC");
        weak5_txt.setText("BUG");
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void ice_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(211,211,204));
        weak2_background.setBackground(new java.awt.Color(255, 102, 51));
        weak3_background.setBackground(new java.awt.Color(248,208,48));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("STEEL");
        weak2_txt.setText("FIRE");
        weak3_txt.setText("ELETRIC");
        weak4_txt.setText("ROCK*");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);   
    }
    
    private void eletric_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(152,216,216));
        weak2_background.setBackground(new java.awt.Color(204, 153, 0));
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("ICE");
        weak2_txt.setText("ROCK");
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void dragon_monotype(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBackground(new java.awt.Color(152,216,216));
        weak3_background.setBackground(new java.awt.Color(112,56,248));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FAIRY");
        weak2_txt.setText("ICE");
        weak3_txt.setText("DRAGON");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void dragon_fire(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(224,192,104));
        weak2_background.setBackground(new java.awt.Color(204, 153, 0));
        weak3_background.setBackground(new java.awt.Color(112,56,248));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GROUND");
        weak2_txt.setText("ROCK");
        weak3_txt.setText("DRAGON");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void dragon_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBackground(new java.awt.Color(112,56,248));
        weak3_background.setBackground(new java.awt.Color(152,216,216));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FAIRY");
        weak2_txt.setText("DRAGON");
        weak3_txt.setText("ICE*");
        weak4_txt.setText("ROCK");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void rock_ground(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(211,211,204));
        weak2_background.setBackground(new java.awt.Color(204,0,102));
        weak3_background.setBackground(new java.awt.Color(51,102,255));
        weak4_background.setBackground(new java.awt.Color(152,216,216));
        weak5_background.setBackground(new java.awt.Color(120,200,80));
        weak6_background.setBackground(new java.awt.Color(224,192,104));
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak6_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("STEEL");
        weak2_txt.setText("FIGHTING");
        weak3_txt.setText("WATER*");
        weak4_txt.setText("ICE");
        weak5_txt.setText("GRASS*");
        weak6_txt.setText("GROUND");
        weak7_txt.setText(null);
    }
    
    private void rock_water(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(120,200,80));
        weak2_background.setBackground(new java.awt.Color(248,208,48));
        weak3_background.setBackground(new java.awt.Color(204,0,102));
        weak4_background.setBackground(new java.awt.Color(224,192,104));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GRASS*");
        weak2_txt.setText("ELETRIC");
        weak3_txt.setText("FIGHTING");
        weak4_txt.setText("GROUND");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void eletric_steel(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(204,0,102));
        weak3_background.setBackground(new java.awt.Color(224,192,104));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("FIGHTING");
        weak3_txt.setText("GROUND*");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void psychic_fairy(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(211,211,204));
        weak3_background.setBackground(new java.awt.Color(160,64,160));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("STEEL");
        weak3_txt.setText("POISON");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void ice_psychic(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(211,211,204));
        weak2_background.setBackground(new java.awt.Color(73,57,99));
        weak3_background.setBackground(new java.awt.Color(255, 102, 51));
        weak4_background.setBackground(new java.awt.Color(112,88,72));
        weak5_background.setBackground(new java.awt.Color(204, 153, 0));
        weak6_background.setBackground(new java.awt.Color(168,184,32));
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("STEEL");
        weak2_txt.setText("GHOST");
        weak3_txt.setText("FIRE");
        weak4_txt.setText("DARK");
        weak5_txt.setText("ROCK");
        weak6_txt.setText("BUG");
        weak7_txt.setText(null);
    }
    
    private void water_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(248,208,48));
        weak2_background.setBackground(new java.awt.Color(204, 153, 0));
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("ELETRIC*");
        weak2_txt.setText("ROCK");
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void water_dark(){
       weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBackground(new java.awt.Color(120,200,80));
        weak3_background.setBackground(new java.awt.Color(248,208,48));
        weak4_background.setBackground(new java.awt.Color(204,0,102));
        weak5_background.setBackground(new java.awt.Color(168,184,32));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FAIRY");
        weak2_txt.setText("GRASS");
        weak3_txt.setText("ELETRIC");
        weak4_txt.setText("FIGHTING");
        weak5_txt.setText("BUG");
        weak6_txt.setText(null);
        weak7_txt.setText(null); 
    }
    
    private void rock_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(211,211,204));
        weak2_background.setBackground(new java.awt.Color(51,102,255));
        weak3_background.setBackground(new java.awt.Color(248,208,48));
        weak4_background.setBackground(new java.awt.Color(152,216,216));
        weak5_background.setBackground(new java.awt.Color(204, 153, 0));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("STEEL");
        weak2_txt.setText("WATER");
        weak3_txt.setText("ELETRIC");
        weak4_txt.setText("ICE");
        weak5_txt.setText("ROCK");
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void bug_grass(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(153, 153, 255));
        weak3_background.setBackground(new java.awt.Color(152,216,216));
        weak4_background.setBackground(new java.awt.Color(160,64,160));
        weak5_background.setBackground(new java.awt.Color(204, 153, 0));
        weak6_background.setBackground(new java.awt.Color(168,184,32));
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE*");
        weak2_txt.setText("FLYING*");
        weak3_txt.setText("ICE");
        weak4_txt.setText("POISON");
        weak5_txt.setText("ROCK");
        weak6_txt.setText("BUG");
        weak7_txt.setText(null);
    }
    
    private void grass_monotype(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(153, 153, 255));
        weak3_background.setBackground(new java.awt.Color(152,216,216));
        weak4_background.setBackground(new java.awt.Color(160,64,160));
        weak5_background.setBackground(new java.awt.Color(168,184,32));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("FLYING");
        weak3_txt.setText("ICE");
        weak4_txt.setText("POISON");
        weak5_txt.setText("BUG");
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void grass_psychic(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak7_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(255, 102, 51));
        weak3_background.setBackground(new java.awt.Color(153, 153, 255));
        weak4_background.setBackground(new java.awt.Color(152,216,216));
        weak5_background.setBackground(new java.awt.Color(112,88,72));
        weak6_background.setBackground(new java.awt.Color(160,64,160));
        weak7_background.setBackground(new java.awt.Color(168,184,32));
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("FIRE");
        weak3_txt.setText("FLYING");
        weak4_txt.setText("ICE");
        weak5_txt.setText("DARK");
        weak6_txt.setText("POISON");
        weak7_txt.setText("BUG*");
    }
    
    private void ground_steel(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(51,102,255));
        weak3_background.setBackground(new java.awt.Color(204,0,102));
        weak4_background.setBackground(new java.awt.Color(224,192,104));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("WATER");
        weak3_txt.setText("FIGHTING");
        weak4_txt.setText("GROUND");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void dark_monotype(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBackground(new java.awt.Color(168,184,32));
        weak3_background.setBackground(new java.awt.Color(204,0,102));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FAIRY");
        weak2_txt.setText("BUG");
        weak3_txt.setText("FIGHTING");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void rock_eletric(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(51,102,255));
        weak2_background.setBackground(new java.awt.Color(120,200,80));
        weak3_background.setBackground(new java.awt.Color(204,0,102));
        weak4_background.setBackground(new java.awt.Color(224,192,104));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("WATER");
        weak2_txt.setText("GRASS");
        weak3_txt.setText("FIGHTING");
        weak4_txt.setText("GROUND*");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void dark_poison(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(null);
        weak3_background.setBorder(null);
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(224,192,104));
        weak2_background.setBackground(null);
        weak3_background.setBackground(null);
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GROUND");
        weak2_txt.setText(null);
        weak3_txt.setText(null);
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void psychic_poison(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(112,88,72));
        weak3_background.setBackground(new java.awt.Color(224,192,104));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("DARK");
        weak3_txt.setText("GROUND");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void grass_dragon(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(153, 153, 255));
        weak2_background.setBackground(new java.awt.Color(152,216,216));
        weak3_background.setBackground(new java.awt.Color(112,56,248));
        weak4_background.setBackground(new java.awt.Color(160,64,160));
        weak5_background.setBackground(new java.awt.Color(255, 153, 204));
        weak6_background.setBackground(new java.awt.Color(168,184,32));
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FLYING");
        weak2_txt.setText("ICE*");
        weak3_txt.setText("DRAGON");
        weak4_txt.setText("POISON");
        weak5_txt.setText("FAIRY");
        weak6_txt.setText("BUG");
        weak7_txt.setText(null);
    }
    
    private void fire_ghost(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(51,102,255));
        weak2_background.setBackground(new java.awt.Color(73,57,99));
        weak3_background.setBackground(new java.awt.Color(224,192,104));
        weak4_background.setBackground(new java.awt.Color(112,88,72));
        weak5_background.setBackground(new java.awt.Color(204, 153, 0));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/water.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("WATER");
        weak2_txt.setText("GHOST");
        weak3_txt.setText("GROUND");
        weak4_txt.setText("DARK");
        weak5_txt.setText("ROCK");
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void poison_fairy(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(211,211,204));
        weak2_background.setBackground(new java.awt.Color(248,88,136));
        weak3_background.setBackground(new java.awt.Color(224,192,104));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("STEEL");
        weak2_txt.setText("PSYCHIC");
        weak3_txt.setText("GROUND");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void psychic_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(112,88,72));
        weak3_background.setBackground(new java.awt.Color(248,208,48));
        weak4_background.setBackground(new java.awt.Color(152,216,216));
        weak5_background.setBackground(new java.awt.Color(204, 153, 0));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("DARK");
        weak3_txt.setText("ELETRIC");
        weak4_txt.setText("ICE");
        weak5_txt.setText("ROCK");
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void fighting_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(248,88,136));
        weak2_background.setBackground(new java.awt.Color(153, 153, 255));
        weak3_background.setBackground(new java.awt.Color(255, 153, 204));
        weak4_background.setBackground(new java.awt.Color(248,208,48));
        weak5_background.setBackground(new java.awt.Color(152,216,216));
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("PSYCHIC");
        weak2_txt.setText("FLYING");
        weak3_txt.setText("FAIRY");
        weak4_txt.setText("ELETRIC");
        weak5_txt.setText("ICE");
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void dark_flying(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBackground(new java.awt.Color(248,208,48));
        weak3_background.setBackground(new java.awt.Color(152,216,216));
        weak4_background.setBackground(new java.awt.Color(204, 153, 0));
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(null);
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FAIRY");
        weak2_txt.setText("ELETRIC");
        weak3_txt.setText("ICE");
        weak4_txt.setText("ROCK");
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void psychic_fighting(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(73,57,99));
        weak2_background.setBackground(new java.awt.Color(255, 153, 204));
        weak3_background.setBackground(new java.awt.Color(153, 153, 255));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(null);
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/flying.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("GHOST");
        weak2_txt.setText("FAIRY");
        weak3_txt.setText("FLYING");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    
    private void steel_monotype(){
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setBorder(null);
        weak5_background.setBorder(null);
        weak6_background.setBorder(null);
        weak7_background.setBorder(null);
        weak8_background.setBorder(null);

	weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak2_background.setBackground(new java.awt.Color(204,0,102));
        weak3_background.setBackground(new java.awt.Color(224,192,104));
        weak4_background.setBackground(null);
        weak5_background.setBackground(null);
        weak6_background.setBackground(null);
        weak7_background.setBackground(null);
        weak8_background.setBackground(null);

        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png")));
        weak2_txt.setIcon(null);
        weak3_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/ground.png")));
        weak4_txt.setIcon(null);
        weak5_txt.setIcon(null);
        weak6_txt.setIcon(null);
        weak7_txt.setIcon(null);
        weak8_txt.setIcon(null);

	weak_txt.setText("FIRE");
        weak2_txt.setText("FIGHTING");
        weak3_txt.setText("GROUND");
        weak4_txt.setText(null);
        weak5_txt.setText(null);
        weak6_txt.setText(null);
        weak7_txt.setText(null);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Name of the Pokemons Variations">
    private void variations(){
            
        String name = pokemon_name.getSelectedItem().toString();
        String varpok = pokemon_variations.getSelectedItem().toString();
        
        if(name.equals(" #001 Bulbasaur")){
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Bulbasaur");
        pokemon_variations.setEnabled(false);
        } else if (name.equals(" #002 Ivysaur")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Ivysaur");
        pokemon_variations.setEnabled(false);
        } else if (name.equals(" #003 Venusaur")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Venusaur"); 
        pokemon_variations.addItem("Mega Venusaur");
        pokemon_variations.addItem("Gigantamax Venusaur");
        } else if (name.equals(" #004 Charmander")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Charmander");
        pokemon_variations.setEnabled(false);    
        } else if (name.equals(" #005 Charmeleon")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Charmeleon");
        pokemon_variations.setEnabled(false); 
        } else if (name.equals(" #006 Charizard")){
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Charizard"); 
        pokemon_variations.addItem("Mega Charizard X");
        pokemon_variations.addItem("Mega Charizard Y");
        pokemon_variations.addItem("Gigantamax Charizard");
        
        } else if (name.equals(" #007 Squirtle")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Squirtle");
        pokemon_variations.setEnabled(false);    
        
        } else if (name.equals(" #008 Wartortle")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Wartortle");
        pokemon_variations.setEnabled(false);    
        
        } else if (name.equals(" #009 Blastoise")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Blastoise"); 
        pokemon_variations.addItem("Mega Blastoise");
        pokemon_variations.addItem("Gigantamax Blastoise");
        
        }  else if (name.equals(" #010 Caterpie")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Caterpie");
        pokemon_variations.setEnabled(false);   
        
        }  else if (name.equals(" #011 Metapod")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Metapod");
        pokemon_variations.setEnabled(false);  
        
        }  else if (name.equals(" #012 Butterfree")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Butterfree"); 
        pokemon_variations.addItem("Gigantamax Butterfree");
        
        }  else if (name.equals(" #013 Weedle")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Weedle");
        pokemon_variations.setEnabled(false); 
        
        }  else if (name.equals(" #014 Kakuna")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Kakuna");
        pokemon_variations.setEnabled(false); 
        
        }  else if (name.equals(" #015 Beedrill")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Beedrill"); 
        pokemon_variations.addItem("Mega Beedrill"); 
        
        }  else if (name.equals(" #016 Pidgey")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Pidgey");
        pokemon_variations.setEnabled(false);    
        }  else if (name.equals(" #017 Pidgeotto")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Pidgeotto");
        pokemon_variations.setEnabled(false);  
        
        }  else if (name.equals(" #018 Pidgeot")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Pidgeot"); 
        pokemon_variations.addItem("Mega Pidgeot"); 
        
        }  else if (name.equals(" #019 Rattata")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Rattata"); 
        pokemon_variations.addItem("Alolan Form"); 
        
        }  else if (name.equals(" #020 Raticate")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Raticate"); 
        pokemon_variations.addItem("Alolan Form"); 
        
        }  else if (name.equals(" #021 Spearow")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Spearow");
        pokemon_variations.setEnabled(false);  
            
        }  else if (name.equals(" #022 Fearow")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Fearow");
        pokemon_variations.setEnabled(false);  
           
        }  else if (name.equals(" #023 Ekans")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Ekans");
        pokemon_variations.setEnabled(false);  
            
        }  else if (name.equals(" #024 Arbok")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Arbok");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #025 Pikachu")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Pikachu"); 
        pokemon_variations.addItem("Gigantamax Pikachu"); 
            
        }   else if (name.equals(" #026 Raichu")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Raichu"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #027 Sandshrew")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Sandshrew"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #028 Sandslash")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Sandslash"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #029 Nidoran♀")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Nidoran♀");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #030 Nidorina")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Nidorina");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #031 Nidoqueen")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Nidoqueen");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #032 Nidoran♂")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Nidoran♂");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #033 Nidorino")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Nidorino");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #034 Nidoking")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Nidoking");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #035 Clefairy")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Clefairy");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #036 Clefable")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Clefable");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #037 Vulpix")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Vulpix"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #038 Ninetales")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Ninetales"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #039 Jigglypuff")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Jigglypuff");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #040 Wigglytuff")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Wigglytuff");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #041 Zubat")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Zubat");
        pokemon_variations.setEnabled(false);  
           
        }   else if (name.equals(" #042 Golbat")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Golbat");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #043 Oddish")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Oddish");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #044 Gloom")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Gloom");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #045 Vileplume")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Vileplume");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #046 Paras")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Paras");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #047 Parasect")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Parasect");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #048 Venonat")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Venonat");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #049 Venomoth")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Venomoth");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #050 Diglett")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Diglett"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #051 Dugtrio")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Dugtrio"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #052 Meowth")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Meowth"); 
        pokemon_variations.addItem("Alolan Form");  
        pokemon_variations.addItem("Galarian Form"); 
        pokemon_variations.addItem("Gigantamax Meowth");
            
        }   else if (name.equals(" #053 Persian")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Persian"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #054 Psyduck")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Psyduck");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #055 Golduck")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Golduck");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #056 Mankey")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Mankey");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #057 Primeape")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Primeape");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #058 Growlithe")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Growlithe");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #059 Arcanine")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Arcanine");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #060 Poliwag")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Poliwag");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #061 Poliwhirl")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Poliwhirl");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #062 Poliwrath")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Poliwrath");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #063 Abra")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Abra");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #064 Kadabra")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Kadabra");
        pokemon_variations.setEnabled(false);  
           
        }   else if (name.equals(" #065 Alakazam")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Alakazam"); 
        pokemon_variations.addItem("Mega Alakazam"); 
            
        }   else if (name.equals(" #066 Machop")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Machop");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #067 Machoke")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Machoke");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #068 Machamp")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Machamp"); 
        pokemon_variations.addItem("Gigantamax Machamp"); 
            
        }   else if (name.equals(" #069 Bellsprout")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Bellsprout");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #070 Weepinbell")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Weepinbell");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #071 Victreebel")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Victreebel");
        pokemon_variations.setEnabled(false);  
             
        }   else if (name.equals(" #072 Tentacool")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Tentacool");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #073 Tentacruel")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Tentacruel");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #074 Geodude")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Geodude"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #075 Graveler")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Graveler"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #076 Golem")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Golem"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }   else if (name.equals(" #077 Ponyta")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Ponyta"); 
        pokemon_variations.addItem("Galarian Form"); 
            
        }   else if (name.equals(" #078 Rapidash")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Rapidash"); 
        pokemon_variations.addItem("Galarian Form"); 
            
        }   else if (name.equals(" #079 Slowpoke")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Slowpoke"); 
        pokemon_variations.addItem("Galarian Form"); 
            
        }   else if (name.equals(" #080 Slowbro")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Slowbro");
        pokemon_variations.addItem("Mega Slowbro");
        pokemon_variations.addItem("Galarian Form"); 
            
        }   else if (name.equals(" #081 Magnemite")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Magnemite");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #082 Magneton")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Magneton");
        pokemon_variations.setEnabled(false);  
            
        }   else if (name.equals(" #083 Farfetch'd")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Farfetch'd"); 
        pokemon_variations.addItem("Galarian Form"); 
             
        }   else if (name.equals(" #084 Doduo")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Doduo");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #085 Dodrio")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Dodrio");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #086 Seel")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Seel");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #087 Dewgong")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Dewgong");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #088 Grimer")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Grimer"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }    else if (name.equals(" #089 Muk")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Muk"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }    else if (name.equals(" #090 Shellder")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Shellder");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #091 Cloyster")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Cloyster");
        pokemon_variations.setEnabled(false);  
           
        }    else if (name.equals(" #092 Gastly")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Gastly");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #093 Haunter")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Haunter");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #094 Gengar")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Gengar"); 
        pokemon_variations.addItem("Mega Gengar"); 
        pokemon_variations.addItem("Gigantamax Gengar"); 
            
        }    else if (name.equals(" #095 Onix")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Onix");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #096 Drowzee")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Drowzee");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #097 Hypno")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Hypno");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #098 Krabby")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Krabby");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #099 Kingler")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Kingler"); 
        pokemon_variations.addItem("Gigantamax Kingler"); 
             
        }    else if (name.equals(" #100 Voltorb")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Voltorb");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #101 Electrode")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Electrode");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #102 Exeggcute")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Exeggcute");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #103 Exeggutor")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Exeggutor"); 
        pokemon_variations.addItem("Alolan Form"); 
            
        }    else if (name.equals(" #104 Cubone")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Cubone");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #105 Marowak")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Marowak"); 
        pokemon_variations.addItem("Alolan Form"); 
             
        }    else if (name.equals(" #106 Hitmonlee")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Hitmonlee");
        pokemon_variations.setEnabled(false);  
             
        }    else if (name.equals(" #107 Hitmonchan")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Hitmonchan");
        pokemon_variations.setEnabled(false);  
             
        }    else if (name.equals(" #108 Lickitung")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Licktung");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #109 Koffing")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Koffing");
        pokemon_variations.setEnabled(false);  
            
        }    else if (name.equals(" #110 Weezing")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Weezing"); 
        pokemon_variations.addItem("Galarian Form"); 
             
        }    else if (name.equals(" #111 Rhyhorn")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Rhyhorn");
        pokemon_variations.setEnabled(false);  
              
        }     else if (name.equals(" #112 Rhydon")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Rhydon");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #113 Chansey")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Chansey");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #114 Tangela")) {
           
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Tangela");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #115 Kangaskhan")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Kangaskhan"); 
        pokemon_variations.addItem("Mega Kangaskhan"); 
            
        }     else if (name.equals(" #116 Horsea")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Horsea");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #117 Seadra")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Seadra");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #118 Goldeen")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Goldeen");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #119 Seaking")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Seaking");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #120 Staryu")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Staryu");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #121 Starmie")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Starmie");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #122 Mr. Mime")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Mr. Mime"); 
        pokemon_variations.addItem("Galarian Form"); 
            
        }     else if (name.equals(" #123 Scyther")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Scyther");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #124 Jynx")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Jynx");
        pokemon_variations.setEnabled(false);  
             
        }     else if (name.equals(" #125 Electabuzz")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Electabuzz");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #126 Magmar")) {
            
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Magmar");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #127 Pinsir")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Pinsir"); 
        pokemon_variations.addItem("Mega Pinsir"); 
            
        }     else if (name.equals(" #128 Tauros")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Tauros");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #129 Magikarp")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Magikarp");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #130 Gyarados")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Gyarados"); 
        pokemon_variations.addItem("Mega Gyarados"); 
            
        }     else if (name.equals(" #131 Lapras")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Lapras"); 
        pokemon_variations.addItem("Gigantamax Lapras"); 
             
        }     else if (name.equals(" #132 Ditto")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Ditto");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #133 Eevee")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Eevee"); 
        pokemon_variations.addItem("Gigantamax Eevee"); 
            
        }     else if (name.equals(" #134 Vaporeon")) {
              
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Vaporeon");
        pokemon_variations.setEnabled(false);  
           
        }     else if (name.equals(" #135 Jolteon")) {
              
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Jolteon");
        pokemon_variations.setEnabled(false);  
           
        }     else if (name.equals(" #136 Flareon")) {
              
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Flareon");
        pokemon_variations.setEnabled(false);  
           
        }     else if (name.equals(" #137 Porygon")) {
              
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Porygon");
        pokemon_variations.setEnabled(false);  
           
        }     else if (name.equals(" #138 Omanyte")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Omanyte");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #139 Omastar")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Omastar");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #140 Kabuto")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Kabuto");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #141 Kabutops")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Kabutops");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #142 Aerodactyl")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Aerodactyl"); 
        pokemon_variations.addItem("Mega Aerodactyl"); 
            
        }     else if (name.equals(" #143 Snorlax")) {
             
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Snorlax"); 
        pokemon_variations.addItem("Gigantamax Snorlax"); 
            
        }     else if (name.equals(" #144 Articuno")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Articuno"); 
        pokemon_variations.addItem("Galarian Form"); 
            
        }     else if (name.equals(" #145 Zapdos")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Zapdos"); 
        pokemon_variations.addItem("Galarian Form"); 
            
        }     else if (name.equals(" #146 Moltres")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Moltres"); 
        pokemon_variations.addItem("Galarian Form"); 
            
        }     else if (name.equals(" #147 Dratini")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Dratini");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #148 Dragonair")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Dragonair");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #149 Dragonite")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Dragonite");
        pokemon_variations.setEnabled(false);  
            
        }     else if (name.equals(" #150 Mewtwo")) {
            
        pokemon_variations.setEnabled(true); 
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Mewtwo"); 
        pokemon_variations.addItem("Mega Mewtwo X"); 
        pokemon_variations.addItem("Mega Mewtwo Y");
        
        }     else if (name.equals(" #151 Mew")) {
             
        pokemon_variations.removeAllItems();
        pokemon_variations.addItem("Mew");
        pokemon_variations.setEnabled(false);  
             
        }
    }  
    
    // </editor-fold>
   
    // <editor-fold defaultstate="collapsed" desc="Pokemon Variations">
    public void pokemon_var(){
        try{
            if(pokemon_variations.getSelectedItem().toString().equals("Venusaur")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/003.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.");
            grass1();
            poison2();
            grass_poison();
            } else if(pokemon_variations.getSelectedItem().toString().equals("Mega Venusaur")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/003_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.");
            grass1();
            poison2();
            grass_poison();
            }  else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Venusaur")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/003_f3.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("In battle, this Pokémon swings around two thick vines. If these vines slammed into a 10-story building, they could easily topple it.");
            grass1();
            poison2();
            grass_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Charizard")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/006.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It spits fire that is hot enough to melt boulders. It may cause forest fires by blowing flames.");
            fire1();
            flying2();
            fire_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Charizard X")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/006_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The overwhelming power that fills its entire body causes it to turn black and creates intense blue flames.");
            fire1();
            dragon2();
            dragon_fire();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Charizard Y")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/006_f3.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its bond with its Trainer is the source of its power. It boasts speed and maneuverability greater than that of a jet fighter.");
            fire1();
            flying2();
            fire_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Charizard")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/006_f4.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This colossal, flame-winged figure of a Charizard was brought about by Gigantamax energy.");
            fire1();
            flying2();
            fire_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Blastoise")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/009.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It crushes its foe under its heavy body to cause fainting. In a pinch, it will withdraw inside its shell.");
            water1();
            monotype();
            water_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Blastoise")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/009_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The cannon on its back is as powerful as a tank gun. Its tough legs and back enable it to withstand the recoil from firing the cannon.");
            water1();
            monotype();
            water_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Blastoise")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/009_f3.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s not very good at precision shooting. When attacking, it just fires its 31 cannons over and over and over.");
            water1();
            monotype();
            water_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Butterfree")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/012.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("In battle, it flaps its wings at great speed to release highly toxic dust into the air.");
            bug1();
            flying2();
            bug_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Butterfree")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/012_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Crystallized Gigantamax energy makes up this Pokémon’s blindingly bright and highly toxic scales.");
            bug1();
            flying2();
            bug_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Beedrill")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/015.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has three poisonous stingers on its forelegs and its tail. They are used to jab its enemy repeatedly.");
            bug1();
            poison2();
            bug_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Beedrill")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/015_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its legs have become poison stingers. It stabs its prey repeatedly with the stingers on its limbs, dealing the final blow with the stinger on its rear.");
            bug1();
            poison2();
            bug_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Pidgeot")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/018.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon flies at Mach 2 speed, seeking prey. Its large talons are feared as wicked weapons.");
            normal1();
            flying2();
            normal_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Pidgeot")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/018_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("With its muscular strength now greatly increased, it can fly continuously for two weeks without resting.");
            normal1();
            flying2();
            normal_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Rattata") && pokemon_name.getSelectedItem().toString().equals(" #019 Rattata")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/019.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Will chew on anything with its fangs. If you see one, you can be certain that 40 more live in the area.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #019 Rattata")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/019_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its whiskers provide it with a keen sense of smell, enabling it to pick up the scent of hidden food and locate it instantly.");
            dark1();
            normal2();
            dark_normal();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Raticate")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/020.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its hind feet are webbed. They act as flippers, so it can swim in rivers and hunt for prey.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #020 Raticate")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/020_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It makes its Rattata underlings gather food for it, dining solely on the most nutritious and delicious fare.");
            dark1();
            normal2();
            dark_normal();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Pikachu")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/025.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Pikachu that can generate powerful electricity have cheek sacs that are extra soft and super stretchy.");
            eletric1();
            monotype();
            eletric_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Pikachu")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/025_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its Gigantamax power expanded, forming its supersized body and towering tail.");
            eletric1();
            monotype();
            eletric_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Raichu")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/026.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its long tail serves as a ground to protect itself from its own high-voltage power.");
            eletric1();
            monotype();
            eletric_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #026 Raichu")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/026_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s believed that the weather, climate, and food of the Alola region all play a part in causing Pikachu to evolve into this form of Raichu.");
            eletric1();
            psychic2();
            eletric_psychic();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Sandshrew")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/027.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It loves to bathe in the grit of dry, sandy areas. By sand bathing, the Pokémon rids itself of dirt and moisture clinging to its body.");
            ground1();
            monotype();
            ground_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #027 Sandshrew")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/027_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Life on mountains covered with deep snow has granted this Pokémon a body of ice that’s as hard as steel.");
            ice1();
            steel2();
            ice_steel();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Sandslash")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/028.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The drier the area Sandslash lives in, the harder and smoother the Pokémon’s spikes will feel when touched.");
            ground1();
            monotype();
            ground_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #028 Sandslash")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/028_f2 (1).png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Life on mountains covered with deep snow has granted this Pokémon a body of ice that’s as hard as steel.");
            ice1();
            steel2();
            ice_steel();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Vulpix")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/037.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("While young, it has six gorgeous tails. When it grows, several new tails are sprouted.");
            fire1();
            monotype();
            fire_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #037 Vulpix")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/037_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("After long years in the ever-snowcapped mountains of Alola, this Vulpix has gained power over ice.");
            ice1();
            monotype();
            ice_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Ninetales")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/038.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is said to live 1,000 years, and each of its tails is loaded with supernatural powers.");
            fire1();
            monotype();
            fire_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #038 Ninetales")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/038_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("A deity resides in the snowy mountains where this Pokémon lives. In ancient times, it was worshiped as that deity’s incarnation.");
            ice1();
            fairy2();
            ice_fairy();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Diglett")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/050.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("If a Diglett digs through a field, it leaves the soil perfectly tilled and ideal for planting crops.");
            ground1();
            monotype();
            ground_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #050 Diglett")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/050_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The metal-rich geology of this Pokémon’s habitat caused it to develop steel whiskers on its head.");
            ground1();
            steel2();
            ground_steel();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Dugtrio")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/051.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("A team of Diglett triplets. It triggers huge earthquakes by burrowing 60 miles underground.");
            ground1();
            monotype();
            ground_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #051 Dugtrio")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/051_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Their beautiful, metallic whiskers create a sort of protective helmet on their heads, and they also function as highly precise sensors.");
            ground1();
            steel2();
            ground_steel();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #052 Meowth")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/052_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s accustomed to luxury because it used to live with Alolan royalty. As a result, it’s very picky about food.");
            dark1();
            monotype();
            dark_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Meowth")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/052.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It loves to collect shiny things. If it’s in a good mood, it might even let its Trainer have a look at its hoard of treasures.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #052 Meowth")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/052_f3.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Living with a savage, seafaring people has toughened this Pokémon’s body so much that parts of it have turned to iron.");
            steel1();
            monotype();
            steel_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Meowth")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/052_f4.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The pattern that has appeared on its giant coin is thought to be the key to unlocking the secrets of the Dynamax phenomenon.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Persian")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/053.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Getting this prideful Pokémon to warm up to you takes a lot of effort, and it will claw at you the moment it gets annoyed.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #053 Persian")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/053_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The round face of Alolan Persian is considered to be a symbol of prosperity in the Alola region, so these Pokémon are very well cared for.");
            dark1();
            monotype();
            dark_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alakazam")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/065.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has an incredibly high level of intelligence. Some say that Alakazam remembers everything that ever happens to it, from birth till death.");
            psychic1();
            monotype();
            psychic_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Alakazam")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/065_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s adept at precognition. When attacks completely miss Alakazam, that’s because it’s seeing the future.");
            psychic1();
            monotype();
            psychic_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Machamp")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/068.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It quickly swings its four arms to rock its opponents with ceaseless punches and chops from all angles.");
            fighting1();
            monotype();
            fighting_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Machamp")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/068_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The Gigantamax energy coursing through its arms makes its punches hit as hard as bomb blasts.");
            fighting1();
            monotype();
            fighting_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Geodude")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/074.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Getting this prideful Pokémon to warm up to you takes a lot of effort, and it will claw at you the moment it gets annoyed.");
            rock1();
            ground2();
            rock_ground();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #074 Geodude")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/074_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its stone head is imbued with electricity and magnetism. If you carelessly step on one, you’ll be in for a painful shock.");
            rock1();
            eletric2();
            rock_eletric();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Graveler")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/075.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Often seen rolling down mountain trails. Obstacles are just things to roll straight over, not avoid.");
            rock1();
            ground2();
            rock_ground();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #075 Graveler")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/075_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When it comes rolling down a mountain path, anything in its way gets zapped by electricity and sent flying.");
            rock1();
            eletric2();
            rock_eletric();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Golem")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/076.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Once it sheds its skin, its body turns tender and whitish. Its hide hardens when it’s exposed to air.");
            rock1();
            ground2();
            rock_ground();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #076 Golem")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/076_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It uses magnetism to accelerate and fire off rocks tinged with electricity. Even if it doesn’t score a direct hit, the jolt of electricity will do the job.");
            rock1();
            eletric2();
            rock_eletric();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Ponyta")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/077.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It can’t run properly when it’s newly born. As it races around with others of its kind, its legs grow stronger.");
            fire1();
            monotype();
            fire_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #077 Ponyta")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/077_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its small horn hides a healing power. With a few rubs from this Pokémon’s horn, any slight wound you have will be healed.");
            fairy1();
            monotype();
            fairy_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Rapidash")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/078.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon can be seen galloping through fields at speeds of up to 150 mph, its fiery mane fluttering in the wind.");
            fire1();
            monotype();
            fire_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #078 Rapidash")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/078_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its small horn hides a healing power. With a few rubs from this Pokémon’s horn, any slight wound you have will be healed.");
            fairy1();
            psychic2();
            psychic_fairy();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Slowpoke")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/079.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Slow-witted and oblivious, this Pokémon won’t feel any pain if its tail gets eaten. It won’t notice when its tail grows back, either.");
            water1();
            psychic2();
            water_psychic();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #079 Slowpoke")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/079_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Although this Pokémon is normally zoned out, its expression abruptly sharpens on occasion. The cause for this seems to lie in Slowpoke’s diet.");
            psychic1();
            monotype();
            psychic_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Slowbro")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/080.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Slowpoke became Slowbro when a Shellder bit on to its tail. Sweet flavors seeping from the tail make the Shellder feel as if its life is a dream.");
            water1();
            psychic2();
            water_psychic();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Slowbro")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/080_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Under the influence of Shellder’s digestive fluids, Slowpoke has awakened, gaining a great deal of power—and a little motivation to boot.");
            water1();
            psychic2();
            water_psychic();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #080 Slowbro")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/080_f3.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("A Shellder bite set off a chemical reaction with the spices inside Slowbro’s body, causing Slowbro to become a Poison-type Pokémon.");
            psychic1();
            poison2();
            psychic_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Farfetch’d")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/083.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The stalk this Pokémon carries in its wings serves as a sword to cut down opponents. In a dire situation, the stalk can also serve as food.");
            normal1();
            flying2();
            normal_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #083 Farfetch'd")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/083_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The Farfetch’d of the Galar region are brave warriors, and they wield thick, tough leeks in battle.");
            fighting1();
            monotype();
            fighting_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Grimer")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/088.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Made of congealed sludge. It smells too putrid to touch. Even weeds won’t grow in its path.");
            poison1();
            monotype();
            poison_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #088 Grimer")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/088_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has a passion for trash above all else, speedily digesting it and creating brilliant crystals of sparkling poison.");
            poison1();
            dark2();
            dark_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Muk")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/089.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Smells so awful, it can cause fainting. Through degeneration of its nose, it lost its sense of smell.");
            poison1();
            monotype();
            poison_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #089 Muk")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/089_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Muk’s coloration becomes increasingly vivid the more it feasts on its favorite dish—trash.");
            poison1();
            dark2();
            dark_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Gengar")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/094_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It can pass through other dimensions and appear anywhere. It caused a stir one time when it stuck just one leg out of a wall.");
            ghost1();
            poison2();
            ghost_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gengar")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/094.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("On the night of a full moon, if shadows move on their own and laugh, it must be Gengar’s doing.");
            ghost1();
            poison2();
            ghost_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Gengar")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/094_f3.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Rumor has it that its gigantic mouth leads not into its body, filled with cursed energy, but instead directly to the afterlife.");
            ghost1();
            poison2();
            ghost_poison();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Kingler")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/099.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its large and hard pincer has 10,000-horsepower strength. However, being so big, it is unwieldy to move.");
            water1();
            monotype();
            water_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Kingler")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/099_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The flow of Gigantamax energy has spurred this Pokémon’s left pincer to grow to an enormous size. That claw can pulverize anything.");
            water1();
            monotype();
            water_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Exeggutor")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/103.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Each of Exeggutor’s three heads is thinking different thoughts. The three don’t seem to be very interested in one another.");
            grass1();
            psychic2();
            grass_psychic();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #103 Exeggutor")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/103_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Blazing sunlight has brought out the true form and powers of this Pokémon.");
            grass1();
            dragon2();
            grass_dragon();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Marowak")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/105.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon overcame its sorrow to evolve a sturdy new body. Marowak faces its opponents bravely, using a bone as a weapon.");
            ground1();
            monotype();
            ground_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Alolan Form") && pokemon_name.getSelectedItem().toString().equals(" #105 Marowak")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/105_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon sets the bone it holds on fire and dances through the night as a way to mourn its fallen allies.");
            fire1();
            ghost2();
            fire_ghost();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Weezing")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/110.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It mixes gases between its two bodies. It’s said that these Pokémon were seen all over the Galar region back in the day.");
            poison1();
            monotype();
            poison_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #110 Weezing")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/110_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon consumes particles that contaminate the air. Instead of leaving droppings, it expels clean air.");
            poison2();
            fairy2();
            poison_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Kangaskhan")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/115.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Although it’s carrying its baby in a pouch on its belly, Kangaskhan is swift on its feet. It intimidates its opponents with quick jabs.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Kangaskhan")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/115_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its child has grown rapidly, thanks to the energy of Mega Evolution. Mother and child show off their harmonious teamwork in battle.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mr. Mime")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/122.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The broadness of its hands may be no coincidence—many scientists believe its palms became enlarged specifically for pantomiming.");
            psychic1();
            fairy2();
            psychic_fairy();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #122 Mr. Mime")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/122_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its talent is tap-dancing. It can also manipulate temperatures to create a floor of ice, which this Pokémon can kick up to use as a barrier.");
            ice1();
            psychic2();
            ice_psychic();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Pinsir")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/127.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("These Pokémon judge one another based on pincers. Thicker, more impressive pincers make for more popularity with the opposite gender.");
            bug1();
            monotype();
            bug_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Pinsir")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/127_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("With its vaunted horns, it can lift an opponent 10 times heavier than itself and fly about with ease.");
            bug1();
            flying2();
            bug_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gyarados")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/130.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has an extremely aggressive nature. The Hyper Beam it shoots from its mouth totally incinerates all targets.");
            water1();
            flying2();
            water_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Gyarados")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/130_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Although it obeys its instinctive drive to destroy everything within its reach, it will respond to orders from a Trainer it truly trusts.");
            water1();
            dark2();
            water_dark();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Lapras")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/131.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has an extremely aggressive nature. The Hyper Beam it shoots from its mouth totally incinerates all targets.");
            water1();
            ice2();
            water_ice();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Lapras")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/131_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Over 5,000 people can ride on its shell at once. And it’s a very comfortable ride, without the slightest shaking or swaying.");
            water1();
            ice2();
            water_ice();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Eevee")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/133.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It has the ability to alter the composition of its body to suit its surrounding environment.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Eevee")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/133_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Gigantamax energy upped the fluffiness of the fur around Eevee’s neck. The fur will envelop a foe, capturing its body and captivating its mind.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Aerodactyl")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/142.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This is a ferocious Pokémon from ancient times. Apparently even modern technology is incapable of producing a perfectly restored specimen.");
            rock1();
            flying2();
            rock_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Aerodactyl")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/142_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("The power of Mega Evolution has completely restored its genes. The rocks on its body are harder than diamond.");
            rock1();
            flying2();
            rock_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Snorlax")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/143.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It is not satisfied unless it eats over 880 pounds of food every day. When it is done eating, it goes promptly to sleep.");
            normal1();
            monotype();
            normal_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Gigantamax Snorlax")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/143_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Gigantamax energy has affected stray seeds and even pebbles that got stuck to Snorlax, making them grow to a huge size.");
            normal1();
            monotype();
            normal_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Articuno")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/144.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s said that this Pokémon’s beautiful blue wings are made of ice. Articuno flies over snowy mountains, its long tail fluttering along behind it.");
            ice1();
            flying2();
            ice_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #144 Articuno")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/144_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its feather-like blades are composed of psychic energy and can shear through thick iron sheets as if they were paper.");
            psychic1();
            flying2();
            psychic_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Zapdos")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/145.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon has complete control over electricity. There are tales of Zapdos nesting in the dark depths of pitch-black thunderclouds.");
            eletric1();
            flying2();
            eletric_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #145 Zapdos")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/145_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("When its feathers rub together, they produce a crackling sound like the zapping of electricity. That’s why this Pokémon is called Zapdos.");
            fighting1();
            flying2();
            fighting_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Articuno")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/146.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("It’s one of the legendary bird Pokémon. When Moltres flaps its flaming wings, they glimmer with a dazzling red glow.");
            fire1();
            flying2();
            fire_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Galarian Form") && pokemon_name.getSelectedItem().toString().equals(" #146 Moltres")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/146_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("This Pokémon’s sinister, flame-like aura will consume the spirit of any creature it hits. Victims become burned-out shadows of themselves.");
            dark1();
            flying2();
            dark_flying();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mewtwo")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/150.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Its DNA is almost the same as Mew’s. However, its size and disposition are vastly different.");
            psychic1();
            monotype();
            psychic_monotype();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Mewtwo X")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/150_f2.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Psychic power has augmented its muscles. It has a grip strength of one ton and can sprint a hundred meters in two seconds flat!");
            psychic1();
            fighting2();
            psychic_fighting();
            }   else if(pokemon_variations.getSelectedItem().toString().equals("Mega Mewtwo Y")){
            pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/150_f3.png")));
            pokemon_desc.setText(null);
            pokemon_desc.setText("Despite its diminished size, its mental power has grown phenomenally. With a mere thought, it can smash a skyscraper to smithereens.");
            psychic1();
            monotype();
            psychic_monotype();
            }
        } catch (Exception error){
            System.out.println(error);
        }
    }
    // </editor-fold>
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pokemonart = new javax.swing.JLabel();
        pokemon_name = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pokemon_desc = new javax.swing.JTextArea();
        type_weak = new javax.swing.JPanel();
        type_background = new javax.swing.JPanel();
        type_txt = new javax.swing.JLabel();
        type2_background = new javax.swing.JPanel();
        type2_txt = new javax.swing.JLabel();
        pokemon_variations = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        weak_background = new javax.swing.JPanel();
        weak_txt = new javax.swing.JLabel();
        weak3_background = new javax.swing.JPanel();
        weak3_txt = new javax.swing.JLabel();
        weak5_background = new javax.swing.JPanel();
        weak5_txt = new javax.swing.JLabel();
        weak7_background = new javax.swing.JPanel();
        weak7_txt = new javax.swing.JLabel();
        weak2_background = new javax.swing.JPanel();
        weak2_txt = new javax.swing.JLabel();
        weak4_background = new javax.swing.JPanel();
        weak4_txt = new javax.swing.JLabel();
        weak6_background = new javax.swing.JPanel();
        weak6_txt = new javax.swing.JLabel();
        weak8_background = new javax.swing.JPanel();
        weak8_txt = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        atk_stats = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        hp_stats = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        def_stats = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        spatk_stats = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        spdef_stats = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        spd_stats = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        total_stats = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/iconfinder__Pokeball_1337537.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        jPanel3.setFocusable(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        pokemonart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemonart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/001 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pokemonart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pokemonart, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
        );

        pokemon_name.setBackground(new java.awt.Color(102, 204, 255));
        pokemon_name.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        pokemon_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " #001 Bulbasaur", " #002 Ivysaur", " #003 Venusaur", " #004 Charmander", " #005 Charmeleon", " #006 Charizard", " #007 Squirtle", " #008 Wartortle", " #009 Blastoise", " #010 Caterpie", " #011 Metapod", " #012 Butterfree", " #013 Weedle", " #014 Kakuna", " #015 Beedrill", " #016 Pidgey", " #017 Pidgeotto", " #018 Pidgeot", " #019 Rattata", " #020 Raticate", " #021 Spearow", " #022 Fearow", " #023 Ekans", " #024 Arbok", " #025 Pikachu", " #026 Raichu", " #027 Sandshrew", " #028 Sandslash", " #029 Nidoran♀", " #030 Nidorina", " #031 Nidoqueen", " #032 Nidoran♂", " #033 Nidorino", " #034 Nidoking", " #035 Clefairy", " #036 Clefable", " #037 Vulpix", " #038 Ninetales", " #039 Jigglypuff", " #040 Wigglytuff", " #041 Zubat", " #042 Golbat", " #043 Oddish", " #044 Gloom", " #045 Vileplume", " #046 Paras", " #047 Parasect", " #048 Venonat", " #049 Venomoth", " #050 Diglett", " #051 Dugtrio", " #051 Dugtrio", " #052 Meowth", " #053 Persian", " #054 Psyduck", " #055 Golduck", " #056 Mankey", " #057 Primeape", " #058 Growlithe", " #059 Arcanine", " #060 Poliwag", " #061 Poliwhirl", " #062 Poliwrath", " #063 Abra", " #064 Kadabra", " #065 Alakazam", " #066 Machop", " #067 Machoke", " #068 Machamp", " #069 Bellsprout", " #070 Weepinbell", " #071 Victreebel", " #072 Tentacool", " #073 Tentacruel", " #074 Geodude", " #075 Graveler", " #076 Golem", " #077 Ponyta", " #078 Rapidash", " #079 Slowpoke", " #080 Slowbro", " #081 Magnemite", " #082 Magneton", " #083 Farfetch'd", " #084 Doduo", " #085 Dodrio", " #086 Seel", " #087 Dewgong", " #088 Grimer", " #089 Muk", " #090 Shellder", " #091 Cloyster", " #092 Gastly", " #093 Haunter", " #094 Gengar", " #095 Onix", " #096 Drowzee", " #097 Hypno", " #098 Krabby", " #099 Kingler", " #100 Voltorb", " #101 Electrode", " #102 Exeggcute", " #103 Exeggutor", " #104 Cubone", " #105 Marowak", " #106 Hitmonlee", " #107 Hitmonchan", " #108 Lickitung", " #109 Koffing", " #110 Weezing", " #111 Rhyhorn", " #112 Rhydon", " #113 Chansey", " #114 Tangela", " #115 Kangaskhan", " #116 Horsea", " #117 Seadra", " #118 Goldeen", " #119 Seaking", " #120 Staryu", " #121 Starmie", " #122 Mr. Mime", " #123 Scyther", " #124 Jynx", " #125 Electabuzz", " #126 Magmar", " #127 Pinsir", " #128 Tauros", " #129 Magikarp", " #130 Gyarados", " #131 Lapras", " #132 Ditto", " #133 Eevee", " #134 Vaporeon", " #135 Jolteon", " #136 Flareon", " #137 Porygon", " #138 Omanyte", " #139 Omastar", " #140 Kabuto", " #141 Kabutops", " #142 Aerodactyl", " #143 Snorlax", " #144 Articuno", " #145 Zapdos", " #146 Moltres", " #147 Dratini", " #148 Dragonair", " #149 Dragonite", " #150 Mewtwo", " #151 Mew" }));
        pokemon_name.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nome do Pokémon", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic", 1, 24))); // NOI18N
        pokemon_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon_nameActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel4.setEnabled(false);

        pokemon_desc.setBackground(new java.awt.Color(0, 0, 0));
        pokemon_desc.setColumns(20);
        pokemon_desc.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        pokemon_desc.setForeground(new java.awt.Color(255, 255, 255));
        pokemon_desc.setLineWrap(true);
        pokemon_desc.setRows(5);
        pokemon_desc.setText("There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.");
        pokemon_desc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(pokemon_desc);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        type_weak.setBackground(new java.awt.Color(255, 51, 102));
        type_weak.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "TYPE\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        type_background.setBackground(new java.awt.Color(120, 200, 80));
        type_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        type_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        type_txt.setForeground(new java.awt.Color(255, 255, 255));
        type_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/grass.png"))); // NOI18N
        type_txt.setText("GRASS");
        type_txt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                type_txtInputMethodTextChanged(evt);
            }
        });
        type_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                type_txtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout type_backgroundLayout = new javax.swing.GroupLayout(type_background);
        type_background.setLayout(type_backgroundLayout);
        type_backgroundLayout.setHorizontalGroup(
            type_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(type_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        type_backgroundLayout.setVerticalGroup(
            type_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(type_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        type2_background.setBackground(new java.awt.Color(160, 64, 160));
        type2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        type2_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        type2_txt.setForeground(new java.awt.Color(255, 255, 255));
        type2_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type2_txt.setText("POISON");

        javax.swing.GroupLayout type2_backgroundLayout = new javax.swing.GroupLayout(type2_background);
        type2_background.setLayout(type2_backgroundLayout);
        type2_backgroundLayout.setHorizontalGroup(
            type2_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(type2_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        type2_backgroundLayout.setVerticalGroup(
            type2_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(type2_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout type_weakLayout = new javax.swing.GroupLayout(type_weak);
        type_weak.setLayout(type_weakLayout);
        type_weakLayout.setHorizontalGroup(
            type_weakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(type_weakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(type_weakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(type2_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        type_weakLayout.setVerticalGroup(
            type_weakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(type_weakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(type_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(type2_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pokemon_variations.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        pokemon_variations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulbasaur" }));
        pokemon_variations.setEnabled(false);
        pokemon_variations.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                pokemon_variationsAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pokemon_variationsAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pokemon_variations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon_variationsActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 51, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "WEAKNESS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        weak_background.setBackground(new java.awt.Color(255, 102, 51));
        weak_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        weak_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weak_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/icones/fire.png"))); // NOI18N
        weak_txt.setText("FIRE");

        javax.swing.GroupLayout weak_backgroundLayout = new javax.swing.GroupLayout(weak_background);
        weak_background.setLayout(weak_backgroundLayout);
        weak_backgroundLayout.setHorizontalGroup(
            weak_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weak_backgroundLayout.createSequentialGroup()
                .addComponent(weak_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        weak_backgroundLayout.setVerticalGroup(
            weak_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        weak3_background.setBackground(new java.awt.Color(153, 153, 255));
        weak3_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        weak3_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak3_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak3_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weak3_txt.setText("FLYING");

        javax.swing.GroupLayout weak3_backgroundLayout = new javax.swing.GroupLayout(weak3_background);
        weak3_background.setLayout(weak3_backgroundLayout);
        weak3_backgroundLayout.setHorizontalGroup(
            weak3_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak3_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        weak3_backgroundLayout.setVerticalGroup(
            weak3_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak3_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        weak5_background.setBackground(new java.awt.Color(255, 51, 102));

        weak5_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak5_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak5_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout weak5_backgroundLayout = new javax.swing.GroupLayout(weak5_background);
        weak5_background.setLayout(weak5_backgroundLayout);
        weak5_backgroundLayout.setHorizontalGroup(
            weak5_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak5_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        weak5_backgroundLayout.setVerticalGroup(
            weak5_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak5_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        weak7_background.setBackground(new java.awt.Color(255, 51, 102));

        weak7_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak7_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak7_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout weak7_backgroundLayout = new javax.swing.GroupLayout(weak7_background);
        weak7_background.setLayout(weak7_backgroundLayout);
        weak7_backgroundLayout.setHorizontalGroup(
            weak7_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak7_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        weak7_backgroundLayout.setVerticalGroup(
            weak7_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak7_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        weak2_background.setBackground(new java.awt.Color(255, 153, 204));
        weak2_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak2_background.setPreferredSize(new java.awt.Dimension(126, 44));

        weak2_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak2_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak2_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weak2_txt.setText("PSYCHIC");

        javax.swing.GroupLayout weak2_backgroundLayout = new javax.swing.GroupLayout(weak2_background);
        weak2_background.setLayout(weak2_backgroundLayout);
        weak2_backgroundLayout.setHorizontalGroup(
            weak2_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak2_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        weak2_backgroundLayout.setVerticalGroup(
            weak2_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak2_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        weak4_background.setBackground(new java.awt.Color(152, 216, 216));
        weak4_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        weak4_background.setPreferredSize(new java.awt.Dimension(126, 44));

        weak4_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak4_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak4_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weak4_txt.setText("ICE");

        javax.swing.GroupLayout weak4_backgroundLayout = new javax.swing.GroupLayout(weak4_background);
        weak4_background.setLayout(weak4_backgroundLayout);
        weak4_backgroundLayout.setHorizontalGroup(
            weak4_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak4_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        weak4_backgroundLayout.setVerticalGroup(
            weak4_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak4_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        weak6_background.setBackground(new java.awt.Color(255, 51, 102));

        weak6_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak6_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak6_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout weak6_backgroundLayout = new javax.swing.GroupLayout(weak6_background);
        weak6_background.setLayout(weak6_backgroundLayout);
        weak6_backgroundLayout.setHorizontalGroup(
            weak6_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak6_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        weak6_backgroundLayout.setVerticalGroup(
            weak6_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak6_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        weak8_background.setBackground(new java.awt.Color(255, 51, 102));

        weak8_txt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        weak8_txt.setForeground(new java.awt.Color(255, 255, 255));
        weak8_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout weak8_backgroundLayout = new javax.swing.GroupLayout(weak8_background);
        weak8_background.setLayout(weak8_backgroundLayout);
        weak8_backgroundLayout.setHorizontalGroup(
            weak8_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak8_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        weak8_backgroundLayout.setVerticalGroup(
            weak8_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weak8_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weak3_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weak5_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weak7_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weak_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weak4_background, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(weak6_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weak8_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weak2_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weak_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weak2_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weak3_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(weak4_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weak5_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(weak6_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weak7_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weak8_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(null);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "BASE STATS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 153, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATTACK");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        atk_stats.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        atk_stats.setForeground(new java.awt.Color(255, 255, 255));
        atk_stats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atk_stats.setText("49");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atk_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(atk_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HP");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hp_stats.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        hp_stats.setForeground(new java.awt.Color(255, 255, 255));
        hp_stats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp_stats.setText("45");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hp_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(hp_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DEFENSE");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        def_stats.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        def_stats.setForeground(new java.awt.Color(255, 255, 255));
        def_stats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        def_stats.setText("49");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(def_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(def_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(51, 102, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SP. ATK");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        spatk_stats.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        spatk_stats.setForeground(new java.awt.Color(255, 255, 255));
        spatk_stats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spatk_stats.setText("65");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spatk_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(spatk_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(51, 255, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SP. DEF");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        spdef_stats.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        spdef_stats.setForeground(new java.awt.Color(255, 255, 255));
        spdef_stats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spdef_stats.setText("65");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spdef_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(spdef_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 102, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SPEED");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        spd_stats.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        spd_stats.setForeground(new java.awt.Color(255, 255, 255));
        spd_stats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spd_stats.setText("45");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spd_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(spd_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 51, 102));
        jPanel13.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TOTAL");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        total_stats.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        total_stats.setForeground(new java.awt.Color(255, 255, 255));
        total_stats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_stats.setText("318");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(total_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(248, 248, 248)
                        .addComponent(pokemon_variations, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 343, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pokemon_name, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(type_weak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pokemon_variations))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pokemon_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(type_weak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="System Events">

    private void pokemon_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon_nameActionPerformed
        mostrar();
        variations();
        pokemon_var();
    }//GEN-LAST:event_pokemon_nameActionPerformed

    private void pokemon_variationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon_variationsActionPerformed
        pokemon_var();
    }//GEN-LAST:event_pokemon_variationsActionPerformed

    private void pokemon_variationsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pokemon_variationsAncestorAdded

    }//GEN-LAST:event_pokemon_variationsAncestorAdded

    private void pokemon_variationsAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pokemon_variationsAncestorMoved

    }//GEN-LAST:event_pokemon_variationsAncestorMoved

    private void type_txtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_type_txtInputMethodTextChanged
        
    }//GEN-LAST:event_type_txtInputMethodTextChanged

    private void type_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_type_txtKeyReleased

    }//GEN-LAST:event_type_txtKeyReleased

    // </editor-fold>
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokemonSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokemonSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokemonSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokemonSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokemonSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atk_stats;
    private javax.swing.JLabel def_stats;
    private javax.swing.JLabel hp_stats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pokemon_desc;
    private javax.swing.JComboBox<String> pokemon_name;
    private javax.swing.JComboBox<String> pokemon_variations;
    private javax.swing.JLabel pokemonart;
    private javax.swing.JLabel spatk_stats;
    private javax.swing.JLabel spd_stats;
    private javax.swing.JLabel spdef_stats;
    private javax.swing.JLabel total_stats;
    private javax.swing.JPanel type2_background;
    private javax.swing.JLabel type2_txt;
    private javax.swing.JPanel type_background;
    private javax.swing.JLabel type_txt;
    private javax.swing.JPanel type_weak;
    private javax.swing.JPanel weak2_background;
    private javax.swing.JLabel weak2_txt;
    private javax.swing.JPanel weak3_background;
    private javax.swing.JLabel weak3_txt;
    private javax.swing.JPanel weak4_background;
    private javax.swing.JLabel weak4_txt;
    private javax.swing.JPanel weak5_background;
    private javax.swing.JLabel weak5_txt;
    private javax.swing.JPanel weak6_background;
    private javax.swing.JLabel weak6_txt;
    private javax.swing.JPanel weak7_background;
    private javax.swing.JLabel weak7_txt;
    private javax.swing.JPanel weak8_background;
    private javax.swing.JLabel weak8_txt;
    private javax.swing.JPanel weak_background;
    private javax.swing.JLabel weak_txt;
    // End of variables declaration//GEN-END:variables
}
