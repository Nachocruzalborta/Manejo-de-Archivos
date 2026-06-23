package VISUAL;

import CONSOLA.Paciente;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarPacienteEmpresa extends javax.swing.JInternalFrame {

    OperacionesSeguroVisual obj;

    //Getter and Setter
    
    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public BuscarPacienteEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        empresaTxt = new javax.swing.JTextField();
        msjLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pacienteEmpresaTbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("BUSCAR PACIENTES POR EMPRESA");

        jLabel1.setText("EMPRESA AFILIADA:");

        buscarBtn.setText("BUSCAR");
        buscarBtn.addActionListener(this::buscarBtnActionPerformed);

        empresaTxt.addActionListener(this::empresaTxtActionPerformed);

        pacienteEmpresaTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(pacienteEmpresaTbl);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empresaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBtn)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarBtn)
                    .addComponent(empresaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        if (empresaTxt.getText().isEmpty()){
            msjLbl.setText("ERROR: DEBE LLENAR EL CAMPO 'EMPRESA'");
            msjLbl.setForeground(Color.RED);
            javax.swing.JOptionPane.showMessageDialog(this, "LLENE TODOS LOS DATOS PARA REGISTRAR", "¡CAMPOS VACIOS!", javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        //Obteniendo el artista para realizar la busqueda
        
        List<Paciente> listaPacientes = new ArrayList<>();
        String empresa;
        empresa = empresaTxt.getText();

        //Llamando al metodo de busqueda
        
        listaPacientes = obj.buscarPacienteEmpresa(empresa);

        if (listaPacientes != null) {
            if (listaPacientes.size() > 0) {
                DefaultTableModel modelo = (DefaultTableModel) pacienteEmpresaTbl.getModel();
                modelo.setColumnCount(4);
                modelo.setRowCount(10);
                int f = 0;
                for (Paciente p : listaPacientes) {
                    pacienteEmpresaTbl.setValueAt(f + 1, f, 0);
                    pacienteEmpresaTbl.setValueAt(p.getNombreCompleto(), f, 1);
                    pacienteEmpresaTbl.setValueAt(p.getNumeroCedula(), f, 2);
                    pacienteEmpresaTbl.setValueAt(p.getEdad(), f, 3);
                    f++;
                }
            } else {
                msjLbl.setText("NO SE ENCUENTRA REGISTRADA LA EMPRESA: " + empresa);
                msjLbl.setForeground(Color.blue);
            }
        } else {
            msjLbl.setText("NO SE TIENEN PACIENTES REGISTRADOS");
            msjLbl.setForeground(Color.red);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void empresaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField empresaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JTable pacienteEmpresaTbl;
    // End of variables declaration//GEN-END:variables
}
