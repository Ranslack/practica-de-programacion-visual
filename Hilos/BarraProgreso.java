/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hilos;

/**
 *
 * @author yaser
 */
public class BarraProgreso extends javax.swing.JFrame {

    /**
     * Creates new form BarraProgreso
     */
    public BarraProgreso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pbar1 = new javax.swing.JProgressBar();
        pbar2 = new javax.swing.JProgressBar();
        pbar3 = new javax.swing.JProgressBar();
        pbar4 = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnIniciar = new javax.swing.JMenuItem();
        btnEdicion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("barra de progreso");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 400));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));

        Pbar1.setMinimum(1);
        Pbar1.setValue(50);
        Pbar1.setName("barra de progreso1"); // NOI18N
        Pbar1.setString("50%");
        Pbar1.setStringPainted(true);

        pbar2.setStringPainted(true);

        pbar3.setStringPainted(true);

        pbar4.setMinimum(1);
        pbar4.setStringPainted(true);

        btnArchivo.setText("Archivo");

        btnIniciar.setText("(Iniciar)");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        btnArchivo.add(btnIniciar);

        jMenuBar1.add(btnArchivo);

        btnEdicion.setText("Edicion");
        jMenuBar1.add(btnEdicion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Pbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(pbar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pbar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(pbar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        Thread a=new Thread(){
            @Override
            public void run(){
                for(int i=0;i<101;i++){
                    System.out.println(i+"=="+getName());
                    //new Hilo1("luis").start();
                    pbar2.setValue(i);
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
            
        };a.start();
        a.setName("Juarez");
        Thread b=new Thread(){
            @Override
            public void run(){
                for(int i=0;i<101;i++){
                    System.out.println(i+"=="+getName());
                    //new Hilo1("luis").start();
                    pbar3.setValue(i);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
            }
        };b.start();
        b.setName("Yetz");
        Thread c=new Thread(){
            @Override
            public void run(){
                for(int i=0;i<101;i++){
                    System.out.println(i+"=="+getName());
                    //new Hilo1("luis").start();
                    pbar4.setValue(i);
                    try {
                        Thread.sleep(20);
                    } catch (Exception e) {
                    }
                }
            }
        };c.start();
        c.setName("Bañales");
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(BarraProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarraProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarraProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarraProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarraProgreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Pbar1;
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnEdicion;
    private javax.swing.JMenuItem btnIniciar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar pbar2;
    private javax.swing.JProgressBar pbar3;
    private javax.swing.JProgressBar pbar4;
    // End of variables declaration//GEN-END:variables
}
