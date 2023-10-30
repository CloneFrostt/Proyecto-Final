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
    private Libros lib = null;

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

        setBackground(new java.awt.Color(0, 102, 51));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   EJEMPLARES:");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Libro:");

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad :");

        jTextCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jTextCodigo.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jTextIdLibro.setBackground(new java.awt.Color(204, 204, 204));
        jTextIdLibro.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jCEstado.setBackground(new java.awt.Color(204, 204, 204));
        jCEstado.setEditable(true);
        jCEstado.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jCEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Disponible en Biblioteca", "Prestado", "Retraso", "Reparacion" }));

        jTextCantEj.setBackground(new java.awt.Color(204, 204, 204));
        jTextCantEj.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jBAgregar.setBackground(new java.awt.Color(102, 102, 102));
        jBAgregar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(102, 102, 102));
        jBModificar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(102, 102, 102));
        jBEliminar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(102, 102, 102));
        jBSalir.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscar.setBackground(new java.awt.Color(102, 102, 102));
        jBBuscar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        jBLimpiar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jTextCantEj, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextIdLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextCantEj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAgregar)
                        .addGap(23, 23, 23)
                        .addComponent(jBModificar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                jTextIdLibro.setText(ejeActual.getIdLibro().getIdLibro() + "");
                jCEstado.setSelectedItem(ejeActual.isEstado() );
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
           lib = ld.buscarLibroPorId(idLibro);
            String estado = (String) (jCEstado.getSelectedItem());
            int cantidad = Integer.parseInt(jTextCantEj.getText());
            ejeActual = ejeData.buscarEjemplarPorCodigo(codigo);
            if (ejeActual != null) {
               
                ejeActual.setCodigo(codigo);
                ejeActual.setIdLibro(lib);
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
            int codigo = Integer.parseInt(jTextCodigo.getText());
            ejeData.eliminarEjemplar(codigo);
            if (ejeActual != null) {
               
                JOptionPane.showMessageDialog(null, "Error, usted no ha seleccionado ningun ejemplar para eliminar.");
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
        jCEstado.setSelectedItem("Seleccionar");
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