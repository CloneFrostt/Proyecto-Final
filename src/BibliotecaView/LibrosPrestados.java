package BibliotecaView;
import Data.PrestamoData;
import Entidades.Libros;
import Entidades.Prestamo;
import javax.swing.table.DefaultTableModel;

public class LibrosPrestados extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo = new DefaultTableModel();
private PrestamoData pd = new PrestamoData();
private Prestamo prestamoActual = null;
   
public LibrosPrestados() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLibPrest = new javax.swing.JTable();
        jBVerLista = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Libros que Fueron Prestados:");

        jTLibPrest.setBackground(new java.awt.Color(102, 102, 102));
        jTLibPrest.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTLibPrest.setForeground(new java.awt.Color(255, 255, 255));
        jTLibPrest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTLibPrest);

        jBVerLista.setBackground(new java.awt.Color(102, 102, 102));
        jBVerLista.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBVerLista.setForeground(new java.awt.Color(255, 255, 255));
        jBVerLista.setText("Ver Lista");
        jBVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerListaActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(102, 102, 102));
        jBSalir.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jBVerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVerLista)
                    .addComponent(jBSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
     this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerListaActionPerformed
for(Libros lib:pd.listaLibrosPrestados()){
                modelo.addRow(new Object[]{lib.getIsbn(),lib.getTitulo(),lib.getAnio(),lib.getTipo(),lib.getEditorial()});
        }     
    }//GEN-LAST:event_jBVerListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVerLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTLibPrest;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modelo.addColumn("ISBN");
        modelo.addColumn("Titulo");
        modelo.addColumn("Año");
        modelo.addColumn("Tipo");
        modelo.addColumn("Editorial");
        jTLibPrest.setModel(modelo);

    }
}