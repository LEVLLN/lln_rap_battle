package entity;

import java.util.UUID;

public class Genre {
   private String genreTitle;
   private UUID uuid;

   public String getGenreTitle() {
      return genreTitle;
   }

   public void setGenreTitle(String genreTitle) {
      this.genreTitle = genreTitle;
   }

   public UUID getUuid() {
      return uuid;
   }

   public void setUuid(UUID uuid) {
      this.uuid = uuid;
   }

   @Override
   public String toString() {
      return "\n" +
              "genre Title='" + genreTitle + '\''+"\n"+
              "genre uuid=" + uuid+ '}'+ "\n";
   }
}
