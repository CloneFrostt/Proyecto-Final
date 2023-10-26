package BibliotecaView;
import Data.LectorData;
import Entidades.Lector;
import javax.swing.JOptionPane;

public class LectorView extends javax.swing.JInternalFrame {
private LectorData ld = new LectorData();
private Lector lectorActual=null;
   
    public LectorView() {
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
        jTxtNroSocio = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextDomicilio = new javax.swing.JTextField();
        jTextMail = new javax.swing.JTextField();
        jRbuttonEstado = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLabel1.setText("Socio");

        jLabel2.setText("Nro Socio:");

        jLabel3.setText("Nombre Y Apellido:");

        jLabel4.setText("Domicilio:");

        jLabel5.setText("Mail:");

        jLabel6.setText("Estado");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(jRbuttonEstado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre)
                                    .addComponent(jTextDomicilio)
                                    .addComponent(jTextMail)
                                    .addComponent(jTxtNroSocio))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jBLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jBGuardar)
                .addGap(18, 18, 18)
                .addComponent(jBEliminar)
                .addGap(18, 18, 18)
                .addComponent(jBSalir)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtNroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRbuttonEstado))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed

    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
       try {
        int NroSocio = Integer.parseInt(jTxtNroSocio.getText());
        lectorActual= ld.bucarLectorPorNroSocio(NroSocio);
        if(lectorActual!=null){
           jTextNombre.setText(lectorActual.getNombre());
           jTextDomicilio.setText(lectorActual.getDomicilio());
           jTextMail.setText(lectorActual.getMail());
           jRbuttonEstado.setSelected(lectorActual.isEstado());
        }
         } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numero de socio valido");
    }                                        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
        lectorActual=null;
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       try {
        int NroSocio = Integer.parseInt(jTxtNroSocio.getText());
       String Nombre = jTextNombre.getText();
       String Domicilio = jTextDomicilio.getText();
       String mail = jTextMail.getText();
       if (Nombre.isEmpty() || Domicilio.isEmpty() || mail.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deben quedar campos vacios.");
                return;
            }
       Boolean Estado = jRbuttonEstado.isSelected();
       if(lectorActual == null){
           lectorActual= new Lector(NroSocio, Nombre, Domicilio, mail, Estado);
           ld.CargarLector(lectorActual);
       }else{
           lectorActual.setNroSocio(NroSocio);
           lectorActual.setNombre(Nombre);
           lectorActual.setDomicilio(Domicilio);
           lectorActual.setMail(mail);
           lectorActual.setEstado(Estado);
           ld.modificarLector(lectorActual);
       }
       
         } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numero de socio valido");
    }                       
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
           try {
               if(lectorActual != null){                  
                   ld.eliminarLector(lectorActual.getIdLector());
                   lectorActual = null;
                   limpiarCampos();
               }else {
                   JOptionPane.showMessageDialog(null, "Error, usted no ha seleccionado a ningun Lector.");
               }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso un numero de socio valido");
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
    private javax.swing.JRadioButton jRbuttonEstado;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTxtNroSocio;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
        jTxtNroSocio.setText("");
        jTextNombre.setText("");
        jTextDomicilio.setText("");
        jTextMail.setText("");
        jRbuttonEstado.setSelected(false);
    }
}