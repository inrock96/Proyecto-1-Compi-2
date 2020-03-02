/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import TablaDeSimbolos.NodoError;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author inti_
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public static JTextPane entrada; 
    public static LinkedList<NodoError> Error;
    LinkedList<String> nombrePestanas;
    boolean guardado;
    String nombre, path;
    public Ventana() {
        Error = new LinkedList<>();
        nombrePestanas = new LinkedList<>();
        initComponents();
        LineaText tmpL = new LineaText();
        entrada=tmpL.text_pane;
        posicionPuntero(tmpL);
        JPanel tmpP = new JPanel(new BorderLayout());
        tmpP.add(tmpL,BorderLayout.WEST);
        tmpP.add(tmpL.scrollPane,BorderLayout.CENTER);
        tabs.addTab("nuevo",tmpP);
        tabs.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e){
                System.out.println("tab: "+tabs.getSelectedIndex());
            }
        });
        Ventana_Load();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        noColumna = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        noLinea = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        mNuevaPestana = new javax.swing.JMenuItem();
        mAbrir = new javax.swing.JMenuItem();
        mGuardar = new javax.swing.JMenuItem();
        mGuardarComo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mCompilarCup = new javax.swing.JMenuItem();
        mCompilarJavaCC = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mErrores = new javax.swing.JMenuItem();
        mReporteTS = new javax.swing.JMenuItem();
        mReporteAST = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTextPane1);

        noColumna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noColumna.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Columna");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Linea");

        noLinea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noLinea.setText("0");

        jMenu5.setText("Archivo");

        mNuevaPestana.setText("NuevaPestana");
        mNuevaPestana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevaPestanaActionPerformed(evt);
            }
        });
        jMenu5.add(mNuevaPestana);

        mAbrir.setText("Abrir");
        mAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAbrirActionPerformed(evt);
            }
        });
        jMenu5.add(mAbrir);

        mGuardar.setText("Guardar");
        jMenu5.add(mGuardar);

        mGuardarComo.setText("Guardar Como");
        mGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGuardarComoActionPerformed(evt);
            }
        });
        jMenu5.add(mGuardarComo);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Compilar");

        mCompilarCup.setText("Compilar Cup");
        jMenu1.add(mCompilarCup);

        mCompilarJavaCC.setText("Compilar JavaCC");
        mCompilarJavaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCompilarJavaCCActionPerformed(evt);
            }
        });
        jMenu1.add(mCompilarJavaCC);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Reportes");

        mErrores.setText("Reporte Errores");
        jMenu3.add(mErrores);

        mReporteTS.setText("Reporte Tabla de Simbolos");
        jMenu3.add(mReporteTS);

        mReporteAST.setText("Reporte AST");
        jMenu3.add(mReporteAST);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Misc");

        mAbout.setText("About");
        jMenu2.add(mAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(noColumna)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(noLinea)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noColumna)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(noLinea))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGuardarComoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mGuardarComoActionPerformed

    private void mCompilarJavaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCompilarJavaCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mCompilarJavaCCActionPerformed

    private void mNuevaPestanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevaPestanaActionPerformed
        // TODO add your handling code here:
        crearPestana("nueva", "");
    }//GEN-LAST:event_mNuevaPestanaActionPerformed

    private void mAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAbrirActionPerformed
        // TODO add your handling code here:
        abrir();
    }//GEN-LAST:event_mAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    private void crearPestana(String titulo, String texto){
        LineaText tmpL = new LineaText();
        entrada=tmpL.text_pane;
        posicionPuntero(tmpL);
        JPanel tmpP = new JPanel(new BorderLayout());
        tmpP.add(tmpL,BorderLayout.WEST);
        tmpP.add(tmpL.scrollPane,BorderLayout.CENTER);
        tabs.addTab("nuevo",tmpP);
    }
    private void abrir(){
        File f;
        JFileChooser selArchivo;
        selArchivo = new JFileChooser();
        FileNameExtensionFilter fne = new FileNameExtensionFilter("*.xml", "xml");
            selArchivo.setFileFilter(fne);
        selArchivo.showOpenDialog(null);
        
        f = selArchivo.getSelectedFile();
        System.out.println("Archivo seleccionado"+f);
        System.out.println("Path actual: "+
                selArchivo.getCurrentDirectory());
        
        try{
            
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String text = br.readLine();
            char cambiolinea = 10;
            JTextPane jtp  = getJTextPane();
            if(jtp==null){
                crearPestana(f.getName(), "");
                jtp = getJTextPane();
                while(text!=null){
                    jtp.setText(jtp.getText() + "\n" + text + cambiolinea);
                    text = br.readLine();
                }
            }else{
                crearPestana(f.getName(),"");
                while(text!=null){
                    jtp.setText(jtp.getText() + "\n" + text + cambiolinea);
                    text = br.readLine();
                }     
            }
            
            br.close();
            fr.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void guardar(){
        File guardar;
       
        if(guardado){
            
            String contenido = getJTextPane().getText();
            try{
                guardar = new File(path);
                System.out.println(guardar.getPath());
                System.out.println(guardar.getName());
                FileWriter texto = new FileWriter(guardar);
                BufferedWriter bw = new BufferedWriter(texto);
                bw.write(contenido);
                bw.close();;
                texto.close();
            }catch(IOException ex){
                System.out.println("Error");
            }
            
        }
        else{
            guardarComo();
        }
    }
    
    private void guardarComo(){
        JFileChooser jfc = new JFileChooser();
         int option = jfc.showSaveDialog(this);
         if(option == JFileChooser.APPROVE_OPTION);        
            File f = jfc.getSelectedFile();
            File guardar;
         try{
             guardar = new File(f + ".arit");
             FileWriter texto = new FileWriter(guardar);
             BufferedWriter bw = new BufferedWriter(texto);
             bw.write(getJTextPane().getText());
             bw.close();
             
             JOptionPane.showMessageDialog(null, "uweb creado"); 
             System.out.println(guardar.getPath());
             nombre = guardar.getName();
             path = guardar.getPath();
             guardado=true;
         }catch (IOException ex) {
             System.out.println("Error ");
         }
    }
    
    public JTextPane getJTextPane(){
        JTextPane jtp = null;
        JPanel jp;
        jp = (JPanel) tabs.getSelectedComponent();
        if(jtp!=null){
            return ((LineaText)jp.getComponent(0)).text_pane;
        }
        return jtp;
    }
    private void Ventana_Load(){
        WindowListener l = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    public void appendSalida(String mensaje){
        jTextPane1.setText(jTextPane1.getText()+mensaje);
    }
    private void posicionPuntero(LineaText lines){
        lines.text_pane.addCaretListener(new CaretListener(){
            
            @Override
            public void caretUpdate(CaretEvent e) {
                int pos = e.getDot();
		int fila = 1, columna=0;
		int ultimalinea=-1;
		String text =lines.text_pane.getText().replaceAll("\r","");
				
		for(int i=0;i<pos;i++){
                    if(text.charAt(i)==10){
                        fila++;
                        ultimalinea=i;
                    }
                }
				
		columna=pos-ultimalinea;                
                noLinea.setText(fila +"");
                noColumna.setText(columna+"");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem mAbout;
    private javax.swing.JMenuItem mAbrir;
    private javax.swing.JMenuItem mCompilarCup;
    private javax.swing.JMenuItem mCompilarJavaCC;
    private javax.swing.JMenuItem mErrores;
    private javax.swing.JMenuItem mGuardar;
    private javax.swing.JMenuItem mGuardarComo;
    private javax.swing.JMenuItem mNuevaPestana;
    private javax.swing.JMenuItem mReporteAST;
    private javax.swing.JMenuItem mReporteTS;
    private javax.swing.JLabel noColumna;
    private javax.swing.JLabel noLinea;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
