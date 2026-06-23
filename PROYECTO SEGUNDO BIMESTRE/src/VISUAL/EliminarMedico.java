package VISUAL;

import CONSOLA.Medico;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EliminarMedico extends javax.swing.JInternalFrame {

    OperacionesSeguroVisual obj = new OperacionesSeguroVisual();
    List<Medico> listaMedicos;  
    
    //Getter y Setter

    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public EliminarMedico() {
        initComponents();
    }
    
    public void mostrarMedico(){
        int f = 0;
        listaMedicos = obj.getListaMedicos();
        if(!listaMedicos.isEmpty()){
            DefaultTableModel modelo = (DefaultTableModel)tablaMedicoTbl.getModel();
            
            //Definiendo filas y columnas en el modelo
            
            modelo.setColumnCount(5);
            modelo.setRowCount(10);
            
            //Llenando los datos a la tabla
            
            for(Medico m:listaMedicos){
               tablaMedicoTbl.setValueAt(f+1, f, 0);
               tablaMedicoTbl.setValueAt(m.getNombreCompleto(), f, 1);
               tablaMedicoTbl.setValueAt(m.getNumeroCedula(), f, 2);
               tablaMedicoTbl.setValueAt(m.getEdad(), f, 3);
               tablaMedicoTbl.setValueAt(m.getEspecialidad(), f, 4);
               f++;
            }
            
        }else{
            msjLbl.setText("NO SE TIENEN MEDICOS REGISTRADOS");
            msjLbl.setForeground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedulaTxt = new javax.swing.JTextField();
        cancelarBtn = new javax.swing.JButton();
        msjLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMedicoTbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        cedulaTxt.addActionListener(this::cedulaTxtActionPerformed);

        cancelarBtn.setText("CANCELAR");
        cancelarBtn.addActionListener(this::cancelarBtnActionPerformed);

        msjLbl.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setText("CEDULA:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("ELIMINAR MEDICO");

        eliminarBtn.setText("ELIMINAR");
        eliminarBtn.addActionListener(this::eliminarBtnActionPerformed);

        tablaMedicoTbl.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Nª", "NOMBRE", "CEDULA", "EDAD", "EMPRESA"
            }
        ));
        tablaMedicoTbl.setShowGrid(false);
        jScrollPane2.setViewportView(tablaMedicoTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 238, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarBtn)
                        .addGap(236, 236, 236))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eliminarBtn)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed

        msjLbl.setText("");
        cedulaTxt.setText("");

    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed

        if (cedulaTxt.getText().isEmpty()){
            msjLbl.setText("ERROR: DEBE LLENAR EL CAMPO 'CEDULA'");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "LLENE TODOS LOS DATOS PARA CONTINUAR", "¡CAMPOS VACIOS!", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Realizando la busqueda de album musical

        String cedula = cedulaTxt.getText();

        //Llamando al metodo de busqueda

        Medico medEncontrado = obj.buscarMedico(cedula);

        if (medEncontrado != null) {
            String nombreMedico = medEncontrado.getNombreCompleto();
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,"¿DESEA CONTINUAR CON LA ELIMINACION DE: " + nombreMedico + "?","CONFIRMAR ELIMINACION",javax.swing.JOptionPane.YES_NO_OPTION,javax.swing.JOptionPane.QUESTION_MESSAGE);
            if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                obj.eliminarMedico(cedula);
                msjLbl.setText("MEDICO ELIMINADO CON EXITO");
                msjLbl.setForeground(Color.GREEN);
            } else {
                msjLbl.setText("ELIMINACION CANCELADA");
                msjLbl.setForeground(Color.ORANGE);
            }
        } else {
            msjLbl.setText("ERROR: LA CEDULA NO ESTA REGISTRADA");
            msjLbl.setForeground(Color.RED);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JTable tablaMedicoTbl;
    // End of variables declaration//GEN-END:variables
}
