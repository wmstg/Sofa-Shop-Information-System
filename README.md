# Sofa Shop Information System
 Year 2 Emerging Platforms and Technology Assignment
 
 ## The Requirement
Use Java and NetBeans to create a Sofa Shop Information System. To create the system, you are required to create a project named SSIS containing a class named SSInfo. 

The system stores information about various types of sofa, its GUI should have a table titled “Sofa Details” for storing and displaying the following information: 
-	Sofa ID
-	Category (e.g. Armchair sofa, Loveseat sofa, Sofa beds)
-	SofaName within each category (e.g. for Armchair: Low Back, High Back, Swivel, Wingback, etc.) 
-	Colour (Red, Blue, Yellow)
-	Price
The above are the minimum requirements for sofa items in the table.

The requirements for the input GUI are: 
-	Radio buttons for selecting colours
-	A Combo box for selecting categories
-	Text fields for all other inputs 
-	The table, named Sofa Details, should have at least five categories, with two or three pieces of sofa stored for each category.

For the project GUI, a simple menu bar is required. It should have at least the following tabs:
-	File – with Open File for opening an existing file and Exit for closing the system
-	Help – for user help files

The system should provide functionality to search for different types of sofa based on price. If two or more types of sofa in the table have the same price, only the first matching sofa should be displayed in a JOptionPane message box. If no such sofa  is found, then the system should display some meaningful information in a JOptionPane message box. The search algorithm should be based on binary search. The system’s GUI should have: 
-	A text field for entering the search criteria (in this case, price),  
-	A button for searching for sofa, named “Search”.

You are required to implement another function for querying how many pieces of sofa are available when given a category: 
-	a Combo box for providing the search criteria (e.g. Armchair Sofa, Sofa Beds, etc), 
-	a button named “Available Sofa” for the search. 
The search result should be displayed meaningfully in a JOptionPane message box, for example “There are two pieces of Armchair Sofa available: a Low Back and a High Back”.


 ## Notes
 Additionally I added extra functionality to import sofa information via xml.
