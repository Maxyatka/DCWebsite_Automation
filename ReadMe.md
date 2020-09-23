# Douglas College website Automation Project
 
This project currently has 25 Test Cases that test the core functionality of the website (most frequently visited pages).

### Covered areas are: 

1. **Main page**
    * 6 main dropdown menus
    * Logins dropdown menu
    * Covid-19 navigation notification
    * Site Search
    
2. **Logins dropdown menu**
    * Office 365 login
    * MyAccount login
    * BlackBoard login
    * MyCareer login

3. ‘Future Students’ dropdown
    * English requirements
    * Transcripts
    * Transfer Credit
    * Apply sub-header

4. ‘Current Students’ dropdown
    * Course Scheduling tool
    * Graduation
    * Register sub-header
    * Exam Schedule
    * Dates & Deadlines

5. ‘International Students’ dropdown
    * Int students programs
    * Scholarships and awards
    * PGWP

6. ‘Programs & Courses’ dropdown
    * Programs
    * Courses
    * Faculties

7. ‘Student Services’ dropdown
    * ID
    * U-Pass

8. ‘About Douglas’ dropdown
    * Campus Facilities
    
For full documentation and test cases see the separate document

### Directories guide

* See **_test > java_** for all test suites and resources

* **_Test_Suite_1_** is a first and for now the only directory with _Tests_ subdirectory with test classes divided by the area of testing

* **_Resources > PO_** is a directory with all page objects required for tests to run

* **_Resources > Utils_** is a directory with various utility classes and methods required for test visualization and setup (see **_Set Up_** section) 

### Set Up your desired environment

Test environment setup is located under **_Resources > Utils > HelperMethods.java_** <br/>
Locate _getDriver()_ method on line 123 and inside it call the appropriate method to invoke desired environment (see comments and above methods)<br/>
Do not forget to replace values for SauceLabs constants with your own!

### How to run Test Suite

To run the test suite locate and run **_Test_Suite_1.java_** under **_Test_Suite_1_** directory. You can also run _Test_Suite_1_Runner.java_ file if you'd like. 
