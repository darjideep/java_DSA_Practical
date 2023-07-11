/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

class Main {
        public static void main(String args[]) {
		Audi a = new Audi(5,7);
		a.Audi();
        }         
    }

class car {
        private int seats;
        private int speed;
 
        public car(int seats, int speed) {
		this.seats = seats;
		this.speed = speed;
		System.out.print("This Is Car ");
        }
    }

    class Audi extends car {
        Audi(int x, int y) {
		super(x,y); 
		System.out.print("This Is Para Audi ");
        }
        void Audi() {
		System.out.print("This Is Def Audi");
        }
    } 
 
    
