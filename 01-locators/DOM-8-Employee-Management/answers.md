#### XPath Practice Answers – Employee Management

## Level 1: Basic Locators

Email textbox

XPath: //input[@type='email']

CSS: input[type='email']

Password textbox

XPath: //input[@type='password']

CSS: input[type='password']

Login button

XPath: //button[text()='Login']

CSS: button

Cancel button

XPath: //button[text()='Cancel']

CSS: button.cancel

Remember checkbox

XPath: //input[@type='checkbox']

CSS: input[type='checkbox']

Employee table

XPath: //table

CSS: table

Employee section

XPath: //section[@id='employeeSection']

CSS: #employeeSection

Footer

XPath: //footer

CSS: footer

Navigation menu

XPath: //nav

CSS: nav

Home link

XPath: //a[text()='Home']

CSS: a[href='/home']

## Level 2: Attributes

Textbox using class

XPath: //input[@class='textbox']

CSS: .textbox

Textbox using name

XPath: //input[@name='email']

CSS: input[name='email']

Login button using text

XPath: //button[text()='Login']

CSS: button

Delete button using class

XPath: //button[@class='delete']

CSS: .delete

Button having class "primary"

XPath: //button[@class='primary']

CSS: .primary

## Level 3: contains & starts-with

id containing "login"

XPath: //*[contains(@id,'login')]

CSS: [id*='login']

class containing "btn"

XPath: //*[contains(@class,'btn')]

CSS: [class*='btn']

id starting with "pass"

XPath: //*[starts-with(@id,'pass')]

CSS: [id^='pass']

all buttons

XPath: //button

CSS: button

all input elements

XPath: //input

CSS: input

## Level 4: Axes

Parent of Email textbox

XPath: //input[@type='email']/parent::*

Child input inside loginForm

XPath: //form[@id='loginForm']/input

Descendants of employeeSection

XPath: //section[@id='employeeSection']//

Ancestor of Login button

XPath: //button[text()='Login']/ancestor::*

Following sibling of Remember checkbox

XPath: //input[@type='checkbox']/following-sibling::*

Preceding sibling of Login button

XPath: //button[text()='Login']/preceding-sibling::*

Descendants of loginForm

XPath: //form[@id='loginForm']//*

Parent of Delete button

XPath: //button[@class='delete']/parent::*

Ancestor form of Password textbox

XPath: //input[@type='password']/ancestor::form

Child buttons inside buttons div

XPath: //div[@class='buttons']/button

## Level 5: Indexing

First employee row

XPath: (//tr)[1]

Second employee row

XPath: (//tr)[2]

Last employee row

XPath: (//tr)[last()]

Third button

XPath: (//button)[3]

First Delete button

XPath: (//button[@class='delete'])[1]

Second Edit button

XPath: (//button[@class='edit'])[2]

Last Edit button

XPath: (//button[@class='edit'])[last()]

Second table column

XPath: (//td)[2]

Third table row

XPath: (//tr)[3]

Last table cell

XPath: (//td)[last()]

## Level 6: Text-Based XPath

Login button

XPath: //button[text()='Login']

Employees menu

XPath: //a[text()='Employees']

Remember Me label

XPath: //label[contains(text(),'Remember')]

Company footer

XPath: //footer

Employee named John

XPath: //td[text()='John']

Employee named Rahul

XPath: //td[text()='Rahul']

QA department

XPath: //td[text()='QA']

Automation department

XPath: //td[text()='Automation']

Salary 80000

XPath: //td[text()='80000']

Contact link

XPath: //a[text()='Contact']

## Level 7: Dynamic XPath

Button containing "Log"

XPath: //button[contains(text(),'Log')]

Textbox containing id "mail"

XPath: //input[contains(@id,'mail')]

Button whose id starts with "login"

XPath: //button[starts-with(@id,'login')]

Buttons containing class "btn"

XPath: //button[contains(@class,'btn')]

All textboxes

XPath: //input

## Level 8: Real Interview Scenarios

Edit button for John

XPath: //tr[td[text()='John']]//button[text()='Edit']

Delete button for Rahul

XPath: //tr[td[text()='Rahul']]//button[text()='Delete']

Salary of Rani

XPath: //tr[td[text()='Rani']]/td[contains(@class,'salary')]

Department of John

XPath: //tr[td[text()='John']]/td[contains(@class,'dept')]

Employee ID of Rahul

XPath: //tr[td[text()='Rahul']]/td[1]

Login button inside form only

XPath: //form[@id='loginForm']//button[text()='Login']

Count all employee rows

XPath: count(//tr)

Last employee name

XPath: (//tr/td[1])[last()]

First Delete button

XPath: (//button[text()='Delete'])[1]

Edit button after John

XPath: //td[text()='John']/following::button[text()='Edit'][1]

## Bonus: XPath + CSS

Login button

XPath: //button[text()='Login']

CSS: button

Email textbox

XPath: //input[@type='email']

CSS: input[type='email']

Remember checkbox

XPath: //input[@type='checkbox']

CSS: input[type='checkbox']

Employee table

XPath: //table

CSS: table

Delete button for Rahul

XPath: //tr[td[text()='Rahul']]//button[text()='Delete']

Salary of Rani

XPath: //tr[td[text()='Rani']]/td[contains(@class,'salary')]

CSS: .salary

Employees menu link

XPath: //a[text()='Employees']

CSS: a[href='/employees']

Footer text

XPath: //footer

CSS: footer

Password textbox

XPath: //input[@type='password']

CSS: input[type='password']

Second Edit button

XPath: (//button[text()='Edit'])[2]
