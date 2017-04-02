/**
 * @name:       TestCreateProfileFailScenarioTwo
 * @copyright:  Copyright © SITA SRDT 2014. Confidential. All rights reserved.
 *              This source code is part of the SITA SRDT Application
 *              and cannot be used or distributed without SITA authorization.
 *
 * @author:     SITA
 * @version:    1.0
 * @created:    16 May 2014
 * @modified:   16 May 2014
 *
 * @description:
 * @use:
 * @todo:
 */
package aero.sita.srdt.test.scenario.customeraffinity.createprofile;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;
import org.springframework.mock.web.MockHttpServletRequest;

import com.opensymphony.xwork2.ActionContext;

import aero.sita.srdt.common.SRDTGlobalConstants;
import aero.sita.srdt.common.constant.LocaleConstants;
import aero.sita.srdt.test.SRDTBaseStrutsTestCaseTemplate;

/**
 * @author M1011484 - 16 May 2014
 * 
 *         <pre>
 * <b>Class : </b> <br>
 * TestCreateProfileScenarioOne
 * </pre>
 * 
 *         <pre>
 * <b>Description : </b> <br>
 * <<Brief description about the class>>
 * 
 * <b>Example:
 *  <<If applicable give examples>>
 * </b>
 * @see <<Provide the reference class names here
 * </pre>
 */
public class TestCreateProfileScenarioNine extends
		SRDTBaseStrutsTestCaseTemplate {

	protected String path = "testdata/customeraffinity/createprofile/createprofile-s9-good/";

	protected String actionURI = "/htm/customeraffinity/createNewProfile.action";

	protected String namespace = "/htm/customeraffinity";

	protected String actionName = "createNewProfile";

	protected String expectedResult = "success";
	protected String container = "customeraffinity/test-srdt-spring-bean-createprofile.xml";

	public TestCreateProfileScenarioNine() {
		this.setPath(path);
		this.setActionURI(actionURI);
		this.setNamespace(namespace);
		this.setActionName(actionName);
		this.setExpectedResult(expectedResult);
		this.setWebServcie(true);
		this.setTemplateName("createProfileWebServiceTempalte");
		this.setDummyRunway(false);
		this.setContainer(container);
	}

	@Override
	protected void doGeneralAssertion(Object action) {

	}

	
	@Override
	protected void doValidationAssertion(Object action) {
	
	}

	@Override
	protected void addMoreSessionVariable(Map<String, Object> session)
			throws Exception {
		ActionContext context = ActionContext.getContext();
		context.put(StrutsStatics.HTTP_REQUEST, request);
		MockHttpServletRequest request = (MockHttpServletRequest) ActionContext
				.getContext().get(StrutsStatics.HTTP_REQUEST);
		request.getSession().setAttribute(
				SRDTGlobalConstants.IS_CA_ADMIN_GROUP, "true");
		request.getSession().setAttribute(
				LocaleConstants.USER_LOCALE.getValue(), Locale.US);
		request.getSession().setAttribute(
				SRDTGlobalConstants.CA_ENABLE_LOCAL_LANGUAGE,"false");
		request.getSession().setAttribute(
				SRDTGlobalConstants.CA_LOCAL_LANGUAGE_CODE,"KO");
		session.put(
				"CA_CREATE_CUSTOMER_PROFILE_URL",
				"http://localhost:8080/FAT/horizon/services/CustomerAffinity/CustomerAffinityComposite");
		session.put(SRDTGlobalConstants.SUBSCRIBER_REFERENCE, "SITA");
		session.put("CA_CREATED_BY", "SRDT");
		// request.getSession ( ).getServletContext ( ).setAttribute (
		// "idmSecurityToken",
		// "e97b5fc0-6ca7-45db-9a55-3c5757c93e46|RklLWEZ8bnVsbHxTeXN0ZW18MTQ0OTA0ODA5OTc4Mw==|763856c6d95279c2da258bcedcbfdf710380818f9fa57f4c1606063254820e1afefda6df9785bda1b3c4e5532470235d66cb9000b6d2f4c345c6d405627f03f5"
		// );

	}
}
