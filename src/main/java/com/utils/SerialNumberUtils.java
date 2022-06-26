package com.utils;

import org.joda.time.DateTime;

import java.util.UUID;

/**
 * serialNumber 生成器，19位
 * @author GokouRuri
 */
public class SerialNumberUtils {

    public static String createSerialNumber(char type) {
        StringBuilder builder = new StringBuilder(19);

        String date = new DateTime().toString("yyyyMMdd");
        String uid = UUID.randomUUID().toString().replace("-", "").substring(0, 6);

        builder.append("GKRR");

        if (type == 'I' || type == 'i') {
            builder.append('I');
        } else if (type == 'O' || type == 'o') {
            builder.append('O');
        } else {
            return null;
        }

        builder.append(date).append(uid);

        return builder.toString();
    }
}
