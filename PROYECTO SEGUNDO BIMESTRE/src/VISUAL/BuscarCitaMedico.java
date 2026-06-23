package VISUAL;

import CONSOLA.Cita;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarCitaMedico extends javax.swing.JInternalFrame {
    
    OperacionesSeguroVisual obj;

    //Getter and Setter
    
    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }

    public BuscarCitaMedico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        medicoTxt = new javax.swing.JTextField();
        msjLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        citaMedicoTbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("BUSCAR CITAS POR MEDICO");

        jLabel1.setText("MEDICO:");

        buscarBtn.setText("BUSCAR");
        buscarBtn.addActionListener(this::buscarBtnActionPerformed);

        medicoTxt.addActionListener(this::medicoTxtActionPerformed);

        citaMedicoTbl.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nº", "PACIENTE", "ESPECIALIDAD", "FECHA", "HORA"
            }
        ));
        jScrollPane1.setViewportView(citaMedicoTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBtn)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarBtn)
                    .addComponent(medicoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        if (medicoTxt.getText().isEmpty()){
            msjLbl.setText("ERROR: DEBE LLENAR EL CAMPO 'MEDICO'");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "LLENE TODOS LOS DATOS PARA REGISTRAR", "¡CAMPOS VACIOS!", javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        //Obteniendo el artista para realizar la busqueda

        List<Cita>listaCitas = new ArrayList<>();
        String nombre;
        nombre = medicoTxt.getText();

        //Llamando al metodo de busqueda

        listaCitas = obj.buscarCitaMedico(nombre);

        if (listaCitas != null) {
            if (listaCitas.size() > 0) {
                DefaultTableModel modelo = (DefaultTableModel) citaMedicoTbl.getModel();
                modelo.setColumnCount(5);
                modelo.setRowCount(10);
                int f = 0;
                for (Cita c : listaCitas) {
                    citaMedicoTbl.setValueAt(f + 1, f, 0);
                    citaMedicoTbl.setValueAt(c.getPaciente().getNombreCompleto(), f, 1);
                    citaMedicoTbl.setValueAt(c.getMedico().getEspecialidad(), f, 2);
                    citaMedicoTbl.setValueAt(c.getFecha(), f, 3);
                    citaMedicoTbl.setValueAt(c.getHora(), f, 4);
                    f++;
                }
            } else {
                msjLbl.setText("NO SE TIENEN CITAS A NOMBRE DEL MEDICO: " + nombre);
                msjLbl.setForeground(Color.blue);
            }
        } else {
            msjLbl.setText("NO SE TIENEN CITAS REGISTRADAS");
            msjLbl.setForeground(Color.red);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void medicoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicoTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTable citaMedicoTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicoTxt;
    private javax.swing.JLabel msjLbl;
    // End of variables declaration//GEN-END:variables
}
