package co.unicauca.hyunseda.admin.presentation;

import co.unicauca.hyunseda.admin.domain.entities.Category;
import co.unicauca.hyunseda.admin.domain.entities.Product;
import co.unicauca.hyunseda.admin.domain.services.CategoryService;
import co.unicauca.hyunseda.admin.domain.services.ProductService;
import co.unicauca.hyunseda.admin.infra.Utilities;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class GUIAdminMenu extends javax.swing.JFrame {

    private final List <Category> categoriesSelected;
    
    private boolean addOption;
    
    /**
     * Creates new form GUIProducts
     * @param authToken token de autorizacion
     */
    public GUIAdminMenu(String authToken) {
        initComponents();
        this.setLocationRelativeTo(null);
        CategoryService.getCategoryService(authToken);
        ProductService.getProductService(authToken);
        this.categoriesSelected = new ArrayList<>();
        
        cbxFeatures.setModel(getCategoriesModel());
        stateInitial();
    }
    
    private DefaultComboBoxModel<String> getCategoriesModel()
    {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Category c: CategoryService.getCategoryService().getCategories())
        {
            model.addElement(c.toString());
        }
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSouth = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lbCategory = new javax.swing.JLabel();
        cbxFeatures = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblLink = new javax.swing.JLabel();
        txtLink = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");

        pnlSouth.setBackground(new java.awt.Color(102, 102, 102));
        pnlSouth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/agregar.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlSouth.add(btnNuevo);

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnEditar);

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ojo.png"))); // NOI18N
        btnSave.setText("Grabar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlSouth.add(btnSave);

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cruz.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnCancelar);

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnEliminar);

        btnFind.setBackground(new java.awt.Color(204, 204, 204));
        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/busqueda.png"))); // NOI18N
        btnFind.setText("Buscar");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        pnlSouth.add(btnFind);

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/logout_1828427.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnCerrar);

        getContentPane().add(pnlSouth, java.awt.BorderLayout.SOUTH);

        pnlCenter.setBackground(new java.awt.Color(102, 102, 102));
        pnlCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCenter.setLayout(new java.awt.GridLayout(7, 2));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("*Id:  ");
        pnlCenter.add(jLabel1);

        txtId.setBackground(new java.awt.Color(153, 153, 153));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setName(""); // NOI18N
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        pnlCenter.add(txtId);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("*Nombre:  ");
        pnlCenter.add(jLabel2);

        txtName.setBackground(new java.awt.Color(153, 153, 153));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setName(""); // NOI18N
        pnlCenter.add(txtName);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripción:  ");
        pnlCenter.add(jLabel3);

        txtDescription.setBackground(new java.awt.Color(153, 153, 153));
        txtDescription.setColumns(20);
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        pnlCenter.add(jScrollPane1);

        lbCategory.setForeground(new java.awt.Color(255, 255, 255));
        lbCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCategory.setText("Categorias:  ");
        pnlCenter.add(lbCategory);

        cbxFeatures.setBackground(new java.awt.Color(153, 153, 153));
        cbxFeatures.setForeground(new java.awt.Color(255, 255, 255));
        cbxFeatures.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "item2" }));
        cbxFeatures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFeaturesActionPerformed(evt);
            }
        });
        pnlCenter.add(cbxFeatures);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Precio:  ");
        pnlCenter.add(jLabel5);

        txtPrice.setBackground(new java.awt.Color(153, 153, 153));
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        pnlCenter.add(txtPrice);

        lblLink.setForeground(new java.awt.Color(255, 255, 255));
        lblLink.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLink.setText("Link de Imagen:  ");
        pnlCenter.add(lblLink);

        txtLink.setBackground(new java.awt.Color(153, 153, 153));
        txtLink.setForeground(new java.awt.Color(255, 255, 255));
        pnlCenter.add(txtLink);

        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Stock:  ");
        pnlCenter.add(jLabel4);

        txtStock.setBackground(new java.awt.Color(153, 153, 153));
        pnlCenter.add(txtStock);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        stateNew();
        txtName.requestFocus();
        addOption = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        stateInitial();
        cleanControls();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        GUILogin login = new GUILogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtName.getText().trim().equals("")) {
            Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
            txtName.requestFocus();
            return;
        }
        //se asume que la clase ya ha sido inicaializada, por lo que solo hay que verificar si esta vacia
        if (categoriesSelected.isEmpty())
        {
            Messages.showMessageDialog("Aun no ha seleccionado la categoria del producto", "Atención");
            return;
        }
        try 
        {
            if (Double.parseDouble(txtPrice.getText()) < 0)
            {
                Messages.showMessageDialog("El precio del producto no puede ser negativo", "Atención");
                return;
            }
        } catch (NumberFormatException e)
        {
            Messages.showMessageDialog("El precio solo debe contener numeros (no se recomienda el uso de ',' para valores )", "Atención");
            return;
        }
        if (txtLink.getText().trim().equals("")) {
            Messages.showMessageDialog("Debe ingresar un link de la imagen", "Atención");
            txtLink.requestFocus();
        } else if(Utilities.loadImageFromCloud(txtLink.getText()) == null)
        {
            Messages.showMessageDialog("El link no permite cagar una imagen", "Atención");
            txtLink.requestFocus();
        }
        try 
        {
            if (Integer.parseInt(txtStock.getText()) < 0)
            {
                Messages.showMessageDialog("La cantidad de producto en stock no puede ser negativo", "Atención");
                return;
            }
        } catch (NumberFormatException e)
        {
            Messages.showMessageDialog("la cantidad de producto debe contener numeros (no se recomienda el uso de ',' para valores )", "Atención");
            return;
        }
        if(addOption){
            addProduct();
            cleanControls();
        }
        else if(!addOption){
            editProduct();
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        addOption = false;
        stateEdit();
        txtId.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtId.getText().trim().equals("")) {
            Messages.showMessageDialog("Debe buscar el producto a eliminar", "Atención");
            txtId.requestFocus();
            return;
        }
        //Long productId = Long.parseLong(id);
        if (Messages.showConfirmDialog("Está seguro que desea eliminar este producto?", "Confirmación") == JOptionPane.YES_NO_OPTION) {
            if (ProductService.getProductService().deleteProduct(txtId.getText().trim())) {
                Messages.showMessageDialog("Producto eliminado con éxito", "Atención");
                stateInitial();
                cleanControls();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        GUIAdminSearch instance = new GUIAdminSearch(this, true, ProductService.getProductService());
        instance.setVisible(true);
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
        if (txtId.getText().trim().equals("")) {
            return;
        }
        //Long productId = Long.parseLong(txtId.getText());
        Product prod = ProductService.getProductService().getProductById(txtId.getText());
        if (prod == null) {
            Messages.showMessageDialog("El identificador del producto no existe", "Error");
            txtId.setText("");
            txtId.requestFocus();
        } else {
            txtName.setText(prod.getName());
            txtDescription.setText(prod.getDescription());
            
            
            lbCategory.setText("Categorias:" + " " + categoriesSelected.toString());
            
            txtPrice.setText(Double.toString(prod.getPrice()));
            txtLink.setText(prod.getImageLink());
            txtStock.setText(Integer.toString(prod.getAmount()));
        }
    }//GEN-LAST:event_txtIdFocusLost

    private void cbxFeaturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFeaturesActionPerformed
        System.out.println("co.unicauca.hyunseda.admin.presentation.GUIAdminMenu.cbxFeaturesActionPerformed()" + cbxFeatures.getSelectedItem().toString());
        if (categoriesSelected.isEmpty())
        {
            System.out.println("co.unicauca.hyunseda.admin.presentation.GUIAdminMenu.cbxFeaturesActionPerformed()" + cbxFeatures.getSelectedItem().toString());
            categoriesSelected.add(CategoryService.getCategoryService().getCategoryByName(cbxFeatures.getSelectedItem().toString()));
            lbCategory.setText("Categorias" + " " + categoriesSelected.toString());
            return;
        }
        
        for (Category c : categoriesSelected)
        {
            if (cbxFeatures.getSelectedItem().toString().compareTo(c.toString()) == 0)
            {
                //System.out.println("Removiendo: " + c.toString());
                categoriesSelected.remove(c);
                lbCategory.setText("Categorias" + " " + categoriesSelected.toString());
                return;
            }
        }
        
        categoriesSelected.add(CategoryService.getCategoryService().getCategoryByName(cbxFeatures.getSelectedItem().toString()));
        lbCategory.setText("Categorias" + " " + categoriesSelected.toString());
    }//GEN-LAST:event_cbxFeaturesActionPerformed
    
    private void stateEdit() {
        btnNuevo.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(true);
        btnCancelar.setVisible(true);
        btnCerrar.setVisible(false);
        btnSave.setVisible(true);
        btnFind.setVisible(false);
        txtId.setEnabled(true);
        txtName.setEnabled(true);
        txtDescription.setEnabled(true);
        cbxFeatures.setEnabled(true);
        txtPrice.setEnabled(true);
        txtLink.setEnabled(true);
        txtStock.setEnabled(true);
    }

    private void stateInitial() {
        btnNuevo.setVisible(true);
        btnEditar.setVisible(true);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(false);
        btnCerrar.setVisible(true);
        btnSave.setVisible(false);
        btnFind.setVisible(true);
        txtId.setEnabled(false);
        txtName.setEnabled(false);
        txtDescription.setEnabled(false);
        cbxFeatures.setEnabled(false);
        txtPrice.setEnabled(false);
        txtLink.setEnabled(false);
        txtStock.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxFeatures;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCategory;
    private javax.swing.JLabel lblLink;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    private void stateNew() {
        btnNuevo.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(true);
        btnCerrar.setVisible(false);
        btnSave.setVisible(true);
        btnFind.setVisible(false);
        txtId.setEnabled(false);
        txtName.setEnabled(true);
        txtDescription.setEnabled(true);
        cbxFeatures.setEnabled(true);
        txtPrice.setEnabled(true);
        txtLink.setEnabled(true);
        txtStock.setEnabled(true);
    }

    private void cleanControls() {
        txtId.setText("");
        txtName.setText("");
        txtDescription.setText("");
        lbCategory.setText("Categorias:");
        txtPrice.setText("");
        txtLink.setText("");
        txtStock.setText("");
    }

    private void addProduct() {
        String name = txtName.getText().trim();
        String description = txtDescription.getText().trim();
        int amount = Integer.parseInt(txtStock.getText());
        double price = Double.parseDouble(txtPrice.getText());
        String strLink = txtLink.getText();
        
        Product newProduct = new Product(0L, name, description, price, amount, categoriesSelected, strLink);
//        Product newProduct = new Product();
//        newProduct.setName(name);
//        newProduct.setDescription(description);
//        newProduct.setCategories(categoriesSelected);
//        newProduct.setPrice(price);
//        newProduct.setImageLink(strLink);
        
        //System.out.println("value: " + categoriesSelected.get(0).getName() + "  and  " + categoriesSelected.get(0).getCategoryId());
       // if (productService.saveProduct(name, description)) {
       ///////De momento solo se inserta el primero, pero se deberia de pasar el arreglo de categorias del producto declarado en las variables globales de la clase
        if (ProductService.getProductService().postProduct(newProduct)){
            Messages.showMessageDialog("Se grabó con éxito", "Atención");
            cleanControls();
            stateInitial();
        } else {
            Messages.showMessageDialog("Error al grabar, lo siento mucho", "Atención");
        }
    }

    private void editProduct() {
        String id = txtId.getText().trim();
        String name = txtName.getText().trim();
        String description = txtDescription.getText().trim();
        int amount = Integer.parseInt(txtStock.getText());
        double price = Double.parseDouble(txtPrice.getText());
        String strLink = txtLink.getText();
        
        
        if (id.equals("")) {
            Messages.showMessageDialog("Debe buscar el producto a editar", "Atención");
            txtId.requestFocus();
            return;
        }
        
        Long productId = Long.valueOf(id);
        Product newProduct = new Product(productId, name, description, price,amount, categoriesSelected, strLink);

        if (ProductService.getProductService().putProduct(newProduct, id)) {
            Messages.showMessageDialog("Se editó con éxito", "Atención");
            cleanControls();
            stateInitial();
        } else {
            Messages.showMessageDialog("Error al editar, lo siento mucho", "Atención");
        }
    }
}