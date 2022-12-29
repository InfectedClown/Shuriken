package __View__;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.util.Random;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static x496e666563746564436c6f776e.z496e666563746564436c6f776e.Z496e666563746564436c6f776e;
public class __View__ extends javax.swing.JFrame {
static String IC;
private int init;
    public __View__()  {
        
        initComponents();
        def();
        set_shell();
        ImageIcon img = new ImageIcon(getClass().getResource( "/__Asset__/asdfghjklzxcvbnmqwertyuiop"));
        this.setIconImage(img.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JF = new javax.swing.JPanel();
        ASL_lil = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_As = new javax.swing.JList<>();
        jp2 = new javax.swing.JPanel();
        Logo_As = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        PORT = new javax.swing.JTextField();
        IP = new javax.swing.JTextField();
        L = new javax.swing.JButton();
        CP = new javax.swing.JButton();
        Save_File = new javax.swing.JButton();
        Scol = new javax.swing.JScrollPane();
        Cview = new javax.swing.JTextArea();
        ___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ = new javax.swing.JLabel();
        OS_n = new javax.swing.JComboBox<>();
        B = new javax.swing.JLabel();
        A = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shuriken");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        JF.setBackground(new java.awt.Color(0, 0, 0));
        JF.setForeground(new java.awt.Color(255, 255, 255));

        ASL_lil.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        ASL_lil.setForeground(new java.awt.Color(255, 255, 255));
        ASL_lil.setText("Shuriken");
        ASL_lil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ASL_lil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        List_As.setBackground(new java.awt.Color(0, 0, 0));
        List_As.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        List_As.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        List_As.setForeground(new java.awt.Color(255, 255, 255));
        List_As.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        List_As.setAutoscrolls(false);
        List_As.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List_AsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List_As);

        jp2.setBackground(new java.awt.Color(0, 0, 0));

        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/-.png"))); // NOI18N

        I.setBackground(new java.awt.Color(51, 51, 51));
        I.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        I.setForeground(new java.awt.Color(204, 204, 255));
        I.setText("IP ");

        i5.setBackground(new java.awt.Color(0, 0, 0));
        i5.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        i5.setForeground(new java.awt.Color(204, 204, 255));
        i5.setText("Port ");

        PORT.setBackground(new java.awt.Color(0, 51, 51));
        PORT.setFont(PORT.getFont());
        PORT.setForeground(new java.awt.Color(255, 255, 255));
        PORT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PORT.setText("8080");
        PORT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PORT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PORTKeyReleased(evt);
            }
        });

        IP.setBackground(new java.awt.Color(0, 51, 51));
        IP.setFont(IP.getFont());
        IP.setForeground(new java.awt.Color(255, 255, 255));
        IP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP.setText("127.0.0.1");
        IP.setAutoscrolls(false);
        IP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IP.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        IP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IPKeyReleased(evt);
            }
        });

        L.setBackground(new java.awt.Color(0, 0, 0));
        L.setForeground(new java.awt.Color(255, 255, 255));
        L.setText("listener ");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        CP.setBackground(new java.awt.Color(0, 0, 0));
        CP.setForeground(new java.awt.Color(255, 255, 255));
        CP.setText("Copy");
        CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPActionPerformed(evt);
            }
        });

        Save_File.setBackground(new java.awt.Color(0, 0, 0));
        Save_File.setForeground(new java.awt.Color(255, 255, 255));
        Save_File.setText("Save As");
        Save_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_FileActionPerformed(evt);
            }
        });

        Cview.setBackground(new java.awt.Color(0, 0, 0));
        Cview.setColumns(20);
        Cview.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cview.setForeground(new java.awt.Color(255, 255, 255));
        Cview.setLineWrap(true);
        Cview.setRows(5);
        Cview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cview.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CviewKeyPressed(evt);
            }
        });
        Scol.setViewportView(Cview);

        ___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________.setBackground(new java.awt.Color(0, 0, 0));
        ___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/+.png"))); // NOI18N

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scol, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addComponent(L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save_File))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Logo_As, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(I)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(i5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PORT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(I)
                            .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i5)
                            .addComponent(PORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Logo_As, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scol, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L)
                            .addComponent(CP)
                            .addComponent(Save_File))))
                .addContainerGap())
        );

        OS_n.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        OS_n.setEnabled(false);
        OS_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OS_nActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 15)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("OS  :");

        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/rgb-background-x-d.gif"))); // NOI18N

        javax.swing.GroupLayout JFLayout = new javax.swing.GroupLayout(JF);
        JF.setLayout(JFLayout);
        JFLayout.setHorizontalGroup(
            JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JFLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(ASL_lil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JFLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(B)
                        .addGap(12, 12, 12)
                        .addComponent(OS_n, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JFLayout.setVerticalGroup(
            JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFLayout.createSequentialGroup()
                .addGroup(JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ASL_lil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JFLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(B))
                            .addComponent(OS_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(JFLayout.createSequentialGroup()
                        .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void List_AsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List_AsMouseClicked
    int xf2 = List_As.getSelectedIndex();
    byte[] i3 = Z496e666563746564436c6f776e(__Data__.Ic636f6d6d616e64[xf2]);
    byte[] i4 = Z496e666563746564436c6f776e(__Data__.Ic4f735f4e616d65[xf2]);
    String xf3 = new String(i3, StandardCharsets.UTF_8);
    String xf4 = new String(i4, StandardCharsets.UTF_8);
    if(xf4.equals("['linux', 'mac']"))  {
        init = 0;
        Cview.setText(xf3.replace("{ip}", IP.getText()).replace("{port}", PORT.getText()).replace("{shell}", "bash"));
    }else {
        init = 1;  
        Cview.setText(xf3.replace("{ip}", IP.getText()).replace("{port}", PORT.getText()).replace("{shell}", "powershell"));
    } 
    if (List_As.getSelectedIndex() < 5){
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/7ac8ec6e649aaeae66ca9e82b11576f5")));
    } else if(List_As.getSelectedIndex() < 15 && List_As.getSelectedIndex() > 12) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/1b3e0feafa731650a8148d5693c9fac2")));
    } else if(List_As.getSelectedIndex() < 17 && List_As.getSelectedIndex() > 14) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/445757c43b91413661e3e7d736b60a64")));
    } else if(List_As.getSelectedIndex() < 20 && List_As.getSelectedIndex() > 17) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/56112a0e8149232487c31dee2b78e603")));
    } else if(List_As.getSelectedIndex() < 31 && List_As.getSelectedIndex() > 19) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/934883359de1a7bcd10598bf83022775")));
    } else if(List_As.getSelectedIndex() < 36 && List_As.getSelectedIndex() > 30) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/77452fea82dac3c7d3f20cbbb376f92a")));
    } else if(List_As.getSelectedIndex() < 42 && List_As.getSelectedIndex() > 35) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/8e42263d0adc5e3092067c9cfa538015")));
    } else if(List_As.getSelectedIndex() < 44 && List_As.getSelectedIndex() > 41) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/570b43528e25af748b501bf770217233")));
    } else if(List_As.getSelectedIndex() < 57 && List_As.getSelectedIndex() > 54) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/489528da440db75ce82bb40857fc0f8d")));
    } else if(List_As.getSelectedIndex() < 58 && List_As.getSelectedIndex() > 56) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/2ab01a44d8c45d3f316becd19cedec49")));
    }else if(List_As.getSelectedIndex() == 17) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/4665664b2ee7819521629c7bbf990445")));
    }else if(List_As.getSelectedIndex() == 60) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/29f08526bd56c2220b6ba9f28b74771e")));
    }else if(List_As.getSelectedIndex() > 4 && List_As.getSelectedIndex() < 12) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/e21f2d13dee2321b6c54fb63d2358813")));
    }else if(List_As.getSelectedIndex() == 51) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/c72c3b2a87eb1b5780f8edcd2c96cc2f")));
    }else if(List_As.getSelectedIndex() == 53) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/db4d999bd88b41ad94e6fdb0eadb51e7")));
    }else if(List_As.getSelectedIndex() == 52) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/bb88534a4e4d29938c7bb1266c22238e")));
    }else if(List_As.getSelectedIndex() < 51 && List_As.getSelectedIndex() > 47) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/963ebc3a61d5fdb75cfd7af022eea437")));
    }else if(List_As.getSelectedIndex() < 48 && List_As.getSelectedIndex() > 45) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/61ccc9b746b94160688c13d633f10b62")));
    }else if(List_As.getSelectedIndex() == 58) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/b26e49c6e3933160d6bd84d62bc77fba")));
    }else if(List_As.getSelectedIndex() == 54) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/950efa571d7dc530fe8adfe7c2fceaba")));
    }else if(List_As.getSelectedIndex() == 12||List_As.getSelectedIndex() == 44 || List_As.getSelectedIndex() == 45) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/7ac8ec6e649aaeae66ca9e82b11576f5")));
    }else if(List_As.getSelectedIndex() ==  61 - 2) {
        Logo_As.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/2da65eedb5c550988cb6e8df7b584f63")));
        }                 
    }//GEN-LAST:event_List_AsMouseClicked

    private void OS_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OS_nActionPerformed
         def();   
    }//GEN-LAST:event_OS_nActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed

    try {
       
        Process p = Runtime.getRuntime().exec("cmd.exe /c start java -jar lib\\InfectedClown.jar "+ PORT.getText() );
    } catch (IOException ex) {
        Logger.getLogger(__View__.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LActionPerformed

    private void CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPActionPerformed
    StringSelection text = new StringSelection(Cview.getText());    
    Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
    clip.setContents(text, null);
    JOptionPane.showMessageDialog(this, "Done...!","Shuriken",1);
    }//GEN-LAST:event_CPActionPerformed

    private void CviewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CviewKeyPressed
        Random rand = new Random();
        Cview.setForeground(new java.awt.Color(rand.nextFloat(), rand.nextFloat(),rand.nextFloat()));
    }//GEN-LAST:event_CviewKeyPressed

    private void Save_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_FileActionPerformed

        __Fview__.F();
        IC = Cview.getText();             
    }//GEN-LAST:event_Save_FileActionPerformed

    private void IPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IPKeyReleased
        for(int x=0;x!=__Data__.Ic68747470733a2f2f6769746875622e636f6d2f496e666563746564436c6f776e.length;x++){
            byte[] i3 = Z496e666563746564436c6f776e(__Data__.Ic636f6d6d616e64[x]);
            String xf3 = new String(i3, StandardCharsets.UTF_8);
            if(List_As.getSelectedIndex() ==x){
                switch(init){
                    case 0 :{
                        Cview.setText(xf3.replace("{ip}", IP.getText()).replace("{port}", PORT.getText()).replace("{shell}", "bash"));
                        break;
                    }
                    default:{
                    Cview.setText(xf3.replace("{ip}", IP.getText()).replace("{port}", PORT.getText()).replace("{shell}", "powershell"));                 
                    };}
             
                break;
            }}
    }//GEN-LAST:event_IPKeyReleased

    private void PORTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PORTKeyReleased
        for(int x=0;x!=__Data__.Ic68747470733a2f2f6769746875622e636f6d2f496e666563746564436c6f776e.length;x++){
            byte[] i3 = Z496e666563746564436c6f776e(__Data__.Ic636f6d6d616e64[x]);
            String xf3 = new String(i3, StandardCharsets.UTF_8);
            if(List_As.getSelectedIndex() == x){
                switch(init){
                    case 0 :{
                        Cview.setText(xf3.replace("{ip}", IP.getText()).replace("{port}", PORT.getText()).replace("{shell}", "bash"));
                        break;
                    }
                    default:{
                    Cview.setText(xf3.replace("{ip}", IP.getText()).replace("{port}", PORT.getText()).replace("{shell}", "powershell"));                 
                    };}
                break;
            }}
    }//GEN-LAST:event_PORTKeyReleased

    public static void main() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(__View__.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new __View__().setVisible(true);
        });
    }
    public final void def(){
        ArrayList<String> All = new ArrayList<String>();
        for(int x=0;x!=__Data__.Ic68747470733a2f2f6769746875622e636f6d2f496e666563746564436c6f776e.length;x++){
                byte[] i2 = Z496e666563746564436c6f776e(__Data__.Ic68747470733a2f2f6769746875622e636f6d2f496e666563746564436c6f776e[x]);
                String xf2 = new String(i2, StandardCharsets.UTF_8);
                All.add(xf2);
        }
            List_As.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return All.size();}
            public String getElementAt(int i) { return All.get(i); }
        });
    Toolkit tk = this.getToolkit();
    Dimension dim = tk.getScreenSize();
    int x = (int) dim.getWidth() / 2 - this.getWidth() / 2;
    int y = (int) dim.getHeight() / 2 - this.getHeight() / 2;
    this.setLocation(x, y);}
public final void set_shell(){



}
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel ASL_lil;
    private javax.swing.JLabel B;
    private javax.swing.JButton CP;
    private javax.swing.JTextArea Cview;
    private javax.swing.JLabel I;
    private javax.swing.JTextField IP;
    private javax.swing.JPanel JF;
    private javax.swing.JButton L;
    private javax.swing.JList<String> List_As;
    private javax.swing.JLabel Logo_As;
    private javax.swing.JComboBox<String> OS_n;
    private javax.swing.JTextField PORT;
    private javax.swing.JButton Save_File;
    private javax.swing.JScrollPane Scol;
    private javax.swing.JLabel ___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________;
    private javax.swing.JLabel i5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp2;
    // End of variables declaration//GEN-END:variables
}