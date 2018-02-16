@Echo off
set mypath=%cd%
echo ==================================
echo === Building React for Release ===
echo ==================================
echo %mypath%
echo =================================
echo === Copying Target to Compile ===
echo =================================
echo [Build]: COPY %1 TO %2
echo F|xcopy /y /s /f /q "%1" "%2"
echo [Build]: CD compile
cd compile
echo =============================
echo === Rebuilding Dictionary ===
echo =============================
echo [Build]: EXEC FT.jar
java -jar -Xmx1g -Xms1m FT.jar -k:5000
echo ==========================
echo === Encrypting Strings ===
echo ==========================
echo [Build]: EXEC stringer.jar
java -jar -Xmx2g stringer.jar -configFile stringer.cfg stage1.jar out.jar
echo ===================
echo === Obfuscating ===
echo ===================
echo [Build]: EXEC proguard.jar
java -jar -Xmx4g proguard.jar @obfuscation.cfg -verbose
echo ========================
echo === Apply Signatures ===
echo ========================
echo [Build]: EXEC md5p.jar ON %5
echo [Build]: EXEC md5p.jar ON %7
java -jar MD5P-1.0.jar %5
java -jar MD5P-1.0.jar %7
echo ================================
echo === Copying Output Resources ===
echo ================================
echo [Build]: COPY %3 TO %4
echo [Build]: COPY %5 TO %6
echo [Build]: COPY %7 TO %8
echo F|xcopy /y /s /f /q "%3" "%4"
echo F|xcopy /y /s /f /q "%5" "%6"
echo F|xcopy /y /s /f /q "%7" "%8"
echo ===============
echo === Cleanup ===
echo ===============
echo [Build]: DELETE %3
echo [Build]: DELETE %4
echo [Build]: DELETE %5
echo del "%3"
echo del "%5"
echo del "%7"
