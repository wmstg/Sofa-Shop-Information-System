/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssis;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
//import javax.swing.JOptionPane;

/**
 *
 * @author G Williams
 */
public class SSinfo extends javax.swing.JFrame {
    ArrayList<String> categoryItems = new ArrayList<String>(0);

    /**
     * Creates new form SofaShopInformationSystem
     */
    public SSinfo() {
        initComponents();
        setCategories();
        sofaIDTF.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colourGroupRadio = new javax.swing.ButtonGroup();
        priceTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        sofaIDTF = new javax.swing.JTextField();
        sofaNameTF = new javax.swing.JTextField();
        sofaPriceTF = new javax.swing.JTextField();
        categoryCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        colourBlackRadio = new javax.swing.JRadioButton();
        colorBrownRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        colourGreyRadio = new javax.swing.JRadioButton();
        colorWhiteRadio = new javax.swing.JRadioButton();
        storeBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        availableSofaBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sofasTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFileMI = new javax.swing.JMenuItem();
        importSofasMI = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenuItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Const.APP_TITLE);

        priceTF.setText(Const.PRICE);
        priceTF.setName(""); // NOI18N
        priceTF.setPreferredSize(new java.awt.Dimension(400, 32));
        priceTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceTFFocusLost(evt);
            }
        });

        searchBtn.setText(Const.SEARCH);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(Const.NEW_SOFA_DETAILS));
        jPanel1.setName(""); // NOI18N

        jLabel1.setText(Const.SOFA_ID);

        jLabel2.setText(Const.SOFA_NAME);

        jLabel3.setText(Const.PRICE);

        jLabel4.setText(Const.CATEGORY);

        colourGroupRadio.add(colourBlackRadio);
        colourBlackRadio.setSelected(true);
        colourBlackRadio.setText(Const.BLACK);

        colourGroupRadio.add(colorBrownRadio);
        colorBrownRadio.setText(Const.BROWN);

        jLabel5.setText(Const.COLOUR);

        colourGroupRadio.add(colourGreyRadio);
        colourGreyRadio.setText(Const.GREY);

        colourGroupRadio.add(colorWhiteRadio);
        colorWhiteRadio.setText(Const.WHITE);

        storeBtn.setText(Const.STORE);
        storeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorBrownRadio)
                            .addComponent(colourBlackRadio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colourGreyRadio)
                            .addComponent(colorWhiteRadio))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sofaIDTF)
                            .addComponent(sofaNameTF)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sofaPriceTF)
                            .addComponent(categoryCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(storeBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sofaIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sofaNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sofaPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colourBlackRadio)
                    .addComponent(jLabel5)
                    .addComponent(colourGreyRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorBrownRadio)
                    .addComponent(colorWhiteRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(storeBtn))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(Const.SOFA_INVENTORY_SEARCH));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        availableSofaBtn.setText(Const.AVAILABLE_SOFAS);
        availableSofaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableSofaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableSofaBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(availableSofaBtn)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sofa Details"));

        sofasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sofa ID", "Category", "Sofa Name", "Colour", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sofasTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText(Const.FILE);

        openFileMI.setText(Const.OPEN_FILE);
        openFileMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileMIActionPerformed(evt);
            }
        });
        jMenu1.add(openFileMI);

        importSofasMI.setText(Const.IMPORT_SOFAS);
        importSofasMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importSofasMIActionPerformed(evt);
            }
        });
        jMenu1.add(importSofasMI);

        exitMenuItem.setText(Const.EXIT);
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        helpMenuItem.setText(Const.HELP);
        helpMenuItem.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                helpMenuItemMenuSelected(evt);
            }
        });
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        jMenuBar1.add(helpMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Stores new sofa details submitted via the form once validated and performs
     * a SofaID test, to determine Sofa IDs are unique.
     * 
     * @param evt 
     */
    private void storeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeBtnActionPerformed
        FormHandler formHandler = new FormHandler(sofaIDTF,
                sofaNameTF, sofaPriceTF);
        
        // Validate the form
        boolean formValid = formHandler.validate();
        if (formValid){
            // Check the sofa ID is unique
            if (!isSIDUnique()){
                JOptionPane.showMessageDialog(null, 
                        String.format(Const.SOFA_ID_NOT_UNIQUE, sofaIDTF.getText()));
            }
            else {
                //newSofa();
                newSofa(sofaIDTF.getText(),
                        categoryCB.getSelectedItem().toString(),
                        sofaNameTF.getText(),
                        getSelectedColour(),
                        sofaPriceTF.getText());
            }
        }
    }//GEN-LAST:event_storeBtnActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed
        
    }//GEN-LAST:event_helpMenuItemActionPerformed

    /**
     * Exits the program
     * 
     * @param evt 
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * Reads the help documentation from a .txt file and displays it in a dialog
     * (JOptionPane)
     * 
     * @param evt 
     */
    private void helpMenuItemMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_helpMenuItemMenuSelected
        String content = null;
        String helpDoc = "";
        
        try {
            
            InputStream inputStream = this.getClass().getResourceAsStream(Const.FILE_HELP);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            
            while ((content = reader.readLine())!= null){
                helpDoc = helpDoc + content + "\n";
            }
            reader.close();
            JOptionPane.showMessageDialog(this, helpDoc);
        } catch (IOException ex) {
            Logger.getLogger(SSinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_helpMenuItemMenuSelected

    /**
     * Clears text from the price textfield.
     * 
     * @param evt 
     */
    private void priceTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTFFocusGained
        // TODO add your handling code here:
        JTextField priceTF = (JTextField) evt.getSource();
        if (priceTF.getText().length() > 0){
            priceTF.setText("");
        }
    }//GEN-LAST:event_priceTFFocusGained

    /**
     * If the price text field contains no text it will set the text value
     * to the word Price. It informs the user that a price is required to be provided.
     * 
     * @param evt 
     */
    private void priceTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTFFocusLost
        JTextField priceTF = (JTextField) evt.getSource();
        if (priceTF.getText().length()==0){
            priceTF.setText(Const.PRICE);
        }
    }//GEN-LAST:event_priceTFFocusLost

    /**
     * Loops through the table rows and counts how many times the selected
     * category is found. It outputs the count in a dialog box (JOptionPane).
     * 
     * @param evt 
     */
    private void availableSofaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableSofaBtnActionPerformed

        int rowCnt = sofasTable.getRowCount();
        int sofaCnt = 0;
        String sofaNames = "";
        
        for (int i = 0; i < rowCnt; i++){
            String data = (String)sofasTable.getValueAt(i, 1);
            String tmpName = (String)sofasTable.getValueAt(i, 2);
            if (data!=null && data.length()!=0){
                if (jComboBox2.getSelectedItem().toString().equals(data.toString())){
                    sofaCnt++;
                    sofaNames += tmpName+"\n";
                }
            }
        }
        
        String msg;
        if (sofaCnt == 0){
            msg = Const.NO_SOFAS_AVAILABLE;
        }
        else {
            msg = String.format(Const.X_SOFAS_AVAILABLE, sofaCnt,
                    jComboBox2.getSelectedItem().toString(), sofaNames);
        }
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_availableSofaBtnActionPerformed

    /**
     * Initiates the search on the sofas table using the value entered from
     * the price search text field.
     * 
     * @see #search
     * @param evt 
     */
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        try {
            Double d = Double.parseDouble(priceTF.getText().toString());
            search(priceTF.getText().toString());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, Const.VALIDATE_ERR_SEARCH_PRICE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    /**
     * Simulates opening a file. It displays a success message in a dialog box
     * 
     * @param evt 
     */
    private void openFileMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMIActionPerformed
        // TODO add your handling code here:
        JFileChooser fileOpen = new JFileChooser();
        int returnResult = fileOpen.showDialog(null, null);
        
        if (returnResult == JFileChooser.APPROVE_OPTION){
            if (Desktop.isDesktopSupported()){
                try {
                    //String filePath = .getAbsolutePath();
                    Desktop.getDesktop().open(fileOpen.getSelectedFile());
                } catch (IOException ex) {
                    Logger.getLogger(SSinfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       
    }//GEN-LAST:event_openFileMIActionPerformed
    
    /**
     * Opens the file chooser for the user to provide the sofas.xml file.
     * This will import the sofas in to the sofas details table.
     * 
     * @param evt 
     */
    private void importSofasMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importSofasMIActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
       fileChooser.setFileFilter(new FileNameExtensionFilter(
               Const.EXTENSION_FILTER_DESC_XML, "xml"));
       fileChooser.setAcceptAllFileFilterUsed(false);
       int returnResult = fileChooser.showDialog(null, null);
       
       if (returnResult == JFileChooser.APPROVE_OPTION){
            try {
                
                DOMParser parser = new DOMParser();
                parser.parse(fileChooser.getSelectedFile().getAbsolutePath());
                Document doc = parser.getDocument();
                doc.getDocumentElement().normalize();
                NodeList nodeList = doc.getElementsByTagName("sofa");
                //Node n;

                for (int i=0; i<nodeList.getLength(); i++)
                {
                   NodeList children = nodeList.item(i).getChildNodes();
                   String tID="", tCategory="", tName="", tColor ="", tPrice = "";
                   
                   for (int j =0; j<children.getLength();j++){
                       switch (children.item(j).getNodeName()){
                           case "id":
                               tID = children.item(j).getTextContent();
                               break;
                           case "category":
                               tCategory = children.item(j).getTextContent();
                               break;
                           case "name":
                               tName = children.item(j).getTextContent();
                               break;
                           case "color":
                               tColor = children.item(j).getTextContent();
                               break;
                           case "price":
                               tPrice = children.item(j).getTextContent();
                               break;
                       }
                   }
                   newSofa(tID, tCategory, tName, tColor, tPrice);
                   
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SSinfo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | SAXException ex) {
                Logger.getLogger(SSinfo.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_importSofasMIActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SSinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SSinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SSinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SSinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SSinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton availableSofaBtn;
    private javax.swing.JComboBox<String> categoryCB;
    private javax.swing.JRadioButton colorBrownRadio;
    private javax.swing.JRadioButton colorWhiteRadio;
    private javax.swing.JRadioButton colourBlackRadio;
    private javax.swing.JRadioButton colourGreyRadio;
    private javax.swing.ButtonGroup colourGroupRadio;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenuItem;
    private javax.swing.JMenuItem importSofasMI;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openFileMI;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField sofaIDTF;
    private javax.swing.JTextField sofaNameTF;
    private javax.swing.JTextField sofaPriceTF;
    private javax.swing.JTable sofasTable;
    private javax.swing.JButton storeBtn;
    // End of variables declaration//GEN-END:variables

    /**
     * Loops through the Colour button group and returns the selected button
     * 
     * @return String the colour of the selected Colour button group
     */
    private String getSelectedColour(){
        String colour = "";
        for (Enumeration colourRadio = colourGroupRadio.getElements(); colourRadio.hasMoreElements();){
            JRadioButton button = (JRadioButton) colourRadio.nextElement();
            if (button.isSelected()){
                colour = button.getText();
            }
        }
        return colour;
    }
    
    /**
     * Checks the Sofa ID against the existing Sofa IDs in the table.
     * The ID must be unique.
     * 
     * @return boolean
     */
    private boolean isSIDUnique(){
        int rowCnt = sofasTable.getRowCount();
        for (int i = 0; i < rowCnt; i++){
            String data = (String)sofasTable.getValueAt(i, 0);
            if (data!=null && data.length()!=0){
                if (sofaIDTF.getText().equals(data.toString())){
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Stores a new sofa details in to the sofa table
     */
    private void newSofa(String id, String category, String name, String colour,
            String price) {
        try{
        
        String[] value = {id, category, name, colour, price};
        int rowCount = sofasTable.getRowCount(); //get the number of rows
        int columnCount = sofasTable.getColumnCount(); //get the number of columns
        int nextRow = 0;
        boolean emptyRowFlag = false; //
        String s;
        
        do {
            s = (String)sofasTable.getValueAt(nextRow, 0);
            
            if (s!=null && s.length()!=0){
                nextRow++;
            }
            else{
                emptyRowFlag = true;
            }
        } while (nextRow<rowCount && !emptyRowFlag);
        
        for (int i=0; i<columnCount; i++){
            sofasTable.setValueAt(value[i], nextRow, i);
        }
        } catch (Exception e){JOptionPane.showMessageDialog(null, e.toString());}
    }
    
    /**
     * Sets the categories for the inventory search and new sofa details combo boxes
     */
    private void setCategories(){
        String content = null;
        
        try {
            
            InputStream inputStream = this.getClass().getResourceAsStream(Const.FILE_CATEGORIES);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            
            while ((content = reader.readLine())!=null){
                categoryItems.add(content);
            }
                } catch (IOException ex) {
                    Logger.getLogger(SSinfo.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
       
        if (!categoryItems.isEmpty()){
            categoryCB.setModel(new DefaultComboBoxModel(categoryItems.toArray()));
            jComboBox2.setModel(new DefaultComboBoxModel(categoryItems.toArray()));
        }
    }
    
    /**
     * Searches the Sofa Tables using binary search to find a sofa matching the
     * given price
     * 
     * @param items 
     */
    private void search(String price){
        BinarySearch binarySearch = new BinarySearch();
 
        ArrayList<Sofa> sofa = new ArrayList<Sofa>();

        int rowCount = sofasTable.getRowCount();
        int rowIndex = 0; // start from row 0

        boolean emptyFlag = false;

        do {
            String prices = (String) sofasTable.getValueAt(rowIndex, 4);
            String sofaName = (String) sofasTable.getValueAt(rowIndex, 2);

            if (prices != null && prices.length() != 0){
                sofa.add(new Sofa(Double.parseDouble(prices), sofaName));
                rowIndex++;
            }
            else {
                emptyFlag = true;
            }

        } while (rowIndex < rowCount && !emptyFlag);

        Collections.sort(sofa); // sort the list

        int low = 0;
        int high = sofa.size() - 1;

        int searchResult = binarySearch.search(sofa, low, high, Double.parseDouble(price));

        if (searchResult < 0){
            JOptionPane.showMessageDialog(null,
                    String.format(Const.PRICE_SEARCH_NOT_FOUND, price));
        }
        else {
            JOptionPane.showMessageDialog(null, String.format(Const.PRICE_SEARCH_FOUND,
                    sofa.get(searchResult).getName(), price));
        }
    }
}
