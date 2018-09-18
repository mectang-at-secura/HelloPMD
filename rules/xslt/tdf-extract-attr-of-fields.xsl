<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
  <xsl:output method="text"/>
  <xsl:template match="/">
	<xsl:variable name="fieldElementsWithUnorderedAttrs" select="/collection/page/pageElement/fieldElement[@type != 'hidden' and @type != 'message' and not(attribute()[1]/name()='type' and attribute()[2]/name()='uniqueId' and attribute()[3]/name()='label' and attribute()[4]/name()='id')]"/>
	<xsl:call-template name="outputFieldsInfo">
		<xsl:with-param name="elements" select="$fieldElementsWithUnorderedAttrs"/>
		<xsl:with-param name="errorMessage" select="'The first four attributes of a fieldElement should be &quot;type&quot;, &quot;uniqueId&quot;, &quot;label&quot;, and &quot;id&quot; as recommended for better maintenainability'"/>
	</xsl:call-template>
	
	<xsl:call-template name="outputFieldsInfo">
		<xsl:with-param name="elements" select="//comment()[contains(., '&lt;/') or contains(., 'TODO')]"/>
		<xsl:with-param name="errorMessage" select="'Please remove unneeded comment section, or address those &quot;TODO&quot; marks'"/>
	</xsl:call-template>
	
	<xsl:call-template name="outputFieldsInfo">
		<xsl:with-param name="elements" select="/rule_file/rule[step/selectNodes[count(child::where/operator[contains(@type, '&lt;') or contains(@type, '&gt;')]/operand[@fieldType='variableReference']) != count(child::where/operator[not(@type)]/operand[@fieldType='variableReference'])]]"/>
		<xsl:with-param name="errorMessage" select="'Need to check whether variables are null before comparing them with &lt; or &gt; (Also may need to specify fieldType=&quot;variableReference&quot; explicitly for better checking result)'"/>
	</xsl:call-template>
	
	<xsl:call-template name="outputFieldsInfo">
		<xsl:with-param name="elements" select="//node()[matches(@id, '^N\d+$')]"/>
		<xsl:with-param name="errorMessage" select="'&quot;id&quot; attribute with value that looks like id=&quot;N12&quot; is not needed. Please get rid of them'"/>
	</xsl:call-template>
	
	<xsl:call-template name="outputFieldsInfo">
		<xsl:with-param name="elements" select="/rule_file/rule[step/selectNodes/where[@negate='false']]"/>
		<xsl:with-param name="errorMessage" select="'No need for negate=&quot;false&quot; in the &quot;where&quot; statements for XARC Rules. Please remove them.'"/>
	</xsl:call-template>
  </xsl:template>
  <xsl:template name="outputFieldsInfo">
	<xsl:param name="elements"/>
	<xsl:param name="errorMessage"/>
	<xsl:if test="0 &lt; count($elements)">
		<xsl:value-of select="$errorMessage" />
		<xsl:text> (Total # of violations: </xsl:text>
		<xsl:value-of select="count($elements)" />
		<xsl:text>)&#xa;</xsl:text>
		<xsl:for-each select="$elements">
			<xsl:choose>
				<xsl:when test="current()/name() = 'fieldElement'">
					<xsl:text>fieldElement[type="</xsl:text>
					<xsl:value-of select="current()/@type" />
					<xsl:text>", uniqueId="</xsl:text>
					<xsl:value-of select="current()/@uniqueId"/>
					<xsl:text>"]</xsl:text>
				</xsl:when>
				<xsl:when test="current()/name() = 'rule'">
					<xsl:text>rule[name="</xsl:text>
					<xsl:value-of select="current()/@name"/>
					<xsl:text>"]</xsl:text>
				</xsl:when>
				<xsl:when test="matches(current()/@id, '^N\d+$')">
					<xsl:text>&lt;</xsl:text>
					<xsl:value-of select="current()/name()"/>
					<xsl:text> id=&quot;</xsl:text>
					<xsl:value-of select="current()/@id"/>
					<xsl:text>&quot;&gt;</xsl:text>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="current()"/>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:text>&#xa;</xsl:text>
		</xsl:for-each>
		<xsl:text>&#xa;</xsl:text>
	</xsl:if>
  </xsl:template>
</xsl:stylesheet>
