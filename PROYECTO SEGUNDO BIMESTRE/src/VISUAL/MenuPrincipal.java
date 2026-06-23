package VISUAL;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    ////Definicion del objeto
    
    OperacionesSeguroVisual operacion;
    
    public MenuPrincipal() {
        initComponents();
        operacion = new OperacionesSeguroVisual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        medicoMenu = new javax.swing.JMenu();
        registrarMedicoMenuItem = new javax.swing.JMenuItem();
        mostrarMedicoMenuItem = new javax.swing.JMenuItem();
        buscarMedicoMenu = new javax.swing.JMenu();
        buscarMedicoCedulaMenuItem = new javax.swing.JMenuItem();
        buscarMedicoEspecialidadMenuItem = new javax.swing.JMenuItem();
        eliminarMedicoMenuItem = new javax.swing.JMenuItem();
        pacienteMenu = new javax.swing.JMenu();
        registrarPacienteMenuItem = new javax.swing.JMenuItem();
        mostrarPacienteMenuItem = new javax.swing.JMenuItem();
        buscarPacienteMenu = new javax.swing.JMenu();
        buscarPacienteCedulaMenuItem = new javax.swing.JMenuItem();
        buscarPacienteEmpresaMenuItem = new javax.swing.JMenuItem();
        eliminarPacienteMenuItem = new javax.swing.JMenuItem();
        citaMenu = new javax.swing.JMenu();
        registrarCitaMenuItem = new javax.swing.JMenuItem();
        mostrarCitaMenuItem = new javax.swing.JMenuItem();
        buscarCitaMenu = new javax.swing.JMenu();
        buscarCitaMedicoMenuItem = new javax.swing.JMenuItem();
        buscarCitaPacienteMenuItem = new javax.swing.JMenuItem();
        eliminarCitaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        medicoMenu.setText("MEDICO");

        registrarMedicoMenuItem.setText("REGISTRAR NUEVO MEDICO");
        registrarMedicoMenuItem.addActionListener(this::registrarMedicoMenuItemActionPerformed);
        medicoMenu.add(registrarMedicoMenuItem);

        mostrarMedicoMenuItem.setText("MOSTRAR MEDICOS");
        mostrarMedicoMenuItem.addActionListener(this::mostrarMedicoMenuItemActionPerformed);
        medicoMenu.add(mostrarMedicoMenuItem);

        buscarMedicoMenu.setText("BUSCAR MEDICOS");

        buscarMedicoCedulaMenuItem.setText("POR CEDULA");
        buscarMedicoCedulaMenuItem.addActionListener(this::buscarMedicoCedulaMenuItemActionPerformed);
        buscarMedicoMenu.add(buscarMedicoCedulaMenuItem);

        buscarMedicoEspecialidadMenuItem.setText("POR ESPECIALIDAD");
        buscarMedicoEspecialidadMenuItem.addActionListener(this::buscarMedicoEspecialidadMenuItemActionPerformed);
        buscarMedicoMenu.add(buscarMedicoEspecialidadMenuItem);

        medicoMenu.add(buscarMedicoMenu);

        eliminarMedicoMenuItem.setText("ELIMINAR MEDICO");
        eliminarMedicoMenuItem.addActionListener(this::eliminarMedicoMenuItemActionPerformed);
        medicoMenu.add(eliminarMedicoMenuItem);

        jMenuBar1.add(medicoMenu);

        pacienteMenu.setText("PACIENTE");

        registrarPacienteMenuItem.setText("REGISTRAR NUEVO PACIENTE");
        registrarPacienteMenuItem.addActionListener(this::registrarPacienteMenuItemActionPerformed);
        pacienteMenu.add(registrarPacienteMenuItem);

        mostrarPacienteMenuItem.setText("MOSTRAR PACIENTES");
        mostrarPacienteMenuItem.addActionListener(this::mostrarPacienteMenuItemActionPerformed);
        pacienteMenu.add(mostrarPacienteMenuItem);

        buscarPacienteMenu.setText("BUSCAR PACIENTES");

        buscarPacienteCedulaMenuItem.setText("POR CEDULA");
        buscarPacienteCedulaMenuItem.addActionListener(this::buscarPacienteCedulaMenuItemActionPerformed);
        buscarPacienteMenu.add(buscarPacienteCedulaMenuItem);

        buscarPacienteEmpresaMenuItem.setText("POR EMPRESA");
        buscarPacienteEmpresaMenuItem.addActionListener(this::buscarPacienteEmpresaMenuItemActionPerformed);
        buscarPacienteMenu.add(buscarPacienteEmpresaMenuItem);

        pacienteMenu.add(buscarPacienteMenu);

        eliminarPacienteMenuItem.setText("ELIMINAR PACIENTE");
        eliminarPacienteMenuItem.addActionListener(this::eliminarPacienteMenuItemActionPerformed);
        pacienteMenu.add(eliminarPacienteMenuItem);

        jMenuBar1.add(pacienteMenu);

        citaMenu.setText("CITA");

        registrarCitaMenuItem.setText("REGISTRAR NUEVA CITA");
        registrarCitaMenuItem.addActionListener(this::registrarCitaMenuItemActionPerformed);
        citaMenu.add(registrarCitaMenuItem);

        mostrarCitaMenuItem.setText("MOSTRAR CITAS");
        mostrarCitaMenuItem.addActionListener(this::mostrarCitaMenuItemActionPerformed);
        citaMenu.add(mostrarCitaMenuItem);

        buscarCitaMenu.setText("BUSCAR CITAS");

        buscarCitaMedicoMenuItem.setText("POR MEDICO");
        buscarCitaMedicoMenuItem.addActionListener(this::buscarCitaMedicoMenuItemActionPerformed);
        buscarCitaMenu.add(buscarCitaMedicoMenuItem);

        buscarCitaPacienteMenuItem.setText("POR PACIENTE");
        buscarCitaPacienteMenuItem.addActionListener(this::buscarCitaPacienteMenuItemActionPerformed);
        buscarCitaMenu.add(buscarCitaPacienteMenuItem);

        citaMenu.add(buscarCitaMenu);

        eliminarCitaMenuItem.setText("ELIMINAR CITA");
        eliminarCitaMenuItem.addActionListener(this::eliminarCitaMenuItemActionPerformed);
        citaMenu.add(eliminarCitaMenuItem);

        jMenuBar1.add(citaMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarMedicoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMedicoMenuItemActionPerformed
        
        // Aperturar la ventana de registrarMedico

        RegistrarMedico registrar = new RegistrarMedico();

        // Traspasando el Objeto a la nueva clase
        
        registrar.setObj(operacion);

        // Adicionando el componente al escritorio
        
        escritorio.add(registrar);

        // Visualizando
        
        registrar.show();
    }//GEN-LAST:event_registrarMedicoMenuItemActionPerformed

    private void eliminarMedicoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMedicoMenuItemActionPerformed
        
        //Aperturar la ventana de mostrarPaciente
    
        EliminarMedico eliminar = new EliminarMedico();

        //Traspasando el Objeto a la nueva clase

        eliminar.setObj(operacion);

        //Llamando al metodo

        eliminar.mostrarMedico();

        //Adicionando el componente al escritorio

        escritorio.add(eliminar);

        //Visualizando

        eliminar.show();
        
    }//GEN-LAST:event_eliminarMedicoMenuItemActionPerformed

    private void registrarPacienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPacienteMenuItemActionPerformed
        
        // Aperturar la ventana de registrarPaciente

        RegistrarPaciente registrar = new RegistrarPaciente();

        // Traspasando el Objeto a la nueva clase
        
        registrar.setObj(operacion);

        // Adicionando el componente al escritorio
        
        escritorio.add(registrar);

        // Visualizando
        
        registrar.show();
        
    }//GEN-LAST:event_registrarPacienteMenuItemActionPerformed

    private void registrarCitaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCitaMenuItemActionPerformed
        
        // Aperturar la ventana de registrarCita

        RegistrarCita registrar = new RegistrarCita();

        // Traspasando el Objeto a la nueva clase
        
        registrar.setObj(operacion);

        // Adicionando el componente al escritorio
        
        escritorio.add(registrar);

        // Visualizando
        
        registrar.show();
        
    }//GEN-LAST:event_registrarCitaMenuItemActionPerformed

    private void eliminarCitaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCitaMenuItemActionPerformed
        
        //Aperturar la ventana de mostrarPaciente
    
        EliminarCita eliminar = new EliminarCita();

        //Traspasando el Objeto a la nueva clase

        eliminar.setObj(operacion);

        //Llamando al metodo

        eliminar.mostrarCita();

        //Adicionando el componente al escritorio

        escritorio.add(eliminar);

        //Visualizando

        eliminar.show();
        
    }//GEN-LAST:event_eliminarCitaMenuItemActionPerformed

    private void mostrarCitaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCitaMenuItemActionPerformed
        
        //Aperturar la ventana de mostrarCita
    
        MostrarCita mostrar = new MostrarCita();

        //Traspasando el Objeto a la nueva clase

        mostrar.setObj(operacion);

        //Llamando al metodo

        mostrar.mostrarCita();

        //Adicionando el componente al escritorio

        escritorio.add(mostrar);

        //Visualizando

        mostrar.show();
        
    }//GEN-LAST:event_mostrarCitaMenuItemActionPerformed

    private void mostrarMedicoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMedicoMenuItemActionPerformed
        
        //Aperturar la ventana de mostrarMedico
    
        MostrarMedico mostrar = new MostrarMedico();

        //Traspasando el Objeto a la nueva clase

        mostrar.setObj(operacion);

        //Llamando al metodo

        mostrar.mostrarMedico();

        //Adicionando el componente al escritorio

        escritorio.add(mostrar);

        //Visualizando

        mostrar.show();
        
    }//GEN-LAST:event_mostrarMedicoMenuItemActionPerformed

    private void mostrarPacienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPacienteMenuItemActionPerformed
        
        //Aperturar la ventana de mostrarPaciente
    
        MostrarPaciente mostrar = new MostrarPaciente();

        //Traspasando el Objeto a la nueva clase

        mostrar.setObj(operacion);

        //Llamando al metodo

        mostrar.mostrarPaciente();

        //Adicionando el componente al escritorio

        escritorio.add(mostrar);

        //Visualizando

        mostrar.show();
        
    }//GEN-LAST:event_mostrarPacienteMenuItemActionPerformed

    private void buscarPacienteCedulaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPacienteCedulaMenuItemActionPerformed
        
        // Realiza la busqueda por Nombre de Paciente
    
        BuscarPaciente  buscar = new BuscarPaciente();

        // Traspasando el Objeto a la nueva clase

        buscar.setObj(operacion);

        // Adicionando el componente al escritorio

        escritorio.add(buscar);

        // Visualizando

        buscar.show();
        
    }//GEN-LAST:event_buscarPacienteCedulaMenuItemActionPerformed

    private void buscarMedicoCedulaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMedicoCedulaMenuItemActionPerformed
        
        // Realiza la busqueda por Nombre de Paciente
    
        BuscarMedico  buscar = new BuscarMedico();

        // Traspasando el Objeto a la nueva clase

        buscar.setObj(operacion);

        // Adicionando el componente al escritorio

        escritorio.add(buscar);

        // Visualizando

        buscar.show();
        
    }//GEN-LAST:event_buscarMedicoCedulaMenuItemActionPerformed

    private void buscarMedicoEspecialidadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMedicoEspecialidadMenuItemActionPerformed
        
        // Realiza la busqueda de Medico por Especialidad
    
        BuscarMedicoEspecialidad buscar = new BuscarMedicoEspecialidad();

        // Traspasando el Objeto a la nueva clase

        buscar.setObj(operacion);

        // Adicionando el componente al escritorio

        escritorio.add(buscar);

        // Visualizando

        buscar.show();
        
    }//GEN-LAST:event_buscarMedicoEspecialidadMenuItemActionPerformed

    private void buscarPacienteEmpresaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPacienteEmpresaMenuItemActionPerformed
        
        // Realiza la busqueda de Paciente por Empresa
    
        BuscarPacienteEmpresa buscar = new BuscarPacienteEmpresa();

        // Traspasando el Objeto a la nueva clase

        buscar.setObj(operacion);

        // Adicionando el componente al escritorio

        escritorio.add(buscar);

        // Visualizando

        buscar.show();
        
    }//GEN-LAST:event_buscarPacienteEmpresaMenuItemActionPerformed

    private void buscarCitaMedicoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCitaMedicoMenuItemActionPerformed
        
        // Realiza la busqueda de Paciente por Empresa
    
        BuscarCitaMedico buscar = new BuscarCitaMedico();

        // Traspasando el Objeto a la nueva clase

        buscar.setObj(operacion);

        // Adicionando el componente al escritorio

        escritorio.add(buscar);

        // Visualizando

        buscar.show();
        
    }//GEN-LAST:event_buscarCitaMedicoMenuItemActionPerformed

    private void buscarCitaPacienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCitaPacienteMenuItemActionPerformed
        
        // Realiza la busqueda de Paciente por Empresa
    
        BuscarCitaPaciente buscar = new BuscarCitaPaciente();

        // Traspasando el Objeto a la nueva clase

        buscar.setObj(operacion);

        // Adicionando el componente al escritorio

        escritorio.add(buscar);

        // Visualizando

        buscar.show();
        
    }//GEN-LAST:event_buscarCitaPacienteMenuItemActionPerformed

    private void eliminarPacienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPacienteMenuItemActionPerformed
        
        //Aperturar la ventana de mostrarPaciente
    
        EliminarPaciente eliminar = new EliminarPaciente();

        //Traspasando el Objeto a la nueva clase

        eliminar.setObj(operacion);

        //Llamando al metodo

        eliminar.mostrarPaciente();

        //Adicionando el componente al escritorio

        escritorio.add(eliminar);

        //Visualizando

        eliminar.show();
        
    }//GEN-LAST:event_eliminarPacienteMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buscarCitaMedicoMenuItem;
    private javax.swing.JMenu buscarCitaMenu;
    private javax.swing.JMenuItem buscarCitaPacienteMenuItem;
    private javax.swing.JMenuItem buscarMedicoCedulaMenuItem;
    private javax.swing.JMenuItem buscarMedicoEspecialidadMenuItem;
    private javax.swing.JMenu buscarMedicoMenu;
    private javax.swing.JMenuItem buscarPacienteCedulaMenuItem;
    private javax.swing.JMenuItem buscarPacienteEmpresaMenuItem;
    private javax.swing.JMenu buscarPacienteMenu;
    private javax.swing.JMenu citaMenu;
    private javax.swing.JMenuItem eliminarCitaMenuItem;
    private javax.swing.JMenuItem eliminarMedicoMenuItem;
    private javax.swing.JMenuItem eliminarPacienteMenuItem;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu medicoMenu;
    private javax.swing.JMenuItem mostrarCitaMenuItem;
    private javax.swing.JMenuItem mostrarMedicoMenuItem;
    private javax.swing.JMenuItem mostrarPacienteMenuItem;
    private javax.swing.JMenu pacienteMenu;
    private javax.swing.JMenuItem registrarCitaMenuItem;
    private javax.swing.JMenuItem registrarMedicoMenuItem;
    private javax.swing.JMenuItem registrarPacienteMenuItem;
    // End of variables declaration//GEN-END:variables
}
