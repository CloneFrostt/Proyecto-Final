package BibliotecaView;
import Data.PrestamoData;
import Entidades.Lector;
import javax.swing.table.DefaultTableModel;

public class LectoresconPrestamo extends javax.swing.JInternalFrame {

    private PrestamoData pd = new PrestamoData();
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna) {        
            return false;
        }
    };
    private Lector L1=null;
    public LectoresconPrestamo() {
        initComponents();
        armarCabeceraYCargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRBVerTabla = new javax.swing.JRadioButton();
        jRBSalir = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("        Lista de Lectores que Pidieron un prestamo:");

        jScrollPane1.setBackground(new java.awt.Color(102, 0, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jRBVerTabla.setBackground(new java.awt.Color(102, 0, 102));
        jRBVerTabla.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jRBVerTabla.setForeground(new java.awt.Color(255, 255, 255));
        jRBVerTabla.setText("Ver Tabla");
        jRBVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBVerTablaActionPerformed(evt);
            }
        });

        jRBSalir.setBackground(new java.awt.Color(102, 0, 102));
        jRBSalir.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jRBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jRBSalir.setText("Salir");
        jRBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jRBVerTabla)
                        .addGap(100, 100, 100)
                        .addComponent(jRBSalir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBVerTabla)
                    .addComponent(jRBSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBVerTablaActionPerformed
       jRBSalir.setSelected(false);
          for (Lector L : pd.listaLectoresQuePidieronPrestamo()) {
            modelo.addRow(new Object[]{L.getNroSocio(), L.getNombre(), L.getDomicilio(), L.isEstado()});
        }
    }//GEN-LAST:event_jRBVerTablaActionPerformed

    private void jRBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSalirActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_jRBSalirActionPerformed
    private void armarCabeceraYCargar() {
        modelo.addColumn("Nro Socio");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBSalir;
    private javax.swing.JRadioButton jRBVerTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}