package com.ask2784.dairybook.models;

import androidx.annotation.NonNull;

public class Details {
    float quantity, fat, snf, rate, amount;

    public Details() {
    }

    public Details(float quantity, float fat, float snf, float rate, float amount) {
        this.quantity = quantity;
        this.fat = fat;
        this.snf = snf;
        this.rate = rate;
        this.amount = amount;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getSnf() {
        return snf;
    }

    public void setSnf(float snf) {
        this.snf = snf;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @NonNull
    @Override
    public String toString() {
        return "Details{" +
                "quantity=" + quantity +
                ", fat=" + fat +
                ", snf=" + snf +
                ", rate=" + rate +
                ", amount=" + amount +
                '}';
    }
}
