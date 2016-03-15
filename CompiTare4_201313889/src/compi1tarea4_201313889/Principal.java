package compi1tarea4_201313889;

import Acciones.Compilador;
import Acciones.ErrorT;
import Acciones.ListaToken;
import Acciones.Token;
import java.awt.Desktop;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;
import jsyntaxpane.DefaultSyntaxKit;

/**
 *
 * @author Hilbert
 */
public class Principal extends javax.swing.JFrame {

    //Imprimir resultados ebn consola
    public static ArrayList<String> reconocido = new ArrayList<String>();    
    
    public static ArrayList<ListaToken> ListaT = new ArrayList<ListaToken>();
    
    public ArrayList<ErrorT> lista_errores;
    public ArrayList<Token> lista_reservadas;
    
    public static String pintararchivo1 = "";
    public static String pintar = "";
    
    public Principal() {
        initComponents();
        //this.iniciarEditor();
    }
    
    private void iniciarEditor() {
        DefaultSyntaxKit.initKit();
        this.txt1.setContentType("text/java");
        txt1.setFont(new Font("Comic Sans", txt1.getFont().getStyle(), 14));
    }
    
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JEditorPane();
        lcaret = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        txtsalida = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        iabrir = new javax.swing.JMenuItem();
        isalir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuEjecutar = new javax.swing.JMenu();
        icompilar = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        iacercade = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 1");

        jLabel1.setText("Introduccion de Texto a Analizar");

        txt1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt1CaretUpdate(evt);
            }
        });
        scroll1.setViewportView(txt1);

        lcaret.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lcaret.setForeground(new java.awt.Color(0, 204, 153));
        lcaret.setText(":D");

        txtsalida.setBackground(new java.awt.Color(0, 0, 0));
        txtsalida.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        txtsalida.setForeground(new java.awt.Color(0, 255, 0));
        scroll2.setViewportView(txtsalida);

        jLabel2.setText("CONSOLA");

        barraMenu.setBackground(new java.awt.Color(0, 204, 102));
        barraMenu.setForeground(new java.awt.Color(255, 255, 255));
        barraMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuArchivo.setBackground(new java.awt.Color(0, 0, 0));
        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        iabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document-open.png"))); // NOI18N
        iabrir.setText("Abrir");
        iabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iabrirActionPerformed(evt);
            }
        });
        menuArchivo.add(iabrir);

        isalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boot.png"))); // NOI18N
        isalir.setText("Salir");
        isalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isalirActionPerformed(evt);
            }
        });
        menuArchivo.add(isalir);

        jMenuItem1.setText("Limpiar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuArchivo.add(jMenuItem1);

        barraMenu.add(menuArchivo);

        menuEjecutar.setBackground(new java.awt.Color(0, 0, 0));
        menuEjecutar.setText("Ejecutar");
        menuEjecutar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        icompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/kt-start.png"))); // NOI18N
        icompilar.setText("Archivo 1");
        icompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icompilarActionPerformed(evt);
            }
        });
        menuEjecutar.add(icompilar);

        barraMenu.add(menuEjecutar);

        menuAyuda.setText("?");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        iacercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ajuda-sobre.png"))); // NOI18N
        iacercade.setText("Acerca de ...");
        iacercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacercadeActionPerformed(evt);
            }
        });
        menuAyuda.add(iacercade);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document-open.png"))); // NOI18N
        jMenuItem2.setText("Manual de Usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAyuda.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document-open.png"))); // NOI18N
        jMenuItem3.setText("Manual Tecnico");
        menuAyuda.add(jMenuItem3);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lcaret)
                            .addComponent(jLabel1))
                        .addGap(0, 284, Short.MAX_VALUE))
                    .addComponent(scroll2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lcaret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void iabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iabrirActionPerformed
        JFileChooser filechooserabrir = new JFileChooser();
        filechooserabrir.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Dar formato (*.usac)", "usac");
        filechooserabrir.setFileFilter(filtro);
        int seleccion = filechooserabrir.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                
                BufferedReader bufferreader;
                File file = filechooserabrir.getSelectedFile();
                bufferreader = new BufferedReader(new FileReader(file.getAbsolutePath()));
                String linea, contenido = "";
                //leeendo linea a linea
                while ((linea = bufferreader.readLine()) != null) {
                    contenido += linea + "\n";
                }
                this.txt1.setText(contenido);
                bufferreader.close();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_iabrirActionPerformed

    private void isalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isalirActionPerformed
        Object[] opciones = {"Si", "No"};
        String sms = "Esta a punto de salir, quiere continuar";
        int eleccion = JOptionPane.showOptionDialog(this, sms, "Saliendo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_isalirActionPerformed

    private void iacercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacercadeActionPerformed
        JOptionPane.showMessageDialog(null, "Hilbert Josue Perucho Ramirez\nCarnet: 2013-13889\nGuatemala Abril 2016", "Acerca de", 1);
    }//GEN-LAST:event_iacercadeActionPerformed

    private void icompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icompilarActionPerformed
        //Principal a = new Principal();
          if(txt1.getText().length()!=0 || !txt1.getText().equals(""))
        {
            Compilador c = new Compilador();
            c.Analizar(this.txt1.getText(),this.txtsalida);
            //String salida = c.Analizar(archivo.txt_entrada.getText());
            //archivo.txt_salida.setText(salida);  
        }
////        for (int i = 0; i < ListaT.size(); i++) {
////            //if (ListaT.get(i).toString() == "request") {
////            System.out.println(ListaT.get(i));
////            //}
////            txtsalida.setText("");
////            
////        }
        String Consola = "";
        for (int i = 0; i < reconocido.size(); i++) {
            Consola = Consola + reconocido.get(i) + "\n";
        }
        txtsalida.setText(Consola);
        

    }//GEN-LAST:event_icompilarActionPerformed

    private void txt1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt1CaretUpdate
        try {
            int caretPos = txt1.getCaretPosition();
            int rowNum = (caretPos == 0) ? 1 : 0;
            for (int offset = caretPos; offset > 0;) {
                offset = Utilities.getRowStart(txt1, offset) - 1;
                rowNum++;
            }
            int offset = Utilities.getRowStart(txt1, caretPos);
            int colNum = caretPos - offset + 1;
            lcaret.setText("Linea: " + rowNum + "       Columna: " + colNum);
        } catch (BadLocationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt1CaretUpdate

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            File path = new File("/home/Hilbert/Documentos/USAC/COMPI 1/Projects/Proyecto1/Proyecto1.pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception evvv) {
            JOptionPane.showMessageDialog(null, "No se puede abrir el archivo de ayuda, probablemente fue borrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        txt1.setText("");
        txtsalida.setText("");
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem iabrir;
    private javax.swing.JMenuItem iacercade;
    private javax.swing.JMenuItem icompilar;
    private javax.swing.JMenuItem isalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lcaret;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEjecutar;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    public static javax.swing.JEditorPane txt1;
    public static javax.swing.JTextPane txtsalida;
    // End of variables declaration//GEN-END:variables
}
