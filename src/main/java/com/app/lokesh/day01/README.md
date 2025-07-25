1️⃣ Why Java? (The elevator pitch)
• Runs on 3 billion devices (Android, servers, ATMs, smart TVs).
• “Write once, run anywhere” thanks to the Java Virtual Machine (JVM).
• Mature, battle-tested libraries (Spring, Hibernate, Kafka, etc.).
• Massive job market: Google (AdWords backend), Meta (Instagram data infra), Amazon (Alexa skills), Netflix (micro-services) all use Java somewhere.

--> Real-world analogy

Think of the JVM as a universal translator at the United Nations. You (the Java code) speak only one language, but the translator (JVM) lets every country (Windows, Linux, macOS) understand you perfectly.

2️⃣ Install Your Toolkit (10-min checklist)
• JDK 21 (LTS): https://www.oracle.com/in/java/technologies/downloads/
• IntelliJ IDEA Community: https://www.jetbrains.com/idea/download
• Git: https://git-scm.com
• GitHub account: https://github.com

-> Verify in terminal

java -version
javac -version
git --version
If all versions print, you’re golden.

3️⃣ Create Your First Java Program
Step A: Open IntelliJ → New Project → “Java” → Project SDK (JDK 21) → Finish
Step B: Right-click src → New → Java Class → Name it HelloWorld
- Paste this code exactly, read the comments out loud:

// File: HelloWorld.java
// public class name MUST match the file name (case-sensitive!)
public class HelloWorld {

    // JVM starts execution from this exact method signature
    public static void main(String[] args) {
        // System.out is a pre-wired PrintStream to your console
        System.out.println("Hello, Lokesh — Java is now your playground!");
    }
}
Compile & Run
Green “Run” arrow in IntelliJ
Or terminal inside project root:

javac HelloWorld.java   # compiles to HelloWorld.class (bytecode)
java HelloWorld         # JVM runs the bytecode
Expected console output:
Hello, Lokesh — Java is now your playground!

4️⃣ Anatomy Breakdown (beginner-friendly)
• public class HelloWorld → Blueprint of a house named HelloWorld.
• public static void main(String[] args) → Front door of the house; JVM knocks here.
• System.out.println(...) → A loudspeaker that prints to console.

--> Memory snapshot
When you run java HelloWorld, the JVM loads the .class file, creates a stack frame for main, and executes line by line.
5️⃣ Push to GitHub (your first public evidence)
In terminal inside project root:

git init
git add .
git commit -m "Day 1: Hello World in Java"
gh repo create hello-java --public --source=. --push
# (or create repo on GitHub UI and follow push instructions)

Your repo URL becomes proof of progress on your resume.
📝 DAY 1 HOMEWORK (due in 24 h)
Change the message to include today’s date and your favorite emoji.
Add a second print statement that lists three cool facts about the JVM.
Commit with message style: feat: add 3 JVM facts (#day1)
Reply here with your GitHub repo link so I can star and review it!
