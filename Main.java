package project;
import project.Controller.Controller;
import project.Model.FileOperation;
import project.Model.Repository;
import project.View.View;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation("AnimalFarm.csv");
        Repository repository = new Repository(fileOperation);
        Controller controller = new Controller(repository);
        View view = new View(controller);
        view.run();
    }
}