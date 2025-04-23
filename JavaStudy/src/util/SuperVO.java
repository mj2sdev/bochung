package util;

import java.lang.reflect.Field;

public class SuperVO <T>{
	
	@Override
	public String toString() {
		var builder = new StringBuilder();
		Class<T> clazz = (Class<T>) this.getClass();
		
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
