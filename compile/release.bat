@Echo off
set mypath=%cd%
echo %mypath%
echo Copying Target to Compile
echo F|xcopy /y /s /f /q "%1" "%2"
cd compile
echo Rebuilding dictionary
java -jar -Xmx1g -Xms1m FT.jar -k:20000
echo Obfuscating...
java -jar -Xmx2g proguard.jar @obfuscation.cfg -verbose
echo Copying Output Resources
echo F|xcopy /y /s /f /q "%3" "%4"
echo F|xcopy /y /s /f /q "%5" "%6"
echo F|xcopy /y /s /f /q "%7" "%8"