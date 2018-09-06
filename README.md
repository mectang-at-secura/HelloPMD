# HelloPMD
A sample project to showcase the capabilities of PMD (source code analyzer)


# Setup schema for PMD rules (Optional)
Since the schemaLocation doesn't seem to work -- which means that the following schema location attribute won't load 
the schema file:

> xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 https://pmd.sourceforge.net/ruleset_2_0_0.xsd"

We could (*optionally*) set up the XML catalog in Eclipse to make the schema assistant work.
1. Select �Window -> Preferences� to launch the Preferences dialog. 
1. In the navigation tree expand the �XML -> XML Catalog�.
1. Select "User Specified Entries" and click the "Add" button to add a User Specified Entry.
1. Set "Location" to be the actual schema file, i.e. "HelloPMD/shcema/ruleset_2_0_0.xsd", and set "Key type" to be "Namespace name", "Key" to be "http://pmd.sourceforge.net/ruleset/2.0.0".
1. Click "OK" and "Apply" button to make this new XML Catalo entry work.

Note that the schema file here is exracted from pmd-core.jar/ruleset_2_0_0.xsd.

ref: [Edit the XML Catalog settings in Eclipse](https://wiki.eclipse.org/Using_the_XML_Catalog)

# Install PMD Plugin for Eclipse (Optional)
You don't need to install the plugin for Eclipse (the standalone CLI tool would be good enough). But if you really want to, read along.

To install the PMD plugin for Eclipse:
1. Start Eclipse and open a project
1. Select �Help�->�Software Updates�->�Find and Install�
1. Click �Next�, then click �New remote site�
1. Enter �PMD� into the Name field and https://dl.bintray.com/pmd/pmd-eclipse-plugin/updates/ into the URL field
1. Click through the rest of the dialog boxes to install the plugin

# Add PMD Library
You might also add the PMD library as dependency for this project, in order to invoke PMD directly in the code.
1. Select "Windows" -> "Preferences", locate to "Java -> Build Path" -> "User Libraries";
1. CLick "New" button to add a new user library, set up a name like "PMD";
1. Click "Add External JARS" to import all those Jar files in the PMD "lib" directory
1. Click "Aply and Close", then add this user library into current project's Libraries list.


# References
* [PMD official documentation](https://pmd.github.io/pmd-6.7.0/)
* [PMD plugin for Eclipse](https://pmd.github.io/pmd-6.7.0/pmd_userdocs_tools.html#eclipse)
* [Edit the XML Catalog settings in Eclipse](https://wiki.eclipse.org/Using_the_XML_Catalog)
