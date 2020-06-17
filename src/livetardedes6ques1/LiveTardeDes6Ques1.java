package livetardedes6ques1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveTardeDes6Ques1 {

    /**
     * Em um laboratório usam-se dois tipos de cobaias: ratos e coelhos. O
     * código para ratos é 1 e para coelhos, 2. Foram feitas 15 experiências,
     * nas quais foram utilizados um dos tipos de cobaias. Faça um algoritmo que
     * leia, para cada uma das experiências, o código da cobaia utilizada e a
     * quantidade de cobaias. Deseja-se saber: o total de cobaias utilizadas, o
     * total de ratos, o total de coelhos e o percentual de cada cobaia.
     */
    public static void main(String[] args) {
        //for - while() - do while()

        int cont, cod, quant, acRato, acCoelho;
        acRato = 0;
        acCoelho = 0;
        for (cont = 1; cont <= 2; cont++) {
            cod = Integer.parseInt(JOptionPane.showInputDialog("Escolha\n"
                    + "1 - Ratos\n"
                    + "2 - Coelhos\n"
                    + "Digite:"));
            if (cod == 1) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos Ratos?"));
                acRato = acRato + quant;
            } else if (cod == 2) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos Coelhos?"));
                acCoelho = acCoelho + quant;
            } else {
                JOptionPane.showMessageDialog(null, "Código Inválido, apenas 1 ou 2 "
                        + "- Tente novamente");
                cont--;
            }
        }//fim do loop
        DecimalFormat f = new DecimalFormat("0.0");
        JOptionPane.showMessageDialog(null,"Resultados do dia\n"
            + "-----------------------------------\n"
            + "\nEm "+(cont-1)+" experiências\n"
            + " foram usados "+acRato+" Ratos e "+acCoelho+" Coelhos"
            + " num total de "+(acCoelho+acRato)+" cobaias (ratos e coelhos)\n"
            + "Percentuais:\nRatos "+f.format((acRato/(double)(acRato+acCoelho)*100))+"% - "
            + "Coelhos "+f.format((acCoelho/(double)(acRato+acCoelho)*100))+"%"
            ,"Laboratório Vá com Deus",JOptionPane.ERROR_MESSAGE);
    }

}
