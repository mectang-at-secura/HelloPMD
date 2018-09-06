REM 2018-09-05
REM a short script to run the PMD ruleset against current source directory 
REM assume the "pmd" executable file exists in curreNT $Path
REM ref: https://pmd.github.io/pmd-6.7.0/pmd_userdocs_installation.html#running-pmd-via-command-line
REM pmd -d ../src/ -R sample-ruleset.xml -auxclasspath ../bin/ -cache ../pmd-cache/ -f text
pmd -d ../src/ -R sample-ruleset.xml -auxclasspath ../bin/ -no-cache -f text