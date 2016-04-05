package entity;

import java.util.UUID;

public class Singer {
    private String name;
    private String lastname;
    private String nickname;
    private UUID uuid = UUID.randomUUID();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "\n" +"singer name='" + name + "\n" +
                "singer lastname='" + lastname + "\n" +
                "singer nickname='" + nickname + "\n" +
                "singer uuid=" + uuid + '}' + "\n";
    }
}
