package VISUAL;

import CONSOLA.Medico;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MostrarMedico extends javax.swing.JInternalFrame {

    OperacionesSeguroVisual obj = new OperacionesSeguroVisual();
    List<Medico> listaMedicos;  
    
    //Getter y Setter

    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public MostrarMedico() {
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

        msjLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMedicoTbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        msjLbl.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("MOSTRAR TODOS LOS MEDICOS REGISTRADOS");

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
                "Nª", "NOMBRE", "CEDULA", "EDAD", "ESPECIALIDAD"
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JTable tablaMedicoTbl;
    // End of variables declaration//GEN-END:variables
}
