/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayerTask;

/**
 *
 * @author nellis-greenwood
 */
public class Song {
    
    private String artist;
    private String songName;
    private int playBack;
    
    
    
    public Song(){}
    
    public Song(String artist, String songName, int playBack){
        this.artist = artist;
        this.songName = songName;
        this.playBack = playBack;
        
        
    }   
    
    public String getName(){
        return this.songName;
       
    }
    
    public int getPlayBack(){
        return this.playBack;
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setName (String newName){
        this.songName=newName;
    }
    public void setPlay(int newPlays){
        this.playBack=newPlays;
    }
    
    public void printSong(){
        system.out.println(this.songName + "," + this.artist + "," + this.playBack);
    }
    
    
    
        
        
        
    
    
    
}
