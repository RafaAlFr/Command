// Command.java
public interface Command {
    void execute();
    void undo(); // Adicionamos o método undo para desfazer o comando, se necessário
}
