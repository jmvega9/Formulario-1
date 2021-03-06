/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import java.awt.BorderLayout ;
import javax.swing.JOptionPane;
import Negocio.Modelo.Agenda;
import Negocio.Control.Persona;

/**
 *
 * @author JESSICA MARIBEL VEGA MASAPANTA
 */
public class InterfazFormulario extends javax.swing.JFrame {

    javax.swing.ImageIcon icono= new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes/Aprobado.png"));
    /**
     * Creates new form InterfazFormulario
     */
    public InterfazFormulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLTitulo = new javax.swing.JLabel();
        JLNombres = new javax.swing.JLabel();
        JLApellidos = new javax.swing.JLabel();
        JLCedula = new javax.swing.JLabel();
        JLEmail = new javax.swing.JLabel();
        JLTelefono = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtValidador = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        JLImagenNombres = new javax.swing.JLabel();
        JLImagenApellidos = new javax.swing.JLabel();
        JLImagenCedula = new javax.swing.JLabel();
        JLImagenEmail = new javax.swing.JLabel();
        JLImagenTelefono = new javax.swing.JLabel();
        JLImagenValidador = new javax.swing.JLabel();
        BotonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMULARIO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLTitulo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 0, 0));
        JLTitulo.setText("Formulario de datos");

        JLNombres.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        JLNombres.setForeground(new java.awt.Color(255, 255, 255));
        JLNombres.setText("Nombres");

        JLApellidos.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        JLApellidos.setForeground(new java.awt.Color(255, 255, 255));
        JLApellidos.setText("Apellidos");

        JLCedula.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        JLCedula.setForeground(new java.awt.Color(255, 255, 255));
        JLCedula.setText("Cedula");

        JLEmail.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        JLEmail.setForeground(new java.awt.Color(255, 255, 255));
        JLEmail.setText("email");

        JLTelefono.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        JLTelefono.setForeground(new java.awt.Color(255, 255, 255));
        JLTelefono.setText("Telefono");

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtValidador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValidadorFocusLost(evt);
            }
        });
        txtValidador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValidadorKeyTyped(evt);
            }
        });

        BotonGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        JLImagenNombres.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenNombres.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenNombres.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenApellidos.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenApellidos.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenApellidos.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenCedula.setMaximumSize(new java.awt.Dimension(0, 0));
        JLImagenCedula.setMinimumSize(new java.awt.Dimension(0, 0));
        JLImagenCedula.setPreferredSize(new java.awt.Dimension(0, 0));

        JLImagenEmail.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenEmail.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenEmail.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenTelefono.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenTelefono.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenTelefono.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenValidador.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenValidador.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenValidador.setPreferredSize(new java.awt.Dimension(30, 30));

        BotonMostrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BotonMostrar.setText("Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(JLTitulo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(BotonGuardar)
                            .addGap(49, 49, 49)
                            .addComponent(BotonLimpiar)
                            .addGap(50, 50, 50)
                            .addComponent(BotonSalir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonMostrar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLNombres)
                                .addComponent(JLApellidos)
                                .addComponent(JLCedula)
                                .addComponent(JLEmail)
                                .addComponent(JLTelefono))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidos)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtValidador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEmail)
                                .addComponent(txtTelefono)
                                .addComponent(txtNombres))
                            .addGap(123, 123, 123)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JLImagenValidador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLImagenCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JLImagenNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLImagenApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLNombres)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JLImagenNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImagenApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLImagenValidador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLImagenCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLTelefono)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonSalir)
                    .addComponent(BotonMostrar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FondoFormulario AplicarFondo= new FondoFormulario();

        this.add( AplicarFondo , BorderLayout.SOUTH);
        AplicarFondo.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCedula.setText("");
        txtValidador.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed

        if(txtNombres.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor Ingrese el nombre");
            return;
        }
        if(txtApellidos.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor ingrese los apellidos");
            return;
        }
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor ingrese la cédula");
            return;
        }
        if(txtValidador.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor ingrese el código");
            return;
        }
        if(txtEmail.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor ingrese el email");
           return;
        }
        if(this.txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor ingrese el número de teléfono");
            return;
        }
        //Limpiamos un poco el código haciendo variables nuevas
        String Nombres,Apellidos,Cedula,Email,Telefono;
        //Los llenamos con las variables
        Nombres=txtNombres.getText();
        Apellidos=txtApellidos.getText();
        Cedula=txtCedula.getText()+"-"+txtValidador.getText();
        Email=txtEmail.getText();
        Telefono=txtTelefono.getText();

        //y aqui nuestra respuesta de los datos bien agregados
        JOptionPane.showMessageDialog(null,"Nombre: "+Nombres+" Apellido: "
                +Apellidos+" Cedula: "+Cedula+" Email: "+Email+" Teléfono: "+Telefono);

        //y aqui nuestra respuesta de los datos bien agregados
        //Persona persona=new Persona(Nombres,Apellidos,Cedula,Email,Telefono);
        //agenda.GuardarPersona(persona);
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped

        if(txtNombres.getText().length()>=30){
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if(Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped

        if(txtCedula.getText().length()>=12){
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        if(txtApellidos.getText().length()>=30){
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if(Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if(txtTelefono.getText().length()>=12){
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if(txtEmail.getText().length()>=30){
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if(Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtValidadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValidadorKeyTyped
        if(txtValidador.getText().length()>=12){
            evt.consume();
        }

        char TipoDeTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtValidadorKeyTyped

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        if(txtNombres.getText().length()>=2){
            JLImagenNombres.setIcon(icono);
        }else{
            JLImagenNombres.setIcon(null);
        }
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        if(txtApellidos.getText().length()>=2){
            JLImagenApellidos.setIcon(icono);
        }else{
            JLImagenApellidos.setIcon(null);
        }
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if(txtCedula.getText().length()>=2){
            JLImagenCedula.setIcon(icono);
        }else{
            JLImagenCedula.setIcon(null);
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(txtEmail.getText().length()>=2){
            JLImagenEmail.setIcon(icono);
        }else{
            JLImagenEmail.setIcon(null);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if(txtTelefono.getText().length()>=2){
        JLImagenTelefono.setIcon(icono);
        }else{
        JLImagenTelefono.setIcon(null);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtValidadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValidadorFocusLost
        if(txtValidador.getText().length()>=2){
            JLImagenValidador.setIcon(icono);
        }else{
            JLImagenValidador.setIcon(null);
        }
    }//GEN-LAST:event_txtValidadorFocusLost

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        JOptionPane.showMessageDialog(null,agenda.MostrarAgenda);
    }//GEN-LAST:event_BotonMostrarActionPerformed


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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel JLApellidos;
    private javax.swing.JLabel JLCedula;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLImagenApellidos;
    private javax.swing.JLabel JLImagenCedula;
    private javax.swing.JLabel JLImagenEmail;
    private javax.swing.JLabel JLImagenNombres;
    private javax.swing.JLabel JLImagenTelefono;
    private javax.swing.JLabel JLImagenValidador;
    private javax.swing.JLabel JLNombres;
    private javax.swing.JLabel JLTelefono;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValidador;
    // End of variables declaration//GEN-END:variables
}
