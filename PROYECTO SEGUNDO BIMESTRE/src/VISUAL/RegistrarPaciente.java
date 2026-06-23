package VISUAL;

import java.awt.Color;

public class RegistrarPaciente extends javax.swing.JInternalFrame {

    //Definicion del objeto
    
    OperacionesSeguroVisual obj;
    
    //Getter and Setter

    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public RegistrarPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        cedulaTxt = new javax.swing.JTextField();
        edadTxt = new javax.swing.JTextField();
        empresaTxt = new javax.swing.JTextField();
        registrarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        msjLbl = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("REGISTRO DE UN NUEVO PACIENTE");

        jLabel2.setText("NOMBRE:");

        jLabel1.setText("CEDULA:");

        jLabel4.setText("EDAD:");

        jLabel5.setText("EMPRESA:");

        nombreTxt.addActionListener(this::nombreTxtActionPerformed);

        edadTxt.addActionListener(this::edadTxtActionPerformed);

        empresaTxt.addActionListener(this::empresaTxtActionPerformed);

        registrarBtn.setBackground(new java.awt.Color(102, 255, 51));
        registrarBtn.setForeground(new java.awt.Color(0, 0, 0));
        registrarBtn.setText("REGISTRAR");
        registrarBtn.addActionListener(this::registrarBtnActionPerformed);

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setForeground(new java.awt.Color(0, 0, 0));
        limpiarBtn.setText("LIMPIAR");
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(msjLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registrarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(cedulaTxt)
                            .addComponent(edadTxt)
                            .addComponent(empresaTxt))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarBtn)
                    .addComponent(limpiarBtn))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed

        if (nombreTxt.getText().isEmpty() || cedulaTxt.getText().isEmpty() || empresaTxt.getText().isEmpty() || edadTxt.getText().isEmpty()) {
            msjLbl.setText("ERROR: TODOS LOS CAMPOS SON OBLIGATORIOS");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "LLENE TODOS LOS DATOS PARA REGISTRAR", "¡CAMPOS VACIOS!", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obteniendo los datos del formulario

        String nombre, cedula, empresa;
        int edad;

        try {
            edad = Integer.parseInt(edadTxt.getText());
            if (edad <= 0) {
                msjLbl.setText("ERROR: LA EDAD DEBE SER MAYOR A 0");
                javax.swing.JOptionPane.showMessageDialog(this, "DEBE INTRODUCIR UN VALOR MAYOR A 0 EN 'EDAD'", "¡ERROR DE DATO!", javax.swing.JOptionPane.ERROR_MESSAGE);
                msjLbl.setForeground(Color.RED);
                return;
            }
        } catch (NumberFormatException e) {
            msjLbl.setText("ERROR: LA EDAD DEBE SER UN NÚMERO VÁLIDO");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "DEBE INTRODUCIR UN VALOR ENTERO EN 'EDAD'", "¡ERROR DE FORMATO!", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }

        // Rescatando los datos agregados a cada componente

        nombre = nombreTxt.getText();
        cedula = cedulaTxt.getText();
        empresa = empresaTxt.getText();

        // Pasando los datos obtenidos al constructor

        obj.registrarPaciente(nombre, cedula, edad, empresa);

        // Adicionando el mensaje para el usuario

        msjLbl.setText("DATOS REGISTRADOS CORRECTAMENTE");
        msjLbl.setForeground(Color.GREEN);
        
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed

        // Limpiando los campos del Album

        nombreTxt.setText("");
        cedulaTxt.setText("");
        empresaTxt.setText("");
        edadTxt.setText("");
        msjLbl.setText("");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void empresaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaTxtActionPerformed

    private void edadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JTextField edadTxt;
    private javax.swing.JTextField empresaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JButton registrarBtn;
    // End of variables declaration//GEN-END:variables
}
