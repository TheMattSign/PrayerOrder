package com.middleton.prayerorder.models;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NightTimeRoutine {

    private static final Random generator = new Random(getTodaysSeed());

    private static long getTodaysSeed() {
        LocalDateTime now = LocalDateTime.now();
        String seedString = now.getMonthValue() + now.getDayOfMonth() + now.getYear() + "";

        return Long.parseLong(seedString);
    }

    private final List<String> prayerOrder;
    private final boolean piggyBacks;
    private final LocalDateTime routineDateTime;

    public NightTimeRoutine() {
        prayerOrder = Arrays.asList("Addy", "Mose", "Emrick");
        Collections.shuffle(prayerOrder, generator);

        int random = generator.nextInt(10);
        piggyBacks = random >= 8;

        routineDateTime = LocalDateTime.now();
    }

    public List<String> getPrayerOrder() {
        return prayerOrder;
    }

    public boolean isPiggyBacks() {
        return piggyBacks;
    }

    public LocalDateTime getRoutineDateTime() {
        return routineDateTime;
    }
}
