package superx;
import javax.swing.*;
import java.awt.*;
public class main {

	public static void main(String[] args) {
	
				String personagem = JOptionPane.showInputDialog(null,
						"Digite um personagem do Dragon Ball");
				String nomeImagem = "";
				String Origem = "";
				switch(personagem) {
					case "Goku":
						Origem = "Planeta Sayajin";
						nomeImagem = "goku-icone";
						break;
					case "Piccolo":
						Origem = "Planeta Namekusejin";
						nomeImagem = "piccolo-icone";
						break;
					case "Vegeta":
						Origem = "Planeta Sayajin";
						nomeImagem = "vegeta-icone";
						break;
					case "Bulma":
						Origem = "Planeta Terra";
						nomeImagem = "bulma-icone";
						break;
					case "Kuririn":
						Origem = "Planeta Terra";
						nomeImagem = "kuririn-icone";
						break;
					default:
						Origem="Desconhecido";
						nomeImagem = "default";
				}		
				String caminhoImagem = String.format("src/imagem/%s.png", nomeImagem);
				ImageIcon icone = new ImageIcon(caminhoImagem);
				String informacoesPersonagem = String.format("Personagem: %s\nOrigem: %s",personagem,Origem);
				JOptionPane.showConfirmDialog(null,informacoesPersonagem,"Descrição",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,icone);
			}
		}


	