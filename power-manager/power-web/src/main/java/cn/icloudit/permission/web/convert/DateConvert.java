package cn.icloudit.permission.web.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 自定义日期转换器
 */
public class DateConvert implements Converter<String, Date> {
    // 定义日期格式
    private SimpleDateFormat[] sdfs = new SimpleDateFormat[]{
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    };

    @Override
    public Date convert(String source) {
       for (int i = 0; i < sdfs.length; i++){
           try {
               Date d = sdfs[i].parse(source);
               return d;
           } catch (ParseException e) {
               continue;
           }
       }
       throw new RuntimeException("日期格式无效");
    }
}
