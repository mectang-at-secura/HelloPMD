REM 2018-09-05
REM a short script to run the PMD ruleset against current source directory 
REM assume the "pmd" executable file exists in curreNT $Path
REM ref: https://pmd.github.io/pmd-6.7.0/pmd_userdocs_installation.html#running-pmd-via-command-line
REM pmd -d ../src/ -R custom-ruleset.xml -auxclasspath ../bin/ -cache ../pmd-cache/ -f text
REM pmd -d ../src/ -R custom-ruleset.xml -auxclasspath ../bin/ -no-cache -f text
REM @echo off
REM set TOPDIR=%~dp0..
REM set OPTS=
REM set MAIN_CLASS=net.sourceforge.pmd.PMD

REM java -classpath "%TOPDIR%\lib\*" %OPTS% %MAIN_CLASS% %*
set PMD_DIR=C:\Programs\pmd-bin-6.7.0
java -classpath "%PMD_DIR%\lib\*";../bin/ net.sourceforge.pmd.PMD -d ../src/ -R custom-ruleset-java.xml -auxclasspath ../bin/ -no-cache -f text