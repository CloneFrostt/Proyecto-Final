package BibliotecaView;
import javax.swing.JOptionPane;
import Data.EjemplarData;
import Data.LibroData;
import Entidades.Ejemplar;
import Entidades.Libros;

public class EjemplarView extends javax.swing.JInternalFrame {

    private EjemplarData ejeData = new EjemplarData();
    private Ejemplar ejeActual = null;
    private LibroData ld =new LibroData();

    public EjemplarView() {
        initComponents();
        ejeData = new EjemplarData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jTextIdLibro = new javax.swing.JTextField();
        jCEstado = new javax.swing.JComboBox<>();
        jTextCantEj = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        jLabel1.setText("Ejemplares");

        jLabel2.setText("Codigo:");

        jLabel3.setText("ID Libro:");

        jLabel4.setText("Estado:");

        jLabel5.setText("Cantidad Ej.:");

        jCEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Prestado", "Retraso", "Reparacion", "Disponible en Biblioteca", " ", " " }));

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextCantEj))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(jTextIdLibro)
                                    .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jBAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jBSalir)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jBLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCantEj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        try {
            int codigo = Integer.parseInt(jTextCodigo.getText());
            int idLibro = Integer.parseInt(jTextIdLibro.getText());
            Libros L = ld.buscarLibroPorId(idLibro);
            String estado = (jCEstado.getSelectedItem().toString());
            int cantidad = Integer.parseInt(jTextCantEj.getText());

            if (ejeActual == null) {
                ejeActual = new Ejemplar(codigo,L, estado, cantidad);
                ejeData.cargarEjemplar(ejeActual);
            } else {
                ejeActual.setCodigo(codigo);
                ejeActual.setIdLibro(L);
                ejeActual.setEstado(estado);
                ejeActual.setCantidad(cantidad);
                ejeData.cargarEjemplar(ejeActual);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un Codigo valido");

        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            int codigo = Integer.parseInt(jTextCodigo.getText());
            ejeActual = ejeData.buscarEjemplarPorCodigo(codigo);
            if (ejeActual != null) {
                jTextIdLibro.setText(ejeActual.getIdLibro() + "");
                jCEstado.setSelectedItem(ejeActual.isEstado() + "");
                jTextCantEj.setText(ejeActual.getCantidad() + "");
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numro");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        try {

            int codigo = Integer.parseInt(jTextCodigo.getText());
            int idLibro = Integer.parseInt(jTextIdLibro.getText());
              Libros L = ld.buscarLibroPorId(idLibro);
            String estado = (jCEstado.getSelectedItem().toString());
            int cantidad = Integer.parseInt(jTextCantEj.getText());

            if (ejeActual == null) {
                ejeActual = new Ejemplar(codigo, L, estado, cantidad);
                ejeData.modificarEjemplar(ejeActual);
            } else {
                ejeActual.setCodigo(codigo);
                ejeActual.setIdLibro(L);
                ejeActual.setEstado(estado);
                ejeActual.setCantidad(cantidad);
                ejeData.modificarEjemplar(ejeActual);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un Codigo valido");

        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            if (ejeActual != null) {
                ejeData.eliminarEjemplar(ejeActual.getIdEjemplar());
            } else {
                JOptionPane.showMessageDialog(null, "Error, usted no ha seleccionado ningun ejemplar.");
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numero");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        limpiarCampos();
        ejeActual = null;
    }

    private void limpiarCampos() {
        jTextCodigo.setText("");
        jTextIdLibro.setText("");
        jTextCantEj.setText("");
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextCantEj;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextIdLibro;
    // End of variables declaration//GEN-END:variables
}