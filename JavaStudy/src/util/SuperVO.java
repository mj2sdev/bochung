package util;

import java.lang.reflect.Field;
import java.sql.Connection;

public class SuperVO <T>{
	
	@Override
	@SuppressWarnings("rawtypes")
	public String toString() {
		var builder = new StringBuilder();
		
		Class clazz = this.getClass();
		
		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			try {
				builder.append(field.get(this));
				builder.append("\t");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return builder.toString();
	}
}
