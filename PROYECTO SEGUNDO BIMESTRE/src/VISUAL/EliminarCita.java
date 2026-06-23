package VISUAL;

import CONSOLA.Cita;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EliminarCita extends javax.swing.JInternalFrame {

    OperacionesSeguroVisual obj = new OperacionesSeguroVisual();
    List<Cita> listaCitas;  
    
    //Getter y Setter

    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public EliminarCita() {
        initComponents();
    }
    
    public void mostrarCita(){
        int f = 0;
        listaCitas = obj.getListaCitas();
        if(!listaCitas.isEmpty()){
            DefaultTableModel modelo = (DefaultTableModel)tablaCitaTbl.getModel();
            
            //Definiendo filas y columnas en el modelo
            
            modelo.setColumnCount(6);
            modelo.setRowCount(10);
            
            //Llenando los datos a la tabla
            
            for(Cita c:listaCitas){
               tablaCitaTbl.setValueAt(f+1, f, 0);
               tablaCitaTbl.setValueAt(c.getPaciente().getNombreCompleto(), f, 1);
               tablaCitaTbl.setValueAt(c.getMedico().getNombreCompleto(), f, 2);
               tablaCitaTbl.setValueAt(c.getMedico().getEspecialidad(), f, 3);
               tablaCitaTbl.setValueAt(c.getFecha(), f, 4);
               tablaCitaTbl.setValueAt(c.getHora(), f, 5);
               f++;
            }
            
        }else{
            msjLbl.setText("NO SE TIENEN CITAS REGISTRADAS");
            msjLbl.setForeground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarBtn = new javax.swing.JButton();
        cedulaTxt = new javax.swing.JTextField();
        cancelarBtn = new javax.swing.JButton();
        msjLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitaTbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel7.setText("CEDULA:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("ELIMINAR CITA");

        eliminarBtn.setText("ELIMINAR");
        eliminarBtn.addActionListener(this::eliminarBtnActionPerformed);

        cedulaTxt.addActionListener(this::cedulaTxtActionPerformed);

        cancelarBtn.setText("CANCELAR");
        cancelarBtn.addActionListener(this::cancelarBtnActionPerformed);

        msjLbl.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setText("FECHA:");

        fechaTxt.addActionListener(this::fechaTxtActionPerformed);

        tablaCitaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nª", "PACIENTE", "MEDICO", "ESPECIALIDAD", "FECHA", "HORA"
            }
        ));
        tablaCitaTbl.setShowGrid(false);
        jScrollPane2.setViewportView(tablaCitaTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn)
                    .addComponent(cancelarBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed

        if (cedulaTxt.getText().isEmpty() && fechaTxt.getText().isEmpty()){
            msjLbl.setText("ERROR: DEBE LLENAR TODOS LOS CAMPOS");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "LLENE TODOS LOS DATOS PARA CONTINUAR", "¡CAMPOS VACIOS!", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Realizando la busqueda de album musical

        String cedula = cedulaTxt.getText();
        String fecha = fechaTxt.getText();

        //Llamando al metodo de busqueda

        Cita citaEncontrada = obj.buscarCitaEspecifica(cedula, fecha);

        if (citaEncontrada != null) {
            String nombrePac = citaEncontrada.getPaciente().getNombreCompleto();
            String fechaPac = citaEncontrada.getFecha();
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,"¿DESEA CONTINUAR CON LA ELIMINACION DE LA CITA DE: " + nombrePac + " EN FECHA " + fechaPac + "?","CONFIRMAR ELIMINACION",javax.swing.JOptionPane.YES_NO_OPTION,javax.swing.JOptionPane.QUESTION_MESSAGE);
            if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                obj.eliminarCita(cedula, fecha);
                msjLbl.setText("CITA ELIMINADA CON EXITO");
                msjLbl.setForeground(Color.GREEN);
            } else {
                msjLbl.setText("ELIMINACION CANCELADA");
                msjLbl.setForeground(Color.ORANGE);
            }
        } else {
            msjLbl.setText("ERROR: LA CEDULA Y/O LA FECHA NO ESTAN REGISTRADA");
            msjLbl.setForeground(Color.RED);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed

        msjLbl.setText("");
        cedulaTxt.setText("");
        fechaTxt.setText("");
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void fechaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JTextField fechaTxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JTable tablaCitaTbl;
    // End of variables declaration//GEN-END:variables
}
