package com.app.lokesh.day02;

public class VariablesPlayground {

	public static void main(String[] args) {
		 // ✅ Primitive Types with Creative Names
        byte coffeeShots = 2;
        short pageCount = 320;
        int population = 7_900_000_00;
        long universeAge = 13_800_000_000L;
        float piEstimate = 3.14f;
        double gravitationalConstant = 6.67430e-11;
        char initial = 'J';
        boolean isLearningFun = true;

        // ✅ String Magic: Full Name + Rocket Emoji
        String fullName = "Lokesh Sukhwal";
        String message = fullName + " 🚀";
        System.out.println("\n👋 Hello from: " + message);

        // ✅ Table: Primitive Types & Their Sizes
        System.out.println("\n📊 Primitive Type Sizes (in bytes):");
        System.out.printf(
            "%-10s %-15s %-20s\n",
            "Type", "Value", "Size (Bytes)"
        );
        System.out.printf("%-10s %-15d %-20d\n", "byte", coffeeShots, Byte.BYTES);
        System.out.printf("%-10s %-15d %-20d\n", "short", pageCount, Short.BYTES);
        System.out.printf("%-10s %-15d %-20d\n", "int", population, Integer.BYTES);
        System.out.printf("%-10s %-15d %-20d\n", "long", universeAge, Long.BYTES);
        System.out.printf("%-10s %-15f %-20d\n", "float", piEstimate, Float.BYTES);
        System.out.printf("%-10s %-15e %-20d\n", "double", gravitationalConstant, Double.BYTES);
        System.out.printf("%-10s %-15c %-20d\n", "char", initial, Character.BYTES);
        System.out.printf("%-10s %-15b %-20s\n", "boolean", isLearningFun, "1 (JVM specific)");
    }
}
