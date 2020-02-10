package ssis;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
* The Form Handler implements validation for form items where user
* input is required. It also handles the displaying of any error messages.
*
* @author  G Williams
* @version 1.0
* @since   2019-12-02
 */
public class FormHandler {
    private JTextField sofaID;
    private JTextField sofaName;
    private JTextField sofaPrice;
    
    // Constructor
    public FormHandler(JTextField sofaID, JTextField sofaName, JTextField sofaPrice){
        this.sofaID = sofaID;
        this.sofaName = sofaName;
        this.sofaPrice = sofaPrice;
    }
    
    /**
     * Does validation on the user input for the sofa details form.
     * 
     * @return boolean 
     */
    public boolean validate(){
        
        //Initially set the validity to false
        boolean validity = false;
        
        /*
        Checks the Sofa Id matches the format we require which is case sensitive
        and needs to follow the format "AA1000"
        */
        if (!validateSofaIDFormat(sofaID.getText())){
            JOptionPane.showMessageDialog(null, Const.VALIDATE_ERR_SOFA_ID);
        }
        else if (!validateWord(sofaName.getText())){
            JOptionPane.showMessageDialog(null, Const.VALIDATE_ERR_SOFA_NAME);
        }
        else if (!validatePrice(sofaPrice.getText())){
            JOptionPane.showMessageDialog(null, Const.VALIDATE_ERR_SOFA_PRICE);
        }
        else {
            validity = true;
        }
        return validity;
    }
    
    
    /**
     * Validates the given string, checks it contains only letters and spaces
     * 
     * @param String The string value to validate.
     * @return boolean
     */
    private boolean validateWord(String text){
        String pattern = "^([a-zA-Z\\s]+)";
        return text.matches(pattern);
    }
    
    /**
     * Validates the given string to conform to the Sofa ID required format
     * 
     * @param String The string value to validate.
     * @return boolean
     */
    private boolean validateSofaIDFormat(String value){
        String pattern = "^[A-Z]{2}([0-9]){4}";
        return value.matches(pattern);
    }
    
    /**
     * Validates the given price to conform to the stated pattern (monetary form)
     * 
     * @param value The price to validate
     * @return boolean
     */
    private boolean validatePrice(String value){
        String pattern = "^\\d+\\.\\d{2}";
        return value.matches(pattern);
    }
}
