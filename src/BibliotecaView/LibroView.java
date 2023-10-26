package BibliotecaView;
import Data.LibroData;
import Entidades.Libros;
import javax.swing.JOptionPane;

public class LibroView extends javax.swing.JInternalFrame {
private LibroData ld = new LibroData();
private Libros libroActual = null;

    public LibroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jREstado = new javax.swing.JRadioButton();
        jTextISBN = new javax.swing.JTextField();
        jTextTitulo = new javax.swing.JTextField();
        jTextAnio = new javax.swing.JTextField();
        jTextAutor = new javax.swing.JTextField();
        jTextTipo = new javax.swing.JTextField();
        jTextEditorial = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();

        jLabel1.setText("Libros");

        jLabel2.setText("ISBN:");

        jLabel3.setText("Título:");

        jLabel4.setText("Autor:");

        jLabel5.setText("Año:");

        jLabel6.setText("Tipo:");

        jLabel7.setText("Editorial:");

        jLabel8.setText("Estado:");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(37, 37, 37)
                        .addComponent(jREstado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextISBN)
                            .addComponent(jTextTitulo)
                            .addComponent(jTextAnio)
                            .addComponent(jTextAutor)
                            .addComponent(jTextTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jBGuardar)
                .addGap(18, 18, 18)
                .addComponent(jBEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jREstado)))
                    .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            String isbn = jTextISBN.getText();
            libroActual = ld.buscarLibroPorIsbn(isbn);
            if (libroActual != null) {
                jTextTitulo.setText(libroActual.getTitulo());
                jTextAutor.setText(libroActual.getAutor());
                jTextAnio.setText(libroActual.getAnio() + "");
                jTextTipo.setText(libroActual.getTipo());
                jTextEditorial.setText(libroActual.getEditorial());
                jREstado.setSelected(libroActual.isEstado());
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numero valido");
        }        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
        libroActual = null;
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            
            String isbn = jTextISBN.getText();
            if (!isbn.matches("\\d{13}")) {
            JOptionPane.showMessageDialog(this,"No debe contener letras.");
            return;          
}
            if(isbn.length()!=13){
            JOptionPane.showMessageDialog(this, "El ISBN debe contener 13 caracteres");
            return;
            }
            
            String titulo = jTextTitulo.getText();
            String autor = jTextAutor.getText();
            int anio = Integer.parseInt(jTextAnio.getText());
            String tipo = jTextTipo.getText();
            String editorial = jTextEditorial.getText();
            if (isbn.isEmpty() || titulo.isEmpty() || autor.isEmpty() || tipo.isEmpty() || editorial.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deben quedar campos vacios.");
                return;
            }
            boolean estado = jREstado.isSelected();
            if (libroActual == null) {
                libroActual = new Libros(isbn, titulo, autor, anio, tipo, editorial, estado);
                ld.cargarLibro(libroActual);
            } else {
                libroActual.setIsbn(isbn);
                libroActual.setTitulo(titulo);
                libroActual.setAutor(autor);
                libroActual.setAnio(anio);
                libroActual.setTipo(tipo);
                libroActual.setEditorial(editorial);
                libroActual.setEstado(estado);
                ld.modificarLibro(libroActual);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numero valido");
        }        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
         try {
               if(libroActual!= null){                  
                 ld.eliminarLibro(libroActual.getIdLibro());
                  libroActual= null;
                   limpiarCampos();
               }else {
                   JOptionPane.showMessageDialog(null, "Error, usted no ha seleccionado  ningun libro.");
               }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numero valido");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTextAnio;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextEditorial;
    private javax.swing.JTextField jTextISBN;
    private javax.swing.JTextField jTextTipo;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
        jTextISBN.setText("");
        jTextTitulo.setText("");
         jTextAutor.setText("");
         jTextAnio.setText("");
         jTextTipo.setText("");
         jTextEditorial.setText("");
         jREstado.setSelected(false);
    }

}