package org.example;

import sk.upjs.jpaz2.ObjectInspector;
import sk.upjs.jpaz2.Turtle;
import sk.upjs.jpaz2.WinPane;

public class Main {
    public static void main(String[] args) {
        WinPane plocha = new WinPane(500,500);
        MojaKorytnacka jozko = new MojaKorytnacka();
        plocha.add(jozko);
        jozko.plnySestUholnik(100);

    }
}