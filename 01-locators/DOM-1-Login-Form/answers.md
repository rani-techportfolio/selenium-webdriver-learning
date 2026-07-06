Login Form XPath Practice Questions - Answers
=================================================

Basic XPath
-----------

Q1. Locate the Username textbox using ID.

//input[@id='username']

Q2. Locate the Password textbox using ID.

//input[@id='password']

Q3. Locate the Login button using text.

//button[text()='Login']

Q4. Locate the Username label.

//label[text()='Username']

Q5. Locate the Password label.

//label[text()='Password']


XPath Axes
----------

Q6. Locate the Username textbox using the Username label.

//label[text()='Username']/following::input[1]

Q7. Locate the Password textbox using the Password label.

//label[text()='Password']/following::input[1]

Q8. Locate the parent div of the Login button.

//button[text()='Login']/parent::*

Q9. Locate the Password label using the Password textbox.

//input[@id='password']/preceding::label[1]

Q10. Locate the Username label using the Username textbox.

//input[@id='username']/preceding::label[1]

Q11. Locate all direct children of loginForm.

//form[@id='loginForm']/child::*

Q12. Locate all descendants of loginForm.

//form[@id='loginForm']//*


Multiple Locator Challenge
--------------------------

Q13. Write 3 different XPath locators for the Login button.

//button[text()='Login']

//button[@type='submit']

//input[@type='submit' and @value='Login']


Q14. Write 2 different XPath locators for the Username textbox.

//input[@id='username']

//input[@name='username']


Q15. Write 2 different XPath locators for the Password textbox.

//input[@id='password']

//input[@name='password']


Interview Challenge
-------------------

Q16. Locate the Login button using the Username label.

//label[text()='Username']/ancestor::form//button[text()='Login']

Q17. Locate the Login button using the Password label.

//label[text()='Password']/ancestor::form//button[text()='Login']

Q18. Locate the Password textbox using the Username textbox.

//input[@id='username']/following::input[@type='password']

Q19. Locate all input fields.

//input

Q20. Locate all labels.

//label
