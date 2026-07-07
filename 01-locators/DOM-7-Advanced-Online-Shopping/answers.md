# Selenium XPath Answers - Online Shopping

## Level 1 – Basic

1. Locate the **Email** textbox.  
   `//input[@id='email']`

2. Locate the **Password** textbox.  
   `//input[@id='password']`

3. Locate the **Login** button.  
   `//button[@id='loginBtn']`

4. Locate the **Reset** button.  
   `//button[@id='resetBtn']`

5. Locate the **Male** radio button.  
   `//input[@id='male']`

6. Locate the **Country** dropdown.  
   `//select[@id='country']`

7. Locate the **Product** section.  
   `//section[@id='productSection']`

8. Locate the **Order** table.  
   `//table[@id='orderTable']`

9. Locate the **Navigation** menu.  
   `//ul[@class='menu']`

10. Locate the **Contact Us** link.  
    `//a[text()='Contact Us']`

---

## Level 2 – Attributes

11. Locate the textbox using its **class**.  
    `//input[contains(@class,'textbox')]`

12. Locate the **Login** button using its **id**.  
    `//button[@id='loginBtn']`

13. Locate the **Login** button using its **text**.  
    `//button[text()='Login']`

14. Locate the **Buy Now** button using its **class**.  
    `//button[contains(@class,'buyBtn')]`

15. Locate the **Cancel** button using its **class**.  
    `//button[contains(@class,'cancelBtn')]`

16. Locate the radio button using its **name**.  
    `//input[@name='gender']`

17. Locate the dropdown using its **id**.  
    `//select[@id='country']`

18. Locate the button having class **primary**.  
    `//button[contains(@class,'primary')]`

19. Locate the button having class **secondary**.  
    `//button[contains(@class,'secondary')]`

20. Locate all **product cards**.  
    `//div[@class='product-card']`

---

## Level 3 – Dynamic XPath

21. Locate the element whose **id contains** `"login"`.  
    `//*[contains(@id,'login')]`

22. Locate the element whose **class contains** `"btn"`.  
    `//*[contains(@class,'btn')]`

23. Locate the element whose **id starts with** `"pass"`.  
    `//*[starts-with(@id,'pass')]`

24. Locate **all buttons**.  
    `//button`

25. Locate **all input elements**.  
    `//input`

26. Locate **all radio buttons**.  
    `//input[@type='radio']`

27. Locate **all Buy Now buttons**.  
    `//button[contains(@class,'buyBtn')]`

28. Locate **all product names**.  
    `//h3`

29. Locate **all prices**.  
    `//span[@class='price']`

30. Locate **all table rows**.  
    `//table[@id='orderTable']//tbody/tr`

---

## Level 4 – XPath Axes

31. Find the **parent** of the Email textbox.  
    `//input[@id='email']/parent::div`

32. Find the **parent** of the Login button.  
    `//button[@id='loginBtn']/..`

33. Find the **ancestor form** of the Password textbox.  
    `//input[@id='password']/ancestor::form`

34. Find all **child buttons** inside the `buttons` div.  
    `//div[@class='buttons']/button`

35. Find the **following sibling** of the Male radio button.  
    `//input[@id='male']/following-sibling::label`

36. Find the **preceding sibling** of the Reset button.  
    `//button[@id='resetBtn']/preceding-sibling::button`

37. Find **all descendants** of the `loginForm`.  
    `//form[@id='loginForm']/descendant::*`

38. Find the **parent** of the Buy Now button.  
    `//button[normalize-space()='Buy Now']/..`

39. Find the **ancestor** of the Country dropdown.  
    `//select[@id='country']/ancestor::section`

40. Find **all descendants** of the `productSection`.  
    `//section[@id='productSection']/descendant::*`

---

## Level 5 – Indexing

41. Locate the **first product card**.  
    `(//div[@class='product-card'])[1]`

42. Locate the **second product card**.  
    `(//div[@class='product-card'])[2]`

43. Locate the **last product card**.  
    `(//div[@class='product-card'])[last()]`

44. Locate the **third button** on the page.  
    `(//button)[3]`

45. Locate the **first Buy Now button**.  
    `(//button[@class='buyBtn'])[1]`

46. Locate the **last Buy Now button**.  
    `(//button[@class='buyBtn'])[last()]`

47. Locate the **second order row**.  
    `//table[@id='orderTable']//tbody/tr[2]`

48. Locate the **last order row**.  
    `//table[@id='orderTable']//tbody/tr[last()]`

49. Locate the **second customer name**.  
    `//table[@id='orderTable']//tbody/tr[2]/td[2]`

50. Locate the **last status**.  
    `//table[@id='orderTable']//tbody/tr[last()]/td[4]`

---

## Level 6 – Text Functions

51. Find the **Login** button using text.  
    `//button[text()='Login']`

52. Find the **Reset** button using text.  
    `//button[text()='Reset']`

53. Find the product **Samsung S25**.  
    `//h3[text()='Samsung S25']`

54. Find the product **iPhone 17**.  
    `//h3[text()='iPhone 17']`

55. Find the **Processing** status.  
    `//td[text()='Processing']`

56. Find the **Delivered** status.  
    `//td[text()='Delivered']`

57. Find the customer **Rahul**.  
    `//td[text()='Rahul']`

58. Find the **Contact Us** link.  
    `//a[text()='Contact Us']`

59. Find the **ShopEasy** logo.  
    `//div[normalize-space()='ShopEasy']`

60. Find the **footer text**.  
    `//footer/span`

---

## Level 7 – Real Interview Scenarios

61. Click the **Buy Now** button for **Samsung S25**.  
    `//div[h3='Samsung S25']//button`

62. Click the **Buy Now** button for **OnePlus 15**.  
    `//div[h3='OnePlus 15']//button`

63. Get the **price** of **iPhone 17**.  
    `//div[h3='iPhone 17']//span[@class='price']`

64. Get **Rahul's order status**.  
    `//tr[td='Rahul']/td[4]`

65. Get the **Order ID** of **Anjali**.  
    `//td[text()='Anjali']/preceding-sibling::td[1]`

66. Click the **View** button for **Rahul**.  
    `//tr[td='Rahul']//button[text()='View']`

67. Click the **Cancel** button for **Rani**.  
    `//tr[td='Rani']//button[text()='Cancel']`

68. Count all **product cards**.  
    `//div[@class='product-card']`

69. Count all **order rows**.  
    `//table[@id='orderTable']//tbody/tr`

70. Find the **last product name**.  
    `(//div[@class='product-card'])[last()]/h3`

71. Find the **first customer**.  
    `//table[@id='orderTable']//tbody/tr[1]/td[2]`

72. Find the **last Buy Now button**.  
    `(//button[@class='buyBtn'])[last()]`

73. Find the **first Cancel button**.  
    `(//table[@id='orderTable']//button[text()='Cancel'])[1]`

74. Click the **Login** button inside the **loginForm** only.  
    `//form[@id='loginForm']//button[text()='Login']`

75. Locate the **Country** dropdown.  
    `//select[@id='country']`
