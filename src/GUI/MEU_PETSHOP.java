
package GUI;
import DAO.AnimaisDAO;
import Javabeam.Animais;
import Javabeam.Cachorro;
import Javabeam.Coruja;
import Javabeam.Furao;
import Javabeam.Gato;
import Javabeam.Hamster;
import Javabeam.Peixe;
import javax.swing.JOptionPane;
public class MEU_PETSHOP extends javax.swing.JFrame {

    /**
     * Creates new form MEU_PETSHOP
     */
    public MEU_PETSHOP() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();
        txtNome = new javax.swing.JTextField();
        txtRaca = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovo.setText("Novo");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Raca");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("Cadastro dos Animais");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Cor");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Preco");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Idade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCor, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(txtRaca)
                            .addComponent(txtIdade)
                            .addComponent(txtPreco))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCor, txtIdade, txtNome, txtPreco, txtRaca});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLimpar, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLimpar, btnNovo, btnSalvar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCor, txtIdade, txtNome, txtPreco, txtRaca});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        
        //Guardando os objetos em Animais///////
       Animais animais = new Animais();
        animais.setNome(txtNome.getText());
        animais.setCor(txtCor.getText());
        animais.setIdade(txtIdade.getText());
        animais.setPreco(txtPreco.getText());
        animais.setRaca(txtRaca.getText());
        
        //criar um tipo objeto do tipo AnimaisDAO
        
        AnimaisDAO animaisdao = new AnimaisDAO();
        animaisdao.cadastrarAnimal(animais);
        JOptionPane.showMessageDialog(null, "Cadastra de Animal feito com Sucesso");
        
        
        //Criando um objeto para cada classe//
        
        Cachorro ca =  new Cachorro();
        
        ca.setCor(txtCor.getText());
        ca.setNome(txtNome.getText());
        ca.setIdade(txtIdade.getText());
        ca.setPreco(txtPreco.getText());
        ca.setRaca(txtRaca.getText());
        
        //Lipar
        txtNome.setText("");
        txtRaca.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtPreco.setText("");

        //Cadastrando gato//
        Gato ga =  new Gato();
        
        ga.setCor(txtCor.getText());
        ga.setNome(txtNome.getText());
        ga.setIdade(txtIdade.getText());
        ga.setPreco(txtPreco.getText());
        ga.setRaca(txtRaca.getText());
        
        //Limpando
        txtNome.setText("");
        txtRaca.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtPreco.setText("");
        
        
        //Cadastrando Coruja
        
        Coruja co = new Coruja();
        
        co.setCor(txtCor.getText());
        co.setNome(txtNome.getText());
        co.setIdade(txtIdade.getText());
        co.setPreco(txtPreco.getText());
        co.setRaca(txtRaca.getText());
        
        
        //Limpando
        txtNome.setText("");
        txtRaca.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtPreco.setText("");
        
        //Cadastrando Hamster
        
        Hamster ha = new Hamster();
        
        ha.setCor(txtCor.getText());
        ha.setNome(txtNome.getText());
        ha.setIdade(txtIdade.getText());
        ha.setPreco(txtPreco.getText());
        ha.setRaca(txtRaca.getText());
        
        //Limpando
        
        txtNome.setText("");
        txtRaca.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtPreco.setText("");
        
        //Cadastrando peixe
        
        Peixe pe = new Peixe();
        
        pe.setCor(txtCor.getText());
        pe.setNome(txtNome.getText());
        pe.setIdade(txtIdade.getText());
        pe.setPreco(txtPreco.getText());
        pe.setRaca(txtRaca.getText());
        
        //Limpando
        txtNome.setText("");
        txtRaca.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtPreco.setText("");
        
        
        //Cadastrndo furao
        Furao fu = new Furao();
        
        fu.setCor(txtCor.getText());
        fu.setNome(txtNome.getText());
        fu.setIdade(txtIdade.getText());
        fu.setPreco(txtPreco.getText());
        fu.setRaca(txtRaca.getText());
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtRaca.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtPreco.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MEU_PETSHOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
