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
echo ================================
echo === Copying Output Resources ===
echo ================================
echo [Build]: COPY %5 TO %8
echo F|xcopy /y /s /f /q "%5" "%8"
echo ===============
echo === Cleanup ===
echo ===============
echo [Build]: DELETE %3
echo [Build]: DELETE %4
echo [Build]: DELETE %5
echo del "%3"
echo del "%5"
echo del "%7"
