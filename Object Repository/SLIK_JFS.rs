<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SLIK_JFS</name>
   <tag></tag>
   <elementGuidId>0355fb0c-fc29-46a0-93cb-2bf976e9b959</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;contractNumber\&quot;: \&quot;123456\&quot;,\n    \&quot;cuid\&quot;: \&quot;234\&quot;,\n    \&quot;dob\&quot;: \&quot;11/11/2018\&quot;,\n    \&quot;function\&quot;: \&quot;JFS\&quot;,\n    \&quot;gender\&quot;: \&quot;L\&quot;,\n    \&quot;ktp\&quot;: \&quot;1871025401550001\&quot;,\n    \&quot;name\&quot;: \&quot;lukman\&quot;,\n    \&quot;postCode\&quot;: \&quot;12345\&quot;,\n    \&quot;purpose\&quot;: \&quot;08\&quot;,\n    \&quot;requestPurpose\&quot;:\&quot;03\&quot;,\n    \&quot;refNumber\&quot;: \&quot;JFS-5401550001_i5t\&quot;,\n    \&quot;requestBy\&quot;: \&quot;SYSTEM\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://dev-ist.homecredit.id/slik-engine-gateway/v1/cbas/JFSSlikCollectibility/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
