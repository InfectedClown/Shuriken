package __View__;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class __Fview__ extends javax.swing.JFrame {

    public __Fview__() {
    Toolkit tk = this.getToolkit();
    Dimension dim = tk.getScreenSize();
    this.setLocation((int) dim.getWidth() / 2 - this.getWidth() / 2, (int) dim.getHeight() / 2 - this.getHeight() / 2);
    def();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Path = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Save As");
        setResizable(false);

        Path.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        Path.setCurrentDirectory(new java.io.File("/"));
        Path.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 15)); // NOI18N
        Path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PathActionPerformed
   
    try {
        try (FileWriter myWriter = new FileWriter(Path.getSelectedFile())) {
            myWriter.write(__View__.IC);
            JOptionPane.showMessageDialog(this, "Done...!","Shuriken",1);
        }
    } catch (IOException e) {
      JOptionPane.showMessageDialog(this, "Error","Shuriken",0);
    }
 
  this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_PathActionPerformed


    public final void def(){
    
     ImageIcon img = new ImageIcon(getClass().getResource( "/__Asset__/asdfghjklzxcvbnmqwertyuiop"));
     this.setIconImage(img.getImage());
    
    }
    public static void F() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(__Fview__.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new __Fview__().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Path;
    // End of variables declaration//GEN-END:variables


}
