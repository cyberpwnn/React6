@Echo off
set mypath=%cd%
echo %mypath%
echo [BUILD]: Copying Target to Compile
echo F|xcopy /y /s /f /q "%1" "%2"
cd compile
echo [BUILD]: Rebuilding dictionary
java -jar -Xmx1g -Xms1m FT.jar -k:5000
echo [BUILD]: Zelix
java -jar ZKM.jar script.zkm
echo [BUILD]: Proguard
java -jar -Xmx2g proguard.jar @obfuscation.cfg -verbose
echo [BUILD]: Encrypting Strings...
java -jar -Xmx2g stringer.jar -configFile stringer.cfg stage1.jar out.jar
echo [BUILD]: Copying Output Resources
echo F|xcopy /y /s /f /q "%3" "%4"
echo F|xcopy /y /s /f /q "%5" "%6"
echo F|xcopy /y /s /f /q "%7" "%8"
java -jar MD5P-1.0.jar %6
java -jar MD5P-1.0.jar %8
