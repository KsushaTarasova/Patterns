package org.example.Adapter;

public class Adapter implements SocketTypeA{
    private ChargerTypeF chargerTypeF;

    public Adapter(ChargerTypeF chargerTypeF) {
        this.chargerTypeF = chargerTypeF;
    }

    @Override
    public void connectToTypeASocket() {
        this.chargerTypeF.chargePhone();
    }
}
