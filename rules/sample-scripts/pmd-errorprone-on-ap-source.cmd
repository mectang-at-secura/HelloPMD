REM 2018-09-14
REM pmd -d ../src/ -R sample-ruleset.xml -auxclasspath ../bin/ -cache ../pmd-cache/ -f text
SET AP_SOURCE_DIR={your source directory}
SET AP_CLASS_DIR={the corresponding class dir}
pmd -d "%AP_SOURCE_DIR%" -R category/java/errorprone.xml -auxclasspath "%AP_CLASS_DIR%" -no-cache -f text