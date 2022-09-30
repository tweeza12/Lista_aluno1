package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {





        org.example.pokemons pokemon1 =  new org.example.pokemons(2022456,  " ARMANDO CARLOS COSTA FERREIRA FILHO",  10);
        org.example.pokemons pokemon2 = new org.example.pokemons( 2022567,  " BRUNO CEZAR NEVES DIAS MAIA",  10);
        org.example.pokemons pokemon3 = new org.example.pokemons( 2022458,  " ANTONIO SERRAO TAVARES JUNIOR",  10);
        org.example.pokemons pokemon4 = new org.example.pokemons( 2022421,  " RAPHAEL NICOLAS CARNEIRO SOUZA\n",  10);
        org.example.pokemons pokemon5 = new org.example.pokemons( 2022345,  " JOSILDO RIBEIRO BRASIL JUNIOR",  10);
        org.example.pokemons pokemon6 = new org.example.pokemons( 2022456,  " ARMANDO CARLOS COSTA FERREIRA FILHO",  10);
        org.example.pokemons pokemon7 = new org.example.pokemons( 2022567,  " BRUNO CEZAR NEVES DIAS MAIA",  10);
        org.example.pokemons pokemon8 = new org.example.pokemons( 2022458,  " ANTONIO SERRAO TAVARES JUNIOR",  10);
        org.example.pokemons pokemon9 = new org.example.pokemons( 2022421,  " RAPHAEL NICOLAS CARNEIRO SOUZA\n",  10);
        org.example.pokemons pokemon10 = new org.example.pokemons(2022345,  " JOSILDO RIBEIRO BRASIL JUNIOR",  10);
        org.example.pokemons pokemon11 = new org.example.pokemons(2022456,  " GLAUTON JUAN SOUSA DA SILVA\n",  10);
        org.example.pokemons pokemon12 = new org.example.pokemons(2022567,  " PEDRO HENRIQUE BORGES NOGUEIRA\n",  10);
        org.example.pokemons pokemon13 = new org.example.pokemons(2022458,  " RODRIGO ERICK FREITAS DO NASCIMENTO\n",  10);
        org.example.pokemons pokemon14 = new org.example.pokemons(2022421,  " PAULO SERGIO SANTANA PADILHA\n\n",  10);
        org.example.pokemons pokemon15 = new org.example.pokemons(2022345,  " JOELSON DE BRITO RIBEIRO",  10);
        org.example.pokemons pokemon16 = new org.example.pokemons(2022345,  " RAFAEL DUARTE DE SOUZA",  10);
        org.example.pokemons pokemon17 = new org.example.pokemons(2022345,  " BRENO LEANDRO DE SOUSA MACEDO",  10);
        org.example.pokemons pokemon18 = new org.example.pokemons(2022345,  " FRANCISCO IGOR RAMOS OLIVEIRA",  10);
        org.example.pokemons pokemon19 = new org.example.pokemons(2022345,  " EDUARDO GUIMARAES DO NASCIMENTO",  10);
        org.example.pokemons pokemon20 = new org.example.pokemons(2022345,  " CAIO CARVALHEIROS SARMENTO\n",  10);
        org.example.pokemons pokemon21 = new org.example.pokemons(2022345,  " ANTONIO ALVES DO NASCIMENTO NETO",  10);
        org.example.pokemons pokemon22 = new org.example.pokemons(2022345,  " WILKER GARCIA LEAL",  10);
        org.example.pokemons pokemon23 = new org.example.pokemons(2022345,  " ANA CRISTINA FORTES PINHEIRO",  10);
        org.example.pokemons pokemon245 =new org.example.pokemons(2022345,  " JOAO VITOR AMORIM BRITO",  10);
        org.example.pokemons pokemon152 =new org.example.pokemons(2022345,  " JOSIVALDO LOBATO PEDREIRA",  10);
        org.example.pokemons pokemon153 =new org.example.pokemons(2022345,  " RITA DE CASSIA CALDAS TEIXEIRA CARVALHO",  10);
        org.example.pokemons pokemon154 =new org.example.pokemons(2022345,  " ODIR BOULHOSA MALATO FILHO",  10);
        org.example.pokemons pokemon155 =new org.example.pokemons(2022345,  " LUIZ CARLOS ARAUJO NETO",  10);

        List<org.example.pokemons> pokemons = new ArrayList<>();

        pokemons.add(pokemon1);
        pokemons.add(pokemon2);
        pokemons.add(pokemon3);
        pokemons.add(pokemon4);
        pokemons.add(pokemon5);


        for(int i = 0; i<pokemons.size();i++){
            System.out.println("Pokemon" + pokemons.get(i).getNome()
                    + "\n Matricula: "+ pokemons.get(i).getID()
                    +  "\n Nota "+ pokemons.get(i).getNota());




        }

    }
}

