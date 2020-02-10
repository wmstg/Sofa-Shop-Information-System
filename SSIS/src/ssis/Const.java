/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssis;

/**
 *
 * @author G Williams
 */
public class Const {
    
    private Const(){};
    
    // Application Name
    public static final String APP_TITLE = "Sofa Shop Information System";
    
    // File names/paths
    public static final String FILE_CATEGORIES = "categories.txt";
    public static final String FILE_HELP = "help.txt";
    
    // Extensions
    public static final String EXTENSION_FILTER_DESC_XML = "XML files (*.xml)";
    
    // Standard, labels and controls
    public static final String PRICE = "Price";
    public static final String SOFA_ID = "Sofa ID";
    public static final String SOFA_NAME = "Sofa Name";
    public static final String CATEGORY = "Category";
    public static final String COLOUR = "Colour";
    public static final String NEW_SOFA_DETAILS = "New Sofa Details";
    public static final String BLACK = "Black";
    public static final String WHITE = "White";
    public static final String BROWN = "Brown";
    public static final String GREY = "Grey";
    public static final String SOFA_INVENTORY_SEARCH = "Sofa Inventory Search";
    public static final String STORE = "Store";
    public static final String SEARCH = "Search";
    public static final String AVAILABLE_SOFAS = "Available Sofas";
    public static final String OPEN_FILE = "Open File";
    public static final String IMPORT_SOFAS = "Import Sofas";
    public static final String EXIT = "Exit";
    public static final String HELP = "Help";
    public static final String FILE = "File";
    
    // Error/Failed Messages
    public static final String NO_SOFAS_AVAILABLE = "There are no sofas available for this category.";
    public static final String PRICE_SEARCH_NOT_FOUND = "There are no sofas for the price of %s";
    public static final String SOFA_ID_NOT_UNIQUE = "A sofa with the ID %s " +
                    " already exists. Please provide a unique ID";
    public static final String VALIDATE_ERR_SOFA_ID = "The sofa ID must be formatted" +
                    " with 2 uppercase letters and followed by 4 digits.\nExample; AA1000";
    public static final String VALIDATE_ERR_SOFA_NAME = "The sofa name can not contain numbers " +
            "or special characters. Please only use alphabetic characters.";
    public static final String VALIDATE_ERR_SOFA_PRICE = "Please provide a price in decimal form.\n" +
            "Example; 100.00\n";
    public static final String VALIDATE_ERR_SEARCH_PRICE = "Please enter a decimal number or whole number.";
    
    // Success Messages
    public static final String X_SOFAS_AVAILABLE = "There are %d sofas available in the category "+
                    "\"%s\". They are as follows;\n%s";
    
    public static final String PRICE_SEARCH_FOUND = "A sofa named \"" + 
                    "%s\" has been found for the matching price of %s";
    public static final String FILE_OPENED = "The file was opened succesfully.";
    
    
    
}
