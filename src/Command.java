// Command.java
public interface Command {
    void execute();
    void undo(); // Adicionamos o m�todo undo para desfazer o comando, se necess�rio
}
