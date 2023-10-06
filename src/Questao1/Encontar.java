package Questao1;

import Questao1.AchadoPerdido;

public class Encontar {
    public static void main(String[] args) {
        Usuario usuario01 = new Usuario("Gustavo","gustavofernandes@gmail.com","123456789");

        AchadoPerdido Blusa = new AchadoPerdido("A","b","C","d","E","F","G");

        Blusa.buscarTitulo();
        Blusa.vizualizarDetalhes();
    }
}
