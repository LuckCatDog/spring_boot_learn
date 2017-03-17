package com.luckcatdog.learn;

import java.math.BigDecimal;

/**
 * Created by LuckCatDog
 * Date: 2017/3/17
 * Time: 9:53
 */
public class RoundL {

    public static BigDecimal getRoundLValue(double value) {
        return new BigDecimal(value).setScale(3).setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public static BigDecimal getRoundLValue(float value) {
        return new BigDecimal(value).setScale(3).setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
}
