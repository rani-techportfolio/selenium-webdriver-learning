# DOM-05 Employee Management Web Table – XPath Answers

---

## Row & Column Counting

### Q1. Count all rows including header.

```xpath
//table[@id='employeeTable']//tr
```

---

### Q2. Count employee records excluding header.

```xpath
//table[@id='employeeTable']//tr[position()>1]
```

---

### Q3. Count all columns.

```xpath
//table[@id='employeeTable']//th
```

---

### Q4. Count all data cells.

```xpath
//table[@id='employeeTable']//td
```

---

## Data Retrieval Using Name

### Q5. Get Rahul's Department.

```xpath
//td[text()='Rahul']/following-sibling::td[1]
```

---

### Q6. Get Rahul's Salary.

```xpath
//td[text()='Rahul']/following-sibling::td[2]
```

---

### Q7. Get Rahul's Status.

```xpath
//td[text()='Rahul']/following-sibling::td[3]
```

---

### Q8. Get entire row for Rahul.

```xpath
//td[text()='Rahul']/parent::tr
```

---

## Data Retrieval Using Employee ID

### Q9. Get Department for employee ID 101.

```xpath
//td[text()='101']/following-sibling::td[2]
```

---

### Q10. Get Salary for employee ID 102.

```xpath
//td[text()='102']/following-sibling::td[3]
```

---

### Q11. Get Status for employee ID 103.

```xpath
//td[text()='103']/following-sibling::td[4]
```

---

### Q12. Get entire row for employee ID 104.

```xpath
//td[text()='104']/parent::tr
```

---

## Button Handling

### Q13. Click Edit button for Rahul.

```xpath
//td[text()='Rahul']/parent::tr//button[text()='Edit']
```

---

### Q14. Click Delete button for Rahul.

```xpath
//td[text()='Rahul']/parent::tr//button[text()='Delete']
```

---

### Q15. Click Edit button for Aadhya.

```xpath
//td[text()='Aadhya']/parent::tr//button[text()='Edit']
```

---

### Q16. Click Delete button for Anu.

```xpath
//td[text()='Anu']/parent::tr//button[text()='Delete']
```

---

## Row Traversal

### Q17. Locate Salary cell from Rahul.

```xpath
//td[text()='Rahul']/following-sibling::td[2]
```

---

### Q18. Locate Status cell from Rahul.

```xpath
//td[text()='Rahul']/following-sibling::td[3]
```

---

### Q19. Locate Action column from Rahul.

```xpath
//td[text()='Rahul']/following-sibling::td[4]
```

---

### Q20. Locate Delete button from Rahul.

```xpath
//td[text()='Rahul']/parent::tr//button[text()='Delete']
```

---

## Column Traversal

### Q21. Get employee name whose ID is 103.

```xpath
//td[text()='103']/following-sibling::td[1]
```

---

### Q22. Get department whose ID is 104.

```xpath
//td[text()='104']/following-sibling::td[2]
```

---

### Q23. Get salary whose ID is 101.

```xpath
//td[text()='101']/following-sibling::td[3]
```

---

### Q24. Get status whose ID is 102.

```xpath
//td[text()='102']/following-sibling::td[4]
```

---

## Advanced Dynamic Table Questions

### Q25. Find all Active employees.

```xpath
//td[text()='Active']/parent::tr/td[2]
```

---

### Q26. Find all Inactive employees.

```xpath
//td[text()='Inactive']/parent::tr/td[2]
```

---

### Q27. Find employee whose salary is 85000.

```xpath
//td[text()='85000']/parent::tr/td[2]
```

---

### Q28. Find employee whose department is Automation.

```xpath
//td[text()='Automation']/parent::tr/td[2]
```

---

## Parent & Ancestor

### Q29. Locate row containing salary 80000.

```xpath
//td[text()='80000']/parent::tr
```

---

### Q30. Locate row containing employee ID 102.

```xpath
//td[text()='102']/parent::tr
```

---

### Q31. Locate employeeTable using Rahul.

```xpath
//td[text()='Rahul']/ancestor::table[@id='employeeTable']
```

---

### Q32. Locate employeePortal using Arjun.

```xpath
//td[text()='Arjun']/ancestor::div[@id='employeePortal']
```

---

## Interview Challenge Questions

### Q33. Find Edit button for employee whose status is Inactive.

```xpath
//td[text()='Inactive']/parent::tr//button[text()='Edit']
```

---

### Q34. Find Delete button for employee whose salary is 65000.

```xpath
//td[text()='65000']/parent::tr//button[text()='Delete']
```

---

### Q35. Find department of employee whose name is Aadhya.

```xpath
//td[text()='Aadhya']/following-sibling::td[1]
```

---

### Q36. Find salary of employee whose department is Support.

```xpath
//td[text()='Support']/following-sibling::td[1]
```

---

### Q37. Find employee name whose salary is 75000.

```xpath
//td[text()='75000']/parent::tr/td[2]
```

---

### Q38. Find employee ID whose department is Automation.

```xpath
//td[text()='Automation']/parent::tr/td[1]
```

---

### Q39. Find all Edit buttons in the table.

```xpath
//table[@id='employeeTable']//button[text()='Edit']
```

---

### Q40. Find all Delete buttons in the table.

```xpath
//table[@id='employeeTable']//button[text()='Delete']
```
