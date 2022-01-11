import application.Application;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();

        app.run();
    }
}

//Stworz asocjacje pomiedzy praconiwkiem i zamowieniem. Obsluz sytuacje gdy zamowienei jest nullem, wtedy automatycznie ustwiamy
//Pracownikowi ze zamowil lamborghini za 10000000