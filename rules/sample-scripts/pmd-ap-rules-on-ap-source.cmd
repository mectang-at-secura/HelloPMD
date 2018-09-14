REM 2018-09-14
set AP_SOURCE_DIR={your custom source dir}
set AP_CLASS_DIR={the corresponding class dir}
pmd -d "%AP_SOURCE_DIR%" -R ../rules/ap-ruleset.xml -auxclasspath "%AP_CLASS_DIR%" -no-cache -f text