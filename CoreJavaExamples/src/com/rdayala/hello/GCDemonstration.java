package com.rdayala.hello;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class GCDemonstration {
	private static Unsafe unsafe;

	static {
		try {
			Field field = Unsafe.class.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			unsafe = (Unsafe) field.get(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long addressOf(Object o) throws Exception {
		Object[] array = new Object[] { o };

		long baseOffset = unsafe.arrayBaseOffset(Object[].class);
		int addressSize = unsafe.addressSize();
		long objectAddress;
		switch (addressSize) {
		case 4:
			objectAddress = unsafe.getInt(array, baseOffset);
			break;
		case 8:
			objectAddress = unsafe.getLong(array, baseOffset);
			break;
		default:
			throw new Error("unsupported address size: " + addressSize);
		}

		return (objectAddress);
	}

	public static void main(String... args) throws Exception {
		for (int i = 0; i < 32000; i++) {
			Object mine = new GCMe();
			long address = addressOf(mine);
			System.out.println(address);
		}

	}
}

class GCMe {
	long data;
	long _;
	long __;
	long ___;
	long ____;
	long _____;
	long ______;
	long _______;
	long ________;
	long _________;
	long __________;
	long ___________;
	long ____________;
	long _____________;
	long ______________;
	long _______________;
	long _________________;
	long __________________;
}