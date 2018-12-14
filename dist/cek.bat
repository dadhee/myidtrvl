@echo off
cls

rem Parameter configuration
SET CONFIG_FILE=./config/clientconfig.properties

SET CLASSP=
setlocal enabledelayedexpansion

FOR /R . %%G IN (*.jar) DO (set CLASSP="%%G";!CLASSP!)

rem build classpath
@echo on


java -Djdk.tls.client.protocols="TLSv1.2" -Dhttps.protocols=TLSv1.2 -cp %CLASSP% com.ga.LoginClient %CONFIG_FILE%
pause
