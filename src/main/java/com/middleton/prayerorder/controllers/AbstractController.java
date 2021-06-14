package com.middleton.prayerorder.controllers;

import com.middleton.prayerorder.PrayerOrderFxApp;

import java.io.IOException;

public class AbstractController {

    private PrayerOrderFxApp prayerOrderFxApp;

    void loadScreen(String resourceName) throws IOException {
        prayerOrderFxApp.loadScreen(resourceName);
    }

    public void setPrayerOrderFxApp(PrayerOrderFxApp prayerOrderFxApp) {
        this.prayerOrderFxApp = prayerOrderFxApp;
    }

    public PrayerOrderFxApp getPrayerOrderFxApp() {
        return prayerOrderFxApp;
    }
}
