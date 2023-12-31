/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafico1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author yaser
 */
public class PrimerParcial extends javax.swing.JFrame {
    String docfin="";
    String ct;

    /**
     * Creates new form PrimerParcial
     */
    public PrimerParcial() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        TxtArea_fuente = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        btnEdicion = new javax.swing.JMenu();
        btnCopiar = new javax.swing.JMenuItem();
        btnCortar = new javax.swing.JMenuItem();
        btnpegar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnacercade = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen parcial #1");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(540, 540, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));

        TxtArea_fuente.setEditable(false);
        TxtArea_fuente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtArea_fuente.setPreferredSize(new java.awt.Dimension(450, 350));

        btnArchivo.setText("Archivo");

        btnAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        btnArchivo.add(btnAbrir);

        btnGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnArchivo.add(btnGuardar);

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnArchivo.add(btnSalir);

        jMenuBar1.add(btnArchivo);

        btnEdicion.setText("Edicion");

        btnCopiar.setText("copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        btnEdicion.add(btnCopiar);

        btnCortar.setText("cortar");
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        btnEdicion.add(btnCortar);

        btnpegar.setText("pegar");
        btnpegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpegarActionPerformed(evt);
            }
        });
        btnEdicion.add(btnpegar);

        jMenuBar1.add(btnEdicion);

        jMenu1.setText("ayuda");

        btnacercade.setText("Informacion");
        btnacercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacercadeActionPerformed(evt);
            }
        });
        jMenu1.add(btnacercade);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtArea_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TxtArea_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
         //estoy creano mi vairable archivo de la clase jfilechooser, con el constructor vacio
        JFileChooser archivo = new JFileChooser();
        archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        //filtro para permitir que solo acepte los archivos txt
        FileNameExtensionFilter txtfile = new FileNameExtensionFilter("Archivos de Texto plano .txt", "txt");
       
        //asigne el filtro al selector de archivos
        archivo.setFileFilter(txtfile);
        
        //el this hace referencia a esta misma clase
        int resultado = archivo.showOpenDialog(this);
        
        //aqui hacemos la comparacion 
        if(resultado!=JFileChooser.CANCEL_OPTION){
            File file = archivo.getSelectedFile();
            
            if(file==null || (file.getName().equals(""))){
                JOptionPane.showMessageDialog(rootPane, "La carga del archivo fue cancelada", 
                                                    "uups! algo malio sal",
                                                    JOptionPane.ERROR_MESSAGE);
            }else{
                    TxtArea_fuente.setEditable(true);
                    TxtArea_fuente.setText("algun texto aqui: "+file.getAbsolutePath());
                try{
                    FileReader fr = new FileReader(file.getAbsolutePath());
                    BufferedReader bf = new BufferedReader(fr);
                    String linea = bf.readLine();
                    docfin="";
                    while(linea!=null){
                        
                        docfin+=linea;
                        docfin+="\n";
                        System.out.println(linea);
                        linea=bf.readLine();
                    }
                    
                    bf.close();
                    TxtArea_fuente.setText(docfin);
                    }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
        }else{
            
          JOptionPane.showMessageDialog(rootPane, "La carga del archivo fue cancelada", 
                                                    "uups! algo malio sal",
                                                    JOptionPane.ERROR_MESSAGE);
    
        }
        
        
    
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnacercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacercadeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, 
                "\n Yaser Josafat Tabares Delgadillo \n 21al7207488 \n Progrmacion III (visual).",
                "Acerca de",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnacercadeActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        // TODO add your handling code here:
        int exit=1;
        exit= JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quiere salir?", "Cerrar ventana", WIDTH);
        if(exit==0){
        System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        // TODO add your handling code here:
        docfin+=TxtArea_fuente.getText();
        ct=docfin;
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        // TODO add your handling code here:
        ct=TxtArea_fuente.getText();
        TxtArea_fuente.setText("");
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnpegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpegarActionPerformed
        // TODO add your handling code here:
        TxtArea_fuente.setText(ct);
    }//GEN-LAST:event_btnpegarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        docfin=TxtArea_fuente.getText();
        
        String ruta = "C:\\Users\\yaser\\OneDrive\\Documentos";
        File nuevoArch = new File(ruta, "Archivo guardado.txt");
        
        try{
            
            nuevoArch.createNewFile();
            
            java.io.FileWriter fw = new java.io.FileWriter(nuevoArch.getAbsoluteFile(),true); 
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(docfin);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(PrimerParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimerParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimerParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimerParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimerParcial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea TxtArea_fuente;
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenuItem btnCopiar;
    private javax.swing.JMenuItem btnCortar;
    private javax.swing.JMenu btnEdicion;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btnacercade;
    private javax.swing.JMenuItem btnpegar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
