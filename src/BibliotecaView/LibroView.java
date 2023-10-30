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

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion de Libros:");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISBN:");

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Título:");

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Autor:");

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año:");

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editorial:");

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");

        jREstado.setBackground(new java.awt.Color(0, 102, 102));

        jTextISBN.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jTextTitulo.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jTextAnio.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jTextAutor.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jTextTipo.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jTextEditorial.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N

        jBLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        jBLimpiar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(102, 102, 102));
        jBGuardar.setFont(new java.awt.Font("Viner Hand ITC", 0, 11)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(jTextTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jREstado)
                                    .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBGuardar)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jREstado))
                .addGap(32, 32, 32))
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
            
            if(isbn.length()!=13){
            JOptionPane.showMessageDialog(this, "El ISBN debe contener 13 caracteres");
            return;
            }
            if (!isbn.matches("\\d{13}")) {
            JOptionPane.showMessageDialog(this,"El ISBN no debe contener letras.");
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