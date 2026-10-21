@echo off
title Start Oracle 21c XE

echo ========================================
echo Starting Oracle 21c XE database & listener
echo ========================================

:: Start Oracle database service
net start OracleServiceXE >nul 2>&1

:: Start Oracle listener service
net start OracleOraDB21Home1TNSListener >nul 2>&1

:: Give Oracle a few seconds to fully start
timeout /t 5 >nul

:: Run SQL script as SYSDBA
"C:\oracle\21cXE\homes\OraDB21Home1\bin\sqlplus.exe" / as sysdba @C:\oracle\21cXE\setup_chakibox.sql

echo.
echo ========================================
echo Database and listener are ready!
echo Username: CHAKIBOX
echo Password: chakibox
echo Service Name: XEPDB1
echo Hostname: localhost
echo Port: 1521
echo ========================================
pause
