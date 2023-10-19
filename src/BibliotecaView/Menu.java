
package BibliotecaView;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jDEscritorio = new javax.swing.JDesktopPane();
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

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        jMListaLibDisp.setText("Socios");
        jMListaLibDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaLibDispActionPerformed(evt);
            }
        });

        jMLector.setText("Formulario de Lector");
        jMLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLectorActionPerformed(evt);
            }
        });
        jMListaLibDisp.add(jMLector);

        jMenuBar1.add(jMListaLibDisp);

        jMenu2.setText("Libros");

        jMLibro.setText("Formulario de Libros");
        jMLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLibroActionPerformed(evt);
            }
        });
        jMenu2.add(jMLibro);

        jMListaLibxAutor.setText("Lista de Libros por Autor");
        jMenu2.add(jMListaLibxAutor);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ejemplar");

        jMEjemplar.setText("Formulario de Ejemplar");
        jMEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEjemplarActionPerformed(evt);
            }
        });
        jMenu4.add(jMEjemplar);

        jMEjeSegunElEst.setText("Ejemplares Segun El Estado");
        jMEjeSegunElEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEjeSegunElEstActionPerformed(evt);
            }
        });
        jMenu4.add(jMEjeSegunElEst);

        jMenuBar1.add(jMenu4);

        jMenu9.setText("Prestamo");

        jMPrestamo.setText("Formulario Prestamo");
        jMPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrestamoActionPerformed(evt);
            }
        });
        jMenu9.add(jMPrestamo);

        jMenuBar1.add(jMenu9);

        jMLibPrest.setText("Administracion");

        jMListLibPrest.setText("Libros Prestados");
        jMListLibPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListLibPrestActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMListLibPrest);

        jMPrestamFechaDet.setText("Libros prestados en Fecha Determinada");
        jMPrestamFechaDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrestamFechaDetActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMPrestamFechaDet);

        jMPrestVencido.setText("Lectores que se les vencio el Prestamo");
        jMPrestVencido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrestVencidoActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMPrestVencido);

        jMLectconPrest.setText("Lectores que pidieron Prestamo");
        jMLectconPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLectconPrestActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMLectconPrest);

        jMListaPresOtorg.setText("Prestamos Otorgados");
        jMListaPresOtorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaPresOtorgActionPerformed(evt);
            }
        });
        jMLibPrest.add(jMListaPresOtorg);

        jMenuBar1.add(jMLibPrest);

        jMenu8.setText("Salir");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
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

    private void jMListaLibDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaLibDispActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jMListaLibDispActionPerformed

    private void jMListLibPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListLibPrestActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        LibrosPrestados lp = new LibrosPrestados();
        lp.setVisible(true);
        jDEscritorio.add(lp);
        jDEscritorio.moveToFront(lp); // TODO add your handling code here:
    }//GEN-LAST:event_jMListLibPrestActionPerformed

    private void jMLectconPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLectconPrestActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        LectoresconPrestamo lp = new LectoresconPrestamo();
        lp.setVisible(true);
        jDEscritorio.add(lp);
        jDEscritorio.moveToFront(lp);// TODO add your handling code here:
    }//GEN-LAST:event_jMLectconPrestActionPerformed

    private void jMPrestVencidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrestVencidoActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        PrestamosVencidos pv = new PrestamosVencidos();
        pv.setVisible(true);
        jDEscritorio.add(pv);
        jDEscritorio.moveToFront(pv); // TODO add your handling code here:
    }//GEN-LAST:event_jMPrestVencidoActionPerformed

    private void jMListaPresOtorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaPresOtorgActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        PrestamosOtorgados po = new PrestamosOtorgados();
        po.setVisible(true);
        jDEscritorio.add(po);
        jDEscritorio.moveToFront(po);  // TODO add your handling code here:
    }//GEN-LAST:event_jMListaPresOtorgActionPerformed

    private void jMPrestamFechaDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrestamFechaDetActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        PrestamosEnFechaDet pfd = new PrestamosEnFechaDet();
        pfd.setVisible(true);
        jDEscritorio.add(pfd);
        jDEscritorio.moveToFront(pfd);         // TODO add your handling code here:
    }//GEN-LAST:event_jMPrestamFechaDetActionPerformed

    private void jMEjeSegunElEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEjeSegunElEstActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        EjemplaresSegunElEstado ese = new EjemplaresSegunElEstado();
        ese.setVisible(true);
        jDEscritorio.add(ese);
        jDEscritorio.moveToFront(ese); // TODO add your handling code here:
    }//GEN-LAST:event_jMEjeSegunElEstActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritorio;
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
