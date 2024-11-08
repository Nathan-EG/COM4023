/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayerTask;
import java.util.ArrayList;
/**
 *
 * @author nellis-greenwood
 */
public class Playlist {
    
    private ArrayList<Song> playList;
    
    
    
    public Playlist(){
        
    }
    
    public void addSong (Song song){
        this.playList.add(song);
    }
    
    
    public int getPlayListSize(){
        return this.playList.size();
    }
    public void clearPlayList(){
        this.playList.clear();
    }
    public boolean removeSong(String songName){
        return false;
    }
    
    public boolean setSongPlays(String songName, int songPlays){
        return false;
    }
}
