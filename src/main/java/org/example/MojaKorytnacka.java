package org.example;

import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class MojaKorytnacka extends Turtle {

    public void trojuholnik(double strana) {
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

}


