# DOM-03 Student Management Portal – XPath Answers

## A1. Locate the Student Name textbox

```xpath
//input[@id='studentName']
```

---

## A2. Locate the Email textbox using Email label

```xpath
//label[text()='Email']/following-sibling::input
```

---

## A3. Locate the Course dropdown using Course label

```xpath
//label[text()='Course']/following-sibling::select
```

---

## A4. Locate the Save button using the Student Name label

```xpath
//label[text()='Student Name']/following::button[text()='Save']
```

---

## A5. Locate the Update button using the Save button

```xpath
//button[text()='Save']/following-sibling::button[1]
```

---

## A6. Locate the Clear button using the Update button

```xpath
//button[text()='Update']/following-sibling::button[1]
```

---

## A7. Locate Course label using Course dropdown

```xpath
//select[@id='course']/preceding-sibling::label
```

---

## A8. Locate Student Portal div using Save button

```xpath
//button[text()='Save']/ancestor::div[@id='studentPortal']
```

---

## A9. Locate Student Form using API Testing option

```xpath
//option[text()='API Testing']/ancestor::form
```

---

## A10. Locate Dashboard link starting from Reports link

```xpath
//a[text()='Reports']/parent::li/preceding-sibling::li[3]/child::a
```

---

## A11. Locate Students link starting from Reports link

```xpath
//a[text()='Reports']/parent::li/preceding-sibling::li[2]/child::a
```

---

## A12. Locate Course dropdown starting from Student Name textbox

```xpath
//input[@id='studentName']/following::select[1]
```

---

## A13. Locate Status label starting from second radio button.

```xpath
//input[@type='radio'][2]/preceding-sibling::label
```

---

## A14. Locate all buttons inside Actions div

**Option 1**

```xpath
//div[@class='actions']/child::button
```

**Option 2**

```xpath
//div[@class='actions']//button
```

---

## A15. Write 3 different XPath locators for Update button

**Using button text**

```xpath
//button[text()='Update']
```

**Using following-sibling**

```xpath
//button[text()='Save']/following-sibling::button[1]
```

**Using parent and index**

```xpath
//div[@class='actions']/button[2]
```
