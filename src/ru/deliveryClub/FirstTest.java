package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды из ресторанов от 25 минут!"));
    }
    @Test
    public void secondTest() {
        driver.get("https://www.delivery-club.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды из ресторанов от 25 минут!"));
    }



}
