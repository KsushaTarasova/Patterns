package org.example.Adapter;

public class Main {
    public static void main(String[] args) {
        ChargerTypeF chargerTypeF = new ChargerTypeF();
        Adapter adapter = new Adapter(chargerTypeF);
        adapter.connectToTypeASocket();
    }
}