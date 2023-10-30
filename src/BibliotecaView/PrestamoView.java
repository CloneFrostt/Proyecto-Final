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

        setBackground(new java.awt.Color(153, 255, 153));
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText("    PRESTAMOS:");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de Inicio:");

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de Devolucion:");

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel4.setText("Id Ejemplar:");

        jTIdEjemplar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel5.setText("Id Lector:");

        jTIdLector.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        jLabel6.setText("Cantidad a Prestar :");

        jTCantidad.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel7.setText("Estado: ");

        jRBEstado.setBackground(new java.awt.Color(153, 255, 153));

        jBGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jBGuardar.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 0, 0));
        jBModificar.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBDevolucion.setBackground(new java.awt.Color(0, 0, 0));
        jBDevolucion.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        jBDevolucion.setText("Devolucion");
        jBDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolucionActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(0, 0, 0));
        jBSalir.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jBBuscar.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jBLimpiar.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel8.setText("Codigo:");

        jTCodigo.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(104, 104, 104)
                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTIdLector, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jBGuardar)
                                            .addGap(53, 53, 53)
                                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTIdEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBDevolucion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jDFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTIdEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTIdLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRBEstado)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
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
                JOptionPane.showMessageDialog(null, "Error, usted no ha seleccionado ningun Prestamo.");
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