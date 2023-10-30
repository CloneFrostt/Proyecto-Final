package BibliotecaView;
import Data.PrestamoData;
import Entidades.Libros;
import Entidades.Prestamo;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;

public class PrestamosEnFechaDet extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna) {        
            return false;
        }
    };
    private PrestamoData pd = new PrestamoData();
    private Prestamo prestamoActual = null;

    public PrestamosEnFechaDet() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jBVerLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLibPresFecDet = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Libros prestados en una Fecha Determinada:");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese una Fecha: ");

        jBVerLista.setBackground(new java.awt.Color(0, 0, 0));
        jBVerLista.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBVerLista.setForeground(new java.awt.Color(255, 255, 255));
        jBVerLista.setText("Ver Lista");
        jBVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerListaActionPerformed(evt);
            }
        });

        jTLibPresFecDet.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTLibPresFecDet);

        jBSalir.setBackground(new java.awt.Color(0, 0, 0));
        jBSalir.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBVerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDCFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBVerLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerListaActionPerformed
       java.util.Date fecha = jDCFecha.getDate();
            LocalDate Fecha = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         
        for (Libros lib : pd.listaLibrosPrestadosEnFechaDet(Fecha)) {

            modelo.addRow(new Object[]{lib.getIsbn(), lib.getTitulo(), lib.getAnio(), lib.getTipo(), lib.getEditorial()});
    }//GEN-LAST:event_jBVerListaActionPerformed
    }
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVerLista;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTLibPresFecDet;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
modelo.addColumn("ISBN");
modelo.addColumn("Titulo");
modelo.addColumn("Año");
modelo.addColumn("Tipo");
modelo.addColumn("Editorial");
jTLibPresFecDet.setModel(modelo);

    }
}