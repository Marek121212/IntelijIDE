package org.example;

import sk.upjs.jpaz2.JPAZUtilities;
import sk.upjs.jpaz2.Turtle;

import java.awt.*;
import java.util.Random;

public class MojaKorytnacka extends Turtle {

    public Color nahodnaFarba(){
        Color farba = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        return farba;
    }

    public void trojuholnik(double strana) {
        this.setPenColor(nahodnaFarba());
        this.step(strana);
        this.turn(120);
        this.step(strana);
        this.turn(120);
        this.step(strana);
        this.turn(120);
    }

    public void zahada() {
        this.trojuholnik(100);
        this.turn(120);
        this.trojuholnik(100);
        this.turn(120);
        this.trojuholnik(100);
        this.turn(120);
    }

    public void stvorec(double strana) {
        this.step(strana);
        this.turn(90);
        this.step(strana);
        this.turn(90);
        this.step(strana);
        this.turn(90);
        this.step(strana);
        this.turn(90);
    }

    public void stvorec1(double strana) {
        for (int i = 0; i < 4; i++) {
            this.step(strana);
            this.turn(90);
        }
    }

    public void trojuholnik1(double strana) {
        for (int i = 0; i < 3; i++) {
            this.step(strana);
            this.turn(120);
        }
    }

    public void cipa12Hviezda(double strana) {
        for (int i = 0; i < 12; i++) {
            this.step(strana);
            this.step(-strana);
            this.turn(360 / 12);
        }
    }

    public void ciarkaBodkaCiarka(double dlzka) {
        this.step(dlzka / 3);
        this.penUp();
        this.step(dlzka / 6);
        this.dot(dlzka / 12);
        this.step(dlzka / 6);
        this.penDown();
        this.step(dlzka / 3);
    }

    public void domcek(double dlzkaStrany) {
        this.stvorec1(dlzkaStrany);
        this.step(dlzkaStrany);
        this.turn(30);
        this.trojuholnik1(dlzkaStrany);
    }

    public void slniecko(double polomer) {
        this.setPenColor(Color.yellow);
        for (int i = 0; i < 36; i++) {
            this.step(polomer);
            this.step(-polomer);
            this.turn(10);
        }
        this.setFillColor(Color.orange);
        this.dot(polomer / 2);
        this.setVisible(false);
    }

    public void lopatka(double dlzkaLopatky) {
        for (int i = 0; i < 8; i++) {
            this.step(dlzkaLopatky);
            this.turn(45);
            this.step(10);
            this.step(-10);
            this.turn(-45);
            this.step(-dlzkaLopatky);
            this.turn(45);
        }
    }

    public void kriz(double strana) {
        this.setPenColor(Color.red);
        this.setPenWidth(2);
        for (int i = 0; i < 4; i++) {
            this.step(strana);
            this.turn(90);
            this.step(strana);
            this.turn(90);
            this.step(strana);
            this.turn(-90);
        }
    }

    public void obrazec(double strana) {
        this.setPenColor(Color.blue);
        this.setPenWidth(2);
        for (int i = 0; i < 10; i++) {
            this.stvorec1(strana);
            this.turn(90);
            this.step(strana / 2);
            this.turn(-54);
        }
    }

    public void plnyStvorec(double strana) {
        this.setFillColor(Color.orange);
        this.openPolygon();
        this.penUp();
        for (int i = 0; i < 4; i++) {
            this.step(strana);
            this.turn(90);
        }
        this.penDown();
        this.closePolygon();
    }

    public void diamant(double uhol, double strana) {
        this.setFillColor(Color.red);
        this.openPolygon();
        this.penUp();
        this.turn(uhol / 2);
        this.step(strana);
        this.turn(-uhol);
        this.step(strana);
        this.turn(180 + uhol);
        this.step(strana);
        this.turn(-uhol);
        this.step(strana);
        this.penDown();
        this.closePolygon();
    }

    public void mitsubishi(double uhol, double strana) {
        for (int i = 0; i < 3; i++) {
            this.diamant(uhol, strana);
            this.turn(60 + uhol / 2);
        }
    }

    public void plnySestUholnik(double strana) {
        this.setFillColor(Color.orange);
        this.openPolygon();
        this.penUp();
        for (int i = 0; i < 6; i++) {
            this.step(strana);
            this.turn(60);
        }
        this.penDown();
        this.closePolygon();
    }

    public void plnyNUholnik(int n, double strana) {
        this.setFillColor(Color.orange);
        this.openPolygon();
        this.penUp();
        for (int i = 0; i < n; i++) {
            this.step(strana);
            this.turn(360 / n);
        }
        this.penDown();
        this.closePolygon();
    }

    public void orionHviezda(double uhol, double strana) {
        this.setFillColor(Color.blue);
        this.openPolygon();
        this.penUp();
        for (int i = 0; i < 4; i++) {
            this.turn(uhol / 2);
            this.step(strana);
            this.turn(180 - uhol);
            this.step(strana);
            this.turn(-90 + uhol / 2);
        }
        this.penDown();
        this.closePolygon();
    }

    public void plnyTrojuholnik(double strana) {
        this.setFillColor(Color.yellow);
        this.penUp();
        this.openPolygon();
        this.turn(90);
        this.step(strana / 2);
        this.turn(-120);
        this.step(strana);
        this.turn(-120);
        this.step(strana);
        this.turn(-120);
        this.step(strana / 2);
        this.turn(-90);
        this.penDown();
        this.closePolygon();
    }

    public void navigacia(double dlzkaStrany) {
        for (int i = 0; i < 5; i++) {
            this.plnyTrojuholnik(dlzkaStrany);
            this.penUp();
            this.step(dlzkaStrany / 2);
            this.penDown();
        }
    }

    public void rovnoramenny(double rameno, double uhol) {
        double startX = this.getX();
        double startY = this.getY();
        double natocetnie = this.getDirection();
        this.turn(-uhol / 2);
        this.step(rameno);
        double bodAx = this.getX();
        double bodAy = this.getY();
        this.step(-rameno);
        this.turn(uhol);
        this.step(rameno);
        this.moveTo(bodAx, bodAy);
        this.setPosition(startX, startY);
        this.setDirection(natocetnie);
    }

    public void stvorcovaSpirala(int pocetStran) {
        double strana = 150;
        for (int i = 0; i < pocetStran; i++) {
            this.step(strana);
            this.turn(90);
            JPAZUtilities.delay(500);
            strana -= 2;
        }
    }

    public void stvorcovaSpirala1() {
        double strana = 150;
        while (strana > 10) {
            this.step(strana);
            this.turn(90);
            JPAZUtilities.delay(50);
            strana = strana * 0.95;
        }
    }

    public void retiazka(int pocetKoralov, double polomer) {
        this.turn(90);
        this.setFillColor(Color.blue);
        this.penUp();
        for (int i = 0; i < pocetKoralov; i++) {
            this.dot(polomer);
            this.step(2 * polomer);
        }
        this.penDown();
    }

    public void rgbRetiazka(int pocetKoralov, double polomer) {
        this.turn(90);
        this.penUp();
        for (int i = 1; i <= pocetKoralov; i++) {
            if (i % 3 == 1) {
                this.setFillColor(Color.red);
            }
            if (i % 3 == 2) {
                this.setFillColor(Color.green);
            }
            if (i % 3 == 0) {
                this.setFillColor(Color.blue);
            }
            this.dot(polomer);
            this.step(2 * polomer);
        }
        this.penDown();
    }

    public void mlyn(int pocetLopatiek, double rameno, double uhol) {
        for (int i = 0; i < pocetLopatiek; i++) {
            this.rovnoramenny(rameno, uhol);
            this.turn(360 / pocetLopatiek);
        }
    }

    public void nahodnaPochodzka(int pocetKrokov) {
        double startX = this.getX();
        double startY = this.getY();
        for (int i = 0; i < pocetKrokov; i++) {
            this.setDirection(Math.random() * 360);
            if (this.getX() < 250) {
                this.setPenColor(Color.red);
            } else {
                this.setPenColor(Color.green);
            }
            this.step(5);
            if (this.distanceTo(startX, startY) > 100) {
                this.step(-5);
            }
            JPAZUtilities.delay(10);
        }
        this.setPosition(startX, startY);
    }

    public void nahodnaPochodzkaOstra(int pocetKrokov) {
        double startX = this.getX();
        double startY = this.getY();
        for (int i = 0; i < pocetKrokov; i++) {
            int uhol = 90 * (int) (Math.random() * 4);
            this.turn(uhol);
            if (this.getX() < 250) {
                this.setPenColor(Color.red);
            } else {
                this.setPenColor(Color.green);
            }
            this.step(5);
            if (this.distanceTo(startX, startY) > 100) {
                this.step(-5);
            }
            JPAZUtilities.delay(1);
        }
        this.setPosition(startX, startY);
    }

    public void pochodzkaTrojkruh(int pocetKrokov, double polomer) {
        double startX = this.getX();
        double startY = this.getY();
        for (int i = 0; i < pocetKrokov; i++) {
            if (this.distanceTo(startX, startY) < polomer / 3) {
                this.penUp();
            } else {
                penDown();
                if (this.distanceTo(startX, startY) < 2 * polomer / 3) {
                    this.setPenColor(Color.blue);
                } else {
                    this.setPenColor(Color.red);
                }
            }
            this.turn(Math.random() * 360);
            this.step(2);
            JPAZUtilities.delay(1);
            if (this.distanceTo(startX, startY) > polomer) {
                this.step(-2);
            }
        }
        this.setPosition(startX, startY);
    }

    public void pochodzkaStvorec(int pocetKrokov, double strana)
    {
        double startX = this.getX();
        double startY = this.getY();
        for (int i=0; i<pocetKrokov; i++)
        {
            this.turn(Math.random()*360);
            this.step(5);
            if(this.getX()>startX+strana/2
            || this.getX()<startX-strana/2
            || this.getY()>startY+strana/2
            || this.getY()<startY-strana/2)
            {
                this.step(-5);
            }
            //
            // PAZUtilities.delay(1);
        }
        this.setPosition(startX, startY);
    }
}


