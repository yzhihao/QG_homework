package chap2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Chap2_39_ {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {

		Class<?> clazz = Chap2_39.class;

		Field field = clazz.getDeclaredField("a");

		System.out.println(Modifier.toString(field.getModifiers()));

	}

}