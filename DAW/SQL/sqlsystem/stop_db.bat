@echo off
title Stop Oracle 21c XE

echo ========================================
echo Stopping Oracle 21c XE database & listener
echo ========================================

:: Stop Oracle listener service
net stop OracleOraDB21Home1TNSListener >nul 2>&1

:: Stop Oracle database service
net stop OracleServiceXE >nul 2>&1

echo.
echo ========================================
echo Database and listener stopped!
echo ========================================
pause
