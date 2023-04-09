/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4.PacMan;

/**
 *
 * @author WINDOWS 10
 */
public class PacMan {
    int x, y, width, height;
    
    void moveLeft(){
        x -= 1;
    }
    void moveRight(){
        x += 1;
    }
    void moveUp(){
        y -= 1;
    }
    void moveDown(){
        y += 1;
    }
    void printPosition(){
        if (x < 0 || x > width || y > height || y < 0){
            System.out.println("Position melewati batas");
        }
        else {
            System.out.println("Koordinat : ( " + x + " , " + y + " )");
        }
        
    }
}
