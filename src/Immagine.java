class Immagine extends ElementoMultimediale implements LuminositaRegolabile {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    public void show() {
        System.out.println(titolo + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}
