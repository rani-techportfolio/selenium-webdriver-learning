# DOM-06 Dynamic Web Table with Checkboxes - Answers

## Checkbox Handling

### 1. Select Rahul's checkbox

```xpath
//td[text()='Rahul']/parent::tr//input[@type='checkbox']
```

### 2. Select Aadhya's checkbox

```xpath
//td[text()='Aadhya']/parent::tr//input[@type='checkbox']
```

### 3. Select employee checkbox for ID 103

```xpath
//td[text()='103']/parent::tr//input[@type='checkbox']
```

### 4. Select checkbox for employee whose status is Inactive

```xpath
//td[text()='Inactive']/parent::tr//input[@type='checkbox']
```

### 5. Select checkbox for employee whose department is QA

```xpath
//td[text()='QA']/parent::tr//input[@type='checkbox']
```

---

# Button Handling

### 6. Click Edit for Rahul

```xpath
//td[text()='Rahul']/parent::tr//button[text()='Edit']
```

### 7. Click Delete for employee ID 102

```xpath
//td[text()='102']/parent::tr//button[text()='Delete']
```

### 8. Click Edit for employee whose salary is 80000

```xpath
//td[text()='80000']/parent::tr//button[text()='Edit']
```

### 9. Click Delete for employee whose department is Development

```xpath
//td[text()='Development']/parent::tr//button[text()='Delete']
```

---

# Reverse Traversal

### 10. Get employee name whose checkbox id is chk103

```xpath
//input[@id='chk103']/ancestor::tr/td[3]
```

### 11. Get department whose salary is 75000

```xpath
//td[text()='75000']/preceding-sibling::td[1]
```

### 12. Get status whose name is Aadhya

```xpath
//td[text()='Aadhya']/following-sibling::td[3]
```

---

# Bulk Selection

### 13. Find all Active employee names

```xpath
//td[text()='Active']/parent::tr/td[3]
```

### 14. Find all employee checkboxes

```xpath
//input[starts-with(@id,'chk')]
```

### 15. Find all Edit buttons

```xpath
//button[text()='Edit']
```

### 16. Find all Delete buttons

```xpath
//button[text()='Delete']
```

---

# Parent and Ancestor

### 17. Find row containing checkbox chk102

```xpath
//input[@id='chk102']/ancestor::tr
```

### 18. Find employeePortal using Rahul

```xpath
//td[text()='Rahul']/ancestor::div[@id='employeePortal']
```

### 19. Find employeeTable using salary 80000

```xpath
//td[text()='80000']/ancestor::table[@id='employeeTable']
```

### 20. Find checkbox for employee whose name is Anu

```xpath
//td[text()='Anu']/parent::tr//input[@type='checkbox']
```

---

# Advanced Dynamic XPath

### 21. Find Edit button for employee whose checkbox id is chk101

```xpath
//input[@id='chk101']/ancestor::tr//button[text()='Edit']
```

### 22. Find Delete button for employee whose checkbox id is chk103

```xpath
//input[@id='chk103']/ancestor::tr//button[text()='Delete']
```

### 23. Find employee name whose checkbox id is chk104

```xpath
//input[@id='chk104']/ancestor::tr/td[3]
```

### 24. Find department whose checkbox id is chk102

```xpath
//input[@id='chk102']/ancestor::tr/td[4]
```

### 25. Find salary whose checkbox id is chk101

```xpath
//input[@id='chk101']/ancestor::tr/td[5]
```

---

# Row Traversal

### 26. Find Status cell from Rahul

```xpath
//td[text()='Rahul']/following-sibling::td[3]
```

### 27. Find Action column from Rahul

```xpath
//td[text()='Rahul']/following-sibling::td[4]
```

### 28. Find Salary cell from Aadhya

```xpath
//td[text()='Aadhya']/following-sibling::td[2]
```

### 29. Find Department cell from Anu

```xpath
//td[text()='Anu']/following-sibling::td[1]
```

### 30. Find Name cell from employee ID 104

```xpath
//td[text()='104']/following-sibling::td[1]
```

---

# Interview Challenge Questions

### 31. Select checkbox for employee whose salary is 85000

```xpath
//td[text()='85000']/parent::tr//input[@type='checkbox']
```

### 32. Select checkbox for employee whose status is Active

```xpath
//td[text()='Active']/parent::tr//input[@type='checkbox']
```

### 33. Find employee name whose salary is 65000

```xpath
//td[text()='65000']/preceding-sibling::td[2]
```

### 34. Find employee ID whose department is Automation

```xpath
//td[text()='Automation']/preceding-sibling::td[2]
```

### 35. Find employee whose status is Inactive

```xpath
//td[text()='Inactive']/parent::tr/td[3]
```

### 36. Find Delete button for employee whose salary is 80000

```xpath
//td[text()='80000']/parent::tr//button[text()='Delete']
```

### 37. Find Edit button for employee whose department is QA

```xpath
//td[text()='QA']/parent::tr//button[text()='Edit']
```

### 38. Find employeePortal using checkbox chk103

```xpath
//input[@id='chk103']/ancestor::div[@id='employeePortal']
```

### 39. Find employeeTable using employee name Rahul

```xpath
//td[text()='Rahul']/ancestor::table[@id='employeeTable']
```

### 40. Find all rows containing Active employees

```xpath
//td[text()='Active']/parent::tr
```
