package VISUAL;

import CONSOLA.Cita;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MostrarCita extends javax.swing.JInternalFrame {

    OperacionesSeguroVisual obj = new OperacionesSeguroVisual();
    List<Cita> listaCitas;  
    
    //Getter y Setter

    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public MostrarCita() {
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

        msjLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitaTbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        msjLbl.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("MOSTRAR TODAS LAS CITAS REGISTRADAS");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel3)
                .addContainerGap(250, Short.MAX_VALUE))
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
    private javax.swing.JTable tablaCitaTbl;
    // End of variables declaration//GEN-END:variables
}
