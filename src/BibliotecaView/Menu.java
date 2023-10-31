package BibliotecaView;

import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu extends javax.swing.JFrame {  
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MENU");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jDEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMListaLibDisp = new javax.swing.JMenu();
        jMLector = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMLibro = new javax.swing.JMenuItem();
        jMListaLibxAutor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMEjemplar = new javax.swing.JMenuItem();
        jMEjeSegunElEst = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMPrestamo = new javax.swing.JMenuItem();
        jMLibPrest = new javax.swing.JMenu();
        jMListLibPrest = new javax.swing.JMenuItem();
        jMPrestamFechaDet = new javax.swing.JMenuItem();
        jMPrestVencido = new javax.swing.JMenuItem();
        jMLectconPrest = new javax.swing.JMenuItem();
        jMListaPresOtorg = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDEscritorio.setPreferredSize(new java.awt.Dimension(800, 1000));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Biblioteca.png"))); // NOI18N

        jDEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1863, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(318, 60));

        jMListaLibDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Lector.png"))); // NOI18N
        jMListaLibDisp.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N

        jMLector.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMLector.setText("Formulario de Lector");
        jMLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLectorActionPerformed(evt);
            }
        });
        jMListaLibDisp.add(jMLector);

        jMenuBar1.add(jMListaLibDisp);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Libros.png"))); // NOI18N

        jMLibro.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMLibro.setText("Formulario de Libros");
        jMLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLibroActionPerformed(evt);
            }
        });
        jMenu2.add(jMLibro);

        jMListaLibxAutor.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMListaLibxAutor.setText("Lista de Libros por Autor");
        jMListaLibxAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaLibxAutorActionPerformed(evt);
            }
        });
        jMenu2.add(jMListaLibxAutor);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Ejemplar.png"))); // NOI18N

        jMEjemplar.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMEjemplar.setText("Formulario de Ejemplar");
        jMEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEjemplarActionPerformed(evt);
            }
        });
        jMenu4.add(jMEjemplar);

        jMEjeSegunElEst.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMEjeSegunElEst.setText("Ejemplares Segun El Estado");
        jMEjeSegunElEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEjeSegunElEstActionPerformed(evt);
            }
        });
        jMenu4.add(jMEjeSegunElEst);

        jMenuBar1.add(jMenu4);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/prestamo.png"))); // NOI18N

        jMPrestamo.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMPrestamo.setText("Formulario Prestamo");
        jMPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrestamoActionPerformed(evt);
            }
        });
        jMenu9.add(jMPrestamo);

        jMenuBar1.add(jMenu9);

        jMLibPrest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Administracion.png"))); // NOI18N

        jMListLibPrest.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMListLibPrest.setText("Libros Prestados");
        jMListLibPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListLibPrestActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMListLibPrest);

        jMPrestamFechaDet.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMPrestamFechaDet.setText("Libros prestados en Fecha Determinada");
        jMPrestamFechaDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrestamFechaDetActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMPrestamFechaDet);

        jMPrestVencido.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMPrestVencido.setText("Lectores que se les vencio el Prestamo");
        jMPrestVencido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrestVencidoActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMPrestVencido);

        jMLectconPrest.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMLectconPrest.setText("Lectores que pidieron Prestamo");
        jMLectconPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLectconPrestActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMLectconPrest);

        jMListaPresOtorg.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jMListaPresOtorg.setText("Prestamos Otorgados");
        jMListaPresOtorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaPresOtorgActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMListaPresOtorg);

        jMenuBar1.add(jMLibPrest);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salida.png"))); // NOI18N
        jMenu8.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu8MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEjemplarActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        EjemplarView ev = new EjemplarView();
        ev.setVisible(true);
        jDEscritorio.add(ev);
        jDEscritorio.moveToFront(ev);
    }//GEN-LAST:event_jMEjemplarActionPerformed

    private void jMLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLectorActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        LectorView lv = new LectorView();
        lv.setVisible(true);
        jDEscritorio.add(lv);
        jDEscritorio.moveToFront(lv);
    }//GEN-LAST:event_jMLectorActionPerformed

    private void jMLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLibroActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        LibroView lbv = new LibroView();
        lbv.setVisible(true);
        jDEscritorio.add(lbv);
        jDEscritorio.moveToFront(lbv);
    }//GEN-LAST:event_jMLibroActionPerformed

    private void jMPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrestamoActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        PrestamoView pv = new PrestamoView();
        pv.setVisible(true);
        jDEscritorio.add(pv);
        jDEscritorio.moveToFront(pv);
    }//GEN-LAST:event_jMPrestamoActionPerformed

    private void jMListLibPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListLibPrestActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        LibrosPrestados lp = new LibrosPrestados();
        lp.setVisible(true);
        jDEscritorio.add(lp);
        jDEscritorio.moveToFront(lp);
    }//GEN-LAST:event_jMListLibPrestActionPerformed

    private void jMLectconPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLectconPrestActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        LectoresconPrestamo lp = new LectoresconPrestamo();
        lp.setVisible(true);
        jDEscritorio.add(lp);
        jDEscritorio.moveToFront(lp);
    }//GEN-LAST:event_jMLectconPrestActionPerformed

    private void jMPrestVencidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrestVencidoActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        PrestamosVencidos pv = new PrestamosVencidos();
        pv.setVisible(true);
        jDEscritorio.add(pv);
        jDEscritorio.moveToFront(pv);
    }//GEN-LAST:event_jMPrestVencidoActionPerformed

    private void jMListaPresOtorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaPresOtorgActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        PrestamosOtorgados po = new PrestamosOtorgados();
        po.setVisible(true);
        jDEscritorio.add(po);
        jDEscritorio.moveToFront(po);
    }//GEN-LAST:event_jMListaPresOtorgActionPerformed

    private void jMPrestamFechaDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrestamFechaDetActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        PrestamosEnFechaDet pfd = new PrestamosEnFechaDet();
        pfd.setVisible(true);
        jDEscritorio.add(pfd);
        jDEscritorio.moveToFront(pfd);
    }//GEN-LAST:event_jMPrestamFechaDetActionPerformed

    private void jMEjeSegunElEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEjeSegunElEstActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        EjemplaresSegunElEstado ese = new EjemplaresSegunElEstado();
        ese.setVisible(true);
        jDEscritorio.add(ese);
        jDEscritorio.moveToFront(ese);
    }//GEN-LAST:event_jMEjeSegunElEstActionPerformed

    private void jMenu8MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu8MenuSelected
        System.exit(0);
    }//GEN-LAST:event_jMenu8MenuSelected

    private void jMListaLibxAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaLibxAutorActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        LibrosPorAutor lpa = new  LibrosPorAutor();
        lpa.setVisible(true);
        jDEscritorio.add(lpa);
        jDEscritorio.moveToFront(lpa);
    }//GEN-LAST:event_jMListaLibxAutorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new TextureLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
             new Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMEjeSegunElEst;
    private javax.swing.JMenuItem jMEjemplar;
    private javax.swing.JMenuItem jMLectconPrest;
    private javax.swing.JMenuItem jMLector;
    private javax.swing.JMenu jMLibPrest;
    private javax.swing.JMenuItem jMLibro;
    private javax.swing.JMenuItem jMListLibPrest;
    private javax.swing.JMenu jMListaLibDisp;
    private javax.swing.JMenuItem jMListaLibxAutor;
    private javax.swing.JMenuItem jMListaPresOtorg;
    private javax.swing.JMenuItem jMPrestVencido;
    private javax.swing.JMenuItem jMPrestamFechaDet;
    private javax.swing.JMenuItem jMPrestamo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}