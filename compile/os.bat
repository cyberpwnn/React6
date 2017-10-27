:: Usage: C:\>obfuscate_string.bat hello
:: This assumes javac & java commands are in your path
@ECHO OFF
set param_string=%1
"C:\Program Files\Java\jdk1.8.0_144\bin\javac" SimpleStringObfuscator.java
java SimpleStringObfuscator %param_string%
@ECHO ON
