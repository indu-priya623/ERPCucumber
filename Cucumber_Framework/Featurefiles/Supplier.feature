Feature:
As a admin want to validate Supplier module
@supplier
Scenario Outline:
Validate add Supplier with multiple Data
When launch browser
When launch url with "http://webapp.qedgetech.com/login.php" in  browser
When wait for username with "xpath" and "//input[@id='username']"  
When enter username with "xpath" and "//input[@id='username']" and "admin"
When enter password with "xpath" and "//input[@id='password']" and "master"
When click submit with "xpath" and "//button[@id='btnsubmit']"
When wait for logout link with "xpath" and "(//a[@href='logout.php'][normalize-space()='Logout'])[2]"
When validate page title with "Dashboard « Stock Accounting"
When wait for Supplier link with "xpath" and "(//a[starts-with(text(),'Suppliers')])[2]"
When click Supplier link with "xpath" and "(//a[starts-with(text(),'Suppliers')])[2]"
When wait for addIcon with "xpath" and "(//span[@data-phrase='AddLink'])[1]"
When click addIcon with "xpath" and "(//span[@data-phrase='AddLink'])[1]"
When wait for supplier number with "xpath" and "(//input[@id='x_Supplier_Number'])[1]"
When capture supplier number  with "xpath" and "(//input[@id='x_Supplier_Number'])[1]"
When enter supplier name in "<SupplierName>" with "xpath" and "//input[@id='x_Supplier_Name']"
When enter address in "<address>" with "xpath" and "//textarea[@id='x_Address']"
When enter city in "<City>" with "xpath" and "//input[@id='x_City']"
When enter country in "<Counrty>" with "xpath" and "//input[@id='x_Country']"
When enter contact person in "<ContactPerson>" with "xpath" and "//input[@id='x_Contact_Person']"
When enter phone number in "<phoneNumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When enter email in "<Email>" with "xpath" and "//input[@id='x__Email']"
When enter mobile number in "<mobileNumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When enter notes  in "<notes>" with "xpath" and "//textarea[@id='x_Notes']"
When click addbutton with "id" and "btnAction"
When wait for confirm ok with "xpath" and "(//button[normalize-space()='OK!'])[1]"
When click confirm ok button with "xpath" and "(//button[normalize-space()='OK!'])[1]" 
When wait for alert ok button with "xpath" and "(//button[contains(normalize-space(),'OK')])[6]"
When click alert ok button with "xpath" and "(//button[contains(normalize-space(),'OK')])[6]"
When validate for supplier table
When click logout with "xpath" and "(//a[@href='logout.php'][normalize-space()='Logout'])[2]"
When close browser


Examples:
|customername|address|City|Country|ContactPerson|phoneNumber|email|mobileNumber|notes|
|chandu1|ameerpet1|hyderabad|india|sai|9876543212|chandu@gmail.com|8765432345|i am customer|
|chandu2|ameerpet2|hyderabad|india|sai|9876543212|chandu@gmail.com|8765432345|i am customer|
|chandu3|ameerpet3|hyderabad|india|sai|9876543212|chandu@gmail.com|8765432345|i am customer|
