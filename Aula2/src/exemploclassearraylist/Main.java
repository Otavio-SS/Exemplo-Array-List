package exemploclassearraylist;

import javax.swing.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa p1;
        Empresa emp1 = new Empresa("123","ABC SUPERMERCADOS");
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1>Cadastrar\n<2>Visualizar\n<3>Excluir\n<4>Sair"));
            switch (opcao){
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
                    String cpf = JOptionPane.showInputDialog("Digite o CPF");
                    p1 = new Pessoa(nome, idade, cpf);
                    pessoas.add(p1);
                    emp1.adicionaFuncionario(p1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,emp1.mostraFuncionario(),
                            "Pessoas",JOptionPane.DEFAULT_OPTION);
                    //int i = 0;
                    //for (Pessoa contato: pessoas){
                      //  JOptionPane.showMessageDialog(null,i+" "+contato.getNome()+ " "+contato.getCpf()+" "
                        //        +contato.getIdade(),"Pessoas",JOptionPane.DEFAULT_OPTION);
                        //i++;
                    //}
                    break;
                case 3:
                    String buscar = JOptionPane.showInputDialog("Nome para Excluir");
                    int j;
                    for (j=0; j<pessoas.size();j++){
                        if (pessoas.get(j).getNome().equals(buscar));{
                            pessoas.remove(j);
                            JOptionPane.showMessageDialog(null,"Removido com sucesso",
                                    "Pessoas",JOptionPane.DEFAULT_OPTION);
                        }
                    }
            }
        } while (opcao!=4);
    }
}