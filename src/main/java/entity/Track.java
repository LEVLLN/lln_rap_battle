package entity;

import entity.user.User;

import java.util.UUID;

public class Track {
   private User artist;
   private String title;
   private String lyrics;
   private int roundNum;
   private Genre genre;
   private UUID uuid;

   public User getArtist() {
      return artist;
   }

   public void setArtist(User artist) {
      this.artist = artist;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getLyrics() {
      return lyrics;
   }

   public void setLyrics(String lyrics) {
      this.lyrics = lyrics;
   }

   public int getRoundNum() {
      return roundNum;
   }

   public void setRoundNum(int roundNum) {
      this.roundNum = roundNum;
   }

   public Genre getGenre() {
      return genre;
   }

   public void setGenre(Genre genre) {
      this.genre = genre;
   }

   public UUID getUuid() {
      return uuid;
   }

   public void setUuid(UUID uuid) {
      this.uuid = uuid;
   }
}