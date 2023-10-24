package BibliotecaView;
import Data.*;
import Entidades.*;
import java.time.*;
import javax.swing.*;

public class PrestamoView extends javax.swing.JInternalFrame {

    private PrestamoData pd = new PrestamoData();
    private Prestamo prestamoActual = null;
    private EjemplarData ed = new EjemplarData();
    private Ejemplar ejemplarActual = null;
    private LectorData ld = new LectorData();
    private Lector lectorActual = null;

    public PrestamoView() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDFechaI = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDFechaF = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTIdEjemplar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTIdLector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jBGuardar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBDevolucion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();

        setVisible(true);

        jLabel1.setText("                   PRESTAMOS:");

        jLabel2.setText("Fecha de Inicio");

        jLabel3.setText("Fecha de Devolucion");

        jLabel4.setText("Id Ejemplar:");

        jLabel5.setText("Id Lector:");

        jLabel6.setText("Cantidad a Prestar :");

        jLabel7.setText("Estado: ");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBDevolucion.setText("Devolucion");
        jBDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolucionActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setText("Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTIdLector, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBDevolucion)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTIdEjemplar, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDFechaI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                                .addComponent(jDFechaF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jRBEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jBGuardar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jBModificar))))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBLimpiar)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBBuscar)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDFechaF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTIdEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTIdLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRBEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar)
                    .addComponent(jBDevolucion)
                    .addComponent(jBSalir))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            int codigo = Integer.parseInt(jTCodigo.getText());
            prestamoActual = pd.buscarPrestamoPorCodigo(codigo);
            if (prestamoActual != null) {
                LocalDate lc = prestamoActual.getFechaI();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDFechaI.setDate(date);
                LocalDate lc1 = prestamoActual.getFechaF();
                java.util.Date date1 = java.util.Date.from(lc1.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDFechaF.setDate(date1);
                jTIdEjemplar.setText(prestamoActual.getEjemplar().getIdEjemplar() + "");
                jTIdLector.setText(prestamoActual.getLector().getIdLector() + "");
                jTCantidad.setText(prestamoActual.getCantidad() + "");
                jRBEstado.setSelected(prestamoActual.isEstado());
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un codigo valido");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            int codigo = Integer.parseInt(jTCodigo.getText());
            java.util.Date fecha = jDFechaI.getDate();
            LocalDate FechaI = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            java.util.Date fecha1 = jDFechaF.getDate();
            LocalDate FechaF = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int IdEjemplar = Integer.parseInt(jTIdEjemplar.getText());

            ejemplarActual = ed.buscarEjemplarPorId(IdEjemplar);
            int IdLector = Integer.parseInt(jTIdLector.getText());
            lectorActual = ld.buscarLector(IdLector);
            int Cantidad = Integer.parseInt(jTCantidad.getText());
            boolean Estado = jRBEstado.isSelected();

            if (prestamoActual == null && ejemplarActual.isEstado().equalsIgnoreCase("Disponible en Biblioteca")) {
                prestamoActual = new Prestamo(codigo, FechaI, FechaF, ejemplarActual, lectorActual, Estado, Cantidad);
                pd.cargarPrestamo(prestamoActual);

                int codigo1 = ejemplarActual.getCodigo();
                Libros idLibro = ejemplarActual.getIdLibro();
                String Estado1 = ejemplarActual.isEstado();
                int cant1 = ejemplarActual.getCantidad() - Cantidad;
                int idEje = ejemplarActual.getIdEjemplar();
                ejemplarActual = new Ejemplar(idEje, codigo1, idLibro, Estado1, cant1);
                ed.modificarCantDeEje(ejemplarActual);

            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un codigo valido");
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
        prestamoActual = null;
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        try {
            int codigo = Integer.parseInt(jTCodigo.getText());

            java.util.Date fecha = jDFechaI.getDate();
            LocalDate FechaI = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            java.util.Date fecha1 = jDFechaF.getDate();
            LocalDate FechaF = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            int IdEjemplar = Integer.parseInt(jTIdEjemplar.getText());
            ejemplarActual = ed.buscarEjemplarPorId(IdEjemplar);

            int IdLector = Integer.parseInt(jTIdLector.getText());
            lectorActual = ld.buscarLector(IdLector);

            int Cantidad = Integer.parseInt(jTCantidad.getText());
            boolean Estado = jRBEstado.isSelected();

            prestamoActual = pd.buscarPrestamoPorCodigo(codigo);
            if (prestamoActual != null) {

                prestamoActual.setCodigo(codigo);
                prestamoActual.setFechaI(FechaI);
                prestamoActual.setFechaF(FechaF);
                prestamoActual.setEjemplar(ejemplarActual);
                prestamoActual.setLector(lectorActual);
                prestamoActual.setCantidad(Cantidad);
                prestamoActual.setEstado(Estado);

                pd.modificarPrestamo(prestamoActual);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un codigo valido");
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevolucionActionPerformed
        try {
            if (prestamoActual != null) {
                pd.devolucionPrestamo(prestamoActual.getIdPrestamo());
                int Cantidad = prestamoActual.getCantidad();
                ejemplarActual = ed.buscarEjemplarPorId(prestamoActual.getEjemplar().getIdEjemplar());

                if (ejemplarActual != null) {
                    int codigo1 = ejemplarActual.getCodigo();
                    Libros idLibro = ejemplarActual.getIdLibro();
                    String Estado1 = ejemplarActual.isEstado();
                    int cant1 = ejemplarActual.getCantidad() + Cantidad;
                    int idEje = ejemplarActual.getIdEjemplar();
                    ejemplarActual = new Ejemplar(idEje, codigo1, idLibro, Estado1, cant1);
                    ed.modificarCantDeEje(ejemplarActual);

                }
                prestamoActual = null;
                limpiarCampos();

            } else {
                JOptionPane.showMessageDialog(null, "Error, usted no ha seleccionado a ningun Lector.");
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un codigo valido");
        }
    }//GEN-LAST:event_jBDevolucionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBDevolucion;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDFechaF;
    private com.toedter.calendar.JDateChooser jDFechaI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTIdEjemplar;
    private javax.swing.JTextField jTIdLector;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTCodigo.setText("");
        jDFechaI.setDate(null);
        jDFechaF.setDate(null);
        jTIdEjemplar.setText("");
        jTIdLector.setText("");
        jTCantidad.setText("");
        jRBEstado.setSelected(false);

    }
}