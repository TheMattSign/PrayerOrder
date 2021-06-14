package com.middleton.prayerorder.controllers;

import com.middleton.prayerorder.models.NightTimeRoutine;
import javafx.scene.control.Label;

import java.time.format.DateTimeFormatter;

public class PrayerOrderController extends AbstractController {

    public Label date_label;
    public Label piggy_back_true_false;
    public Label prayer_order_one;
    public Label prayer_order_two;
    public Label prayer_order_three;

    NightTimeRoutine nightTimeRoutine = null;

    public void getPrayerOrder() {

        if (nightTimeRoutine == null) {
            nightTimeRoutine = new NightTimeRoutine();
        }

        date_label.setText(nightTimeRoutine.getRoutineDateTime().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));

        prayer_order_one.setText(nightTimeRoutine.getPrayerOrder().get(0));
        prayer_order_two.setText(nightTimeRoutine.getPrayerOrder().get(1));
        prayer_order_three.setText(nightTimeRoutine.getPrayerOrder().get(2));

        if (nightTimeRoutine.isPiggyBacks()) {
            piggy_back_true_false.setText("Yep!");
        } else {
            piggy_back_true_false.setText("Sorry, maybe tomorrow :)");
        }
    }
}
