package util;

import java.lang.reflect.Field;

public class Utils {
	public static String toFields(Object object) {
		var builder = new StringBuilder();
		for (Field field : object.getClass().getDeclaredFields()) {
			builder.append(field.getName());
			Length length = field.getDeclaredAnnotation(Length.class);
			int tapsize = length != null ? length.number() : 1;
			
			while (tapsize-- > 0)
				builder.append("\t");
		}
		return builder.toString();
	}
	
	public static String toString(Object object) {
		var builder = new StringBuilder();
		for (Field field : object.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			try {
				builder.append(field.get(object));
				builder.append("\t");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return builder.toString();
	}
}
