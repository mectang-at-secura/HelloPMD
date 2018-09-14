REM 2018-09-14
SET AP_SOURCE_DIR={your custom source directory}
SET AP_CLASS_DIR={the corresponding class dir}
pmd -d "%AP_SOURCE_DIR%" -R category/java/bestpractices.xml,category/java/codestyle.xml,category/java/design.xml,category/java/documentation.xml,category/java/errorprone.xml,category/java/multithreading.xml,category/java/performance.xml,category/java/security.xml -auxclasspath "%AP_CLASS_DIR%" -no-cache -f text