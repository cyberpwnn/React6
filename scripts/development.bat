@Echo off
echo Apply Script: DEVELOPMENT
java -jar scripts/MD5P-1.0.jar "%1"
echo F|xcopy /y /s /f /q "%1" "%2"