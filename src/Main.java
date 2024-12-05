// Main.java
public class Main {
    public static void main(String[] args) {
        // Instanciando os dispositivos (receptores)
        Light livingRoomLight = new Light();
        Fan bedroomFan = new Fan();

        // Criando os comandos para os dispositivos
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(bedroomFan);
        Command fanOff = new FanOffCommand(bedroomFan);

        // Configurando o controle remoto
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, fanOn, fanOff);

        // Testando os comandos
        System.out.println("Pressionando o botão de ligar a luz:");
        remote.pressOnButton(0);

        System.out.println("Pressionando o botão de desligar a luz:");
        remote.pressOffButton(0);

        System.out.println("Pressionando o botão de ligar o ventilador:");
        remote.pressOnButton(1);

        System.out.println("Pressionando o botão de desligar o ventilador:");
        remote.pressOffButton(1);

        System.out.println("Desfazendo o último comando:");
        remote.pressUndoButton();
    }
}
