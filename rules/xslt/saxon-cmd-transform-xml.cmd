rem 2018-08-30
rem Saxon commandline refrence: http://www.saxonica.com/documentation/index.html#!using-xsl/commandline
set SAXON_JAR_PATH={SAXON_JAR_FILE_PATH}
set XML_FILE_PATH={XML_FILE_PATH}
set XSL_FILE_PATH=tdf-extract-attr-of-fields.xsl
java -jar %SAXON_JAR_PATH% -s:"%XML_FILE_PATH%" -xsl:%XSL_FILE_PATH%