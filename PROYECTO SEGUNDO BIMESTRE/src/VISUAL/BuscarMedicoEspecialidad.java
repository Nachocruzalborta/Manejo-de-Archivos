package VISUAL;

import CONSOLA.Medico;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarMedicoEspecialidad extends javax.swing.JInternalFrame {

    OperacionesSeguroVisual obj;

    //Getter and Setter
    
    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public BuscarMedicoEspecialidad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        especialidadTxt = new javax.swing.JTextField();
        msjLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicoEspecialidadTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("ESPECIALIDAD MEDICA:");

        buscarBtn.setText("BUSCAR");
        buscarBtn.addActionListener(this::buscarBtnActionPerformed);

        especialidadTxt.addActionListener(this::especialidadTxtActionPerformed);

        medicoEspecialidadTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº", "NOMBRE", "CEDULA", "EDAD"
            }
        ));
        jScrollPane1.setViewportView(medicoEspecialidadTbl);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("BUSCAR MEDICOS POR ESPECIALIDAD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especialidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarBtn)
                    .addComponent(especialidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        if (especialidadTxt.getText().isEmpty()){
            msjLbl.setText("ERROR: DEBE LLENAR EL CAMPO 'ESPECIALIDAD'");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "LLENE TODOS LOS DATOS PARA REGISTRAR", "¡CAMPOS VACIOS!", javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        //Obteniendo el artista para realizar la busqueda

        List<Medico> listaMedicos = new ArrayList<>();
        String especialidad;
        especialidad = especialidadTxt.getText();

        //Llamando al metodo de busqueda

        listaMedicos = obj.buscarMedicoEspecialidad(especialidad);

        if (listaMedicos != null) {
            if (listaMedicos.size() > 0) {
                DefaultTableModel modelo = (DefaultTableModel) medicoEspecialidadTbl.getModel();
                modelo.setColumnCount(4);
                modelo.setRowCount(10);
                int f = 0;
                for (Medico m : listaMedicos) {
                    medicoEspecialidadTbl.setValueAt(f + 1, f, 0);
                    medicoEspecialidadTbl.setValueAt(m.getNombreCompleto(), f, 1);
                    medicoEspecialidadTbl.setValueAt(m.getNumeroCedula(), f, 2);
                    medicoEspecialidadTbl.setValueAt(m.getEdad(), f, 3);
                    f++;
                }
            } else {
                msjLbl.setText("NO SE ENCUENTRA REGISTRADA LA ESPECIALIDAD: " + especialidad);
                msjLbl.setForeground(Color.blue);
            }
        } else {
            msjLbl.setText("NO SE TIENEN PACIENTES REGISTRADOS");
            msjLbl.setForeground(Color.red);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void especialidadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField especialidadTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicoEspecialidadTbl;
    private javax.swing.JLabel msjLbl;
    // End of variables declaration//GEN-END:variables
}
