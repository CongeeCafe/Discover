package com.discover.discoverapp;

import com.discover.discoverapp.item.Location;

/**
 * Created by Kevin on 19/09/2015.
 */
public class Locations {

    public static Location getLocation(int index) {
        switch (index) {
            case 1:
                return new Location("Beijing", "China", "39.904211", "116.407395");
            case 2:
                return new Location("Cairo", "Egypt", "30.044420", "31.235712");
            case 3:
                return new Location("Mumbai", "India", "19.075984", "72.877656");
            case 4:
                return new Location("Sydney", "Australia", "-33.8675", "151.207");
            case 5:
                return new Location("Detroit", "United States", "42.33143", "-83.0458");
            case 6:
                return new Location("Borgsviksbruk", "Sweden", "59.3667", "12.9333");
            case 7:
                return new Location("Mississauga", "Canada", "43.6", "-79.65");
            case 8:
                return new Location("Damascus", "Syria", "33.4935", "36.28478");
            case 9:
                return new Location("Yaounde", "Cameroon", "3.848032", "11.502075");
            default:
                return null;
        }
    }

}
