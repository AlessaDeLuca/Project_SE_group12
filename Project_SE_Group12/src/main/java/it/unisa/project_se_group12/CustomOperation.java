/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.unisa.project_se_group12;

import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * This class allows us to manage the interface that consent at the user to create custom operations.
 */
public class CustomOperation extends javax.swing.JFrame {
    UDO udo;
    DefaultListModel<String> model;
    /**
     * Creates new form CustomOperation
     * @param udo : User Defined Operation
     * @param model : default model used for JList component
     */
    public CustomOperation(UDO udo, DefaultListModel<String> model) {
        initComponents();
        this.udo = udo;
        this.model = model;
        setDefaultCloseOperation(CustomOperation.DISPOSE_ON_CLOSE);
        nameList.setModel(this.model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        insertNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        diffButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        javax.swing.JButton divButton = new javax.swing.JButton();
        javax.swing.JButton squareRootButton = new javax.swing.JButton();
        javax.swing.JButton invertButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        dropButton = new javax.swing.JButton();
        dupButton = new javax.swing.JButton();
        swapButton = new javax.swing.JButton();
        overButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        operationArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        nameList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        operationView = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        saveToFileButton = new javax.swing.JButton();
        loadFromFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 194, 194));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Custom new operation");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name: ");

        insertNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select operations:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Operations");

        insertButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        insertButton.setForeground(new java.awt.Color(0, 153, 153));
        insertButton.setText("INSERT");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 153, 153));
        addButton.setText("+");
        addButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        diffButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        diffButton.setForeground(new java.awt.Color(0, 153, 153));
        diffButton.setText("-");
        diffButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        diffButton.setPreferredSize(new java.awt.Dimension(15, 23));
        diffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diffButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        multiplyButton.setForeground(new java.awt.Color(0, 153, 153));
        multiplyButton.setText("x");
        multiplyButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        multiplyButton.setPreferredSize(new java.awt.Dimension(15, 23));
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        divButton.setForeground(new java.awt.Color(0, 153, 153));
        divButton.setText("÷");
        divButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        squareRootButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        squareRootButton.setForeground(new java.awt.Color(0, 153, 153));
        squareRootButton.setText("√");
        squareRootButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        squareRootButton.setPreferredSize(new java.awt.Dimension(15, 23));
        squareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootButtonActionPerformed(evt);
            }
        });

        invertButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        invertButton.setForeground(new java.awt.Color(0, 153, 153));
        invertButton.setText("+-");
        invertButton.setActionCommand("-x");
        invertButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        invertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(0, 153, 153));
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        dropButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        dropButton.setForeground(new java.awt.Color(0, 153, 153));
        dropButton.setText("DROP");
        dropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropButtonActionPerformed(evt);
            }
        });

        dupButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        dupButton.setForeground(new java.awt.Color(0, 153, 153));
        dupButton.setText("DUP");
        dupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dupButtonActionPerformed(evt);
            }
        });

        swapButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        swapButton.setForeground(new java.awt.Color(0, 153, 153));
        swapButton.setText("SWAP");
        swapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapButtonActionPerformed(evt);
            }
        });

        overButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        overButton.setForeground(new java.awt.Color(0, 153, 153));
        overButton.setText("OVER");
        overButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overButtonActionPerformed(evt);
            }
        });

        operationArea.setColumns(20);
        operationArea.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        operationArea.setRows(5);
        jScrollPane2.setViewportView(operationArea);

        nameList.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        nameList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(nameList);

        operationView.setColumns(20);
        operationView.setRows(5);
        jScrollPane1.setViewportView(operationView);

        deleteButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 153, 153));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        modifyButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        modifyButton.setForeground(new java.awt.Color(0, 153, 153));
        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 153, 153));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        saveToFileButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        saveToFileButton.setForeground(new java.awt.Color(0, 153, 153));
        saveToFileButton.setText("Save");
        saveToFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToFileButtonActionPerformed(evt);
            }
        });

        loadFromFileButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        loadFromFileButton.setForeground(new java.awt.Color(0, 153, 153));
        loadFromFileButton.setText("Load");
        loadFromFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFromFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(diffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(squareRootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(swapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(overButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(invertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)
                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(saveToFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadFromFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insertNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(diffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divButton)
                            .addComponent(squareRootButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dupButton)
                            .addComponent(clearButton)
                            .addComponent(dropButton)
                            .addComponent(swapButton)
                            .addComponent(overButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addGap(18, 18, 18)
                                .addComponent(modifyButton)
                                .addGap(18, 18, 18)
                                .addComponent(submitButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveToFileButton)
                                .addGap(18, 18, 18)
                                .addComponent(loadFromFileButton)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Textfield for the name of the custom operation.
 * @param evt 
 */
    private void insertNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNameFieldActionPerformed
        
    }//GEN-LAST:event_insertNameFieldActionPerformed
/**
 * Button that allows to the user to insert the operation into the area (Hash Map) that preserve all custom operations created.
 * @param evt 
 */
    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        String name = insertNameField.getText();
        String operation = operationArea.getText();
        udo.insertUDO(name, operation);
        model.addElement(name);
        insertNameField.setText("");
        operationArea.setText("");
    }//GEN-LAST:event_insertButtonActionPerformed
/**
 * Button that allows to the user to add sum operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        operationArea.setText(operationArea.getText() + "+ ");
    }//GEN-LAST:event_addButtonActionPerformed
/**
 * button that allows to the user to add difference operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void diffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diffButtonActionPerformed
        operationArea.setText(operationArea.getText() + "- ");
    }//GEN-LAST:event_diffButtonActionPerformed
/**
 * Button that allows to the user to add product operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        operationArea.setText(operationArea.getText() + "* ");
    }//GEN-LAST:event_multiplyButtonActionPerformed
/**
 * Button that allows to the user to add division operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        operationArea.setText(operationArea.getText() + "÷ ");
    }//GEN-LAST:event_divButtonActionPerformed
/**
 * Button that allows to the user to add square root operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void squareRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootButtonActionPerformed
        operationArea.setText(operationArea.getText() + "√ ");
    }//GEN-LAST:event_squareRootButtonActionPerformed
/**
 * Button that allows to the user to add invert sign operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void invertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertButtonActionPerformed
        operationArea.setText(operationArea.getText() + "+- ");
    }//GEN-LAST:event_invertButtonActionPerformed
/**
 * Button that allows to the user to add clear operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        operationArea.setText(operationArea.getText() + "Clear ");
    }//GEN-LAST:event_clearButtonActionPerformed
/**
 * Button that allows to the user to add drop operation into the text field of the operation that a custom operation have to do
 * @param evt 
 */
    private void dropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropButtonActionPerformed
       operationArea.setText(operationArea.getText() + "Drop ");
    }//GEN-LAST:event_dropButtonActionPerformed
/**
 * Button that allows to the user to add dup operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void dupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dupButtonActionPerformed
       operationArea.setText(operationArea.getText() + "Dup "); 
    }//GEN-LAST:event_dupButtonActionPerformed
/**
 * Button that allows to the user to add swap operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void swapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapButtonActionPerformed
        operationArea.setText(operationArea.getText() + "Swap ");
    }//GEN-LAST:event_swapButtonActionPerformed
/**
 * Button that allows to the user to add over operation into the text field of the operation that a custom operation have to do.
 * @param evt 
 */
    private void overButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overButtonActionPerformed
        operationArea.setText(operationArea.getText() + "Over ");
    }//GEN-LAST:event_overButtonActionPerformed
/**
 * List of the custom operation that the user have created before.
 * @param evt 
 */
    private void nameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMouseClicked
        String key = nameList.getSelectedValue();
        operationView.setText(udo.getMap().get(key));
    }//GEN-LAST:event_nameListMouseClicked
/**
 * Button that allows to the user to delete a custom operation.
 * @param evt 
 */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
         String key = nameList.getSelectedValue();
         udo.deleteUDO(key);
         this.model.removeElement(key);
         operationView.setText("");
    }//GEN-LAST:event_deleteButtonActionPerformed
/**
 * Button that allows to the user to modify a custom operation.
 * @param evt 
 */
    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        String key = nameList.getSelectedValue();
        insertNameField.setText(key);
        operationArea.setText(udo.getMap().get(key));
        udo.deleteUDO(key);
        this.model.removeElement(key);
        operationView.setText("");
    }//GEN-LAST:event_modifyButtonActionPerformed
/**
 * Button that allows to the user to reutilize a custom operation as argument of a new custom operation.
 * @param evt 
 */
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        operationArea.setText(nameList.getSelectedValue() + " ");
    }//GEN-LAST:event_submitButtonActionPerformed
/**
 * The button allows to the user to save the user defined operations in a file.
 * @param evt 
 */
    private void saveToFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToFileButtonActionPerformed
        if(udo.saveToFile()){
            JOptionPane.showMessageDialog(this, "UDO correctly saved on a file");
        }else
            JOptionPane.showMessageDialog(this, "UDO NOT correctly save on a file","ERROR",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_saveToFileButtonActionPerformed
/**
 * The button allows to the user to reload the user defined operation from a file.
 * @param evt 
 */
    private void loadFromFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFromFileButtonActionPerformed
        if(udo.loadFromFile()){
            model.clear();
            for (Map.Entry<String, String> entry : udo.getMap().entrySet()) {
                model.addElement(entry.getKey());
            }
            JOptionPane.showMessageDialog(this, "UDO correctly load from a file");
        }else
            JOptionPane.showMessageDialog(this, "UDO NOT correctly load from a file","ERROR",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_loadFromFileButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
    //         new CustomOperation().setVisible(false);
       }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton diffButton;
    private javax.swing.JButton dropButton;
    private javax.swing.JButton dupButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JTextField insertNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loadFromFileButton;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JList<String> nameList;
    private javax.swing.JTextArea operationArea;
    private javax.swing.JTextArea operationView;
    private javax.swing.JButton overButton;
    private javax.swing.JButton saveToFileButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton swapButton;
    // End of variables declaration//GEN-END:variables
}
