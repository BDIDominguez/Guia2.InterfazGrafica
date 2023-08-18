
package guia2.interfazgrafica;

import static guia2.interfazgrafica.DeTodoSA.productos;
import javax.swing.table.DefaultTableModel;


public class ConsultaPorNombre extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ConsultaPorNombre() {
        initComponents();
        configurarTable();
        cargarProductos();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxArticulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbArticulos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Listado por Nombre");

        jLabel2.setText("Escriba los primeros caracteres");

        jtxArticulo.setText("Articulo Buscado");
        jtxArticulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxArticuloFocusGained(evt);
            }
        });
        jtxArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxArticuloActionPerformed(evt);
            }
        });
        jtxArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxArticuloKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxArticuloKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxArticuloKeyTyped(evt);
            }
        });

        jtbArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbArticulos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtbArticulosFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtbArticulos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jtxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbArticulosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtbArticulosFocusGained
        jtxArticulo.requestFocus();
    }//GEN-LAST:event_jtbArticulosFocusGained

    private void jtxArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxArticuloKeyTyped
       //filtrarTabla();
    }//GEN-LAST:event_jtxArticuloKeyTyped

    private void jtxArticuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxArticuloKeyPressed
       //filtrarTabla();
    }//GEN-LAST:event_jtxArticuloKeyPressed

    private void jtxArticuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxArticuloFocusGained
        jtxArticulo.selectAll();
    }//GEN-LAST:event_jtxArticuloFocusGained

    private void jtxArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxArticuloActionPerformed
        
    }//GEN-LAST:event_jtxArticuloActionPerformed

    private void jtxArticuloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxArticuloKeyReleased
        filtrarTabla();
    }//GEN-LAST:event_jtxArticuloKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbArticulos;
    private javax.swing.JTextField jtxArticulo;
    // End of variables declaration//GEN-END:variables
    private void configurarTable(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtbArticulos.setModel(modelo);
    }
    private void cargarProductos(){
        modelo.setRowCount(0); // Borra todas las filas
        for (Articulos producto : productos) {
            modelo.addRow(new Object[]{
                producto.getCodigo() + "",
                producto.getDescripcion(),
                producto.getPrecio() + "",
                producto.getStock() + ""});
        }
    }
    private void filtrarTabla(){
        modelo.setRowCount(0); // Borra todas las filas
        for (Articulos producto : productos) {
            if ( producto.getDescripcion().toLowerCase().startsWith(jtxArticulo.getText().toLowerCase())  ){
                modelo.addRow(new Object[]{
                producto.getCodigo() + "",
                producto.getDescripcion(),
                producto.getPrecio() + "",
                producto.getStock() + ""});
            }
        } 
    }
    
}
