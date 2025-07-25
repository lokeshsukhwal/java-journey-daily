package com.app.lokesh.day01;

import java.time.LocalDate;

/*
☕  ┌─────────────────────────────┐
    │  Day 1: Java & Me 🤝        │
    └─────────────────────────────┘
*/

//File: HelloWorld.java
//public class name MUST match the file name (case-sensitive!)

public class Day01_HelloWorld {
	// JVM starts execution from this exact method signature
    public static void main(String[] args) {
        // System.out is a pre-wired PrintStream to your console
        System.out.println("Hello, Lokesh — Java is now your playground!");
        
        //📝 DAY 1 HOMEWORK
        
       // Task 1: Personalized Hello Message
        System.out.println("Hello, Java World! 👨‍💻 Today is July 25, 2025.");
        
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today is July 25, 2025"+currentDate);
        
        // Task: 3 Cool Facts About the JVM
        System.out.println("1. The JVM allows Java code to run on any platform (Write Once, Run Anywhere).");
        System.out.println("2. It performs Just-In-Time (JIT) compilation to optimize performance at runtime.");
        System.out.println("3. JVM manages memory through an automatic Garbage Collector (GC).");
    }
}
