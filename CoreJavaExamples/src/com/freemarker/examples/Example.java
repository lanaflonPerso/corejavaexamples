package com.freemarker.examples;

import java.util.regex.*;

public class Example {
	
	public static void main(String[] args)
	  {
	    // String txt="\"{{ID,\" AND \"-\" AND \"{ProcessAccountNotificationsTasklet\" AND \"AccountNotificationEntityId,\" AND \"}} ERROR\" AND \"task.ProcessAccountNotificationsTasklet:\" AND \" - [CLOUD_SERVICES][CS-NOTIFICATIONPROCESSOR][\" AND \"][D2C-\" AND \"][Posting account notification to endpoint https://endpoinths-\" AND \".pacific-test.progress.com/cs-oem-account/api/notification failed  for identifier : \" AND \" status code:\" AND \"400 Response: {\"statusCode\":1,\"statusMessage\":\"Could not create admin account for oem account Notification\"}]\"";
		
		// String txt = "\"{{ID,\" AND \"}{SSNID,\" AND \"}} ERROR util.ExportComplianceUtil:\" AND \" - [CLOUD_SERVICES][CS-COMMON][\" AND \"][D2C-MAIN-INT][Exception occurred in triggering the Export Compliance for this Account. Could not complete successfully. Reason: ; nested exception is:\"";
		
		String txt = "\"{{ID,\" AND \"}}  INFO utils.AccountCommonUtils:\" AND \" - [CLOUD_SERVICES][CS-COMMON][136901][][ Parent account hirarachy from parant to child order is [AccountEntity [accountId=136901, user=UserEntity [userId=75977, loginName=CSUser, firstName=CloudServices, lastName=User1, progressId=CS_ProgressIDTest24by7csqa937229388, emailAddress=cstest_abc24by7csqa173301@yopmail.com, altEmailAddress=null, language=en_US, userCreationIp=null, openId=test, userPropEntities=null], tenant= rb-main-int, PCN=USA-00000000, accountType=INDIVIDUAL, accountStatus=ACTIVE, accountCreationDate=2015-08-09 09:00:44.0, billingId=20663454, billingStatus=ACTIVE, eval=false, evalExpiryDate=2015-09-08 09:00:44.0, evalToPaidConversionDate=2015-08-09 09:04:09.0, planName=Rollbase Core, parentAccount=null, accountPropEntities=[AccountPropEntity [propId=0, accountId=136901, propertyName=ACCOUNT_PROVISIONING_STATUS, propertyValue=ERROR], AccountPropEntity [propId=0, account...\"";

	    System.out.println(txt);
	    
	    String patternStr = "\\[(.*?)\\]";
	    

	    System.out.println(txt.length());
	    Pattern p = Pattern.compile(patternStr);
	    Matcher m = p.matcher("");
	    
	    m.reset(txt);
	    
	    System.out.println(m.toString());
	   
	    
	    while (m.find())
	    {	   	    
	    	int start = m.start();
	        int end = m.end();
	    	
	        System.out.println(start + " " + end);
	        String var1=m.group(1);
	        
	        System.out.println(txt.substring(start, end));
	        
	        // System.out.println(txt.substring(end));
	        
	        // System.out.print("("+var1.toString()+")"+"\n");
	    }
	    
	  }

}
