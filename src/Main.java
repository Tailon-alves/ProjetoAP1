void main() {
    Bateria bateria = new Bateria(60, 4000);
    Celular celular = new Celular("Xiaomi", "Japones", bateria);

    celular.carregarCelular();
    celular.usarcelular(100);

    celular.carregarCelular();
    celular.usarcelular(20);

    celular.usarcelular(-10);

    celular.usarcelular(90);

    System.out.println(celular);


}
