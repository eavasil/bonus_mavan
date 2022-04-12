package ru.netology.domain;

public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long limit = 500;
        long bonus = amount * percent / 100 / 100;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}