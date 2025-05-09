package util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
		try {
			if (resultSet != null) resultSet.close();
			if (preparedStatement != null) preparedStatement.close();
			if (connection != null) connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
