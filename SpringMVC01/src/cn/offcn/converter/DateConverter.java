package cn.offcn.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String str) {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date;
		try {
			if (str.length() > 12) {
				date = format2.parse(str);
			} else {
				date = format1.parse(str);
			}
		} catch (ParseException e) {
			
			e.printStackTrace();
			 date = new Date();
		}
		return date;
	}
}
