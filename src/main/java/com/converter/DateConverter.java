package com.converter;

import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把JS通过new Data()传过来的时间String处理成Date
 * @author GokouRuri
 */
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(@NotNull String source) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            return format.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
