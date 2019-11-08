package com.lti.test;


import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Album;
import com.lti.model.Song;

import java.util.List;



public class AlbumSongTest {

	@Test
	public void addAlbum() {

		Album ab= new Album();
		ab.setId(1);
		ab.setName("A Head Full of Dreams");
		ab.setReleaseDate(LocalDate.of(2015, 10, 25));
		ab.setGenre("Pop");
		
		GenericDao aao=new GenericDao();
		aao.save(ab);
	}
	
	@Test
	public void addSongToAlbum() {
		
		GenericDao aao=new GenericDao();
		Album ab= (Album) aao.fetchById(Album.class, 1);
		Song sg= new Song();
		sg.setId(01);
		sg.setTitle("Hymn For the Weekend");
		sg.setArtist("Coldplay");
		sg.setDuration(4);

		sg.setAlbum(ab);
		aao.save(sg);

	}
	
	@Test
	public void addAlbumAlongWithSongs() {
		
		Album ab=new Album();
		ab.setId(3);
		ab.setName("Minutes to middown");
		ab.setReleaseDate(LocalDate.of(2019, 5, 14));
		ab.setGenre("Pop");
	
		Song s1= new Song();
		s1.setId(02);
		s1.setTitle("one more light");
		s1.setArtist("Chester");
		s1.setDuration(5);
		s1.setAlbum(ab);
		
		Song s2= new Song();
		s2.setId(03);
		s2.setTitle("Roads untravelled");
		s2.setArtist("chester");
		s2.setDuration(5);
		s2.setAlbum(ab);

		
		Song s3= new Song();
		s3.setId(04);
		s3.setTitle("Numb");
		s3.setArtist("Chester");
		s3.setDuration(5);
		s3.setAlbum(ab);

		List<Song> songs=new ArrayList<Song>();
		
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);

		ab.setSongs(songs);
		
		GenericDao aao=new GenericDao();
		aao.save(ab);
	}

}
