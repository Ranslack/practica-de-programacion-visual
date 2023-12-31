/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafico1;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yaser
 */
public class Formulario2 extends javax.swing.JFrame {

    /**
     * Creates new form Formulario2
     */
    public Formulario2() {
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

        LnlNombre = new javax.swing.JLabel();
        LblApelllido = new javax.swing.JLabel();
        LblFecha_de_nacimiento = new javax.swing.JLabel();
        LblAlias = new javax.swing.JLabel();
        TxtNombre = new java.awt.TextField();
        TxtApellidopaterno = new java.awt.TextField();
        txtApellidoMaterno = new java.awt.TextField();
        cbdia = new javax.swing.JComboBox<>();
        cbmes = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        Lblalias2 = new javax.swing.JLabel();
        BtnGuardar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtnArchivo = new javax.swing.JMenu();
        BtnAbrir = new javax.swing.JMenuItem();
        BtnNuevo = new javax.swing.JMenuItem();
        BtnGuardar = new javax.swing.JMenuItem();
        BtnSalir = new javax.swing.JMenuItem();
        BtnEdicion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario 2");
        setBounds(new java.awt.Rectangle(0, 0, 600, 600));
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LnlNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LnlNombre.setText("Nombre : ");
        LnlNombre.setMaximumSize(new java.awt.Dimension(150, 17));
        LnlNombre.setMinimumSize(new java.awt.Dimension(150, 17));
        LnlNombre.setPreferredSize(new java.awt.Dimension(150, 17));
        getContentPane().add(LnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));

        LblApelllido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LblApelllido.setText("Apellidos :");
        LblApelllido.setMaximumSize(new java.awt.Dimension(150, 16));
        LblApelllido.setMinimumSize(new java.awt.Dimension(150, 16));
        getContentPane().add(LblApelllido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 16));

        LblFecha_de_nacimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LblFecha_de_nacimiento.setText("Fecha de nacimiento :");
        LblFecha_de_nacimiento.setMaximumSize(new java.awt.Dimension(150, 16));
        LblFecha_de_nacimiento.setMinimumSize(new java.awt.Dimension(150, 16));
        getContentPane().add(LblFecha_de_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 16));

        LblAlias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LblAlias.setText("Alias :");
        LblAlias.setMaximumSize(new java.awt.Dimension(150, 17));
        LblAlias.setMinimumSize(new java.awt.Dimension(150, 17));
        getContentPane().add(LblAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 20));

        TxtNombre.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TxtNombre.setMaximumSize(new java.awt.Dimension(150, 32767));
        TxtNombre.setMinimumSize(new java.awt.Dimension(150, 20));
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 150, 21));

        TxtApellidopaterno.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TxtApellidopaterno.setMaximumSize(new java.awt.Dimension(150, 32767));
        TxtApellidopaterno.setMinimumSize(new java.awt.Dimension(150, 20));
        TxtApellidopaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidopaternoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtApellidopaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 150, 21));

        txtApellidoMaterno.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtApellidoMaterno.setMaximumSize(new java.awt.Dimension(150, 32767));
        txtApellidoMaterno.setMinimumSize(new java.awt.Dimension(150, 20));
        txtApellidoMaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoMaternoFocusLost(evt);
            }
        });
        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 150, 21));

        cbdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cbdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        cbmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "sepiembre", "octubre", "noviembre", "diciembre" }));
        getContentPane().add(cbmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", " " }));
        getContentPane().add(cbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        Lblalias2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Lblalias2.setText("                                    ...");
        Lblalias2.setMaximumSize(new java.awt.Dimension(200, 200));
        Lblalias2.setMinimumSize(new java.awt.Dimension(200, 200));
        getContentPane().add(Lblalias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 270, 50));

        BtnGuardar1.setText("Guardar");
        BtnGuardar1.setToolTipText("Guardar");
        BtnGuardar1.setMaximumSize(new java.awt.Dimension(150, 22));
        BtnGuardar1.setMinimumSize(new java.awt.Dimension(150, 22));
        BtnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel1.setText("Paterno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 60, -1));

        jLabel2.setText("Materno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 90, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        BtnArchivo.setText("Archivo");

        BtnAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });
        BtnArchivo.add(BtnAbrir);

        BtnNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        BtnArchivo.add(BtnNuevo);

        BtnGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BtnGuardar.setText("Guarda");
        BtnArchivo.add(BtnGuardar);

        BtnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        BtnArchivo.add(BtnSalir);

        jMenuBar1.add(BtnArchivo);

        BtnEdicion.setText("Edicion");
        BtnEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEdicionActionPerformed(evt);
            }
        });
        jMenuBar1.add(BtnEdicion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        int exit=1;
        exit= JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quiere salir?", "Cerrar ventana", WIDTH);
        if(exit==0){
        System.exit(0);
        }
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEdicionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, 
                "\n Progrmacion IV (visual) \n UNEDL \n Yaser Josafat Tabares Delgadillo.",
                "Acerca de",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnEdicionActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void BtnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardar1ActionPerformed
        // TODO add your handling code here:
        //aqui guardamos las variables de los nombres, apellidos, tanto materno como paterno
       String nombre, apellidoP, apellidoM;
       nombre=TxtNombre.getText();
       apellidoP=TxtApellidopaterno.getText();
       apellidoM=txtApellidoMaterno.getText();
       //aqui guardamos los combobox para los dias, meses y años
       byte dia=(byte)cbdia.getSelectedIndex();
       byte mes=(byte)cbmes.getSelectedIndex();
       String año=(String)cbYear.getSelectedItem();
       dia+=1;
       mes+=1;
       TxtNombre.setText(null);
       TxtApellidopaterno.setText(null);
       txtApellidoMaterno.setText(null);
        System.out.println("nombre: "+nombre+" | Apellido Paterno: "+ apellidoP+" | Apellido Materno: "+apellidoM+" | Fecha de nacimiento: "+dia+"/"+mes+"/"+año+".");
        String ruta = "C:\\Users\\yaser\\OneDrive\\Documentos";
        File nuevoArch = new File(ruta, "Agregados_programacion_visual.txt");
        
        try{
            if(!nuevoArch.exists()){
                nuevoArch.createNewFile();
            }
            java.io.FileWriter fw = new java.io.FileWriter(nuevoArch.getAbsoluteFile(),true); 
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("nombre: "+nombre+" | Apellido Paterno: "+ apellidoP+" | Apellido Materno: "+apellidoM+" | Fecha de nacimiento: "+dia+"/"+mes+"/"+año+".");
            bw.newLine();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_BtnGuardar1ActionPerformed

    private void TxtApellidopaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidopaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidopaternoActionPerformed

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void txtApellidoMaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoMaternoFocusLost
        // TODO add your handling code here:
        String Alias="";
        Alias=TxtNombre.getText().charAt(0)+TxtApellidopaterno.getText()+"."+txtApellidoMaterno.getText();
        Lblalias2.setText(Alias);
    }//GEN-LAST:event_txtApellidoMaternoFocusLost

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
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnAbrir;
    private javax.swing.JMenu BtnArchivo;
    private javax.swing.JMenu BtnEdicion;
    private javax.swing.JMenuItem BtnGuardar;
    private javax.swing.JButton BtnGuardar1;
    private javax.swing.JMenuItem BtnNuevo;
    private javax.swing.JMenuItem BtnSalir;
    private javax.swing.JLabel LblAlias;
    private javax.swing.JLabel LblApelllido;
    private javax.swing.JLabel LblFecha_de_nacimiento;
    private javax.swing.JLabel Lblalias2;
    private javax.swing.JLabel LnlNombre;
    private java.awt.TextField TxtApellidopaterno;
    private java.awt.TextField TxtNombre;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JComboBox<String> cbdia;
    private javax.swing.JComboBox<String> cbmes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private java.awt.TextField txtApellidoMaterno;
    // End of variables declaration//GEN-END:variables
}

