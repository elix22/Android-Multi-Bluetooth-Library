package com.ramimartin.multibluetooth.bus;

/**
 * Created by Rami MARTIN on 13/04/2014.
 */
public class ClientConnectionFail {
    public  String serverAddress;
    public ClientConnectionFail(String serverAddress) {
        this.serverAddress = serverAddress;
    }
}
