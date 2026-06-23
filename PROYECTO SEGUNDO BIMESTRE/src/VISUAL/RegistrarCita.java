package VISUAL;

import CONSOLA.Medico;
import CONSOLA.Paciente;
import java.awt.Color;

public class RegistrarCita extends javax.swing.JInternalFrame {

    //Definicion del objeto
    
    OperacionesSeguroVisual obj;
    
    //Getter and Setter

    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public RegistrarCita() {
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
        pacienteTxt = new javax.swing.JTextField();
        medicoTxt = new javax.swing.JTextField();
        fechaTxt = new javax.swing.JTextField();
        horaTxt = new javax.swing.JTextField();
        registrarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        msjLbl = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("REGISTRO DE UNA NUEVA CITA");

        jLabel2.setText("PACIENTE:");

        jLabel1.setText("MEDICO:");

        jLabel4.setText("FECHA:");

        jLabel5.setText("HORA:");

        pacienteTxt.addActionListener(this::pacienteTxtActionPerformed);

        fechaTxt.addActionListener(this::fechaTxtActionPerformed);

        horaTxt.addActionListener(this::horaTxtActionPerformed);

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
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pacienteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(medicoTxt)
                    .addComponent(fechaTxt)
                    .addComponent(horaTxt))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pacienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(medicoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void fechaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTxtActionPerformed

    private void pacienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteTxtActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
                                         
        if (pacienteTxt.getText().isEmpty() || medicoTxt.getText().isEmpty() || fechaTxt.getText().isEmpty() || horaTxt.getText().isEmpty()) {
            msjLbl.setText("ERROR: TODOS LOS CAMPOS SON OBLIGATORIOS");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "LLENE TODOS LOS DATOS PARA REGISTRAR", "¡CAMPOS VACIOS!", javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        // Obteniendo los datos del formulario
        
        String paciente, medico, fecha, hora;

        // Rescatando los datos agregados a cada componente
        
        paciente = pacienteTxt.getText();
        medico = medicoTxt.getText();
        fecha = fechaTxt.getText();
        hora = horaTxt.getText();
        
        Paciente pacEncontrado = obj.buscarPacientePorNombre(paciente);
        Medico medEncontrado = obj.buscarMedicoPorNombre(medico);

        if (pacEncontrado == null && medEncontrado == null) {
            msjLbl.setText("ERROR: NI EL PACIENTE NI EL MÉDICO EXISTEN");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this,"EL PACIENTE " + paciente + " Y EL MEDICO " + medico + " NO SE ENCUENTRAN REGISTRADOS", "¡SIN REGISTRO!", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if (pacEncontrado == null) {
            msjLbl.setText("ERROR: EL PACIENTE NO EXISTE");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this,"EL PACIENTE " + paciente + " NO SE ENCUENTRA REGISTRADO", "¡SIN REGISTRO!", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if (medEncontrado == null) {
            msjLbl.setText("ERROR: EL MÉDICO NO EXISTE");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this,"EL MEDICO " + medico + " NO SE ENCUENTRA REGISTRADO", "¡SIN REGISTRO!", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Pasando los datos obtenidos al constructor
        
        obj.registrarCita(paciente, medico, fecha, hora);

        // Adicionando el mensaje para el usuario
        
        msjLbl.setText("DATOS REGISTRADOS CORRECTAMENTE");
        msjLbl.setForeground(Color.GREEN);
        
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed

        // Limpiando los campos del Album

        pacienteTxt.setText("");
        medicoTxt.setText("");
        fechaTxt.setText("");
        horaTxt.setText("");
        msjLbl.setText("");

    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void horaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fechaTxt;
    private javax.swing.JTextField horaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField medicoTxt;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JTextField pacienteTxt;
    private javax.swing.JButton registrarBtn;
    // End of variables declaration//GEN-END:variables
}
