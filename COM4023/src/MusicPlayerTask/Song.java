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
    
    
    public String getartist(){
        return this.artist;
        
    }
    
    public void setartist(String artist){
        this.artist = artist;
    }
        
        
        
    
    
    
}
