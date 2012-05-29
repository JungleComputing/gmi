@echo off

if "%OS%"=="Windows_NT" @setlocal

rem %~dp0 is expanded pathname of the current script under NT

if "%GMI_HOME%X"=="X" set GMI_HOME=%~dp0..

set GMI_APP_ARGS=

:setupArgs
if ""%1""=="""" goto doneStart
set GMI_APP_ARGS=%GMI_APP_ARGS% %1
shift
goto setupArgs

:doneStart

java -classpath "%CLASSPATH%;%GMI_HOME%\lib\*" -Dlog4j.configuration=file:"%GMI_HOME%"\log4j.properties %GMI_APP_ARGS%

if "%OS%"=="Windows_NT" @endlocal
