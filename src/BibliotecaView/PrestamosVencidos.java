package BibliotecaView;
import Data.PrestamoData;
import Entidades.Lector;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PrestamosVencidos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna) {        
            return false;
        }
    };
    private PrestamoData pd = new PrestamoData();
    private List<Lector> ListaLec;

    public PrestamosVencidos() {
        initComponents();
        armarCabecera();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDCFechaV = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrestVenc = new javax.swing.JTable();
        jBVerLista = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Lectores a los que se le vencio el prestamo:");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese la Fecha Actual: ");

        jTPrestVenc.setBackground(new java.awt.Color(0, 0, 0));
        jTPrestVenc.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        jTPrestVenc.setForeground(new java.awt.Color(255, 255, 255));
        jTPrestVenc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTPrestVenc);

        jBVerLista.setBackground(new java.awt.Color(0, 0, 0));
        jBVerLista.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jBVerLista.setForeground(new java.awt.Color(255, 255, 255));
        jBVerLista.setText("Ver Lista");
        jBVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerListaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDCFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBVerLista)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBVerLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDCFechaV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerListaActionPerformed
        java.util.Date fecha = jDCFechaV.getDate();
        LocalDate FechaVencimiento = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        ListaLec = pd.listaLectoresPrestamoVencido(FechaVencimiento);

        for (Lector l : ListaLec) {
            modelo.addRow(new Object[]{l.getNroSocio(), l.getNombre(), l.getDomicilio(), l.getMail()});

        } 
    }//GEN-LAST:event_jBVerListaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVerLista;
    private com.toedter.calendar.JDateChooser jDCFechaV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPrestVenc;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        modelo.addColumn("Nro Socio");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Mail");
        jTPrestVenc.setModel(modelo);
    }
}