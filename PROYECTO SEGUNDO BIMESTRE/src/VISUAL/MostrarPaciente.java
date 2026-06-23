package VISUAL;

import CONSOLA.Paciente;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MostrarPaciente extends javax.swing.JInternalFrame {

    OperacionesSeguroVisual obj = new OperacionesSeguroVisual();
    List<Paciente> listaPacientes;  
    
    //Getter y Setter

    public OperacionesSeguroVisual getObj() {
        return obj;
    }

    public void setObj(OperacionesSeguroVisual obj) {
        this.obj = obj;
    }
    
    public MostrarPaciente() {
        initComponents(); 
    }
    
    public void mostrarPaciente(){
        int f = 0;
        listaPacientes = obj.getListaPacientes();
        if(!listaPacientes.isEmpty()){
            DefaultTableModel modelo = (DefaultTableModel)tablaPacienteTbl.getModel();
            
            //Definiendo filas y columnas en el modelo
            
            modelo.setColumnCount(5);
            modelo.setRowCount(10);
            
            //Llenando los datos a la tabla
            
            for(Paciente p:listaPacientes){
               tablaPacienteTbl.setValueAt(f+1, f, 0);
               tablaPacienteTbl.setValueAt(p.getNombreCompleto(), f, 1);
               tablaPacienteTbl.setValueAt(p.getNumeroCedula(), f, 2);
               tablaPacienteTbl.setValueAt(p.getEdad(), f, 3);
               tablaPacienteTbl.setValueAt(p.getEmpresa(), f, 4);
               f++;
            }
            
        }else{
            msjLbl.setText("NO SE TIENEN PACIENTES REGISTRADOS");
            msjLbl.setForeground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msjLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacienteTbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        msjLbl.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("MOSTRAR TODOS LOS PACIENTES REGISTRADOS");

        tablaPacienteTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPacienteTbl.setShowGrid(false);
        jScrollPane2.setViewportView(tablaPacienteTbl);

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
                .addContainerGap(222, Short.MAX_VALUE)
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
    private javax.swing.JTable tablaPacienteTbl;
    // End of variables declaration//GEN-END:variables
}
