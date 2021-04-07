<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get_Installment_Schedule_DPD_below_Threshold</name>
   <tag></tag>
   <elementGuidId>74b85e5b-17a5-48b6-92e2-9365ec02eb24</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic T3BleF9Vc2VyOk9wZXhfVXNlcg==</value>
   </httpHeaderProperties>
   <maxResponseSize>0</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:v2=&quot;http://homecredit.net/homerselect/ws/installmentschedule&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;v2:GetInstallmentScheduleRequest>
         &lt;v2:getInstallmentScheduleFilter>
                &lt;v2:contractNumber>4000015076&lt;/v2:contractNumber>
            &lt;/v2:getInstallmentScheduleFilter>
      &lt;/v2:GetInstallmentScheduleRequest>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>https://osb.id00c1.id.infra:443/ID_Opex/InstalmentScheduleService/v2/ID_OpexInstalmentScheduleService_v2</soapServiceEndpoint>
   <soapServiceFunction>GetInstallmentSchedule</soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementText(response, 'GetInstallmentScheduleResponse.installments.installment[0].numInstallment', '1')
//WS.verifyElementText(response, 'GetInstallmentScheduleResponse.installments.installment[1].numInstallment', '2')</verificationScript>
   <wsdlAddress>https://osb.id00c1.id.infra/ID_Opex/InstalmentScheduleService/v2/ID_OpexInstalmentScheduleService_v2?wsdl</wsdlAddress>
</WebServiceRequestEntity>
