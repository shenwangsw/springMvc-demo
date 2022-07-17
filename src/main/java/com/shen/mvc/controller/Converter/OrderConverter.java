package com.shen.mvc.controller.Converter;

import com.shen.mvc.controller.pojo.Order;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderConverter implements Converter<String, Date>  {
    private String pattern;

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return this.pattern;
    }
    public Date convert(String source) {
        Date date=  null;
        //自定义转换格式
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date= sdf.parse(source);
        }catch (ParseException e){
            System.out.println("date类型转换失败");

        }
        return date;
    }
}