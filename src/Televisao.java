public class Televisao {

    boolean ligada = false;
    int volume = 10;

    void ligar(){
        ligada = true;
        System.out.println("TV ligada!");
    }

    void desligar(){
        ligada = false;
        System.out.println("TV desligada");
    }


    void aumentarVolume(){
        if (ligada == true && volume < 100) {
            volume++;
            System.out.println(volume);
        } else {
            System.out.println("O Volume está no máximo: " + volume);
        }
    }

    void diminuirVolume(){
        if (ligada == true && volume > 0) {
            volume-- ;
            System.out.println(volume);
        } else {
            System.out.println("O volume está no mínimo: " + volume);
        }
    }
}
