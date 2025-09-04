package gabrielsynapse.util.fileutil;

import java.util.UUID;

class PlayerData{
    private final String name;
    private final UUID uuid;
    public PlayerData(String name){
        this.name = name;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }
}
public class Main {
    public static void main(String[] args) {
        //teste de escrita
        //PlayerData playerData = new PlayerData("Herico");

        //Json<PlayerData> json = new Json<>(PlayerData.class);
        //json.write("herico.json",playerData);

        //teste de leitura
        Json<PlayerData> json = new Json<>(PlayerData.class);

        PlayerData playerData = json.read("herico.json");
        System.out.println(playerData.getName());
    }
}