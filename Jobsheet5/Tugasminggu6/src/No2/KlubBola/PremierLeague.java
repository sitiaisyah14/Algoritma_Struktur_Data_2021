/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2.KlubBola;

/**
 *
 * @author WINDOWS 10
 */
public class PremierLeague {
    public String team;
    public int play, goal, points;
    
    PremierLeague (String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        points = pt;
    }

    void tampil(){
        System.out.println("  Name Team = " + team);
        System.out.println("  Play      = " +  play);
        System.out.println("  Goal      = " + goal);
        System.out.println("  Points    = " + points);
    }
}
