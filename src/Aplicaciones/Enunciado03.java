/*
 * Caso desarrollado 3: Aplicacion para calcular el sueldo.
 * utilizando clases y objetos.
 *  versión 1.0
 */
package Aplicaciones;
/**
 *
 * @author ARCE ARAUCO María de los Angeles
 * @author FERNANDEZ RONDINEL Noemi Edith
 * @author HURTADO RIVERA Nicole Liz
 */
import java.awt.Color;
import javax.swing.JOptionPane;


public class Enunciado03 extends javax.swing.JFrame {

    /**
     * nombramos a la clase para crear al objeto y llamar a la clase.
     */
    SueldoJeans persona1 = new SueldoJeans();
    
    public Enunciado03() {
        initComponents();
        formulario();
    }
   /**
     * Método formulario
     */
     private void formulario(){
        this.setTitle("JEANS AZULES");
        this.getContentPane().setBackground(new Color(255,255,255));
        
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        PanelDatos.setOpaque(false);
        this.txtHoras.requestFocus();
        this.txtHijos.requestFocus();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtHijos = new javax.swing.JTextField();
        PanelOperaciones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PanelResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(145, 206, 226));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Jeans Azules");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Ingrese Horas Trabajadas:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Selecciones Categoria:");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "A", "B" }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Ingrese cantidad de Hijos:");

        btnCalcular.setBackground(new java.awt.Color(176, 199, 240));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(176, 199, 240));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(176, 199, 240));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        txtResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "                                      Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11))); // NOI18N
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelOperacionesLayout = new javax.swing.GroupLayout(PanelOperaciones);
        PanelOperaciones.setLayout(PanelOperacionesLayout);
        PanelOperacionesLayout.setHorizontalGroup(
            PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelOperacionesLayout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOperacionesLayout.setVerticalGroup(
            PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnCalcular)
                    .addComponent(btnSalir))
                .addGap(32, 32, 32)
                .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboCategoria, 0, 105, Short.MAX_VALUE)
                    .addComponent(txtHoras)
                    .addComponent(txtHijos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addComponent(PanelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       // declaramos una variable para llamar a un método.
        double sueldos;
        //nombramos al objeto para llamar a los atributos
        persona1.setHorasTrabajadas(Integer.parseInt(txtHoras.getText()));
        persona1.setCategoria(cboCategoria.getSelectedIndex());
        persona1.setNumeroHijos(Integer.parseInt(txtHijos.getText()));
        sueldos=persona1.SueldoBasico();
        sueldos=persona1.SueldoBruto();
        sueldos=persona1.sueldoNeto();
        sueldos=persona1.descuentoCategoria();
        /**
         * Código para mostrar el resultado
         */
        txtResultado.setText("\t Resultado\n");
        txtResultado.append("\t -----------\n");
        txtResultado.append("Horas Trabajadas :");
        txtResultado.append(persona1.getHorasTrabajadas()+"\n");
        txtResultado.append("Sueldo Basico");
        txtResultado.append("\t"+persona1.SueldoBasico()+"\n");
        txtResultado.append("Sueldo Bruto");
        txtResultado.append("\t"+persona1.SueldoBruto()+"\n");
        txtResultado.append("Descuento");
        txtResultado.append("\t"+persona1.descuentoCategoria()+"\n");
        txtResultado.append("Sueldo Neto");
        txtResultado.append("\t"+persona1.sueldoNeto()+"\n");
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * Método nuevo Limpiar el txtrepote utiliza un settext("")para limpiar el
     * contenido
     *
     * @param  norecibe parametro alguno
     * @return no tiene retorno
     */
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtHoras.setText("");
        txtHijos.setText("");
        txtResultado.setText("");
        btnNuevo.setEnabled(true);
        btnCalcular.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    /**
     * Método Salir() para poder realizar otra operaciòn y/o salir completamente
     * el programa utilizamos un JOptionPane para que salga un mensaje de salir
     *
     * @param No recibe parametro alguno
     * @return no tiene retorno
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showOptionDialog(this,
                            "¿Estas seguro que deseas salir?",
                            "empresa", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, null, null);
                           if (r == 0) {
                               System.exit(0);}
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enunciado03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelOperaciones;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtHijos;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
