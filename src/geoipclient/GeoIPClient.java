/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoipclient;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 * @author Slightom
 */
public class GeoIPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        System.out.println("My public IP is: " + getGeoIPContext().ip);
        System.out.println("Based on this IP, webService says that I'm in: " + getGeoIPContext().countryName);
    }

    private static GeoIP getGeoIPContext() {
        geoipclient.GeoIPService service = new geoipclient.GeoIPService();
        geoipclient.GeoIPServiceSoap port = service.getGeoIPServiceSoap();
        return port.getGeoIPContext();
    }

}
