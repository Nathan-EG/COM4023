/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayerTask;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author nellis-greenwood
 */
public class Playlist {
    
    private ArrayList<Song> playList;
    
    
    
    public Playlist(){
        this.playList=new ArrayList<>();
        
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
    
    public void removeSong(String songName){
        boolean removeSong = false;
        for (int index = 0; index < playList.size(); index++){
            Song currentSong = playList.get(index);
            if (currentSong.getTitle().equalsIgnoreCase(songName)) {
                playList.remove(index);
                removeSong = true;
            }
        }
        if (removeSong==false){
            System.out.println("Cannot remove as song does not exist.");
        }
    }
    
    public void setSongPlays(String songName, int songPlays){
        
        boolean findSong = false;
        for(int index = 0; index < playList.size(); index++) {
            Song currentSong = playList.get(index);
            if (currentSong.getTitle().equalsIgnoreCase(songName))
                currentSong.setPlays(songPlays);
                findSong = true;
        }
        if (findSong==false){
            System.out.println("Cannot find the SongName.");
        }
    }
    
    public void printAbovePlays(int songPlays){
        boolean findSong = false;
        for (int index = 0; index < playList.size(); index++) {
            Song currentSong = playList.get(index);
            if (currentSong.getPlayBack() > songPlays){
                currentSong.printSong();
                found=true;
                
            }
        }
        
        if (found==false){
            System.out.println("No songs found with play above " + songPlays);
        }
    }
}
