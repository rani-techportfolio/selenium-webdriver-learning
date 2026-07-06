# DOM-04 Student Management Portal (Advanced) – Questions & Answers

## XPath Questions

### Q1. Locate Student Name textbox using `contains()`.

**Answer**
```xpath
//input[contains(@id,'studentName')]
```

---

### Q2. Locate Email textbox using `starts-with()`.

**Answer**
```xpath
//input[starts-with(@id,'studentEmail')]
```

---

### Q3. Locate Save button using visible text.

**Answer**
```xpath
//button[text()='Save']
```

---

### Q4. Locate Delete button using `contains()`.

**Answer**
```xpath
//button[contains(@id,'deleteBtn')]
```

---

### Q5. Locate Clear button using `starts-with()`.

**Answer**
```xpath
//button[starts-with(@id,'clearBtn')]
```

---

# Radio Button Questions

### Q6. Locate Selenium radio button.

**Answer**
```xpath
//input[@id='selenium']
```

---

### Q7. Locate all Course radio buttons.

**Answer**
```xpath
//input[@name='course']
```

---

### Q8. Locate API Testing radio button using Course label.

**Answer**
```xpath
//label[text()='Course']/following::input[@id='api']
```

---

# Checkbox Questions

### Q9. Locate Automation Testing checkbox.

**Answer**
```xpath
//input[@id='automation']
```

---

### Q10. Locate API Testing checkbox.

**Answer**
```xpath
//input[@id='apiSkill']
```

---

### Q11. Locate Automation Testing checkbox using Skills label.

**Answer**
```xpath
//label[text()='Skills']/following::input[@id='automation']
```

---

### Q12. Locate API Testing checkbox using Automation checkbox.

**Answer**
```xpath
//input[@id='automation']/following::input[@id='apiSkill']
```

---

# XPath Axes

### Q13. Locate Email textbox using Email label.

**Answer**
```xpath
//label[text()='Email']/following-sibling::input
```

---

### Q14. Locate Student Name label using Update button.

**Answer**
```xpath
//button[text()='Update']/preceding::label[text()='Student Name']
```

---

### Q15. Locate Save button using Delete button.

**Answer**
```xpath
//button[text()='Delete']/preceding::button[text()='Save']
```

---

### Q16. Locate Courses menu using Reports menu.

**Answer**
```xpath
//a[text()='Reports']/preceding-sibling::a[1]
```

---

### Q17. Locate Reports menu using Dashboard menu.

**Answer**
```xpath
//a[text()='Dashboard']/following-sibling::a[3]
```

---

# Parent / Ancestor

### Q18. Locate parent `div` of Automation checkbox.

**Answer**
```xpath
//input[@id='automation']/parent::div
```

---

### Q19. Locate `studentForm` using Save button.

**Answer**
```xpath
//button[contains(@id,'saveBtn')]/ancestor::form[@id='studentForm']
```

---

### Q20. Locate `studentPortal` using Clear button.

**Answer**
```xpath
//button[text()='Clear']/ancestor::div[@id='studentPortal']
```

---

# Child / Descendant

### Q21. Locate all direct children of `studentForm`.

**Answer**
```xpath
//form[@id='studentForm']/child::*
```

---

### Q22. Locate all descendants of `studentForm`.

**Answer**
```xpath
//form[@id='studentForm']/descendant::*
```

---

### Q23. Locate all direct children of `menu`.

**Answer**
```xpath
//div[@class='menu']/child::*
```

---

# CSS Selectors

### Q24. Locate Student Name textbox.

**Answer**
```css
input#studentName_123
```

---

### Q25. Locate all buttons inside the `actions` div.

**Answer**
```css
div.actions button
```

---

### Q26. Locate Reports menu item.

**Answer**
```css
div.menu a:nth-child(4)
```

---

### Q27. Locate first menu item.

**Answer**
```css
div.menu a:first-child
```

