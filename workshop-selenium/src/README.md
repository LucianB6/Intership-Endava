# Workshop Selenium #

### Prerequisites
 1. Install Java 11.0.13 SDK (https://www.oracle.com/java/technologies/downloads/#java11)
 2. Open Environment Variables and set JAVA_HOME (https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html)
 3. Install maven (take the latest version from: https://maven.apache.org/download.cgi (e.g.: apache-maven-3.8.6-bin.zip) and unzip it)
 4. Open Environment Variables and set MVN_HOME (https://maven.apache.org/install.html)
 5. Install/ Update IntelliJ Community (https://www.jetbrains.com/idea/download/#section=windows)
 6. Open IntelliJ and import the pom.xml as a maven project
 7. Check SDK version to have the same value as java version (File -> Project Structure -> Project Settings -> Project -> SDK)
 8. Go to Scenarios, T1_DriversTest and try to execute it. If any error occurs, write to me (Carmen Andonescu).

### Real tests
- Follow the **AAA** principle (Arrange-Act-Assert) 
	* **Arrange inputs and targets**. Arrange steps should set up the test case. Does the test require any objects or special settings? Does it need to prep a database? Does it need to log into a web app? Handle all of these operations at the start of the test.
	* **Act on the target behavior**. Act steps should cover the main thing to be tested. This could be calling a function or method, calling a REST API, or interacting with a web page. Keep actions focused on the target behavior.
	* **Assert expected outcomes**. Act steps should elicit some sort of response. Assert steps verify the goodness or badness of that response. Sometimes, assertions are as simple as checking numeric or string values. Other times, they may require checking multiple facets of a system. **Assertions will ultimately determine if the test passes or fails** (https://automationpanda.com/2020/07/07/arrange-act-assert-a-pattern-for-writing-good-tests/)
- **NEVER** use static waits (Thread.sleep) - DEBUG/DEMO purposes only
- There is no need to scroll to elements (Selenium does that by default)

### Homework
1. **T1_DriversTest** - create and run same test with Firefox and IE drivers
2. **T2_NavigationTest** - write a test and explore other driver.navigate() options
3. **T3_FindElementsTest** - find searchInput element by css/name instead of id
4. **T7_AlertsTest** - handle Confirm popup and/or Prompt popup
5. **T8_WaitsTest** - check at least two other predefined expected conditions


6. **Extra**
* Go to Endava's page, 
* Click on mail - The Contact page will open
* Go to the Contact section and complete all fields and check both checkboxes available
   (DO NOT submit the form)
   
**Recommendations**:
   1. Find the elements by other option, preferably by one of the relative locators introduced by Selenium 4
   2. Use waits with ExpectedCondition (avoid using Thread.sleep())
##Be creative    
